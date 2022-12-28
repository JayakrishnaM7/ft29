package com.ibm.dip.model.paymentexecution;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.paymentexecution.RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure;
import com.ibm.dip.model.paymentexecution.RetrievePaymentMechanismResponsePaymentMechanism;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrievePaymentMechanismResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:14.904Z[GMT]")

public class RetrievePaymentMechanismResponse   {
  @JsonProperty("PaymentExecutionProcedure")
  private RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure;

  @JsonProperty("PaymentMechanism")
  private RetrievePaymentMechanismResponsePaymentMechanism paymentMechanism;

  public RetrievePaymentMechanismResponse paymentExecutionProcedure(RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
    return this;
  }

  /**
   * Get paymentExecutionProcedure
   * @return paymentExecutionProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure getPaymentExecutionProcedure() {
    return paymentExecutionProcedure;
  }

  public void setPaymentExecutionProcedure(RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
  }

  public RetrievePaymentMechanismResponse paymentMechanism(RetrievePaymentMechanismResponsePaymentMechanism paymentMechanism) {
    this.paymentMechanism = paymentMechanism;
    return this;
  }

  /**
   * Get paymentMechanism
   * @return paymentMechanism
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrievePaymentMechanismResponsePaymentMechanism getPaymentMechanism() {
    return paymentMechanism;
  }

  public void setPaymentMechanism(RetrievePaymentMechanismResponsePaymentMechanism paymentMechanism) {
    this.paymentMechanism = paymentMechanism;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrievePaymentMechanismResponse retrievePaymentMechanismResponse = (RetrievePaymentMechanismResponse) o;
    return Objects.equals(this.paymentExecutionProcedure, retrievePaymentMechanismResponse.paymentExecutionProcedure) &&
        Objects.equals(this.paymentMechanism, retrievePaymentMechanismResponse.paymentMechanism);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentExecutionProcedure, paymentMechanism);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrievePaymentMechanismResponse {\n");
    
    sb.append("    paymentExecutionProcedure: ").append(toIndentedString(paymentExecutionProcedure)).append("\n");
    sb.append("    paymentMechanism: ").append(toIndentedString(paymentMechanism)).append("\n");
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

