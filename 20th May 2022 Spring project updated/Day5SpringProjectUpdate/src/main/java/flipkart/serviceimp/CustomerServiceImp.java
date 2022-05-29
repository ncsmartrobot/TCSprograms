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
		Customer customeradded = localRepositary.save(customer);
		return customeradded;
	}
	
	public List<Customer> getAllListOfCustomer() {
		List<Customer> listofcustomers = localRepositary.findAll();
		return listofcustomers;
	}

	public Optional<Customer> getCustomerById(long CustomerID) {
		Optional<Customer> customerget = localRepositary.findById(CustomerID);
		return customerget;
	}

	@Override
	public void deleteByCustomerId(long CustomerID) {
		localRepositary.deleteById(CustomerID);
	}

	public Customer updateCustomer(Customer customer, long CustomerID) {
		customer.setCustomerID(CustomerID);
		Customer updatedcustomer = localRepositary.save(customer);
		return updatedcustomer;
	}
	

}
