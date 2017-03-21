package com.dao;

import com.goldrausch.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kamil on 21.03.2017.
 */
public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList() {
        Product product1 = new Product();
        product1.setProductId("P123");
        product1.setProductName("ring1");
        product1.setProductCategory("ring");
        product1.setProductDescription("ring!");
        product1.setProductPrice(1200);
        product1.setProductCondition("new");
        product1.setProductStatus("Active");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("asd");

        Product product2 = new Product();
        product2.setProductId("P123");
        product2.setProductName("watch1");
        product2.setProductCategory("watch");
        product2.setProductDescription("This is an awesome watch of 20th century!");
        product2.setProductPrice(25);
        product2.setProductCondition("new");
        product2.setProductStatus("Active");
        product2.setUnitInStock(51);
        product2.setProductManufacturer("EMI");

        Product product3 = new Product();
        product3.setProductId("P125");
        product3.setProductName("jewrely1");
        product3.setProductCategory("jewrely");
        product3.setProductDescription("This is something");
        product3.setProductPrice(355);
        product3.setProductCondition("new");
        product3.setProductStatus("Active");
        product3.setUnitInStock(9);
        product3.setProductManufacturer("Polk");

        productList=new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);


        return productList;
    }

    public Product getProductById(String productId) throws IOException{
        for (Product product: getProductList()) {
            if(product.getProductId().equals(productId)) {
                return product;
            }
        }

        throw new IOException("No product found.");
    }
}
