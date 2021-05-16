package com.falcon.ecommerce.dao;

import com.falcon.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
// collectonResourceRel is name of JSON entry and
// path is api path here /product-category,
// if not used then default is unqualified class name in plural form

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
