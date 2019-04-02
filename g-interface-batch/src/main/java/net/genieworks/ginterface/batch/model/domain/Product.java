package net.genieworks.ginterface.batch.model.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 상품 Entity
 */
@Entity @Getter
public class Product {

    @Id @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    private Long productId;
    @Column @Setter
    private Long customerId;
    @Column @Setter
    private String productName;
    @Column @Setter
    private String productSupplierName;
    @Column @Setter
    private String productEnglishName;
    @Column @Setter
    private String productDescriptionSimple;
    @Column @Setter
    private String productDescriptionDetail;
    @Column @Setter
    private Integer supplierPrice;
    @Column @Setter
    private Integer customerPrice;
    @Column @Setter
    private Integer salePrice;
    @Column @Setter
    private String displayType;
    @Column @Setter
    private String saleType;
    @Column @Setter
    private Long categoryNo;
}
