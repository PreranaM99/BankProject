package com.service;

import com.beans.Customer;
import com.main.Deposit;

public class A implements Deposit{

	public void deposit(Customer customer, double amount) {
		customer.setBalance(customer.getBalance()+amount);
	}

}
