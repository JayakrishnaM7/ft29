package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.getaccountdetails.InitiatePaymentsRequestCurrentAccountFacility;
import com.ibm.dip.model.getaccountdetails.InitiatePaymentsRequestPayments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePaymentsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class InitiatePaymentsRequest   {
  @JsonProperty("CurrentAccountFacility")
  private InitiatePaymentsRequestCurrentAccountFacility currentAccountFacility;

  @JsonProperty("Payments")
  private InitiatePaymentsRequestPayments payments;

  public InitiatePaymentsRequest currentAccountFacility(InitiatePaymentsRequestCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
    return this;
  }

  /**
   * Get currentAccountFacility
   * @return currentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePaymentsRequestCurrentAccountFacility getCurrentAccountFacility() {
    return currentAccountFacility;
  }

  public void setCurrentAccountFacility(InitiatePaymentsRequestCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
  }

  public InitiatePaymentsRequest payments(InitiatePaymentsRequestPayments payments) {
    this.payments = payments;
    return this;
  }

  /**
   * Get payments
   * @return payments
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePaymentsRequestPayments getPayments() {
    return payments;
  }

  public void setPayments(InitiatePaymentsRequestPayments payments) {
    this.payments = payments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentsRequest initiatePaymentsRequest = (InitiatePaymentsRequest) o;
    return Objects.equals(this.currentAccountFacility, initiatePaymentsRequest.currentAccountFacility) &&
        Objects.equals(this.payments, initiatePaymentsRequest.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFacility, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentsRequest {\n");
    
    sb.append("    currentAccountFacility: ").append(toIndentedString(currentAccountFacility)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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

