package info.novatec.bpm.interviews.consultant.controller.responses;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Data of an application process")
public class ApplicationOverview {

    @ApiModelProperty("Business key for this application")
    private String applicationKey;
    
    @ApiModelProperty("Name of the applicant")
    private String applicantName;
    
    public ApplicationOverview() {
        
    }
    
    public ApplicationOverview(String applicationKey, String applicantName) {
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
