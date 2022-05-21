package flipkart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import flipkart.bean.Customer;
import flipkart.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerservice;
	
	@PostMapping(value = "/addcustomerupdate")
	Customer AddCustomer(@RequestBody Customer customer) {
		Customer cust = customerservice.AddCustomer(customer);
		System.out.println(" firstname->>>>> " + cust.getFirstName());// print on server side
		System.out.println(" lastname->>>>> " + cust.getLastName());
		return cust;
		
	}
	
	@GetMapping(value="/viewallofcustomer")
	List<Customer> viewAllListOfCustomers(){
		return customerservice.getAllListOfCustomer();
	}
	
	@GetMapping(value="/viewbyid")
	Optional<Customer> viewByCustomerId(){
		return customerservice.getCustomerById(2);
	}
	/*
	@PutMapping(value="/updatecustomer/{CustomerID}")
	Customer updateCustomer(@RequestBody Customer updateCustomer,@PathVariable long CustomerID) {
		
		Customer updatedDetails = customerservice.updateCustomer(updateCustomer,CustomerID);
		return updatedDetails;
	}
	*/
	@DeleteMapping(value = "/deletecustomerID")
	void deleteCustomerId(@RequestBody Customer deleteCustomerId,@PathVariable long CustomerID) {
		customerservice.deleteByCustomerId(CustomerID);
		
	}

}
