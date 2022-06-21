package com.geodev.di.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutExample {

//	@Pointcut("execution(* com.geodev.di.aop.TargetObject.hello*(..))")
//	@Pointcut("within(TargetObject)")
	@Pointcut("@annotation(GeoAnnotation)")
	public void targetObjectMethods() {
		
	}
}
