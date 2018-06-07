package pe.optical.task;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//import pe.optical.application.CustomAuditable;
import pe.optical.application.annotation.CustomSchedule;
import pe.optical.application.aspect.LoggingAspect;

@Component
public class MailScheduledTask {//implements CustomAuditable{
	
	private static Logger log = LogManager.getLogger(LoggingAspect.class);
	
	@Scheduled(fixedDelayString = "${task.anotherTask.fixedDelay.in.milliseconds}")
	@CustomSchedule
	public void doSomething() {
		// something that should execute periodically
		log.info("RUNNING A CRON");
	}
	
	@Scheduled(fixedDelayString = "${task.emailSending.fixedDelay.in.milliseconds}")	
	public void sendEmail() {
		log.info("SENDING EMAIL - CRON");
	}
	
	@Scheduled(cron = "${task.batchProcessing.cron.expression}")
	@CustomSchedule
	public void batchProcessing() {
		log.info("BATCH PROCESSING TASK - CRON");
	}

//	@Override
//	public Logger getLogger() {
//		return LogManager.getLogger(getClass());
//	}

}
