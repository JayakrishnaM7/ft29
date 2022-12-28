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
 * ExecuteAccountSweepRequestAccountSweep
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class ExecuteAccountSweepRequestAccountSweep   {
  @JsonProperty("SweepApplicationRecord")
  private String sweepApplicationRecord;

  @JsonProperty("AccountSweepTargetAccount")
  private String accountSweepTargetAccount;

  @JsonProperty("AccountSweepAmount")
  private BigDecimal accountSweepAmount;

  @JsonProperty("AccountSweepExecutionDate")
  private String accountSweepExecutionDate;

  public ExecuteAccountSweepRequestAccountSweep sweepApplicationRecord(String sweepApplicationRecord) {
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

  public ExecuteAccountSweepRequestAccountSweep accountSweepTargetAccount(String accountSweepTargetAccount) {
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

  public ExecuteAccountSweepRequestAccountSweep accountSweepAmount(BigDecimal accountSweepAmount) {
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

  public ExecuteAccountSweepRequestAccountSweep accountSweepExecutionDate(String accountSweepExecutionDate) {
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
    ExecuteAccountSweepRequestAccountSweep executeAccountSweepRequestAccountSweep = (ExecuteAccountSweepRequestAccountSweep) o;
    return Objects.equals(this.sweepApplicationRecord, executeAccountSweepRequestAccountSweep.sweepApplicationRecord) &&
        Objects.equals(this.accountSweepTargetAccount, executeAccountSweepRequestAccountSweep.accountSweepTargetAccount) &&
        Objects.equals(this.accountSweepAmount, executeAccountSweepRequestAccountSweep.accountSweepAmount) &&
        Objects.equals(this.accountSweepExecutionDate, executeAccountSweepRequestAccountSweep.accountSweepExecutionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sweepApplicationRecord, accountSweepTargetAccount, accountSweepAmount, accountSweepExecutionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteAccountSweepRequestAccountSweep {\n");
    
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

