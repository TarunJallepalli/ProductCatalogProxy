package com.amazonproxy.productcatalog.controller;

import com.amazonproxy.productcatalog.service.storageImpl.StorageProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final StorageProductService storageProductService;

    public ProductController(StorageProductService storageProductService) {
        this.storageProductService = storageProductService;
    }
}
