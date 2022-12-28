package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountSweep
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class AccountSweep   {
  @JsonProperty("AccountSweepType")
  private String accountSweepType;

  @JsonProperty("AccountSweepDefinition")
  private String accountSweepDefinition;

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

  @JsonProperty("SweepApplicationRecord")
  private String sweepApplicationRecord;

  @JsonProperty("AccountSweepTargetAccount")
  private String accountSweepTargetAccount;

  @JsonProperty("AccountSweepAmount")
  private BigDecimal accountSweepAmount;

  @JsonProperty("AccountSweepExecutionDate")
  private String accountSweepExecutionDate;

  public AccountSweep accountSweepType(String accountSweepType) {
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

  public AccountSweep accountSweepDefinition(String accountSweepDefinition) {
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

  public AccountSweep accountSweepApplicationSchedule(String accountSweepApplicationSchedule) {
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

  public AccountSweep accountSweepConfiguration(String accountSweepConfiguration) {
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

  public AccountSweep targetAccount(String targetAccount) {
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

  public AccountSweep sweepMandate(String sweepMandate) {
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

  public AccountSweep sweepProcessingSchedule(String sweepProcessingSchedule) {
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

  public AccountSweep sweepApplicationRecord(String sweepApplicationRecord) {
    this.sweepApplicationRecord = sweepApplicationRecord;
    return this;
  }

  /**
   * Get sweepApplicationRecord
   * @return sweepApplicationRecord
  */
  @ApiModelProperty(value = "")


  public String getSweepApplicationRecord() {
    return sweepApplicationRecord;
  }

  public void setSweepApplicationRecord(String sweepApplicationRecord) {
    this.sweepApplicationRecord = sweepApplicationRecord;
  }

  public AccountSweep accountSweepTargetAccount(String accountSweepTargetAccount) {
    this.accountSweepTargetAccount = accountSweepTargetAccount;
    return this;
  }

  /**
   * Get accountSweepTargetAccount
   * @return accountSweepTargetAccount
  */
  @ApiModelProperty(value = "")


  public String getAccountSweepTargetAccount() {
    return accountSweepTargetAccount;
  }

  public void setAccountSweepTargetAccount(String accountSweepTargetAccount) {
    this.accountSweepTargetAccount = accountSweepTargetAccount;
  }

  public AccountSweep accountSweepAmount(BigDecimal accountSweepAmount) {
    this.accountSweepAmount = accountSweepAmount;
    return this;
  }

  /**
   * Get accountSweepAmount
   * @return accountSweepAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAccountSweepAmount() {
    return accountSweepAmount;
  }

  public void setAccountSweepAmount(BigDecimal accountSweepAmount) {
    this.accountSweepAmount = accountSweepAmount;
  }

  public AccountSweep accountSweepExecutionDate(String accountSweepExecutionDate) {
    this.accountSweepExecutionDate = accountSweepExecutionDate;
    return this;
  }

  /**
   * Get accountSweepExecutionDate
   * @return accountSweepExecutionDate
  */
  @ApiModelProperty(value = "")


  public String getAccountSweepExecutionDate() {
    return accountSweepExecutionDate;
  }

  public void setAccountSweepExecutionDate(String accountSweepExecutionDate) {
    this.accountSweepExecutionDate = accountSweepExecutionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSweep accountSweep = (AccountSweep) o;
    return Objects.equals(this.accountSweepType, accountSweep.accountSweepType) &&
        Objects.equals(this.accountSweepDefinition, accountSweep.accountSweepDefinition) &&
        Objects.equals(this.accountSweepApplicationSchedule, accountSweep.accountSweepApplicationSchedule) &&
        Objects.equals(this.accountSweepConfiguration, accountSweep.accountSweepConfiguration) &&
        Objects.equals(this.targetAccount, accountSweep.targetAccount) &&
        Objects.equals(this.sweepMandate, accountSweep.sweepMandate) &&
        Objects.equals(this.sweepProcessingSchedule, accountSweep.sweepProcessingSchedule) &&
        Objects.equals(this.sweepApplicationRecord, accountSweep.sweepApplicationRecord) &&
        Objects.equals(this.accountSweepTargetAccount, accountSweep.accountSweepTargetAccount) &&
        Objects.equals(this.accountSweepAmount, accountSweep.accountSweepAmount) &&
        Objects.equals(this.accountSweepExecutionDate, accountSweep.accountSweepExecutionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepType, accountSweepDefinition, accountSweepApplicationSchedule, accountSweepConfiguration, targetAccount, sweepMandate, sweepProcessingSchedule, sweepApplicationRecord, accountSweepTargetAccount, accountSweepAmount, accountSweepExecutionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSweep {\n");
    
    sb.append("    accountSweepType: ").append(toIndentedString(accountSweepType)).append("\n");
    sb.append("    accountSweepDefinition: ").append(toIndentedString(accountSweepDefinition)).append("\n");
    sb.append("    accountSweepApplicationSchedule: ").append(toIndentedString(accountSweepApplicationSchedule)).append("\n");
    sb.append("    accountSweepConfiguration: ").append(toIndentedString(accountSweepConfiguration)).append("\n");
    sb.append("    targetAccount: ").append(toIndentedString(targetAccount)).append("\n");
    sb.append("    sweepMandate: ").append(toIndentedString(sweepMandate)).append("\n");
    sb.append("    sweepProcessingSchedule: ").append(toIndentedString(sweepProcessingSchedule)).append("\n");
    sb.append("    sweepApplicationRecord: ").append(toIndentedString(sweepApplicationRecord)).append("\n");
    sb.append("    accountSweepTargetAccount: ").append(toIndentedString(accountSweepTargetAccount)).append("\n");
    sb.append("    accountSweepAmount: ").append(toIndentedString(accountSweepAmount)).append("\n");
    sb.append("    accountSweepExecutionDate: ").append(toIndentedString(accountSweepExecutionDate)).append("\n");
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

