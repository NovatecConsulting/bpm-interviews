package info.novatec.bpm.interviews.consultant.service;

import org.camunda.bpm.engine.RuntimeService;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.stereotype.Component;

@Component
public class BewerbungServiceTest {

	@Test
	public void startBewerbungProzess_should_start_prozess_with_key() {
		RuntimeService runtimeService = Mockito.mock(RuntimeService.class);
		BewerbungService bewerbungService = new BewerbungService(runtimeService);
		
		bewerbungService.startBewerbungProzess("Holger", "12345");
		
		Mockito.verify(runtimeService).startProcessInstanceByKey("application-process", "12345");
	}

}
