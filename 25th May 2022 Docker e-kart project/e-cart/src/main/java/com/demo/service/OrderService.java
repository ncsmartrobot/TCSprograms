package com.demo.service;

import java.util.List;

import com.demo.bean.Order;


public interface OrderService {
	
	///mention user defined service
	
	Order createOder(Order order);
	
	//list of orders
	List<Order> getAllListOfOrder();

}
