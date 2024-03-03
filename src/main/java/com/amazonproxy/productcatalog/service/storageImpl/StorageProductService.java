package com.amazonproxy.productcatalog.service.storageImpl;

import com.amazonproxy.productcatalog.repo.ProductRepo;
import com.amazonproxy.productcatalog.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageProductService implements IProductService {

    private final ProductRepo productRepo;

    public StorageProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
}
