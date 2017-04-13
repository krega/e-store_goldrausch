package com.goldrausch.dao;

import com.goldrausch.model.Product;

import java.util.List;

/**
 * Created by kamil on 22.03.2017.
 * */
 public interface ProductDao {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
 }
