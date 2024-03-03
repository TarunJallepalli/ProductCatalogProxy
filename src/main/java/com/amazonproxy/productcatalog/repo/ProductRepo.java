package com.amazonproxy.productcatalog.repo;

import com.amazonproxy.productcatalog.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, String> {

}
