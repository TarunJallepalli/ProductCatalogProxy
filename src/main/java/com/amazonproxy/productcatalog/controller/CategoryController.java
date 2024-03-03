package com.amazonproxy.productcatalog.controller;

import com.amazonproxy.productcatalog.service.storageImpl.StorageCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final StorageCategoryService storageControllerService;

    public CategoryController(StorageCategoryService storageControllerService) {
        this.storageControllerService = storageControllerService;
    }


}
