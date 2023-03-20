package com.seed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAOP { 
	public static void main(String[] args) throws InSufficientFund {
	   
	   @SuppressWarnings("resource")
	ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
	   BankService service=(BankService)context.getBean(BankService.class);
	   NetBanking netBanking=	context.getBean(NetBanking.class);
		
	   service.transferAmountByDebitCard(4567);
	   netBanking.transferAmountCardLess(40000);
		
	 //netBanking.withdrawAmount(43000);
	   netBanking.getBalance();
	   service.showBalance();
	}
}