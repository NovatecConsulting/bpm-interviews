package info.novatec.bpm.interviews.junior.variables;

import org.camunda.bpm.engine.delegate.VariableScope;

/**
 * Data accessor class to handle safe access to process variables. According to Camunda best practices.
 * 
 * @author Ben Fuernrohr
 */
public class ApplicationProcessVariables {

    /** VariableScope or Execution */
    private VariableScope variableScope;

    public ApplicationProcessVariables(VariableScope variableScope) {
        this.variableScope = variableScope;
    }

    /**
     * @return {@code true} if no information was missing in the application. Otherwise {@code false}.
     */
    public boolean getApplicationComplete() {
        return (boolean) variableScope.getVariable(ApplicationProcessConstants.VAR_NAME_APPLICATION_COMPLETE);
    }

    /**
     * Sets the variable indicating whether or not information was missing in the application.
     * 
     * @param applicationComplete
     *            {@code true} if no information was missing in the application.
     */
    public void setApplicationComplete(boolean applicationComplete) {
        variableScope.setVariable(ApplicationProcessConstants.VAR_NAME_APPLICATION_COMPLETE, applicationComplete);
    }

    /**
     * @return {@code true} if the job interview was successful. Otherwise {@code false}.
     */
    public boolean getInterviewSuccessful() {
        return (boolean) variableScope.getVariable(ApplicationProcessConstants.VAR_NAME_INTERVIEW_SUCCESSFUL);
    }

    /**
     * Sets the variable indicating whether or not the job interview was successful.
     * 
     * @param interviewSuccessful
     *            {@code true} if the interview was successful.
     */
    public void setInterviewSuccessful(boolean interviewSuccessful) {
        variableScope.setVariable(ApplicationProcessConstants.VAR_NAME_INTERVIEW_SUCCESSFUL, interviewSuccessful);
    }

    /**
     * @return {@code true} if at least one person gave a positive impression of the applicant. Otherwise {@code false}.
     */
    public boolean getPositiveImpression() {
        return (boolean) variableScope.getVariable(ApplicationProcessConstants.VAR_NAME_POSITIVE_IMPRESSION);
    }

    /**
     * Sets the variable indicating whether or not a positive impression was given.
     * 
     * @param positiveImpression
     *            {@code true} if a positive impression was given.
     */
    public void setPositiveImpression(boolean positiveImpression) {
        variableScope.setVariable(ApplicationProcessConstants.VAR_NAME_POSITIVE_IMPRESSION, positiveImpression);
    }

    /**
     * @return {@code true} if the application was approved by a person. Otherwise {@code false}.
     */
    public boolean getManualApproval() {
        return (boolean) variableScope.getVariable(ApplicationProcessConstants.VAR_NAME_MANUALLY_APPROVED);
    }

    /**
     * Sets the variable indicating whether or not the application was approved of.
     * 
     * @param manualApproval
     *            {@code true} if someone approved the application.
     */
    public void setManualApproval(boolean manualApproval) {
        variableScope.setVariable(ApplicationProcessConstants.VAR_NAME_MANUALLY_APPROVED, manualApproval);
    }

    /**
     * @return the content of the application.
     */
    public String getApplicationContent() {
        return (String) variableScope.getVariable(ApplicationProcessConstants.VAR_NAME_APPLICATION_CONTENT);
    }

    /**
     * Sets the variable containing the application content.
     * 
     * @param applicationContent
     *            the content of the application
     */
    public void setApplicationContent(String applicationContent) {
        variableScope.setVariable(ApplicationProcessConstants.VAR_NAME_APPLICATION_CONTENT, applicationContent);
    }
}
