package info.novatec.bpm.interviews.junior.controller.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Data for starting a new application process")
public class StartAplicationData {

    @ApiModelProperty(value = "Unique business key for this application", example = "255503")
    private String applicationKey;
    
    @ApiModelProperty(value = "Name of the applicant", example = "Max Mustermann")
    private String applicantName;

    public StartAplicationData() {
        
    }
    
    public StartAplicationData(String applicationKey, String applicantName) {
        this.applicationKey = applicationKey;
        this.applicantName = applicantName;
    }

    public String getApplicationKey() {
        return this.applicationKey;
    }
    
    public void setApplicationKey(String applicationKey) {
        this.applicationKey = applicationKey;
    }
    
    public String getApplicantName() {
        return this.applicantName;
    }
    
    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }
}
