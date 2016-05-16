package com.spring.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Timer {

	public Timer() {
		// TODO Auto-generated constructor stub
		System.out.println("-----------------------------");
	}

	// 可以尝试下这两种注解
	// @Around("execution(* org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter.handle(..))")
	@Around("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
	public Object logTimer(ProceedingJoinPoint thisJoinPoint) throws Throwable {
		System.out.println("------------------------------------");
		String clazzName = thisJoinPoint.getTarget().getClass().getName();
		String methodName = thisJoinPoint.getSignature().getName();

		// 计时并调用目标函数
		long start = System.currentTimeMillis();
		Object result = thisJoinPoint.proceed();
		long time = System.currentTimeMillis() - start;

		// 输出计时信息
		System.out.println("操作计时：" + time + "ms 类名: " + clazzName + " 方法名:"
				+ methodName + "()");

		return result;
	}
}
