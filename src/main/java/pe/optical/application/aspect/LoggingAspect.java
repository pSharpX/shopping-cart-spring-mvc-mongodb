package pe.optical.application.aspect;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import pe.optical.application.CustomAuditable;

@Component
@Aspect
public class LoggingAspect {
	
	private static Logger log = LogManager.getLogger(LoggingAspect.class);
	
	// || execution(* pe.optical.task.*.*(..))
	@Before("execution(* pe.optical.service.*.*(..))")
	public void beforeExecution(JoinPoint jp) {
		if (jp.getThis() instanceof CustomAuditable) {
			Logger log = ((CustomAuditable) jp.getThis()).getLogger();
			log.info("Before Method: " + jp.getSignature().getName() + " - " + new Date());
			log.info("Class: " + jp.getTarget().getClass().getSimpleName());
		}
	}

	// examples

//	@Pointcut("execution(* aaa.bbb.ccc.ddd.*.*(..))")
//	public void methodInDddPackage() {
//	}
//
//	@Pointcut("execution(* aaa.bbb.ccc.eee.*.*(..))")
//	public void methodInEeePackage() {
//	}
//
//	@Pointcut("methodInDddPackage() || methodInEeePackage()")
//	public void methodInDddOrEeePackage() {
//	}

	// Below equivalent in-line expression

//	@Pointcut("execution(* aaa.bbb.ccc.ddd.*.*(..)) || execution(* aaa.bbb.ccc.eee.*.*(..))")
//	public void methodInDddOrEeePackageInline() {
//	}

	// Other example

	// @Pointcut("within(@org.rejeev.Monitor *)")
	// public void beanAnnotatedWithMonitor() {
	// }

	// @Pointcut("execution(public * *(..))")
	// public void publicMethod() {
	// }

	// Below equivalent in-line expression

	// @Pointcut("publicMethod() && beanAnnotatedWithMonitor()")
	// public void publicMethodInsideAClassMarkedWithAtMonitor() {
	// }

	// Logging methods and scheduled methods

//	@Pointcut("execution(* pe.optical.service.*.*(..))")
//	public void beforeMethodExecution(JoinPoint jp) {
//
//	}

	@Pointcut("execution(* pe.optical.task.*.*(..))")
	public void scheduleAndTaskMethods() {
	}

	// @annotation(org.springframework.scheduling.annotation.Scheduled)
	// @annotation(pe.optical.application.annotation.CustomSchedule)
	// "within(@pe.optical.application.annotation.CustomSchedule *)"
	@Pointcut("@annotation(pe.optical.application.annotation.CustomSchedule)")
	public void scheduleAnnotatedMethods() {
	}

	@Before("scheduleAndTaskMethods() && scheduleAnnotatedMethods()")
	public void beforeScheduleTaskAnnotatedMethodExecution(JoinPoint jp) {
		log.info("Before Method: " + jp.getSignature().getName() + " - " + new Date());
		log.info("Class: " + jp.getTarget().getClass().getSimpleName());
		
		if (jp.getThis() instanceof CustomAuditable) {
//			Logger log = ((CustomAuditable) jp.getThis()).getLogger();
//			log.info("Before Method: " + jp.getSignature().getName() + " - " + new Date());
//			log.info("Class: " + jp.getTarget().getClass().getSimpleName());
		}
	}

	//
	// @After("execution(* pe.optical.service.*.*(..))")
	// public void afterExecution(JoinPoint jp) {
	//
	// }

	@AfterReturning(pointcut = "execution(* pe.optical.service.*.*(..))", returning = "result")
	public void afterReturningExecution(JoinPoint jp, Object result) {
		if (jp.getThis() instanceof CustomAuditable) {
			Logger log = ((CustomAuditable) jp.getThis()).getLogger();
			log.info("After Returning Method: " + jp.getSignature().getName() + " - " + new Date());
			log.info("Class: " + jp.getTarget().getClass().getSimpleName());
			log.info("Returned Result: " + result);
		}
	}

	@AfterThrowing(pointcut = "execution(* pe.optical.service.*.*(..))", throwing = "ex")
	public void afterThrowingExecution(JoinPoint jp, Exception ex) {
		if (jp.getThis() instanceof CustomAuditable) {
			Logger log = ((CustomAuditable) jp.getThis()).getLogger();
			log.info("After Returning Method: " + jp.getSignature().getName() + " - " + new Date());
			log.info("Class: " + jp.getTarget().getClass().getSimpleName());
			log.error("Exeception: " + ex.getMessage());
			// log.error("Exeception Line: " + );
		}
	}

	// @Around("execution(* pe.optical.service.*.*(..))")
	// public void logAround(ProceedingJoinPoint preceedingJoinPoint) throws
	// Throwable {
	//
	// }

}
