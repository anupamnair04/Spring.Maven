package com.seed;

import org.springframework.stereotype.Component;
//offline banking system
@Component
public class BankService {
	
    public void transferAmountByDebitCard(int amount) {
    	System.out.println("Amount "+amount+" transfered by debit card");
    }
    public void showBalance() {
    	System.out.println("showing the  balance");
    }
}