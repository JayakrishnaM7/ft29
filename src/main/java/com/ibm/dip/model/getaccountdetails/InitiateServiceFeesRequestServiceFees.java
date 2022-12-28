package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateServiceFeesRequestServiceFees
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class InitiateServiceFeesRequestServiceFees   {
  @JsonProperty("FeeConfigurationProfile")
  private String feeConfigurationProfile;

  @JsonProperty("FeeType")
  private String feeType;

  public InitiateServiceFeesRequestServiceFees feeConfigurationProfile(String feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
    return this;
  }

  /**
   * Get feeConfigurationProfile
   * @return feeConfigurationProfile
  */
  @ApiModelProperty(value = "")


  public String getFeeConfigurationProfile() {
    return feeConfigurationProfile;
  }

  public void setFeeConfigurationProfile(String feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
  }

  public InitiateServiceFeesRequestServiceFees feeType(String feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * Get feeType
   * @return feeType
  */
  @ApiModelProperty(value = "")


  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateServiceFeesRequestServiceFees initiateServiceFeesRequestServiceFees = (InitiateServiceFeesRequestServiceFees) o;
    return Objects.equals(this.feeConfigurationProfile, initiateServiceFeesRequestServiceFees.feeConfigurationProfile) &&
        Objects.equals(this.feeType, initiateServiceFeesRequestServiceFees.feeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeConfigurationProfile, feeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateServiceFeesRequestServiceFees {\n");
    
    sb.append("    feeConfigurationProfile: ").append(toIndentedString(feeConfigurationProfile)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

