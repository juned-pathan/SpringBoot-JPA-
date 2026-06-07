package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Repository.ICustomerRepository;
import com.nt.entity.Customer;

@Service
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
     @Autowired
	private ICustomerRepository custRepo;
     
	@Override
	public String registerCustomer(Customer cust) {
		//save the obj
		Customer savedCust=custRepo.save(cust);
		//get the genrated id value
		int idVal=savedCust.getCno();
		return "Customer object value is saved with id value::"+idVal;
		
		
	}

}
