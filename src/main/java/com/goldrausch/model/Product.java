package com.goldrausch.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

/**
 * Created by kamil on 19.03.2017.
 */

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String productId;
    private String productName;
    private String productCategory;
    private String productDescription;
    private double productPrice;
    private String productCondition;
    private String productStatus;
    private int unitStock;
    private String productManufacturer;
    @Transient
    private MultipartFile productImage;

    public int getUnitStock() {
        return unitStock;
    }

    public void setUnitStock(int unitStock) {
        this.unitStock = unitStock;
    }

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getUnitInStock() {
        return unitStock;
    }

    public void setUnitInStock(int unitStock) {
        this.unitStock = unitStock;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }
}


