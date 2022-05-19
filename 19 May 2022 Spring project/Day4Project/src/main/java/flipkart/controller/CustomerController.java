package flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import flipkart.bean.Customer;
import flipkart.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerservice;
	
	@PostMapping(value = "/addcustomer")
	Customer AddCustomer(@RequestBody Customer customer) {
		Customer cust = customerservice.AddCustomer(customer);
		return cust;
		
	}

}
