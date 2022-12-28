package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteServiceFeesRequestServiceFees
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class ExecuteServiceFeesRequestServiceFees   {
  @JsonProperty("FeeConfigurationProfile")
  private String feeConfigurationProfile;

  @JsonProperty("FeeType")
  private String feeType;

  @JsonProperty("FeeApplicationRecord")
  private String feeApplicationRecord;

  @JsonProperty("FeeTransaction")
  private String feeTransaction;

  @JsonProperty("TransactionDescription")
  private String transactionDescription;

  @JsonProperty("TransactionFeeType")
  private String transactionFeeType;

  @JsonProperty("FeeProjectionsandCommitments")
  private String feeProjectionsandCommitments;

  @JsonProperty("ProjectedTransactionDescription")
  private String projectedTransactionDescription;

  @JsonProperty("ProjectedTransactionFeeType")
  private String projectedTransactionFeeType;

  @JsonProperty("AccrualFeeType")
  private String accrualFeeType;

  public ExecuteServiceFeesRequestServiceFees feeConfigurationProfile(String feeConfigurationProfile) {
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

  public ExecuteServiceFeesRequestServiceFees feeType(String feeType) {
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

  public ExecuteServiceFeesRequestServiceFees feeApplicationRecord(String feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
    return this;
  }

  /**
   * Get feeApplicationRecord
   * @return feeApplicationRecord
  */
  @ApiModelProperty(value = "")


  public String getFeeApplicationRecord() {
    return feeApplicationRecord;
  }

  public void setFeeApplicationRecord(String feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
  }

  public ExecuteServiceFeesRequestServiceFees feeTransaction(String feeTransaction) {
    this.feeTransaction = feeTransaction;
    return this;
  }

  /**
   * Get feeTransaction
   * @return feeTransaction
  */
  @ApiModelProperty(value = "")


  public String getFeeTransaction() {
    return feeTransaction;
  }

  public void setFeeTransaction(String feeTransaction) {
    this.feeTransaction = feeTransaction;
  }

  public ExecuteServiceFeesRequestServiceFees transactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
    return this;
  }

  /**
   * Get transactionDescription
   * @return transactionDescription
  */
  @ApiModelProperty(value = "")


  public String getTransactionDescription() {
    return transactionDescription;
  }

  public void setTransactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
  }

  public ExecuteServiceFeesRequestServiceFees transactionFeeType(String transactionFeeType) {
    this.transactionFeeType = transactionFeeType;
    return this;
  }

  /**
   * Get transactionFeeType
   * @return transactionFeeType
  */
  @ApiModelProperty(value = "")


  public String getTransactionFeeType() {
    return transactionFeeType;
  }

  public void setTransactionFeeType(String transactionFeeType) {
    this.transactionFeeType = transactionFeeType;
  }

  public ExecuteServiceFeesRequestServiceFees feeProjectionsandCommitments(String feeProjectionsandCommitments) {
    this.feeProjectionsandCommitments = feeProjectionsandCommitments;
    return this;
  }

  /**
   * Get feeProjectionsandCommitments
   * @return feeProjectionsandCommitments
  */
  @ApiModelProperty(value = "")


  public String getFeeProjectionsandCommitments() {
    return feeProjectionsandCommitments;
  }

  public void setFeeProjectionsandCommitments(String feeProjectionsandCommitments) {
    this.feeProjectionsandCommitments = feeProjectionsandCommitments;
  }

  public ExecuteServiceFeesRequestServiceFees projectedTransactionDescription(String projectedTransactionDescription) {
    this.projectedTransactionDescription = projectedTransactionDescription;
    return this;
  }

  /**
   * Get projectedTransactionDescription
   * @return projectedTransactionDescription
  */
  @ApiModelProperty(value = "")


  public String getProjectedTransactionDescription() {
    return projectedTransactionDescription;
  }

  public void setProjectedTransactionDescription(String projectedTransactionDescription) {
    this.projectedTransactionDescription = projectedTransactionDescription;
  }

  public ExecuteServiceFeesRequestServiceFees projectedTransactionFeeType(String projectedTransactionFeeType) {
    this.projectedTransactionFeeType = projectedTransactionFeeType;
    return this;
  }

  /**
   * Get projectedTransactionFeeType
   * @return projectedTransactionFeeType
  */
  @ApiModelProperty(value = "")


  public String getProjectedTransactionFeeType() {
    return projectedTransactionFeeType;
  }

  public void setProjectedTransactionFeeType(String projectedTransactionFeeType) {
    this.projectedTransactionFeeType = projectedTransactionFeeType;
  }

  public ExecuteServiceFeesRequestServiceFees accrualFeeType(String accrualFeeType) {
    this.accrualFeeType = accrualFeeType;
    return this;
  }

  /**
   * Get accrualFeeType
   * @return accrualFeeType
  */
  @ApiModelProperty(value = "")


  public String getAccrualFeeType() {
    return accrualFeeType;
  }

  public void setAccrualFeeType(String accrualFeeType) {
    this.accrualFeeType = accrualFeeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteServiceFeesRequestServiceFees executeServiceFeesRequestServiceFees = (ExecuteServiceFeesRequestServiceFees) o;
    return Objects.equals(this.feeConfigurationProfile, executeServiceFeesRequestServiceFees.feeConfigurationProfile) &&
        Objects.equals(this.feeType, executeServiceFeesRequestServiceFees.feeType) &&
        Objects.equals(this.feeApplicationRecord, executeServiceFeesRequestServiceFees.feeApplicationRecord) &&
        Objects.equals(this.feeTransaction, executeServiceFeesRequestServiceFees.feeTransaction) &&
        Objects.equals(this.transactionDescription, executeServiceFeesRequestServiceFees.transactionDescription) &&
        Objects.equals(this.transactionFeeType, executeServiceFeesRequestServiceFees.transactionFeeType) &&
        Objects.equals(this.feeProjectionsandCommitments, executeServiceFeesRequestServiceFees.feeProjectionsandCommitments) &&
        Objects.equals(this.projectedTransactionDescription, executeServiceFeesRequestServiceFees.projectedTransactionDescription) &&
        Objects.equals(this.projectedTransactionFeeType, executeServiceFeesRequestServiceFees.projectedTransactionFeeType) &&
        Objects.equals(this.accrualFeeType, executeServiceFeesRequestServiceFees.accrualFeeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeConfigurationProfile, feeType, feeApplicationRecord, feeTransaction, transactionDescription, transactionFeeType, feeProjectionsandCommitments, projectedTransactionDescription, projectedTransactionFeeType, accrualFeeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteServiceFeesRequestServiceFees {\n");
    
    sb.append("    feeConfigurationProfile: ").append(toIndentedString(feeConfigurationProfile)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    feeApplicationRecord: ").append(toIndentedString(feeApplicationRecord)).append("\n");
    sb.append("    feeTransaction: ").append(toIndentedString(feeTransaction)).append("\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    transactionFeeType: ").append(toIndentedString(transactionFeeType)).append("\n");
    sb.append("    feeProjectionsandCommitments: ").append(toIndentedString(feeProjectionsandCommitments)).append("\n");
    sb.append("    projectedTransactionDescription: ").append(toIndentedString(projectedTransactionDescription)).append("\n");
    sb.append("    projectedTransactionFeeType: ").append(toIndentedString(projectedTransactionFeeType)).append("\n");
    sb.append("    accrualFeeType: ").append(toIndentedString(accrualFeeType)).append("\n");
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

