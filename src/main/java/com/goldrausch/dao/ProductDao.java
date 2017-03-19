package com.goldrausch.dao;

import com.goldrausch.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kamil on 19.03.2017.
 */
public class ProductDao {
    private List<Product> productList;
    public List<Product> getProductList()
    {
        Product product1 = new Product();
        product1.setProductName("ring1");
        product1.setProductCategory("ring");
        product1.setProductDescription("sample");
        product1.setProductPrice(120);
        product1.setProductCondition("new");
        product1.setProductStatus("Active");
        product1.setUnitStock(11);
        product1.setProductManufacturer("noMatters");

        productList = new ArrayList<Product>();
        productList.add(product1);
        return productList;
    }
}
