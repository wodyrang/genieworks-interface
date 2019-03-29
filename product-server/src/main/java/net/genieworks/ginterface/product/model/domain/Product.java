package net.genieworks.ginterface.product.model.domain;


import lombok.Getter;

import javax.persistence.*;

/**
 * 상품 Entity
 */
@Getter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column
    private Long customerId;

    @Column
    private String productName;

    @Column
    private String productSupplierName;

    @Column
    private String productEnglishName;

    @Column
    private String productDescriptionSimple;

    @Column
    private String productDescriptionDetail;

    @Column
    private Integer supplierPrice;

    @Column
    private Integer customerPrice;

    @Column
    private Integer salePrice;

    @Column
    private String displayType;

    @Column
    private String saleType;

    @Column
    private Long categoryNo;


    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductSupplierName(String productSupplierName) {
        this.productSupplierName = productSupplierName;
    }

    public void setProductEnglishName(String productEnglishName) {
        this.productEnglishName = productEnglishName;
    }

    public void setProductDescriptionSimple(String productDescriptionSimple) {
        this.productDescriptionSimple = productDescriptionSimple;
    }

    public void setProductDescriptionDetail(String productDescriptionDetail) {
        this.productDescriptionDetail = productDescriptionDetail;
    }

    public void setSupplierPrice(Integer supplierPrice) {
        this.supplierPrice = supplierPrice;
    }

    public void setCustomerPrice(Integer customerPrice) {
        this.customerPrice = customerPrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public void setCategoryNo(Long categoryNo) {
        this.categoryNo = categoryNo;
    }
}
