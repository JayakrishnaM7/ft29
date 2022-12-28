package com.ibm.dip.model.initiatefundtransfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.initiatefundtransfer.UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrievePaymentInitiationTransactionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:12.893Z[GMT]")

public class RetrievePaymentInitiationTransactionResponse   {
  @JsonProperty("PaymentInitiationTransaction")
  private UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction paymentInitiationTransaction;

  public RetrievePaymentInitiationTransactionResponse paymentInitiationTransaction(UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction paymentInitiationTransaction) {
    this.paymentInitiationTransaction = paymentInitiationTransaction;
    return this;
  }

  /**
   * Get paymentInitiationTransaction
   * @return paymentInitiationTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction getPaymentInitiationTransaction() {
    return paymentInitiationTransaction;
  }

  public void setPaymentInitiationTransaction(UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction paymentInitiationTransaction) {
    this.paymentInitiationTransaction = paymentInitiationTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrievePaymentInitiationTransactionResponse retrievePaymentInitiationTransactionResponse = (RetrievePaymentInitiationTransactionResponse) o;
    return Objects.equals(this.paymentInitiationTransaction, retrievePaymentInitiationTransactionResponse.paymentInitiationTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInitiationTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrievePaymentInitiationTransactionResponse {\n");
    
    sb.append("    paymentInitiationTransaction: ").append(toIndentedString(paymentInitiationTransaction)).append("\n");
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

