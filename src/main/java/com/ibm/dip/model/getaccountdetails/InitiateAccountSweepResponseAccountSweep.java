package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAccountSweepResponseAccountSweep
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class InitiateAccountSweepResponseAccountSweep   {
  @JsonProperty("AccountSweepDefinition")
  private String accountSweepDefinition;

  @JsonProperty("AccountSweepApplicationSchedule")
  private String accountSweepApplicationSchedule;

  public InitiateAccountSweepResponseAccountSweep accountSweepDefinition(String accountSweepDefinition) {
    this.accountSweepDefinition = accountSweepDefinition;
    return this;
  }

  /**
   * Get accountSweepDefinition
   * @return accountSweepDefinition
  */
  @ApiModelProperty(value = "")


  public String getAccountSweepDefinition() {
    return accountSweepDefinition;
  }

  public void setAccountSweepDefinition(String accountSweepDefinition) {
    this.accountSweepDefinition = accountSweepDefinition;
  }

  public InitiateAccountSweepResponseAccountSweep accountSweepApplicationSchedule(String accountSweepApplicationSchedule) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateAccountSweepResponseAccountSweep initiateAccountSweepResponseAccountSweep = (InitiateAccountSweepResponseAccountSweep) o;
    return Objects.equals(this.accountSweepDefinition, initiateAccountSweepResponseAccountSweep.accountSweepDefinition) &&
        Objects.equals(this.accountSweepApplicationSchedule, initiateAccountSweepResponseAccountSweep.accountSweepApplicationSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepDefinition, accountSweepApplicationSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountSweepResponseAccountSweep {\n");
    
    sb.append("    accountSweepDefinition: ").append(toIndentedString(accountSweepDefinition)).append("\n");
    sb.append("    accountSweepApplicationSchedule: ").append(toIndentedString(accountSweepApplicationSchedule)).append("\n");
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

