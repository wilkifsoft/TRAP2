package com.trap2.shop.dto.request;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopCreateRequest
{
private ShopRequest shopRequest;
private List<BranchesRequest> branchesRequest;
}
