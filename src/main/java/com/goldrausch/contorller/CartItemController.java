package com.goldrausch.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kamil on 11.04.2017.
 */
@Controller
@RequestMapping("/cart")
public class CartItemController {
    @RequestMapping
    public String get (HttpServletRequest request)
    {
        return "redirect:/dart/"+request.getSession(true).getId();
    }

    @RequestMapping(value = "/{cartId})", method = RequestMethod.GET)
    public String getCart(@PathVariable(value = "cartId") String cartId, Model model)
    {
        model.addAttribute("cartId", cartId);
        return "cart";
    }

}
