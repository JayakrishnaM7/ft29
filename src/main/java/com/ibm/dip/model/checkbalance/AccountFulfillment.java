package com.ibm.dip.model.checkbalance;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountFulfillment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:17.694Z[GMT]")

public class AccountFulfillment   {
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

  @JsonProperty("AccountFulfillmentReference")
  private String accountFulfillmentReference;

  @JsonProperty("AccountFulfillmentType")
  private String accountFulfillmentType;

  public AccountFulfillment preconditions(Object preconditions) {
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

  public AccountFulfillment schedule(Object schedule) {
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

  public AccountFulfillment businessService(Object businessService) {
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

  public AccountFulfillment postconditions(Object postconditions) {
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

  public AccountFulfillment internalBankAccountLogReference(String internalBankAccountLogReference) {
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

  public AccountFulfillment accountFulfillmentReference(String accountFulfillmentReference) {
    this.accountFulfillmentReference = accountFulfillmentReference;
    return this;
  }

  /**
   * Get accountFulfillmentReference
   * @return accountFulfillmentReference
  */
  @ApiModelProperty(value = "")


  public String getAccountFulfillmentReference() {
    return accountFulfillmentReference;
  }

  public void setAccountFulfillmentReference(String accountFulfillmentReference) {
    this.accountFulfillmentReference = accountFulfillmentReference;
  }

  public AccountFulfillment accountFulfillmentType(String accountFulfillmentType) {
    this.accountFulfillmentType = accountFulfillmentType;
    return this;
  }

  /**
   * Get accountFulfillmentType
   * @return accountFulfillmentType
  */
  @ApiModelProperty(value = "")


  public String getAccountFulfillmentType() {
    return accountFulfillmentType;
  }

  public void setAccountFulfillmentType(String accountFulfillmentType) {
    this.accountFulfillmentType = accountFulfillmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountFulfillment accountFulfillment = (AccountFulfillment) o;
    return Objects.equals(this.preconditions, accountFulfillment.preconditions) &&
        Objects.equals(this.schedule, accountFulfillment.schedule) &&
        Objects.equals(this.businessService, accountFulfillment.businessService) &&
        Objects.equals(this.postconditions, accountFulfillment.postconditions) &&
        Objects.equals(this.internalBankAccountLogReference, accountFulfillment.internalBankAccountLogReference) &&
        Objects.equals(this.accountFulfillmentReference, accountFulfillment.accountFulfillmentReference) &&
        Objects.equals(this.accountFulfillmentType, accountFulfillment.accountFulfillmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, postconditions, internalBankAccountLogReference, accountFulfillmentReference, accountFulfillmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFulfillment {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    postconditions: ").append(toIndentedString(postconditions)).append("\n");
    sb.append("    internalBankAccountLogReference: ").append(toIndentedString(internalBankAccountLogReference)).append("\n");
    sb.append("    accountFulfillmentReference: ").append(toIndentedString(accountFulfillmentReference)).append("\n");
    sb.append("    accountFulfillmentType: ").append(toIndentedString(accountFulfillmentType)).append("\n");
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

