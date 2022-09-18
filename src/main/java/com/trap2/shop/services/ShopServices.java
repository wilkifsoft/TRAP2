package com.trap2.shop.services;

import java.time.Instant;
import java.util.List;

import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.trap2.shop.dto.request.ShopCreateRequest;
import com.trap2.shop.dto.response.ResponseBase;
import com.trap2.shop.dto.response.ShopResponse;

public interface ShopServices
{

  ResponseEntity<Object> createShop(ShopCreateRequest request);
  ResponseEntity<ResponseBase<List<ShopResponse>>> doSearchShop (byte status, Long category, Instant fromDate, Instant toDate, Pageable pageable);
  ResponseEntity<ResponseBase<List<ShopResponse>>>findByCategory_Id(Long category, Pageable pageable);
  ResponseEntity<ResponseBase<List<ShopResponse>>> findBySellerEmail(String sellerEmail, Pageable pageable);
  ResponseEntity<InputStreamResource> doExportShop(byte status, String sellerEmail, Pageable pageable);

/*public List<Category> findAll();

public void ajouterBoutique(Shop shop, Map<Integer, Branches> map);
public void updateBoutique(Shop shop);
public List<Shop> findByCategorie(Long categorie,String etat);
public List<Shop>findByVendeur(String vendeur);
public List<Shop>getAllBoutiques();
public Shop findByLibelle(String libelle);

public void activerDesactiverOffre(int id);

public void activerDesactiverBoutique(int id);

public Shop getBoutique(int id);

public List<Branches>findAnnexeByBoutique(int idBoutique);
public void updateAnnexe(Branches branches);
public void addAnnexe(Branches branches);
public Branches getAnnexe(int id);
public void deleteAnnexe(int id);


public Departement getDepartement(Long id);
public Arrondissement getArrondissement(Long id);
public Commune getCommune(Long id);
public SectionCommunale getSetion(Long id);


public List<Arrondissement>findByDepartement(Long departement);
public List<Commune>findByArrondissement(Long arrondissement);
public List<SectionCommunale>findByCommune(Long commune);
public List<Departement>getdAll();

public List<Category>listerCategorie();*/
}
