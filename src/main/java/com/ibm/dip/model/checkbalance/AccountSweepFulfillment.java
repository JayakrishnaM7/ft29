package com.ibm.dip.model.checkbalance;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountSweepFulfillment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:17.694Z[GMT]")

public class AccountSweepFulfillment   {
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

  @JsonProperty("AccountSweepFulfillmentReference")
  private String accountSweepFulfillmentReference;

  @JsonProperty("AccountSweepFulfillmentType")
  private String accountSweepFulfillmentType;

  public AccountSweepFulfillment preconditions(Object preconditions) {
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

  public AccountSweepFulfillment schedule(Object schedule) {
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

  public AccountSweepFulfillment businessService(Object businessService) {
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

  public AccountSweepFulfillment postconditions(Object postconditions) {
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

  public AccountSweepFulfillment internalBankAccountLogReference(String internalBankAccountLogReference) {
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

  public AccountSweepFulfillment accountSweepFulfillmentReference(String accountSweepFulfillmentReference) {
    this.accountSweepFulfillmentReference = accountSweepFulfillmentReference;
    return this;
  }

  /**
   * Get accountSweepFulfillmentReference
   * @return accountSweepFulfillmentReference
  */
  @ApiModelProperty(value = "")


  public String getAccountSweepFulfillmentReference() {
    return accountSweepFulfillmentReference;
  }

  public void setAccountSweepFulfillmentReference(String accountSweepFulfillmentReference) {
    this.accountSweepFulfillmentReference = accountSweepFulfillmentReference;
  }

  public AccountSweepFulfillment accountSweepFulfillmentType(String accountSweepFulfillmentType) {
    this.accountSweepFulfillmentType = accountSweepFulfillmentType;
    return this;
  }

  /**
   * Get accountSweepFulfillmentType
   * @return accountSweepFulfillmentType
  */
  @ApiModelProperty(value = "")


  public String getAccountSweepFulfillmentType() {
    return accountSweepFulfillmentType;
  }

  public void setAccountSweepFulfillmentType(String accountSweepFulfillmentType) {
    this.accountSweepFulfillmentType = accountSweepFulfillmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSweepFulfillment accountSweepFulfillment = (AccountSweepFulfillment) o;
    return Objects.equals(this.preconditions, accountSweepFulfillment.preconditions) &&
        Objects.equals(this.schedule, accountSweepFulfillment.schedule) &&
        Objects.equals(this.businessService, accountSweepFulfillment.businessService) &&
        Objects.equals(this.postconditions, accountSweepFulfillment.postconditions) &&
        Objects.equals(this.internalBankAccountLogReference, accountSweepFulfillment.internalBankAccountLogReference) &&
        Objects.equals(this.accountSweepFulfillmentReference, accountSweepFulfillment.accountSweepFulfillmentReference) &&
        Objects.equals(this.accountSweepFulfillmentType, accountSweepFulfillment.accountSweepFulfillmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, postconditions, internalBankAccountLogReference, accountSweepFulfillmentReference, accountSweepFulfillmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSweepFulfillment {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    postconditions: ").append(toIndentedString(postconditions)).append("\n");
    sb.append("    internalBankAccountLogReference: ").append(toIndentedString(internalBankAccountLogReference)).append("\n");
    sb.append("    accountSweepFulfillmentReference: ").append(toIndentedString(accountSweepFulfillmentReference)).append("\n");
    sb.append("    accountSweepFulfillmentType: ").append(toIndentedString(accountSweepFulfillmentType)).append("\n");
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

