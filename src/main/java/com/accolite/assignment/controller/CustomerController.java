package com.accolite.assignment.controller;

import com.accolite.assignment.entity.ColumnDetails;
import com.accolite.assignment.entity.Customer;
import com.accolite.assignment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    // returns all todays's customer
    @RequestMapping(value = "/date", method = RequestMethod.POST)
    public List<Customer> getTodaysCustomers(@RequestBody String date) {
        return customerService.getTodaysCustomers(date);
    }

    // returns customer matching cust_name field
    @RequestMapping(value = "/name", method = RequestMethod.POST)
    public List<Customer> getCustomersByName(@RequestBody String name) {
        return customerService.getCustomersByName(name);
    }

    // returns customer matching cust_address field
    @RequestMapping(value = "/address", method = RequestMethod.POST)
    public List<Customer> getCustomersByAddr(@RequestBody String addr) {
        return customerService.getCustomersByAddr(addr);
    }

    @RequestMapping(value = "/technicianname", method = RequestMethod.POST)
    public List<Customer> getCustomersByTechName(@RequestBody String techName) {
        return customerService.getCustomersByTechName(techName);
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

    @RequestMapping(method = RequestMethod.POST)

    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }
}
