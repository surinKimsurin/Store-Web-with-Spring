package com.mystore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * created by surinKim 19/07/21
 * data model
 */

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String productId;
    private String productName;
    private String productCategory;
    private String prouctDescription;
    private double prouctPrice;
    private String productCondition;
    private String productStatus;
    private int unitInStock;
    private String productManufacturer;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProuctDescription() {
        return prouctDescription;
    }

    public double getProuctPrice() {
        return prouctPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setProuctDescription(String prouctDescription) {
        this.prouctDescription = prouctDescription;
    }

    public void setProuctPrice(double prouctPrice) {
        this.prouctPrice = prouctPrice;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }
}
