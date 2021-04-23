package com.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAspect implements MethodInterceptor{
public Object invoke(MethodInvocation m) throws Throwable {
	System.out.println("Authentication Done");
	Object ob = m.proceed();
	System.out.println("Logging Information");
	return ob;
}
}
