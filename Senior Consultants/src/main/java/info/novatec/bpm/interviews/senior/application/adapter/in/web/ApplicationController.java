package info.novatec.bpm.interviews.senior.application.adapter.in.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import info.novatec.bpm.interviews.senior.application.adapter.in.web.model.requests.StartAplicationData;
import info.novatec.bpm.interviews.senior.application.adapter.in.web.model.responses.ApplicationOverview;
import info.novatec.bpm.interviews.senior.application.domain.model.Application;
import info.novatec.bpm.interviews.senior.application.domain.usecase.in.CreateApplication;
import info.novatec.bpm.interviews.senior.application.domain.usecase.in.GetApplications;
import io.swagger.annotations.ApiOperation;

@RestController
public class ApplicationController {
    
    private static final String APPLICATION_BASE_PATH = "application";
    
    private final CreateApplication createApplication;
	private final GetApplications getApplications;
	
    public ApplicationController(CreateApplication createApplication, GetApplications getApplications) {
		super();
		this.createApplication = createApplication;
		this.getApplications = getApplications;
	}

    @PostMapping(APPLICATION_BASE_PATH + "/start")
    @ApiOperation("Start a new application process")
    public void startApplication(@RequestBody StartAplicationData startApplicationData) {
		createApplication.withNameAndBusinessKey(startApplicationData.getApplicantName(),
				startApplicationData.getApplicationKey());
    }
    
    @GetMapping(APPLICATION_BASE_PATH)
    @ApiOperation("Receive an overview over all application processes")
    public List<ApplicationOverview> getAllApplications() {
        return getApplications.getAll().stream().map(this::toApplicationOverview).collect(Collectors.toList());
    }
    
    private final ApplicationOverview toApplicationOverview(Application application) {
    	return new ApplicationOverview(application.getKey(), application.getName());
    }
}
