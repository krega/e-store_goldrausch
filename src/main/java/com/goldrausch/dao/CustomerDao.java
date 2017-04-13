package com.goldrausch.dao;

import com.goldrausch.model.Customer;

import java.util.List;

/**
 * Created by kamil on 13.04.2017.
 */
public interface CustomerDao {
    void addCustomer(Customer customer);
    Customer getCustomerById (int customerId);
    List<Customer> getAllCustomers();
}
