package info.novatec.bpm.interviews.senior.application.domain.usecase.in;

import java.util.List;

import info.novatec.bpm.interviews.senior.application.domain.model.Application;

public interface GetApplications {

	/**
	 * Retrieves all applications that are currently running.
	 * 
	 * @return A list of {@link Application} that are currently running.
	 */
	List<Application> getAll();
}
