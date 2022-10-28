package info.novatec.bpm.interviews.senior.application.adapter.in.engine.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

/**
 * Message implementation for sending an applicant a job offer.
 * 
 * @author Ben Fuernrohr
 */
@Component
public class JobOfferSender implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {

        System.out.println(
            "Dear Applicant,\nwe are happy to inform you, that we would like to offer you the position you applied for.\nWe are looking forward to working with you!\nSincerely,\nCompany");
    }
}
