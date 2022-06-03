package com.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.bean.Pensioner;

@Service
public interface PensionerService {
	
	//GET PensionerDetailss servcie
	Optional<Pensioner> getPensionerDetailsByAaddhar(long aadharcardid);

	
	/*
	 * //post Integer pensionCalculator(double basicsalary,double
	 * dearnessallowance,int workedageinorganization);
	 */
}
