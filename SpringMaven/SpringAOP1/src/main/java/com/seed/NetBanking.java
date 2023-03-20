package com.seed;

import org.springframework.stereotype.Component;
//online banking system
@Component
public class NetBanking {
	int balance=34000;
		
	public void transferAmountCardLess(double amount) {
    	System.out.println("Amount "+amount+"transfered..from NetBanking");
    	
    	}
		
	public void withdrawAmount(int amount) throws InSufficientFund {
		if(balance>amount) {
			System.out.println("Amount "+amount+" Withdraw Successfully...");
		}else {			
				throw new InSufficientFund("InSufficient Amount....Can't Withdraw");
			
		}
	}
	public double getBalance() {
		System.out.println("Getting the balance");
		return balance;
	}
}