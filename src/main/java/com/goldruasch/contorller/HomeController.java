package com.goldruasch.contorller;

import com.goldrausch.dao.ProductDao;
import com.goldrausch.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by kamil on 18.03.2017.
 */

@Controller
public class HomeController {
    private ProductDao productDao = new ProductDao();
    @RequestMapping("/")
    public String home() {  return "home"; }

    @RequestMapping("/productList")
    public String getProduct(Model model)
    {
        List<Product> productList = productDao.getProductList();
        Product product = productList.get(0);
        model.addAttribute(product);
        return "productList";
    }

}
