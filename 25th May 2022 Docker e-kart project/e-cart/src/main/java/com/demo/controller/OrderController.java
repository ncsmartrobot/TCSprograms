package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Order;
import com.demo.service.OrderService;


@RestController
public class OrderController {

	@Autowired
	OrderService OrderService;

	@PostMapping(value="/createoreder")
	Order addOrder(@RequestBody Order order) {
		Order addorder = OrderService.createOder(order);
		return addorder;
	}
	
	@GetMapping(value="/listoforder")
	List<Order>viewAllListOfOrders(){
		return OrderService.getAllListOfOrder();
	}
	
	@DeleteMapping(value = "/deleteOrderID/{id}")
	ResponseEntity<String> deleteByOrder(@PathVariable long id){
		try {

			if (id == 0) {

				return ResponseEntity.ok("pls enter in proper id " + id);

			}
			OrderService.deleteByOrderId(id);

			return ResponseEntity.ok("Sucessfully deleted " + id);

		} catch (Exception e) {

			return ResponseEntity.ok("Product id does not exists " + id);
		}
		
	}

}
