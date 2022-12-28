package com.ibm.dip.model.checkbalance;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FeeFulfillment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:17.694Z[GMT]")

public class FeeFulfillment   {
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

  @JsonProperty("FeeFulfillmentReference")
  private String feeFulfillmentReference;

  @JsonProperty("FeeFulfillmentType")
  private String feeFulfillmentType;

  public FeeFulfillment preconditions(Object preconditions) {
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

  public FeeFulfillment schedule(Object schedule) {
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

  public FeeFulfillment businessService(Object businessService) {
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

  public FeeFulfillment postconditions(Object postconditions) {
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

  public FeeFulfillment internalBankAccountLogReference(String internalBankAccountLogReference) {
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

  public FeeFulfillment feeFulfillmentReference(String feeFulfillmentReference) {
    this.feeFulfillmentReference = feeFulfillmentReference;
    return this;
  }

  /**
   * Get feeFulfillmentReference
   * @return feeFulfillmentReference
  */
  @ApiModelProperty(value = "")


  public String getFeeFulfillmentReference() {
    return feeFulfillmentReference;
  }

  public void setFeeFulfillmentReference(String feeFulfillmentReference) {
    this.feeFulfillmentReference = feeFulfillmentReference;
  }

  public FeeFulfillment feeFulfillmentType(String feeFulfillmentType) {
    this.feeFulfillmentType = feeFulfillmentType;
    return this;
  }

  /**
   * Get feeFulfillmentType
   * @return feeFulfillmentType
  */
  @ApiModelProperty(value = "")


  public String getFeeFulfillmentType() {
    return feeFulfillmentType;
  }

  public void setFeeFulfillmentType(String feeFulfillmentType) {
    this.feeFulfillmentType = feeFulfillmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeFulfillment feeFulfillment = (FeeFulfillment) o;
    return Objects.equals(this.preconditions, feeFulfillment.preconditions) &&
        Objects.equals(this.schedule, feeFulfillment.schedule) &&
        Objects.equals(this.businessService, feeFulfillment.businessService) &&
        Objects.equals(this.postconditions, feeFulfillment.postconditions) &&
        Objects.equals(this.internalBankAccountLogReference, feeFulfillment.internalBankAccountLogReference) &&
        Objects.equals(this.feeFulfillmentReference, feeFulfillment.feeFulfillmentReference) &&
        Objects.equals(this.feeFulfillmentType, feeFulfillment.feeFulfillmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, postconditions, internalBankAccountLogReference, feeFulfillmentReference, feeFulfillmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeFulfillment {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    postconditions: ").append(toIndentedString(postconditions)).append("\n");
    sb.append("    internalBankAccountLogReference: ").append(toIndentedString(internalBankAccountLogReference)).append("\n");
    sb.append("    feeFulfillmentReference: ").append(toIndentedString(feeFulfillmentReference)).append("\n");
    sb.append("    feeFulfillmentType: ").append(toIndentedString(feeFulfillmentType)).append("\n");
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

