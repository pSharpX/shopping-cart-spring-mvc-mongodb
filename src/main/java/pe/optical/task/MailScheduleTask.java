package pe.optical.task;

import org.springframework.scheduling.annotation.Scheduled;

public class MailScheduleTask {
	
	@Scheduled(fixedDelayString = "${fixedDelay.in.milliseconds}")
	public void doSomething() {
		// something that should execute periodically
	}

}
