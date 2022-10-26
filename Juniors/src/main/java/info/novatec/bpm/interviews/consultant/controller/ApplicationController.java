package info.novatec.bpm.interviews.consultant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import info.novatec.bpm.interviews.consultant.controller.requests.StartAplicationData;
import info.novatec.bpm.interviews.consultant.controller.responses.ApplicationOverview;
import info.novatec.bpm.interviews.consultant.controller.responses.TaskOverview;
import info.novatec.bpm.interviews.consultant.service.BewerbungService;
import io.swagger.annotations.ApiOperation;

@RestController
public class ApplicationController {
	
	@Autowired
	private final BewerbungService bewerbungService;
    
    private static final String APPLICATION_BASE_PATH = "application";

    @PostMapping(APPLICATION_BASE_PATH + "/start")
    @ApiOperation("Start a new application process")
    public void startApplication(@RequestBody StartAplicationData startApplicationData) {
		bewerbungService.startBewerbungProzess(startApplicationData.getApplicantName(),
				startApplicationData.getApplicantName());
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
