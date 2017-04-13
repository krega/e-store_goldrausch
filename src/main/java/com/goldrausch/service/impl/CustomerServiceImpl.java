package com.goldrausch.service.impl;



import com.goldrausch.dao.CustomerDao;
import com.goldrausch.model.Customer;
import com.goldrausch.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kamil on 13.04.2017.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void addCustomer(Customer customer)
    {
        customerDao.addCustomer(customer);
    }
    public Customer getCustomerById(int customerId)
    {
        return customerDao.getCustomerById(customerId);
    }
    public List<Customer> getAllCustomers()
    {
        return customerDao.getAllCustomers();
    }
}
