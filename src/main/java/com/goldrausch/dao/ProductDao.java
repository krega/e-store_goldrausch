package com.goldrausch.dao;

import com.goldrausch.model.Product;

import java.util.List;

/**
 * Created by kamil on 22.03.2017.
 */
public interface ProductDao {
    void addProduct(Product product);
    Product getProductById(String id);
    List<Product> getAllProducts();
    void deleteProduct(String id);
}
