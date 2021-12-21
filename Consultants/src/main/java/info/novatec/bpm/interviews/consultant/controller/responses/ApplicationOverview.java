package info.novatec.bpm.interviews.consultant.controller.responses;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Data of an application process")
public class ApplicationOverview {

    @ApiModelProperty("Business key for this application")
    private String applicationKey;
    
    @ApiModelProperty("Name of the applicant")
    private String applicantName;    
}
