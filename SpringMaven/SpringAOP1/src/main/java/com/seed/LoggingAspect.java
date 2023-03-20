package com.seed;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//if we want to apply advice all methods use wild cards
//jointpoint are methods on which advice is applied
//pointcut is location where advice is  applied
@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggingAspect { 
	
	@Before("execution(* transferAmount*(..))")
	public void log1() {
	  System.out.println("***before transfer....");
	 	  
	}
	/*execution(* *(..)) means method with any return data type and any name   */   	  
	@AfterThrowing(pointcut="execution(* *(..))",throwing= "ex")//(..) means it can be work with zero or any num arg methods
	public void log2(InSufficientFund ex) {
	  System.out.println("***after throwing "+ex);
	  
	}
    @AfterReturning(pointcut="execution(* getBalance())",returning="bal")
	public void log3(double bal) {
	  System.out.println("***after returning from getBalance amount ="+bal);
	  
	}
	@Before("myPointCut()")
	public void log2() {
	  System.out.println("we are mainitaing logs in log2....");
		  
	}  
    @Before("myPointCut()")
	public void log3() throws InSufficientFund{
	  System.out.println("we are mainitaing logs in log3....");	 	  
	} 
    @Pointcut("execution(public void showBalance())")
    public void myPointCut() {   
    	
    } 
}