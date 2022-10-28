package info.novatec.bpm.interviews.senior.application.adapter.out.engine;

import java.util.List;

import org.springframework.stereotype.Component;

import info.novatec.bpm.interviews.senior.application.domain.model.Application;
import info.novatec.bpm.interviews.senior.application.domain.usecase.out.GetApplicationProcesses;

@Component
public class GetApplicationProcessesEngineAdapter implements GetApplicationProcesses {

	@Override
	public List<Application> getAllRunningApplicationProcesses() {
		//TODO: implement me!
		return null;
	}


}
