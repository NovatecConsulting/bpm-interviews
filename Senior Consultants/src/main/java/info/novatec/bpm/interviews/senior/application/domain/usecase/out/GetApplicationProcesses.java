package info.novatec.bpm.interviews.senior.application.domain.usecase.out;

import java.util.List;

import info.novatec.bpm.interviews.senior.application.domain.model.Application;

public interface GetApplicationProcesses {

	/**
	 * Retrieves all current applications as derived from running application
	 * process instances.
	 * 
	 * @return A list of {@link Application} for which processes are currently
	 *         running.
	 */
	List<Application> getAllRunningApplicationProcesses();
}
