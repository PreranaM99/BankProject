package com.main;
import com.service.A;
import com.service.B;
import com.MyExceptions.InsuffientFundsException;
import com.MyExceptions.OutOfLimitException;
import com.beans.Customer;
public class App {
public static void main(String[] args) {

	Customer c1 =new Customer("Spider Man", 6000);
	Customer c2 =new Customer("Iron Man", 8000);
	
	A a= new A();
	a.deposit(c1,5000);
	a.deposit(c2,5000);
	
	B b= new B();
	try {
	b.withdraw(c1,2000);
	}
	catch(OutOfLimitException oe) {
		System.out.println("Amount entered is out of limit,transaction failed ");
		
	}
	catch(InsuffientFundsException ie) {
		System.out.println(" Insufficient balance amount, transaction failed");
	}
	System.out.println(c1);
	System.out.println(c2);
}
}
