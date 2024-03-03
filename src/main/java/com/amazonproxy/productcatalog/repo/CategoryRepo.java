package com.amazonproxy.productcatalog.repo;

import com.amazonproxy.productcatalog.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, String> {

}
