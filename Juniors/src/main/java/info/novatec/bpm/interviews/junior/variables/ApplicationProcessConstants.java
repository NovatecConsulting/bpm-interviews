package info.novatec.bpm.interviews.junior.variables;

/**
 * Interface holding the name of all process variables. According to Camunda best practices.
 * 
 * @author Ben Fuernrohr
 */
public interface ApplicationProcessConstants {

    /** Name of String holding the application content */
    String VAR_NAME_APPLICATION_CONTENT = "applicationContent";

    /** Name of boolean indicating whether the application was complete or missing information */
    String VAR_NAME_APPLICATION_COMPLETE = "application_complete";

    /** Name of boolean indicating whether the application was approved of by a user */
    String VAR_NAME_MANUALLY_APPROVED = "approved";

    /** Name of boolean indicating whether a positive impression of the applicant was found */
    String VAR_NAME_POSITIVE_IMPRESSION = "positive_Impression";

    /** Name of boolean indicating whether the interview was successful */
    String VAR_NAME_INTERVIEW_SUCCESSFUL = "succesful";
}
