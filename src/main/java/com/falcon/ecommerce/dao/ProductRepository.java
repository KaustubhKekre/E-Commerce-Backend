package com.falcon.ecommerce.dao;

import com.falcon.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
// needed as both angular and spring running on localhost
// and by default cross domain not supported
public interface ProductRepository extends JpaRepository<Product, Long> {

}
