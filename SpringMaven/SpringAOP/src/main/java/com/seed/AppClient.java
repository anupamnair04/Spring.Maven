package com.seed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class AppClient {
    public static void main( String[] args ){
    	
    	@SuppressWarnings("resource")
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		BankService service=context.getBean(BankService.class);
		service.showOfflineBalance();
		System.out.println("____________________________________________________");
		NetBanking nb=context.getBean(NetBanking.class);
		nb.showOnlineBalance();
    }
}