package info.novatec.bpm.interviews.consultant.controller.responses;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Data of an existing task")
public class TaskOverview {
    
    @ApiModelProperty("Name of the task")
    private String taskName;
    
    @ApiModelProperty("Key of the application the task refers to")
    private String applicationBusinessKey;

    public TaskOverview() {
        
    }
    
    public TaskOverview(String taskName, String applicationBusinessKey) {
        super();
        this.taskName = taskName;
        this.applicationBusinessKey = applicationBusinessKey;
    }

    public String getTaskName() {
        return this.taskName;
    }
    
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    
    public String getApplicationBusinessKey() {
        return this.applicationBusinessKey;
    }

    public void setApplicationBusinessKey(String applicationBusinessKey) {
        this.applicationBusinessKey = applicationBusinessKey;
    }
}
