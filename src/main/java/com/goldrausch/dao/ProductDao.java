package com.goldrausch.dao;

import com.goldrausch.model.Product;

import java.io.IOException;
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
        Product product2 = new Product();
        product2.setProductName("ring2");
        product2.setProductCategory("ring");
        product2.setProductDescription("sample");
        product2.setProductPrice(120);
        product2.setProductCondition("new");
        product2.setProductStatus("Active");
        product2.setUnitStock(11);
        product2.setProductManufacturer("noMatters");
        Product product3 = new Product();
        product3.setProductName("ring3");
        product3.setProductCategory("ring");
        product3.setProductDescription("sample");
        product3.setProductPrice(120);
        product3.setProductCondition("new");
        product3.setProductStatus("Active");
        product3.setUnitStock(11);
        product3.setProductManufacturer("noMatters");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;
    }

    public Product getProductById(String productId) throws IOException {
        for (Product product: getProductList()) {
            if(product.getProductId().equals(productId)) {
                return product;
            }
        }

        throw new IOException("No product found.");
    }
}
