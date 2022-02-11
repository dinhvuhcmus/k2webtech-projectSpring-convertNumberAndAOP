package com.k2webtech.springboot.app.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeTrackerAdvice {

	Logger logger = LoggerFactory.getLogger(ExecutionTimeTrackerAdvice.class);

	@Around("@annotation(com.k2webtech.springboot.app.advice.TrackExecutionTime)")
	public Object trackTimeProcess(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object object = proceedingJoinPoint.proceed();
		long endTime = System.currentTimeMillis();
		logger.info("Method name " + proceedingJoinPoint.getSignature() + " takes " + (endTime - startTime) + " (ms) to execute.");
		return object;
	}

}