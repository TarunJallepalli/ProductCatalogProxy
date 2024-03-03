package com.amazonproxy.productcatalog.service.storageImpl;

import com.amazonproxy.productcatalog.repo.ProductRepo;
import com.amazonproxy.productcatalog.service.ICategoryService;
import org.springframework.stereotype.Service;

@Service
public class StorageCategoryService implements ICategoryService {

    private final ProductRepo productRepo;

    public StorageCategoryService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
}
