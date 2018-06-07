package pe.optical.task;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MailAsyncTask {
	
	@Async
	Future<String> returnSomething(int i) {
		return null;
		// this will be executed asynchronously
	}

}
