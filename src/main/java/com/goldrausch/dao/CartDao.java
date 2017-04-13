package com.goldrausch.dao;

import com.goldrausch.model.Cart;

/**
 * Created by kamil on 10.04.2017.
 */
public interface CartDao {

    Cart create(Cart cart);

    Cart read(String cartId);

    void update ( String cartId, Cart cart);

    void delete (String cartId);
}
