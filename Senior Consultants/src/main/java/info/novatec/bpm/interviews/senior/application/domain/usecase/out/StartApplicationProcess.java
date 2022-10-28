package info.novatec.bpm.interviews.senior.application.domain.usecase.out;

public interface StartApplicationProcess {
	/**
	 * Start a new Application process in camunda.
	 * 
	 * @param name        the name of the applicant.
	 * @param businessKey the business key referring to this application.
	 */
	void withNameAndBusinessKey(String name, String businessKey);
}
