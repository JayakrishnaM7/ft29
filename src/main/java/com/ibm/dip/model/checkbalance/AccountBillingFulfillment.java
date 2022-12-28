package com.ibm.dip.model.checkbalance;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountBillingFulfillment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:17.694Z[GMT]")

public class AccountBillingFulfillment   {
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

  @JsonProperty("AccountBillingFulfillmentReference")
  private String accountBillingFulfillmentReference;

  @JsonProperty("AccountBillingFulfillmentType")
  private String accountBillingFulfillmentType;

  public AccountBillingFulfillment preconditions(Object preconditions) {
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

  public AccountBillingFulfillment schedule(Object schedule) {
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

  public AccountBillingFulfillment businessService(Object businessService) {
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

  public AccountBillingFulfillment postconditions(Object postconditions) {
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

  public AccountBillingFulfillment internalBankAccountLogReference(String internalBankAccountLogReference) {
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

  public AccountBillingFulfillment accountBillingFulfillmentReference(String accountBillingFulfillmentReference) {
    this.accountBillingFulfillmentReference = accountBillingFulfillmentReference;
    return this;
  }

  /**
   * Get accountBillingFulfillmentReference
   * @return accountBillingFulfillmentReference
  */
  @ApiModelProperty(value = "")


  public String getAccountBillingFulfillmentReference() {
    return accountBillingFulfillmentReference;
  }

  public void setAccountBillingFulfillmentReference(String accountBillingFulfillmentReference) {
    this.accountBillingFulfillmentReference = accountBillingFulfillmentReference;
  }

  public AccountBillingFulfillment accountBillingFulfillmentType(String accountBillingFulfillmentType) {
    this.accountBillingFulfillmentType = accountBillingFulfillmentType;
    return this;
  }

  /**
   * Get accountBillingFulfillmentType
   * @return accountBillingFulfillmentType
  */
  @ApiModelProperty(value = "")


  public String getAccountBillingFulfillmentType() {
    return accountBillingFulfillmentType;
  }

  public void setAccountBillingFulfillmentType(String accountBillingFulfillmentType) {
    this.accountBillingFulfillmentType = accountBillingFulfillmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBillingFulfillment accountBillingFulfillment = (AccountBillingFulfillment) o;
    return Objects.equals(this.preconditions, accountBillingFulfillment.preconditions) &&
        Objects.equals(this.schedule, accountBillingFulfillment.schedule) &&
        Objects.equals(this.businessService, accountBillingFulfillment.businessService) &&
        Objects.equals(this.postconditions, accountBillingFulfillment.postconditions) &&
        Objects.equals(this.internalBankAccountLogReference, accountBillingFulfillment.internalBankAccountLogReference) &&
        Objects.equals(this.accountBillingFulfillmentReference, accountBillingFulfillment.accountBillingFulfillmentReference) &&
        Objects.equals(this.accountBillingFulfillmentType, accountBillingFulfillment.accountBillingFulfillmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, postconditions, internalBankAccountLogReference, accountBillingFulfillmentReference, accountBillingFulfillmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBillingFulfillment {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    postconditions: ").append(toIndentedString(postconditions)).append("\n");
    sb.append("    internalBankAccountLogReference: ").append(toIndentedString(internalBankAccountLogReference)).append("\n");
    sb.append("    accountBillingFulfillmentReference: ").append(toIndentedString(accountBillingFulfillmentReference)).append("\n");
    sb.append("    accountBillingFulfillmentType: ").append(toIndentedString(accountBillingFulfillmentType)).append("\n");
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

