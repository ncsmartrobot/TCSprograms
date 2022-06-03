package com.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Pensioner;
import com.demo.service.PensionerService;

@RestController
public class PensionerController {

	@Autowired 
	PensionerService pensionerservice;
	
	@GetMapping(value = "/PensionerDetailsByAaddhar")
	Optional<Pensioner> getPensionerDetailsByAaddhar(long aadharcardid){
		return pensionerservice.getPensionerDetailsByAaddhar(aadharcardid);
		
	}
}
