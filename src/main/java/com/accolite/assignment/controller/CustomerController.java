package com.accolite.assignment.controller;

import com.accolite.assignment.entity.ColumnDetails;
import com.accolite.assignment.entity.Customer;
import com.accolite.assignment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/customer",consumes = {"application/JSON"})
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    // returns all todays's customer
    @RequestMapping(value = "/date", method = RequestMethod.POST)
    public List<Customer> getTodaysCustomers(@RequestBody String date) {
        return customerService.getTodaysCustomers(date);
    }

    @RequestMapping(value = "/phonenumber", method = RequestMethod.POST)
    public List<Customer> getCustomerByPhoneNumber(@RequestBody String phoneNumber) {
        return customerService.getCustomerByPhoneNumber(phoneNumber);
    }

    @RequestMapping(value = "/addcustomer", method = RequestMethod.POST)
    public void addCustomer(@RequestBody Customer customer) {
        System.out.println(customer);
        customerService.addCustomer(customer);
    }

    @RequestMapping(value = "/getbycolumn", method = RequestMethod.POST)

    public List<Customer> getCustomerByColumn(@RequestBody ColumnDetails columnDetails) {

        return customerService.getCustomerByColumn(columnDetails);
    }

    @RequestMapping(value = "/getAMCDone", method = RequestMethod.POST)

    public List<Customer> getAMCDoneCustomer(@RequestBody String date) {
        return customerService.getAMCDoneCustomer(date);
    }

}
