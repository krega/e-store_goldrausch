package com.goldrausch.service;

import com.goldrausch.model.Product;

import java.util.List;

/**
 * Created by kamil on 12.04.2017.
 */
public interface ProductService {
    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);

}
