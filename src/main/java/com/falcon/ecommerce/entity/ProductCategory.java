package com.falcon.ecommerce.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "product_category")
// @Data -- known bug when using many-to-one or one-to-many
@Getter // workaround
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
//        cascade - When we perform some action on the target entity,
//        the same action will be applied to the associated entity.
//        Type all propagates all operations — including Hibernate-specific ones — from a parent to a child entity.
//        mappedBy - mapping to category instance variable in the Product class as it is the foreign key column
    private Set<Product> products;


}
