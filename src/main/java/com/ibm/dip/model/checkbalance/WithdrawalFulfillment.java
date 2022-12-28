package com.ibm.dip.model.checkbalance;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WithdrawalFulfillment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:17.694Z[GMT]")

public class WithdrawalFulfillment   {
  @JsonProperty("Preconditions")
  private Object preconditions;

  @JsonProperty("Schedule")
  private Object schedule;

  @JsonProperty("BusinessService")
  private Object businessService;

  @JsonProperty("Postconditions")
  private Object postconditions;

  @JsonProperty("InternalBankAccountLogReference")
  private String internalBankAccountLogReference;

  @JsonProperty("WithdrawalFulfillmentReference")
  private String withdrawalFulfillmentReference;

  @JsonProperty("WithdrawalFulfillmentType")
  private String withdrawalFulfillmentType;

  public WithdrawalFulfillment preconditions(Object preconditions) {
    this.preconditions = preconditions;
    return this;
  }

  /**
   * Get preconditions
   * @return preconditions
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPreconditions() {
    return preconditions;
  }

  public void setPreconditions(Object preconditions) {
    this.preconditions = preconditions;
  }

  public WithdrawalFulfillment schedule(Object schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSchedule() {
    return schedule;
  }

  public void setSchedule(Object schedule) {
    this.schedule = schedule;
  }

  public WithdrawalFulfillment businessService(Object businessService) {
    this.businessService = businessService;
    return this;
  }

  /**
   * Get businessService
   * @return businessService
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBusinessService() {
    return businessService;
  }

  public void setBusinessService(Object businessService) {
    this.businessService = businessService;
  }

  public WithdrawalFulfillment postconditions(Object postconditions) {
    this.postconditions = postconditions;
    return this;
  }

  /**
   * Get postconditions
   * @return postconditions
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPostconditions() {
    return postconditions;
  }

  public void setPostconditions(Object postconditions) {
    this.postconditions = postconditions;
  }

  public WithdrawalFulfillment internalBankAccountLogReference(String internalBankAccountLogReference) {
    this.internalBankAccountLogReference = internalBankAccountLogReference;
    return this;
  }

  /**
   * Get internalBankAccountLogReference
   * @return internalBankAccountLogReference
  */
  @ApiModelProperty(value = "")


  public String getInternalBankAccountLogReference() {
    return internalBankAccountLogReference;
  }

  public void setInternalBankAccountLogReference(String internalBankAccountLogReference) {
    this.internalBankAccountLogReference = internalBankAccountLogReference;
  }

  public WithdrawalFulfillment withdrawalFulfillmentReference(String withdrawalFulfillmentReference) {
    this.withdrawalFulfillmentReference = withdrawalFulfillmentReference;
    return this;
  }

  /**
   * Get withdrawalFulfillmentReference
   * @return withdrawalFulfillmentReference
  */
  @ApiModelProperty(value = "")


  public String getWithdrawalFulfillmentReference() {
    return withdrawalFulfillmentReference;
  }

  public void setWithdrawalFulfillmentReference(String withdrawalFulfillmentReference) {
    this.withdrawalFulfillmentReference = withdrawalFulfillmentReference;
  }

  public WithdrawalFulfillment withdrawalFulfillmentType(String withdrawalFulfillmentType) {
    this.withdrawalFulfillmentType = withdrawalFulfillmentType;
    return this;
  }

  /**
   * Get withdrawalFulfillmentType
   * @return withdrawalFulfillmentType
  */
  @ApiModelProperty(value = "")


  public String getWithdrawalFulfillmentType() {
    return withdrawalFulfillmentType;
  }

  public void setWithdrawalFulfillmentType(String withdrawalFulfillmentType) {
    this.withdrawalFulfillmentType = withdrawalFulfillmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WithdrawalFulfillment withdrawalFulfillment = (WithdrawalFulfillment) o;
    return Objects.equals(this.preconditions, withdrawalFulfillment.preconditions) &&
        Objects.equals(this.schedule, withdrawalFulfillment.schedule) &&
        Objects.equals(this.businessService, withdrawalFulfillment.businessService) &&
        Objects.equals(this.postconditions, withdrawalFulfillment.postconditions) &&
        Objects.equals(this.internalBankAccountLogReference, withdrawalFulfillment.internalBankAccountLogReference) &&
        Objects.equals(this.withdrawalFulfillmentReference, withdrawalFulfillment.withdrawalFulfillmentReference) &&
        Objects.equals(this.withdrawalFulfillmentType, withdrawalFulfillment.withdrawalFulfillmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, postconditions, internalBankAccountLogReference, withdrawalFulfillmentReference, withdrawalFulfillmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WithdrawalFulfillment {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    postconditions: ").append(toIndentedString(postconditions)).append("\n");
    sb.append("    internalBankAccountLogReference: ").append(toIndentedString(internalBankAccountLogReference)).append("\n");
    sb.append("    withdrawalFulfillmentReference: ").append(toIndentedString(withdrawalFulfillmentReference)).append("\n");
    sb.append("    withdrawalFulfillmentType: ").append(toIndentedString(withdrawalFulfillmentType)).append("\n");
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

