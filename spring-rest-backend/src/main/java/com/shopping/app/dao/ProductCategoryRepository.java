package com.shopping.app.dao;

import com.shopping.app.entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//REST will automatically create these REST points
//we customize it with these annotation

//52 deki kod ile bir entity icin http requestleri silinebiliyor

@RepositoryRestResource(collectionResourceRel = "productCategory", path="/product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
