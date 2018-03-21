package com.qx.cfg.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import com.alibaba.fastjson.JSON;

@Aspect
@Component
@Order(Integer.MAX_VALUE - 1)
public class HttpDataAspect {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/*@Autowired
	IApilogService apilogService;
*/
	@Around("execution(@org.springframework.web.bind.annotation.RequestMapping * *(..))")
	public Object requestMappingAspect(ProceedingJoinPoint pjp) throws Throwable {
		Object result = null;
		MethodInvocationProceedingJoinPoint methodJoinPoint = (MethodInvocationProceedingJoinPoint) pjp;
		MethodSignature methodSign = (MethodSignature) methodJoinPoint.getSignature();
		String reqParams = JSON.toJSONString(methodJoinPoint.getArgs());
		long startTime = System.currentTimeMillis();
		// methodSign.getDeclaringTypeName(), methodSign.getName()
		String name = methodSign.toShortString();
		String resp = "";
		int rstatus = 0;
		String rmsg = "";
		try {
			result = pjp.proceed();
		} catch (Exception e) {
			logger.error("[HTTP] process error:", e);
			rstatus = 1;
			rmsg = e.getMessage();
		}
		long time = System.currentTimeMillis() - startTime;
		resp = JSON.toJSONString(result);
		return result;
	}

	private Class<?> returnClass(ProceedingJoinPoint pjp) {
		MethodInvocationProceedingJoinPoint methodJoinPoint = (MethodInvocationProceedingJoinPoint) pjp;
		MethodSignature methodSign = (MethodSignature) methodJoinPoint.getSignature();
		// String returnType = methodSign.getReturnType().getSimpleName();
		return methodSign.getReturnType();
	}
}
