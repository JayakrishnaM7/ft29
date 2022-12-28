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
 * Interest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class Interest   {
  @JsonProperty("InterestRateType")
  private String interestRateType;

  @JsonProperty("InterestRateApplicationSchedule")
  private Object interestRateApplicationSchedule;

  @JsonProperty("InterestRateConfiguration")
  private Object interestRateConfiguration;

  @JsonProperty("InterestRate")
  private Object interestRate;

  @JsonProperty("InterestApplicationRecord")
  private String interestApplicationRecord;

  @JsonProperty("InterestTransaction")
  private String interestTransaction;

  @JsonProperty("TransactionDescription")
  private String transactionDescription;

  @JsonProperty("TransactionRateType")
  private String transactionRateType;

  @JsonProperty("TransactionInterestCharge")
  private String transactionInterestCharge;

  @JsonProperty("InterestAccrualAmount")
  private BigDecimal interestAccrualAmount;

  @JsonProperty("InterestAccrualType")
  private String interestAccrualType;

  @JsonProperty("InterestAccrualCharge")
  private String interestAccrualCharge;

  public Interest interestRateType(String interestRateType) {
    this.interestRateType = interestRateType;
    return this;
  }

  /**
   * Get interestRateType
   * @return interestRateType
  */
  @ApiModelProperty(value = "")


  public String getInterestRateType() {
    return interestRateType;
  }

  public void setInterestRateType(String interestRateType) {
    this.interestRateType = interestRateType;
  }

  public Interest interestRateApplicationSchedule(Object interestRateApplicationSchedule) {
    this.interestRateApplicationSchedule = interestRateApplicationSchedule;
    return this;
  }

  /**
   * Get interestRateApplicationSchedule
   * @return interestRateApplicationSchedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInterestRateApplicationSchedule() {
    return interestRateApplicationSchedule;
  }

  public void setInterestRateApplicationSchedule(Object interestRateApplicationSchedule) {
    this.interestRateApplicationSchedule = interestRateApplicationSchedule;
  }

  public Interest interestRateConfiguration(Object interestRateConfiguration) {
    this.interestRateConfiguration = interestRateConfiguration;
    return this;
  }

  /**
   * Get interestRateConfiguration
   * @return interestRateConfiguration
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInterestRateConfiguration() {
    return interestRateConfiguration;
  }

  public void setInterestRateConfiguration(Object interestRateConfiguration) {
    this.interestRateConfiguration = interestRateConfiguration;
  }

  public Interest interestRate(Object interestRate) {
    this.interestRate = interestRate;
    return this;
  }

  /**
   * Get interestRate
   * @return interestRate
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Object interestRate) {
    this.interestRate = interestRate;
  }

  public Interest interestApplicationRecord(String interestApplicationRecord) {
    this.interestApplicationRecord = interestApplicationRecord;
    return this;
  }

  /**
   * Get interestApplicationRecord
   * @return interestApplicationRecord
  */
  @ApiModelProperty(value = "")


  public String getInterestApplicationRecord() {
    return interestApplicationRecord;
  }

  public void setInterestApplicationRecord(String interestApplicationRecord) {
    this.interestApplicationRecord = interestApplicationRecord;
  }

  public Interest interestTransaction(String interestTransaction) {
    this.interestTransaction = interestTransaction;
    return this;
  }

  /**
   * Get interestTransaction
   * @return interestTransaction
  */
  @ApiModelProperty(value = "")


  public String getInterestTransaction() {
    return interestTransaction;
  }

  public void setInterestTransaction(String interestTransaction) {
    this.interestTransaction = interestTransaction;
  }

  public Interest transactionDescription(String transactionDescription) {
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

  public Interest transactionRateType(String transactionRateType) {
    this.transactionRateType = transactionRateType;
    return this;
  }

  /**
   * Get transactionRateType
   * @return transactionRateType
  */
  @ApiModelProperty(value = "")


  public String getTransactionRateType() {
    return transactionRateType;
  }

  public void setTransactionRateType(String transactionRateType) {
    this.transactionRateType = transactionRateType;
  }

  public Interest transactionInterestCharge(String transactionInterestCharge) {
    this.transactionInterestCharge = transactionInterestCharge;
    return this;
  }

  /**
   * Get transactionInterestCharge
   * @return transactionInterestCharge
  */
  @ApiModelProperty(value = "")


  public String getTransactionInterestCharge() {
    return transactionInterestCharge;
  }

  public void setTransactionInterestCharge(String transactionInterestCharge) {
    this.transactionInterestCharge = transactionInterestCharge;
  }

  public Interest interestAccrualAmount(BigDecimal interestAccrualAmount) {
    this.interestAccrualAmount = interestAccrualAmount;
    return this;
  }

  /**
   * Get interestAccrualAmount
   * @return interestAccrualAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getInterestAccrualAmount() {
    return interestAccrualAmount;
  }

  public void setInterestAccrualAmount(BigDecimal interestAccrualAmount) {
    this.interestAccrualAmount = interestAccrualAmount;
  }

  public Interest interestAccrualType(String interestAccrualType) {
    this.interestAccrualType = interestAccrualType;
    return this;
  }

  /**
   * Get interestAccrualType
   * @return interestAccrualType
  */
  @ApiModelProperty(value = "")


  public String getInterestAccrualType() {
    return interestAccrualType;
  }

  public void setInterestAccrualType(String interestAccrualType) {
    this.interestAccrualType = interestAccrualType;
  }

  public Interest interestAccrualCharge(String interestAccrualCharge) {
    this.interestAccrualCharge = interestAccrualCharge;
    return this;
  }

  /**
   * Get interestAccrualCharge
   * @return interestAccrualCharge
  */
  @ApiModelProperty(value = "")


  public String getInterestAccrualCharge() {
    return interestAccrualCharge;
  }

  public void setInterestAccrualCharge(String interestAccrualCharge) {
    this.interestAccrualCharge = interestAccrualCharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Interest interest = (Interest) o;
    return Objects.equals(this.interestRateType, interest.interestRateType) &&
        Objects.equals(this.interestRateApplicationSchedule, interest.interestRateApplicationSchedule) &&
        Objects.equals(this.interestRateConfiguration, interest.interestRateConfiguration) &&
        Objects.equals(this.interestRate, interest.interestRate) &&
        Objects.equals(this.interestApplicationRecord, interest.interestApplicationRecord) &&
        Objects.equals(this.interestTransaction, interest.interestTransaction) &&
        Objects.equals(this.transactionDescription, interest.transactionDescription) &&
        Objects.equals(this.transactionRateType, interest.transactionRateType) &&
        Objects.equals(this.transactionInterestCharge, interest.transactionInterestCharge) &&
        Objects.equals(this.interestAccrualAmount, interest.interestAccrualAmount) &&
        Objects.equals(this.interestAccrualType, interest.interestAccrualType) &&
        Objects.equals(this.interestAccrualCharge, interest.interestAccrualCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestRateType, interestRateApplicationSchedule, interestRateConfiguration, interestRate, interestApplicationRecord, interestTransaction, transactionDescription, transactionRateType, transactionInterestCharge, interestAccrualAmount, interestAccrualType, interestAccrualCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Interest {\n");
    
    sb.append("    interestRateType: ").append(toIndentedString(interestRateType)).append("\n");
    sb.append("    interestRateApplicationSchedule: ").append(toIndentedString(interestRateApplicationSchedule)).append("\n");
    sb.append("    interestRateConfiguration: ").append(toIndentedString(interestRateConfiguration)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    interestApplicationRecord: ").append(toIndentedString(interestApplicationRecord)).append("\n");
    sb.append("    interestTransaction: ").append(toIndentedString(interestTransaction)).append("\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    transactionRateType: ").append(toIndentedString(transactionRateType)).append("\n");
    sb.append("    transactionInterestCharge: ").append(toIndentedString(transactionInterestCharge)).append("\n");
    sb.append("    interestAccrualAmount: ").append(toIndentedString(interestAccrualAmount)).append("\n");
    sb.append("    interestAccrualType: ").append(toIndentedString(interestAccrualType)).append("\n");
    sb.append("    interestAccrualCharge: ").append(toIndentedString(interestAccrualCharge)).append("\n");
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

