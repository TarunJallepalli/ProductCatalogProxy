package com.amazonproxy.productcatalog.service;

import com.amazonproxy.productcatalog.dtos.ProductRequestDto;
import com.amazonproxy.productcatalog.models.Product;

public interface IProductService {
    Product saveProduct(ProductRequestDto productRequestDto);

    Product fetchProduct(String id) throws Exception;
}
