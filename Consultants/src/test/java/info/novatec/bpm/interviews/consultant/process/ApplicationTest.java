package info.novatec.bpm.interviews.consultant.process;

import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.assertThat;
import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.complete;
import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.task;
import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.withVariables;
import static org.camunda.bpm.extension.mockito.CamundaMockito.registerJavaDelegateMock;
import static org.camunda.bpm.extension.mockito.CamundaMockito.verifyJavaDelegateMock;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.extension.process_test_coverage.junit.rules.TestCoverageProcessEngineRuleBuilder;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

import info.novatec.bpm.interviews.consultant.delegates.ApplicationDenialSender;
import info.novatec.bpm.interviews.consultant.delegates.ApplicationTester;
import info.novatec.bpm.interviews.consultant.delegates.InterviewInvitationSender;
import info.novatec.bpm.interviews.consultant.delegates.JobOfferSender;

@Deployment(resources = "application.bpmn")
public class ApplicationTest {

    private static final String PROCESS_DEFINITION_KEY = "application_process";

    @Rule
    @ClassRule
    public static ProcessEngineRule rule = TestCoverageProcessEngineRuleBuilder.create().build();

    private RuntimeService runtimeService;

    @Before
    public void setup() {
        runtimeService = rule.getRuntimeService();

        registerJavaDelegateMock(ApplicationTester.class);
        registerJavaDelegateMock(InterviewInvitationSender.class);
        registerJavaDelegateMock(ApplicationDenialSender.class);
        registerJavaDelegateMock(JobOfferSender.class);
    }

    @Test
    public void testHappyPath() {
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(PROCESS_DEFINITION_KEY,
            Variables.putValue("application_complete", true));
        assertThat(processInstance).isActive();

        assertThat(processInstance).hasPassed("ServiceTask_BewerbungPruefen");
        verifyJavaDelegateMock(ApplicationTester.class).executed();

        assertThat(processInstance).isWaitingAtExactly("UserTask_BewerbungPruefen");
        complete(task(), withVariables("approved", true));

        assertThat(processInstance).hasPassed("SendTask_BewerberEinladen");
        verifyJavaDelegateMock(InterviewInvitationSender.class).executed();

        assertThat(processInstance).isWaitingAtExactly("UserTask_BewerbungsgespraechFueren");
        complete(task(), withVariables("succesful", true));

        assertThat(processInstance).hasPassed("EndTask_BewerberZusagen");
        verifyJavaDelegateMock(JobOfferSender.class).executed();
        
        assertThat(processInstance).hasNotPassed("EndTask_BewerberAbsagen");
        verifyJavaDelegateMock(ApplicationDenialSender.class).executedNever();
        assertThat(processInstance).isEnded();
    }
    
    @Test
    public void testAutomatedApplicationDenial() {
        ProcessInstance processInstance = runtimeService.createProcessInstanceByKey(PROCESS_DEFINITION_KEY)
            .startBeforeActivity("Gateway_BewerbungVollstaendig")
            .setVariable("application_complete", true)
            .execute();
        
        assertThat(processInstance).hasPassed("EndTask_BewerberAbsagen");
        verifyJavaDelegateMock(ApplicationDenialSender.class).executed();
        assertThat(processInstance).isEnded();
        
        assertThat(processInstance).hasNotPassed("UserTask_BewerbungPruefen");
        
        assertThat(processInstance).hasNotPassed("EndTask_BewerberZusagen");
        verifyJavaDelegateMock(JobOfferSender.class).executedNever();
    }

}
