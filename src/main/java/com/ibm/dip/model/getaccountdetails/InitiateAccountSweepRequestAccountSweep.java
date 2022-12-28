package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAccountSweepRequestAccountSweep
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class InitiateAccountSweepRequestAccountSweep   {
  @JsonProperty("AccountSweepType")
  private String accountSweepType;

  @JsonProperty("AccountSweepApplicationSchedule")
  private String accountSweepApplicationSchedule;

  @JsonProperty("AccountSweepConfiguration")
  private String accountSweepConfiguration;

  @JsonProperty("TargetAccount")
  private String targetAccount;

  @JsonProperty("SweepMandate")
  private String sweepMandate;

  @JsonProperty("SweepProcessingSchedule")
  private String sweepProcessingSchedule;

  public InitiateAccountSweepRequestAccountSweep accountSweepType(String accountSweepType) {
    this.accountSweepType = accountSweepType;
    return this;
  }

  /**
   * Get accountSweepType
   * @return accountSweepType
  */
  @ApiModelProperty(value = "")


  public String getAccountSweepType() {
    return accountSweepType;
  }

  public void setAccountSweepType(String accountSweepType) {
    this.accountSweepType = accountSweepType;
  }

  public InitiateAccountSweepRequestAccountSweep accountSweepApplicationSchedule(String accountSweepApplicationSchedule) {
    this.accountSweepApplicationSchedule = accountSweepApplicationSchedule;
    return this;
  }

  /**
   * Get accountSweepApplicationSchedule
   * @return accountSweepApplicationSchedule
  */
  @ApiModelProperty(value = "")


  public String getAccountSweepApplicationSchedule() {
    return accountSweepApplicationSchedule;
  }

  public void setAccountSweepApplicationSchedule(String accountSweepApplicationSchedule) {
    this.accountSweepApplicationSchedule = accountSweepApplicationSchedule;
  }

  public InitiateAccountSweepRequestAccountSweep accountSweepConfiguration(String accountSweepConfiguration) {
    this.accountSweepConfiguration = accountSweepConfiguration;
    return this;
  }

  /**
   * Get accountSweepConfiguration
   * @return accountSweepConfiguration
  */
  @ApiModelProperty(value = "")


  public String getAccountSweepConfiguration() {
    return accountSweepConfiguration;
  }

  public void setAccountSweepConfiguration(String accountSweepConfiguration) {
    this.accountSweepConfiguration = accountSweepConfiguration;
  }

  public InitiateAccountSweepRequestAccountSweep targetAccount(String targetAccount) {
    this.targetAccount = targetAccount;
    return this;
  }

  /**
   * Get targetAccount
   * @return targetAccount
  */
  @ApiModelProperty(value = "")


  public String getTargetAccount() {
    return targetAccount;
  }

  public void setTargetAccount(String targetAccount) {
    this.targetAccount = targetAccount;
  }

  public InitiateAccountSweepRequestAccountSweep sweepMandate(String sweepMandate) {
    this.sweepMandate = sweepMandate;
    return this;
  }

  /**
   * Get sweepMandate
   * @return sweepMandate
  */
  @ApiModelProperty(value = "")


  public String getSweepMandate() {
    return sweepMandate;
  }

  public void setSweepMandate(String sweepMandate) {
    this.sweepMandate = sweepMandate;
  }

  public InitiateAccountSweepRequestAccountSweep sweepProcessingSchedule(String sweepProcessingSchedule) {
    this.sweepProcessingSchedule = sweepProcessingSchedule;
    return this;
  }

  /**
   * Get sweepProcessingSchedule
   * @return sweepProcessingSchedule
  */
  @ApiModelProperty(value = "")


  public String getSweepProcessingSchedule() {
    return sweepProcessingSchedule;
  }

  public void setSweepProcessingSchedule(String sweepProcessingSchedule) {
    this.sweepProcessingSchedule = sweepProcessingSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateAccountSweepRequestAccountSweep initiateAccountSweepRequestAccountSweep = (InitiateAccountSweepRequestAccountSweep) o;
    return Objects.equals(this.accountSweepType, initiateAccountSweepRequestAccountSweep.accountSweepType) &&
        Objects.equals(this.accountSweepApplicationSchedule, initiateAccountSweepRequestAccountSweep.accountSweepApplicationSchedule) &&
        Objects.equals(this.accountSweepConfiguration, initiateAccountSweepRequestAccountSweep.accountSweepConfiguration) &&
        Objects.equals(this.targetAccount, initiateAccountSweepRequestAccountSweep.targetAccount) &&
        Objects.equals(this.sweepMandate, initiateAccountSweepRequestAccountSweep.sweepMandate) &&
        Objects.equals(this.sweepProcessingSchedule, initiateAccountSweepRequestAccountSweep.sweepProcessingSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepType, accountSweepApplicationSchedule, accountSweepConfiguration, targetAccount, sweepMandate, sweepProcessingSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountSweepRequestAccountSweep {\n");
    
    sb.append("    accountSweepType: ").append(toIndentedString(accountSweepType)).append("\n");
    sb.append("    accountSweepApplicationSchedule: ").append(toIndentedString(accountSweepApplicationSchedule)).append("\n");
    sb.append("    accountSweepConfiguration: ").append(toIndentedString(accountSweepConfiguration)).append("\n");
    sb.append("    targetAccount: ").append(toIndentedString(targetAccount)).append("\n");
    sb.append("    sweepMandate: ").append(toIndentedString(sweepMandate)).append("\n");
    sb.append("    sweepProcessingSchedule: ").append(toIndentedString(sweepProcessingSchedule)).append("\n");
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

