package com.service;

import com.MyExceptions.InsuffientFundsException;
import com.MyExceptions.OutOfLimitException;
import com.beans.Customer;
import com.main.withdrawal;

public class B implements withdrawal{

	@Override
	public void withdraw(Customer customer, double amount) 
			 throws OutOfLimitException,InsuffientFundsException {
		 if (amount > withdrawal.limit)
			 throw new OutOfLimitException();
		 
		 if (amount > customer.getBalance())
			 throw new InsuffientFundsException();
		 
		customer.setBalance(customer.getBalance()-amount);	
	}
	

}
