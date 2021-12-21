package info.novatec.bpm.interviews.consultant.controller.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Data for starting a new application process")
public class StartAplicationData {

    @ApiModelProperty(value = "Unique business key for this application", example = "255503")
    private String applicationKey;
    
    @ApiModelProperty(value = "Name of the applicant", example = "Max Mustermann")
    private String applicantName;
}
