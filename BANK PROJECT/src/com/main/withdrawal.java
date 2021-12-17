package com.main;

import com.MyExceptions.InsuffientFundsException;
import com.MyExceptions.OutOfLimitException;
import com.beans.Customer;

public interface withdrawal {
	double limit = 50000;
 void withdraw (Customer customer,double amount)
		 throws OutOfLimitException, InsuffientFundsException ;
}
 
