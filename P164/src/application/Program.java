package application;
import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {

		List<Account> list= new ArrayList<>();
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria",1000.00, 400.00));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Ana",500.00, 500.00));
		double sum = 0.0;
		for (Account acc:list) {
			sum +=acc.getBalance();
			
		}
		System.out.printf("Total Balance %.2f%n", sum);
		for(Account acc:list) {
			acc.deposit(10.0);
		}
		for(Account acc:list) {
			System.out.printf("Update balance Account %d: %.2f%n",acc.getNumber(),acc.getBalance());		
		}
		
	}

}