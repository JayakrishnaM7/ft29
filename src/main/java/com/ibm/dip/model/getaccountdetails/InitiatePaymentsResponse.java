package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.getaccountdetails.InitiatePaymentsResponseCurrentAccountFacility;
import com.ibm.dip.model.getaccountdetails.InitiatePaymentsResponsePayments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePaymentsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class InitiatePaymentsResponse   {
  @JsonProperty("CurrentAccountFacility")
  private InitiatePaymentsResponseCurrentAccountFacility currentAccountFacility;

  @JsonProperty("Payments")
  private InitiatePaymentsResponsePayments payments;

  public InitiatePaymentsResponse currentAccountFacility(InitiatePaymentsResponseCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
    return this;
  }

  /**
   * Get currentAccountFacility
   * @return currentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePaymentsResponseCurrentAccountFacility getCurrentAccountFacility() {
    return currentAccountFacility;
  }

  public void setCurrentAccountFacility(InitiatePaymentsResponseCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
  }

  public InitiatePaymentsResponse payments(InitiatePaymentsResponsePayments payments) {
    this.payments = payments;
    return this;
  }

  /**
   * Get payments
   * @return payments
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePaymentsResponsePayments getPayments() {
    return payments;
  }

  public void setPayments(InitiatePaymentsResponsePayments payments) {
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
    InitiatePaymentsResponse initiatePaymentsResponse = (InitiatePaymentsResponse) o;
    return Objects.equals(this.currentAccountFacility, initiatePaymentsResponse.currentAccountFacility) &&
        Objects.equals(this.payments, initiatePaymentsResponse.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFacility, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentsResponse {\n");
    
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

