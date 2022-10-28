package info.novatec.bpm.interviews.junior.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import info.novatec.bpm.interviews.junior.controller.requests.StartAplicationData;
import info.novatec.bpm.interviews.junior.controller.responses.ApplicationOverview;
import info.novatec.bpm.interviews.junior.controller.responses.TaskOverview;
import info.novatec.bpm.interviews.junior.service.BewerbungService;
import io.swagger.annotations.ApiOperation;

@RestController
public class ApplicationController {
	
	private final BewerbungService bewerbungService;
	
	public ApplicationController(BewerbungService bewerbungService) {
		this.bewerbungService = bewerbungService;
	}
    
    private static final String APPLICATION_BASE_PATH = "application";

    @PostMapping(APPLICATION_BASE_PATH + "/start")
    @ApiOperation("Start a new application process")
    public void startApplication(@RequestBody StartAplicationData startApplicationData) {
		bewerbungService.startBewerbungProzess(startApplicationData.getApplicantName(),
				startApplicationData.getApplicationKey());
    }
    
    @GetMapping(APPLICATION_BASE_PATH + "/{applicationKey}/getTasks")
    @ApiOperation("Get all open tasks for an application process with a given key")
    public List<TaskOverview> getTasksForApplication(@PathVariable String applicationKey) {
        return null;
    }
    
    @GetMapping(APPLICATION_BASE_PATH)
    @ApiOperation("Receive an overview over all application processes")
    public ApplicationOverview getAllApplications() {
        return null;
    }
}
