package com.demo.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.bean.Pensioner;
import com.demo.repo.PensionserRepo;
import com.demo.service.PensionerService;

public class PensionerServviceImpl implements PensionerService{

	@Autowired 
	PensionserRepo pensionserRepo ;
	
	@Override
	//get by aadharcardid
	public Optional<Pensioner> getPensionerDetailsByAaddhar(long aadharcardid) {
		Optional<Pensioner> pensionerget = pensionserRepo.findById(aadharcardid);
		return pensionerget;
	}

	/*
	 * @Override public Integer pensionCalculator(double basicsalary, double
	 * dearnessallowance, int workedageinorganization) {
	 * 
	 * return null; }
	 */

}
