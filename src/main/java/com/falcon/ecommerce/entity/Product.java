package com.falcon.ecommerce.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product") //if @Table not given, entity mapped to unqualified class name, eg: MyTable class mapped to my_table
@Data // Lombok defines getters and setters
public class Product {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // equivalent to autoincrement
    @Column(name = "id") // mapping variable to table column
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false) // this states name of the foreign key column and foreign key is a part of this table
    private ProductCategory category;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "active")
    private boolean active;

    @Column(name = "units_in_stock")
    private int unitsImStock;

    @Column(name = "date_created")
    @CreationTimestamp // hibernate manages timestamps in the background
    private Date dataCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp // hibernate manages timestamps in the background
    private Date lastUpdated;

}
