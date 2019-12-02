package com.accolite.assignment.service;

import com.accolite.assignment.dao.CustomerDao;
import com.accolite.assignment.entity.ColumnDetails;
import com.accolite.assignment.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerDao customerDao;

    public List<Customer> getTodaysCustomers(String date) {
        return customerDao.getTodaysCustomers(date);
    }

    public List<Customer> getCustomersByName(String name){
        return customerDao.getCustomersByName(name);
    }

    public List<Customer> getCustomersByAddr(String addr){
        return customerDao.getCustomersByAddr(addr);
    }

    public List<Customer> getCustomerByPhoneNumber(String phoneNumber) {
        return customerDao.getCustomerByPhoneNumber(phoneNumber);
    }

    public List<Customer> getCustomersByTechName(String techName) {
        return customerDao.getCustomersByTechName(techName);
    }

    public List<Customer> getCustomerByColumn(ColumnDetails columnDetails) {
        return customerDao.getCustomerByColumn(columnDetails);
    }

    public List<Customer> getAMCDoneCustomer(String date) {
        return customerDao.getAMCDoneCustomer(date);
    }

    public List<Customer> getAllCustomer() {
        return customerDao.getAllCustomer();
    }

    public int addCustomer(Customer customer) {
        return customerDao.addCustomer(customer);
    }

}
