package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePaymentsResponsePayments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class InitiatePaymentsResponsePayments   {
  @JsonProperty("PaymentDefinition")
  private String paymentDefinition;

  @JsonProperty("PaymentProcessinngOptionDefinition")
  private String paymentProcessinngOptionDefinition;

  public InitiatePaymentsResponsePayments paymentDefinition(String paymentDefinition) {
    this.paymentDefinition = paymentDefinition;
    return this;
  }

  /**
   * Get paymentDefinition
   * @return paymentDefinition
  */
  @ApiModelProperty(value = "")


  public String getPaymentDefinition() {
    return paymentDefinition;
  }

  public void setPaymentDefinition(String paymentDefinition) {
    this.paymentDefinition = paymentDefinition;
  }

  public InitiatePaymentsResponsePayments paymentProcessinngOptionDefinition(String paymentProcessinngOptionDefinition) {
    this.paymentProcessinngOptionDefinition = paymentProcessinngOptionDefinition;
    return this;
  }

  /**
   * Get paymentProcessinngOptionDefinition
   * @return paymentProcessinngOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getPaymentProcessinngOptionDefinition() {
    return paymentProcessinngOptionDefinition;
  }

  public void setPaymentProcessinngOptionDefinition(String paymentProcessinngOptionDefinition) {
    this.paymentProcessinngOptionDefinition = paymentProcessinngOptionDefinition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentsResponsePayments initiatePaymentsResponsePayments = (InitiatePaymentsResponsePayments) o;
    return Objects.equals(this.paymentDefinition, initiatePaymentsResponsePayments.paymentDefinition) &&
        Objects.equals(this.paymentProcessinngOptionDefinition, initiatePaymentsResponsePayments.paymentProcessinngOptionDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentDefinition, paymentProcessinngOptionDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentsResponsePayments {\n");
    
    sb.append("    paymentDefinition: ").append(toIndentedString(paymentDefinition)).append("\n");
    sb.append("    paymentProcessinngOptionDefinition: ").append(toIndentedString(paymentProcessinngOptionDefinition)).append("\n");
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

