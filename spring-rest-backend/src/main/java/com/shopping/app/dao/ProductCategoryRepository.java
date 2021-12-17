package com.shopping.app.dao;

import com.shopping.app.entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//REST will automatically create these REST points
//we customize it with these annotation

//52 deki kod ile bir entity icin http requestleri silinebiliyor
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
