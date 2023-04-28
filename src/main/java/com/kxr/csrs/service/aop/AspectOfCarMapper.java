package com.kxr.csrs.service.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectOfCarMapper {

    private Logger logger = Logger.getLogger(AspectOfCarMapper.class);

    @Pointcut("execution(* com.kxr.csrs.mapper.CarMapper.*(..))")
    public void pointOfCarDao() {

    }

    @Around("pointOfCarDao()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        String methodName = proceedingJoinPoint.getSignature().getName();
        logger.info("开始执行" + methodName + "方法");
        Object returnValue = null;
        try {
            returnValue = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        logger.info(methodName + "方法执行完毕");
        return returnValue;
    }

    @AfterThrowing(value = "pointOfCarDao()", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        String methodName = joinPoint.getSignature().getName();
        logger.error(methodName + "方法异常:" + exception);
    }
}
