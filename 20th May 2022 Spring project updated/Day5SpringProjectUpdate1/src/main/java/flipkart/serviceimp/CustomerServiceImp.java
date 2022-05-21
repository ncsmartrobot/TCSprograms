package flipkart.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flipkart.bean.Customer;
import flipkart.repositary.LocalRepositary;
import flipkart.service.CustomerService;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	LocalRepositary localRepositary;
	@Override
	public Customer AddCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		Customer customeradded = localRepositary.save(customer);
		return customeradded;
	}
	
	public List<Customer> getAllListOfCustomer() {
		// TODO Auto-generated method stub
		List<Customer> listofcustomers = localRepositary.findAll();
		return listofcustomers;
	}

	public Optional<Customer> getCustomerById(long CustomerID) {
		// TODO Auto-generated method stub
		Optional<Customer> customerget = localRepositary.findById(CustomerID);
		return customerget;
	}

	public void deleteByCustomerId(long CustomerID) {
		// TODO Auto-generated method stub
		localRepositary.deleteById(CustomerID);
		
	}
	
	

	/*
	public Customer updateProduct(Customer customer, long CustomerID) {
				
		customer.setId(CustomerID);
		Customer updatedcustomer = localRepositary.save(customer);

		return updatedcustomer;
	}
	*/

}
