package com.falcon.ecommerce.dao;

import com.falcon.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
// collectonResourceRel is name of JSON entry and
// path is api path here /product-category,
// if not used then default is unqualified class name in plural form
@CrossOrigin
// needed as both angular and spring running on localhost
// and by default cross domain not supported
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
