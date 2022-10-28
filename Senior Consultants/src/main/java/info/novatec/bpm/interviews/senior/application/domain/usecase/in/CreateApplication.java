package info.novatec.bpm.interviews.senior.application.domain.usecase.in;

public interface CreateApplication {

	/**
	 * Creates a new Application in the system.
	 * 
	 * @param name        the name of the applicant.
	 * @param businessKey the business key referring to this application.
	 */
	void withNameAndBusinessKey(String name, String businessKey);
}
