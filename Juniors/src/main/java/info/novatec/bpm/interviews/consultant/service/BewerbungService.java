package info.novatec.bpm.interviews.consultant.service;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.stereotype.Component;

@Component
public class BewerbungService {

	private final RuntimeService runtimeService;
	
	public BewerbungService(RuntimeService runtimeService) {
		this.runtimeService = runtimeService;
	}

	/**
	 * Startet einen Bewerbungs-Prozess unter Verwendung des Bewerbernamens und des
	 * Fachlichen Schl�ssels.
	 * 
	 * @param applicantName  Name des Bewerbers.
	 * @param applicationKey Fachlicher Schl�ssel.
	 */
	public void startBewerbungProzess(String applicantName, String applicationKey) {
		runtimeService.startProcessInstanceByKey("aplication-process", applicationKey);
	}

}
