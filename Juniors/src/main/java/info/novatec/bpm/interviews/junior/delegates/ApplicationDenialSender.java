package info.novatec.bpm.interviews.junior.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

/**
 * Message implementation for declining an application.
 * 
 * @author Ben Fuernrohr
 */
@Component
public class ApplicationDenialSender implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        System.out.println(
            "Dear Applicant,\nwe regret to inform you that your application has been declined.\nWe wish you best of luck with your future endeavors!\nSincerely,\nCompany");

    }

}
