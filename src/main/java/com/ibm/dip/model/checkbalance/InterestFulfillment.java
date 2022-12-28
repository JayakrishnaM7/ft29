package com.ibm.dip.model.checkbalance;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InterestFulfillment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:17.694Z[GMT]")

public class InterestFulfillment   {
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

  @JsonProperty("InterestFulfillmentReference")
  private String interestFulfillmentReference;

  @JsonProperty("InterestFulfillmentType")
  private String interestFulfillmentType;

  public InterestFulfillment preconditions(Object preconditions) {
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

  public InterestFulfillment schedule(Object schedule) {
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

  public InterestFulfillment businessService(Object businessService) {
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

  public InterestFulfillment postconditions(Object postconditions) {
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

  public InterestFulfillment internalBankAccountLogReference(String internalBankAccountLogReference) {
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

  public InterestFulfillment interestFulfillmentReference(String interestFulfillmentReference) {
    this.interestFulfillmentReference = interestFulfillmentReference;
    return this;
  }

  /**
   * Get interestFulfillmentReference
   * @return interestFulfillmentReference
  */
  @ApiModelProperty(value = "")


  public String getInterestFulfillmentReference() {
    return interestFulfillmentReference;
  }

  public void setInterestFulfillmentReference(String interestFulfillmentReference) {
    this.interestFulfillmentReference = interestFulfillmentReference;
  }

  public InterestFulfillment interestFulfillmentType(String interestFulfillmentType) {
    this.interestFulfillmentType = interestFulfillmentType;
    return this;
  }

  /**
   * Get interestFulfillmentType
   * @return interestFulfillmentType
  */
  @ApiModelProperty(value = "")


  public String getInterestFulfillmentType() {
    return interestFulfillmentType;
  }

  public void setInterestFulfillmentType(String interestFulfillmentType) {
    this.interestFulfillmentType = interestFulfillmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterestFulfillment interestFulfillment = (InterestFulfillment) o;
    return Objects.equals(this.preconditions, interestFulfillment.preconditions) &&
        Objects.equals(this.schedule, interestFulfillment.schedule) &&
        Objects.equals(this.businessService, interestFulfillment.businessService) &&
        Objects.equals(this.postconditions, interestFulfillment.postconditions) &&
        Objects.equals(this.internalBankAccountLogReference, interestFulfillment.internalBankAccountLogReference) &&
        Objects.equals(this.interestFulfillmentReference, interestFulfillment.interestFulfillmentReference) &&
        Objects.equals(this.interestFulfillmentType, interestFulfillment.interestFulfillmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, postconditions, internalBankAccountLogReference, interestFulfillmentReference, interestFulfillmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterestFulfillment {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    postconditions: ").append(toIndentedString(postconditions)).append("\n");
    sb.append("    internalBankAccountLogReference: ").append(toIndentedString(internalBankAccountLogReference)).append("\n");
    sb.append("    interestFulfillmentReference: ").append(toIndentedString(interestFulfillmentReference)).append("\n");
    sb.append("    interestFulfillmentType: ").append(toIndentedString(interestFulfillmentType)).append("\n");
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

