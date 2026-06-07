package com.nt.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.service.ICustomerMgmtService;

@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {

	@Autowired
	private ICustomerMgmtService custservice;
	
	@Override
	public void run(String... args) throws Exception {

   try {
	   Customer cust=new Customer();
	   cust.setCname("Sunil");
	   cust.setCaddrs("Pune");
	   cust.setBillAmt(8730.7);
	   
	   //invoke method
	   String msg=custservice.registerCustomer(cust);
	   System.out.println(msg);
   }
   catch(Exception e)
   {
	   e.printStackTrace();
   }

	}

}
