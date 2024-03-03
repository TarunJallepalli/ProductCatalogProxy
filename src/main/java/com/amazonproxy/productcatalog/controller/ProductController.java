package com.amazonproxy.productcatalog.controller;

import com.amazonproxy.productcatalog.dtos.ProductRequestDto;
import com.amazonproxy.productcatalog.models.Product;
import com.amazonproxy.productcatalog.service.IProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @PostMapping()
    public Product saveProduct(@RequestBody ProductRequestDto productRequestDto) {
        return productService.saveProduct(productRequestDto);
    }

    @GetMapping("{id}")
    public Product fetchProduct(@PathVariable String id) throws Exception {
        return productService.fetchProduct(id);
    }
}
