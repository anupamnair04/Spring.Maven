package com.seed;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggingAspect {
	@Before("execution(public void show*())")
	public void log() {
		System.out.println("we are maintaining logs...");
	}
	
	@After("execution(public void show*Balance())")
	public void commitWork() {
		System.out.println("we have commited our work....");
	}
}