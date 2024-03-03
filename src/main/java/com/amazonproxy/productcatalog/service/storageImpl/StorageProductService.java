package com.amazonproxy.productcatalog.service.storageImpl;

import com.amazonproxy.productcatalog.dtos.ProductRequestDto;
import com.amazonproxy.productcatalog.models.Category;
import com.amazonproxy.productcatalog.models.Product;
import com.amazonproxy.productcatalog.repo.ProductRepo;
import com.amazonproxy.productcatalog.service.IProductService;
import org.springframework.stereotype.Service;

@Service
public class StorageProductService implements IProductService {

    private final ProductRepo productRepo;

    public StorageProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product saveProduct(ProductRequestDto productRequestDto) {
        Product product = getProductFromProductDto(productRequestDto);
        return productRepo.save(product);
    }

    @Override
    public Product fetchProduct(String id) throws Exception {
        return productRepo.findById(id).orElseThrow(() -> new Exception("Not Found"));
    }

    private Product getProductFromProductDto(ProductRequestDto productRequestDto) {
        Product product = new Product();
        product.setId(productRequestDto.getProductId());
        product.setTitle(productRequestDto.getTitle());
        product.setDescription(productRequestDto.getDescription());
        product.setImageUrl(productRequestDto.getImageUrl());
        product.setPrice(productRequestDto.getPrice());
        Category category = new Category();
        category.setName(productRequestDto.getCategoryName());
        product.setCategory(category);
        return product;
    }
}
