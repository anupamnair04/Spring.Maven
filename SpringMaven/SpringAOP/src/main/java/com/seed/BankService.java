package com.seed;

import org.springframework.stereotype.Component;

@Component
public class BankService {
	
	public void showOfflineBalance() {
		System.out.println("The Account Balance is Rs 250000");
	}
}