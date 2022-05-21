package flipkart.service;

import java.util.List;
import java.util.Optional;

import flipkart.bean.Customer;

public interface CustomerService {

	// service give by admin insest
	Customer AddCustomer(Customer cusromer);
	
	// get all list of customer
	List<Customer> getAllListOfCustomer();
	
	/*//put or update
	Customer updateProduct(Customer customer,long CustomerID);
	*/
	
	//get by id
	Optional<Customer> getCustomerById(long CustomerID);
	
	/*// delete
	Optional<Customer> deleteByCustomerId(long CustomerID);
	*/
}
