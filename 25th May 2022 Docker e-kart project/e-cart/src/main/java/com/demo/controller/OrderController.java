package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
