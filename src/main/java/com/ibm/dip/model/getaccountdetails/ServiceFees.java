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
 * ServiceFees
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class ServiceFees   {
  @JsonProperty("FeeConfigurationProfile")
  private String feeConfigurationProfile;

  @JsonProperty("FeeDefinition")
  private String feeDefinition;

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

  @JsonProperty("TransactionFeeCharge")
  private String transactionFeeCharge;

  @JsonProperty("FeeProjectionsandCommitments")
  private String feeProjectionsandCommitments;

  @JsonProperty("ProjectedTransactionDescription")
  private String projectedTransactionDescription;

  @JsonProperty("ProjectedTransactionFeeType")
  private String projectedTransactionFeeType;

  @JsonProperty("ProjectedTransactionFeeCharge")
  private String projectedTransactionFeeCharge;

  @JsonProperty("FeeAccrualAmount")
  private BigDecimal feeAccrualAmount;

  @JsonProperty("AccrualFeeType")
  private String accrualFeeType;

  @JsonProperty("AccrualFeeCharge")
  private String accrualFeeCharge;

  public ServiceFees feeConfigurationProfile(String feeConfigurationProfile) {
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

  public ServiceFees feeDefinition(String feeDefinition) {
    this.feeDefinition = feeDefinition;
    return this;
  }

  /**
   * Get feeDefinition
   * @return feeDefinition
  */
  @ApiModelProperty(value = "")


  public String getFeeDefinition() {
    return feeDefinition;
  }

  public void setFeeDefinition(String feeDefinition) {
    this.feeDefinition = feeDefinition;
  }

  public ServiceFees feeType(String feeType) {
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

  public ServiceFees feeApplicationRecord(String feeApplicationRecord) {
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

  public ServiceFees feeTransaction(String feeTransaction) {
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

  public ServiceFees transactionDescription(String transactionDescription) {
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

  public ServiceFees transactionFeeType(String transactionFeeType) {
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

  public ServiceFees transactionFeeCharge(String transactionFeeCharge) {
    this.transactionFeeCharge = transactionFeeCharge;
    return this;
  }

  /**
   * Get transactionFeeCharge
   * @return transactionFeeCharge
  */
  @ApiModelProperty(value = "")


  public String getTransactionFeeCharge() {
    return transactionFeeCharge;
  }

  public void setTransactionFeeCharge(String transactionFeeCharge) {
    this.transactionFeeCharge = transactionFeeCharge;
  }

  public ServiceFees feeProjectionsandCommitments(String feeProjectionsandCommitments) {
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

  public ServiceFees projectedTransactionDescription(String projectedTransactionDescription) {
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

  public ServiceFees projectedTransactionFeeType(String projectedTransactionFeeType) {
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

  public ServiceFees projectedTransactionFeeCharge(String projectedTransactionFeeCharge) {
    this.projectedTransactionFeeCharge = projectedTransactionFeeCharge;
    return this;
  }

  /**
   * Get projectedTransactionFeeCharge
   * @return projectedTransactionFeeCharge
  */
  @ApiModelProperty(value = "")


  public String getProjectedTransactionFeeCharge() {
    return projectedTransactionFeeCharge;
  }

  public void setProjectedTransactionFeeCharge(String projectedTransactionFeeCharge) {
    this.projectedTransactionFeeCharge = projectedTransactionFeeCharge;
  }

  public ServiceFees feeAccrualAmount(BigDecimal feeAccrualAmount) {
    this.feeAccrualAmount = feeAccrualAmount;
    return this;
  }

  /**
   * Get feeAccrualAmount
   * @return feeAccrualAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getFeeAccrualAmount() {
    return feeAccrualAmount;
  }

  public void setFeeAccrualAmount(BigDecimal feeAccrualAmount) {
    this.feeAccrualAmount = feeAccrualAmount;
  }

  public ServiceFees accrualFeeType(String accrualFeeType) {
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

  public ServiceFees accrualFeeCharge(String accrualFeeCharge) {
    this.accrualFeeCharge = accrualFeeCharge;
    return this;
  }

  /**
   * Get accrualFeeCharge
   * @return accrualFeeCharge
  */
  @ApiModelProperty(value = "")


  public String getAccrualFeeCharge() {
    return accrualFeeCharge;
  }

  public void setAccrualFeeCharge(String accrualFeeCharge) {
    this.accrualFeeCharge = accrualFeeCharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceFees serviceFees = (ServiceFees) o;
    return Objects.equals(this.feeConfigurationProfile, serviceFees.feeConfigurationProfile) &&
        Objects.equals(this.feeDefinition, serviceFees.feeDefinition) &&
        Objects.equals(this.feeType, serviceFees.feeType) &&
        Objects.equals(this.feeApplicationRecord, serviceFees.feeApplicationRecord) &&
        Objects.equals(this.feeTransaction, serviceFees.feeTransaction) &&
        Objects.equals(this.transactionDescription, serviceFees.transactionDescription) &&
        Objects.equals(this.transactionFeeType, serviceFees.transactionFeeType) &&
        Objects.equals(this.transactionFeeCharge, serviceFees.transactionFeeCharge) &&
        Objects.equals(this.feeProjectionsandCommitments, serviceFees.feeProjectionsandCommitments) &&
        Objects.equals(this.projectedTransactionDescription, serviceFees.projectedTransactionDescription) &&
        Objects.equals(this.projectedTransactionFeeType, serviceFees.projectedTransactionFeeType) &&
        Objects.equals(this.projectedTransactionFeeCharge, serviceFees.projectedTransactionFeeCharge) &&
        Objects.equals(this.feeAccrualAmount, serviceFees.feeAccrualAmount) &&
        Objects.equals(this.accrualFeeType, serviceFees.accrualFeeType) &&
        Objects.equals(this.accrualFeeCharge, serviceFees.accrualFeeCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeConfigurationProfile, feeDefinition, feeType, feeApplicationRecord, feeTransaction, transactionDescription, transactionFeeType, transactionFeeCharge, feeProjectionsandCommitments, projectedTransactionDescription, projectedTransactionFeeType, projectedTransactionFeeCharge, feeAccrualAmount, accrualFeeType, accrualFeeCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceFees {\n");
    
    sb.append("    feeConfigurationProfile: ").append(toIndentedString(feeConfigurationProfile)).append("\n");
    sb.append("    feeDefinition: ").append(toIndentedString(feeDefinition)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    feeApplicationRecord: ").append(toIndentedString(feeApplicationRecord)).append("\n");
    sb.append("    feeTransaction: ").append(toIndentedString(feeTransaction)).append("\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    transactionFeeType: ").append(toIndentedString(transactionFeeType)).append("\n");
    sb.append("    transactionFeeCharge: ").append(toIndentedString(transactionFeeCharge)).append("\n");
    sb.append("    feeProjectionsandCommitments: ").append(toIndentedString(feeProjectionsandCommitments)).append("\n");
    sb.append("    projectedTransactionDescription: ").append(toIndentedString(projectedTransactionDescription)).append("\n");
    sb.append("    projectedTransactionFeeType: ").append(toIndentedString(projectedTransactionFeeType)).append("\n");
    sb.append("    projectedTransactionFeeCharge: ").append(toIndentedString(projectedTransactionFeeCharge)).append("\n");
    sb.append("    feeAccrualAmount: ").append(toIndentedString(feeAccrualAmount)).append("\n");
    sb.append("    accrualFeeType: ").append(toIndentedString(accrualFeeType)).append("\n");
    sb.append("    accrualFeeCharge: ").append(toIndentedString(accrualFeeCharge)).append("\n");
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

