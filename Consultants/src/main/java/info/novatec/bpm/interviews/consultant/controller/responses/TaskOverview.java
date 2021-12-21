package info.novatec.bpm.interviews.consultant.controller.responses;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Data of an existing task")
public class TaskOverview {
    
    @ApiModelProperty("Name of the task")
    private String taskName;
    
    @ApiModelProperty("Key of the application the task refers to")
    private String applicationBusinessKey;
}
