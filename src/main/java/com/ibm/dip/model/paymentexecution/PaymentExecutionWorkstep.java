package com.ibm.dip.model.paymentexecution;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentExecutionWorkstep
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:14.904Z[GMT]")

public class PaymentExecutionWorkstep   {
  @JsonProperty("PaymentExecutionTaskResult")
  private String paymentExecutionTaskResult;

  public PaymentExecutionWorkstep paymentExecutionTaskResult(String paymentExecutionTaskResult) {
    this.paymentExecutionTaskResult = paymentExecutionTaskResult;
    return this;
  }

  /**
   * Get paymentExecutionTaskResult
   * @return paymentExecutionTaskResult
  */
  @ApiModelProperty(value = "")


  public String getPaymentExecutionTaskResult() {
    return paymentExecutionTaskResult;
  }

  public void setPaymentExecutionTaskResult(String paymentExecutionTaskResult) {
    this.paymentExecutionTaskResult = paymentExecutionTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentExecutionWorkstep paymentExecutionWorkstep = (PaymentExecutionWorkstep) o;
    return Objects.equals(this.paymentExecutionTaskResult, paymentExecutionWorkstep.paymentExecutionTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentExecutionTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentExecutionWorkstep {\n");
    
    sb.append("    paymentExecutionTaskResult: ").append(toIndentedString(paymentExecutionTaskResult)).append("\n");
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

