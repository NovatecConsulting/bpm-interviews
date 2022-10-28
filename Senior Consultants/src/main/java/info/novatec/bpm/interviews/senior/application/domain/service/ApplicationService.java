package info.novatec.bpm.interviews.senior.application.domain.service;

import java.util.List;

import org.springframework.stereotype.Component;

import info.novatec.bpm.interviews.senior.application.domain.model.Application;
import info.novatec.bpm.interviews.senior.application.domain.usecase.in.CreateApplication;
import info.novatec.bpm.interviews.senior.application.domain.usecase.in.GetApplications;
import info.novatec.bpm.interviews.senior.application.domain.usecase.out.GetApplicationProcesses;
import info.novatec.bpm.interviews.senior.application.domain.usecase.out.StartApplicationProcess;

@Component
public class ApplicationService implements CreateApplication, GetApplications {
	
	private final GetApplicationProcesses getApplicationProcesses;
	private final StartApplicationProcess startApplicationProcess;	

	public ApplicationService(GetApplicationProcesses getApplicationProcesses,
			StartApplicationProcess startApplicationProcess) {
		super();
		this.getApplicationProcesses = getApplicationProcesses;
		this.startApplicationProcess = startApplicationProcess;
	}

	@Override
	public void withNameAndBusinessKey(String name, String businessKey) {
		startApplicationProcess.withNameAndBusinessKey(name, businessKey);		
	}

	@Override
	public List<Application> getAll() {
		return getApplicationProcesses.getAllRunningApplicationProcesses();
	}

}
