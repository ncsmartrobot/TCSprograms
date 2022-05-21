package flipkart.serviceimp;

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
	

}
