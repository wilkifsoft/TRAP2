package com.trap2.shop.servicesImpl;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import com.trap2.shop.constants.ShopConstants;
import com.trap2.shop.dto.request.ShopCreateRequest;
import com.trap2.shop.dto.response.PageResponse;
import com.trap2.shop.dto.response.ResponseBase;
import com.trap2.shop.dto.response.ShopResponse;
import com.trap2.shop.entities.Arrondissement;
import com.trap2.shop.entities.Branches;
import com.trap2.shop.entities.Category;
import com.trap2.shop.entities.Commune;
import com.trap2.shop.entities.Departement;
import com.trap2.shop.entities.SectionCommunale;
import com.trap2.shop.entities.Shop;
import com.trap2.shop.repositories.BranchesRepository;
import com.trap2.shop.repositories.ShopRepository;
import com.trap2.shop.services.ShopServices;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShopServicesImpl implements ShopServices
{
  private final ShopRepository shopRepository;
  private final BranchesRepository branchesRepository;

  public ShopServicesImpl(ShopRepository shopRepository, BranchesRepository branchesRepository)
  {
    this.shopRepository = shopRepository;
    this.branchesRepository = branchesRepository;
  }

  @Override
  @Transactional
  public ResponseEntity<Object> createShop(ShopCreateRequest request)
  {
    Shop shop = new Shop();
    shop.setName(request.getShopRequest().getName());
    shop.setEmail(request.getShopRequest().getEmail());
    shop.setSellerEmail(request.getShopRequest().getSellerEmail());
    shop.setDescription(request.getShopRequest().getDescription());
    shop.setImagePath(request.getShopRequest().getImagePath());
    shop.setTel(request.getShopRequest().getTel());
    shop.setSiteWeb(request.getShopRequest().getSiteWeb());
    shop.setCreatedBy("AMIN");
    shop.setCategory(new Category(request.getShopRequest().getCategory()));
    shop.setStatus(ShopConstants.ACTIVE_SHOP_STATUS);
    try
    {
      shopRepository.save(shop);

      List<Branches> branches = new ArrayList<>();

      if (request.getBranchesRequest() != null)
      {
        request.getBranchesRequest().stream().map(item -> {
          branches.add(new Branches(item.getStreet(), item.getNumber(), item.getOpeningHour(), item.getClosingTime(),
            item.getFromDay(), item.getToDay(),
            shop, new Departement(item.getDepartement()),
            new Arrondissement(item.getArrondissement()), new Commune(item.getCommune()),
            new SectionCommunale(item.getSection_Communale())));
          return item;
        }).toList();
        branchesRepository.saveAll(branches);
      }
      return new ResponseEntity<>(HttpStatus.CREATED);
    }catch (Exception e){
      log.error(e.getMessage());
      return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
  }

  @Override
  public ResponseEntity<ResponseBase<List<ShopResponse>>> doSearchShop(byte status, Long category, Instant fromDate,
    Instant toDate, Pageable pageable)
  {
    try
    {
      Page<Shop> page = findAllInDB(status, category, fromDate, toDate, pageable);
      List<ShopResponse> content = page.getContent().stream().map(ShopResponse::new).toList();
      PageResponse<ShopResponse> response = new PageResponse<>(page.getTotalPages(), page.getTotalPages(), content);
      return ResponseEntity.ok(response);
    }
    catch (Exception e)
    {
      log.error(e.getMessage());
      return ResponseBase.getResponseException(e);
    }
  }

  @Override
  public ResponseEntity<ResponseBase<List<ShopResponse>>> findByCategory_Id(Long category, Pageable pageable)
  {
    try
    {
      Page<Shop> page = shopRepository.findByCategory_Id(category, pageable);
      List<ShopResponse> content = page.getContent().stream().map(ShopResponse::new).toList();
      PageResponse<ShopResponse> response = new PageResponse<>(page.getTotalPages(), page.getTotalPages(), content);
      return ResponseEntity.ok(response);
    }
    catch (Exception e)
    {
      log.error(e.getMessage());
      return ResponseBase.getResponseException(e);
    }
  }

  @Override
  public ResponseEntity<ResponseBase<List<ShopResponse>>> findBySellerEmail(String sellerEmail, Pageable pageable)
  {
    try
    {
      Page<Shop> page = shopRepository.findBySellerEmail(sellerEmail, pageable);
      List<ShopResponse> content = page.getContent().stream().map(ShopResponse::new).toList();
      PageResponse<ShopResponse> response = new PageResponse<>(page.getTotalPages(), page.getTotalPages(), content);
      return ResponseEntity.ok(response);
    }
    catch (Exception e)
    {
      log.error(e.getMessage());
      return ResponseBase.getResponseException(e);
    }
  }

  @Override
  public ResponseEntity<InputStreamResource> doExportShop(byte status, String sellerEmail, Pageable pageable)
  {
    return null;
  }

  private Page<Shop> findAllInDB(byte status, Long category, Instant fromDate, Instant toDate, Pageable pageable)
  {
    if (ShopConstants.SHOP_STATUS_ALL == status && Objects.equals((long)ShopConstants.CATEGORY_TYPE_ALL,
      category))
    {
      return shopRepository.findByStatusInAndCreatedDateBetween(
        List.of(ShopConstants.ACTIVE_SHOP_STATUS, ShopConstants.SUSPENDED_SHOP_STATUS), fromDate, toDate, pageable);
    }
    else if (ShopConstants.SHOP_STATUS_ALL == status && !(Objects.equals((long)ShopConstants.CATEGORY_TYPE_ALL,
      category)))
    {
      return shopRepository.findByStatusInAndCategory_IdAndCreatedDateBetween(
        List.of(ShopConstants.ACTIVE_SHOP_STATUS, ShopConstants.SUSPENDED_SHOP_STATUS), category, fromDate, toDate,
        pageable);
    }
    else if ((ShopConstants.SHOP_STATUS_ALL != status) && Objects.equals((long)ShopConstants.CATEGORY_TYPE_ALL,
      category))
    {
      return shopRepository.findByStatusAndCreatedDateBetween(status, fromDate, toDate, pageable);
    }
    else
    {
      return shopRepository.findByStatusAndCategory_IdAndCreatedDateBetween(status, category, fromDate, toDate,
        pageable);

    }
  }

}
