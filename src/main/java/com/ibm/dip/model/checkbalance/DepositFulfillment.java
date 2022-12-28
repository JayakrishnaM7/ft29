package com.ibm.dip.model.checkbalance;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepositFulfillment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:17.694Z[GMT]")

public class DepositFulfillment   {
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

  @JsonProperty("DepositFulfillmentReference")
  private String depositFulfillmentReference;

  @JsonProperty("DepositFulfillmentType")
  private String depositFulfillmentType;

  public DepositFulfillment preconditions(Object preconditions) {
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

  public DepositFulfillment schedule(Object schedule) {
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

  public DepositFulfillment businessService(Object businessService) {
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

  public DepositFulfillment postconditions(Object postconditions) {
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

  public DepositFulfillment internalBankAccountLogReference(String internalBankAccountLogReference) {
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

  public DepositFulfillment depositFulfillmentReference(String depositFulfillmentReference) {
    this.depositFulfillmentReference = depositFulfillmentReference;
    return this;
  }

  /**
   * Get depositFulfillmentReference
   * @return depositFulfillmentReference
  */
  @ApiModelProperty(value = "")


  public String getDepositFulfillmentReference() {
    return depositFulfillmentReference;
  }

  public void setDepositFulfillmentReference(String depositFulfillmentReference) {
    this.depositFulfillmentReference = depositFulfillmentReference;
  }

  public DepositFulfillment depositFulfillmentType(String depositFulfillmentType) {
    this.depositFulfillmentType = depositFulfillmentType;
    return this;
  }

  /**
   * Get depositFulfillmentType
   * @return depositFulfillmentType
  */
  @ApiModelProperty(value = "")


  public String getDepositFulfillmentType() {
    return depositFulfillmentType;
  }

  public void setDepositFulfillmentType(String depositFulfillmentType) {
    this.depositFulfillmentType = depositFulfillmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositFulfillment depositFulfillment = (DepositFulfillment) o;
    return Objects.equals(this.preconditions, depositFulfillment.preconditions) &&
        Objects.equals(this.schedule, depositFulfillment.schedule) &&
        Objects.equals(this.businessService, depositFulfillment.businessService) &&
        Objects.equals(this.postconditions, depositFulfillment.postconditions) &&
        Objects.equals(this.internalBankAccountLogReference, depositFulfillment.internalBankAccountLogReference) &&
        Objects.equals(this.depositFulfillmentReference, depositFulfillment.depositFulfillmentReference) &&
        Objects.equals(this.depositFulfillmentType, depositFulfillment.depositFulfillmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, postconditions, internalBankAccountLogReference, depositFulfillmentReference, depositFulfillmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositFulfillment {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    postconditions: ").append(toIndentedString(postconditions)).append("\n");
    sb.append("    internalBankAccountLogReference: ").append(toIndentedString(internalBankAccountLogReference)).append("\n");
    sb.append("    depositFulfillmentReference: ").append(toIndentedString(depositFulfillmentReference)).append("\n");
    sb.append("    depositFulfillmentType: ").append(toIndentedString(depositFulfillmentType)).append("\n");
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

