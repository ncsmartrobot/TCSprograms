package flipkart.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flipkart.bean.Customer;

@Repository
public interface LocalRepositary extends JpaRepository<Customer, Long>{

}
