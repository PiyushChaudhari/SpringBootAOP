package com.boot.component;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectAddition {

	@Before("execution(* com.boot.service.*.*(..))")
	public void aspectBefore(){
		System.out.println("@Before:"+new Date());
	}
	
	@After("execution(* com.boot.service.*.*(..))")
	public void aspectAfter(){
		System.out.println("@After:"+new Date());
	}
	
//	@Around("execution(* com.boot.service.*.*(..))")
//	public void aspectAround(ProceedingJoinPoint joinPoint) throws Throwable{
//		System.out.println("@Around: Before "+ new Date());
//		System.out.println("process: "+ joinPoint.proceed());
//		System.out.println("@Around: After "+ new Date());
//	}
	
	@AfterReturning(pointcut="execution(* com.boot.service.*.*(..))",returning="val")
	public void aspectAfterReturning(Object val){
		System.out.println("Method return value:"+ val);
		System.out.println("@AfterReturning:"+new Date());
	}
	
	@AfterThrowing(pointcut="execution(* com.boot.service.*.*(..))",throwing="runtimeException")
	public void aspectAfterThrowing(RuntimeException runtimeException){
		System.out.println("@AfterReturning:"+new Date());
		System.out.println("Exception Message::"+ runtimeException.getMessage());
	}
}
