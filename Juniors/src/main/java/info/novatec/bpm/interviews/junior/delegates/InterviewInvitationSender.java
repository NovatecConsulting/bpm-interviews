package info.novatec.bpm.interviews.junior.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

/**
 * Message implementation for inviting an applicant to an interview.
 * 
 * @author Ben Fuernrohr
 */
@Component
public class InterviewInvitationSender implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        System.out.println(
            "Dear Applicant,\nwe would like to invite you to a job interview taking place at our company building next monday at 10 am.\nSincerely,\nCompany");

    }

}
