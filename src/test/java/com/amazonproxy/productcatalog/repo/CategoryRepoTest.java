package com.amazonproxy.productcatalog.repo;

import com.amazonproxy.productcatalog.models.Category;
import com.amazonproxy.productcatalog.models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class CategoryRepoTest {

    @Autowired
    private CategoryRepo categoryRepo;

    @Test
    @Transactional
    @Rollback(value = false)
    void getCategoryTest() {
        Category category = categoryRepo.findById("450bf330-9a66-4cb6-9a1b-ef4e0641db49").orElse(null);
        System.out.println(category);
        assert category != null;
        List<Product> products = category.getProductList();
        for(Product product : products) {
            System.out.println(product);
        }
    }
}