package com.ibm.dip.model.paymentexecution;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:14.904Z[GMT]")

public class InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure   {
  @JsonProperty("PaymentTransactionInitiatorReference")
  private Object paymentTransactionInitiatorReference;

  @JsonProperty("PaymentOrderReference")
  private Object paymentOrderReference;

  @JsonProperty("PayerReference")
  private Object payerReference;

  @JsonProperty("PayerBankReference")
  private Object payerBankReference;

  @JsonProperty("PayerProductInstanceReference")
  private Object payerProductInstanceReference;

  @JsonProperty("PayeeReference")
  private Object payeeReference;

  @JsonProperty("PayeeBankReference")
  private Object payeeBankReference;

  @JsonProperty("PayeeProductInstanceReference")
  private Object payeeProductInstanceReference;

  @JsonProperty("Amount")
  private String amount;

  @JsonProperty("Currency")
  private String currency;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("WashAccountReference")
  private Object washAccountReference;

  @JsonProperty("IntermediaryAccountReference")
  private Object intermediaryAccountReference;

  @JsonProperty("PaymentMechanismType")
  private String paymentMechanismType;

  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure paymentTransactionInitiatorReference(Object paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
    return this;
  }

  /**
   * Get paymentTransactionInitiatorReference
   * @return paymentTransactionInitiatorReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionInitiatorReference() {
    return paymentTransactionInitiatorReference;
  }

  public void setPaymentTransactionInitiatorReference(Object paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
  }

  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure paymentOrderReference(Object paymentOrderReference) {
    this.paymentOrderReference = paymentOrderReference;
    return this;
  }

  /**
   * Get paymentOrderReference
   * @return paymentOrderReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentOrderReference() {
    return paymentOrderReference;
  }

  public void setPaymentOrderReference(Object paymentOrderReference) {
    this.paymentOrderReference = paymentOrderReference;
  }

  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure payerReference(Object payerReference) {
    this.payerReference = payerReference;
    return this;
  }

  /**
   * Get payerReference
   * @return payerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(Object payerReference) {
    this.payerReference = payerReference;
  }

  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure payerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
    return this;
  }

  /**
   * Get payerBankReference
   * @return payerBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
  }

  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure payerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
    return this;
  }

  /**
   * Get payerProductInstanceReference
   * @return payerProductInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerProductInstanceReference() {
    return payerProductInstanceReference;
  }

  public void setPayerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
  }

  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure payeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
    return this;
  }

  /**
   * Get payeeReference
   * @return payeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
  }

  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure payeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   * Get payeeBankReference
   * @return payeeBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }

  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure payeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
    return this;
  }

  /**
   * Get payeeProductInstanceReference
   * @return payeeProductInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }

  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure washAccountReference(Object washAccountReference) {
    this.washAccountReference = washAccountReference;
    return this;
  }

  /**
   * Get washAccountReference
   * @return washAccountReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getWashAccountReference() {
    return washAccountReference;
  }

  public void setWashAccountReference(Object washAccountReference) {
    this.washAccountReference = washAccountReference;
  }

  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure intermediaryAccountReference(Object intermediaryAccountReference) {
    this.intermediaryAccountReference = intermediaryAccountReference;
    return this;
  }

  /**
   * Get intermediaryAccountReference
   * @return intermediaryAccountReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getIntermediaryAccountReference() {
    return intermediaryAccountReference;
  }

  public void setIntermediaryAccountReference(Object intermediaryAccountReference) {
    this.intermediaryAccountReference = intermediaryAccountReference;
  }

  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure paymentMechanismType(String paymentMechanismType) {
    this.paymentMechanismType = paymentMechanismType;
    return this;
  }

  /**
   * Get paymentMechanismType
   * @return paymentMechanismType
  */
  @ApiModelProperty(value = "")


  public String getPaymentMechanismType() {
    return paymentMechanismType;
  }

  public void setPaymentMechanismType(String paymentMechanismType) {
    this.paymentMechanismType = paymentMechanismType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure initiatePaymentExecutionProcedureRequestPaymentExecutionProcedure = (InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure) o;
    return Objects.equals(this.paymentTransactionInitiatorReference, initiatePaymentExecutionProcedureRequestPaymentExecutionProcedure.paymentTransactionInitiatorReference) &&
        Objects.equals(this.paymentOrderReference, initiatePaymentExecutionProcedureRequestPaymentExecutionProcedure.paymentOrderReference) &&
        Objects.equals(this.payerReference, initiatePaymentExecutionProcedureRequestPaymentExecutionProcedure.payerReference) &&
        Objects.equals(this.payerBankReference, initiatePaymentExecutionProcedureRequestPaymentExecutionProcedure.payerBankReference) &&
        Objects.equals(this.payerProductInstanceReference, initiatePaymentExecutionProcedureRequestPaymentExecutionProcedure.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, initiatePaymentExecutionProcedureRequestPaymentExecutionProcedure.payeeReference) &&
        Objects.equals(this.payeeBankReference, initiatePaymentExecutionProcedureRequestPaymentExecutionProcedure.payeeBankReference) &&
        Objects.equals(this.payeeProductInstanceReference, initiatePaymentExecutionProcedureRequestPaymentExecutionProcedure.payeeProductInstanceReference) &&
        Objects.equals(this.amount, initiatePaymentExecutionProcedureRequestPaymentExecutionProcedure.amount) &&
        Objects.equals(this.currency, initiatePaymentExecutionProcedureRequestPaymentExecutionProcedure.currency) &&
        Objects.equals(this.dateType, initiatePaymentExecutionProcedureRequestPaymentExecutionProcedure.dateType) &&
        Objects.equals(this.washAccountReference, initiatePaymentExecutionProcedureRequestPaymentExecutionProcedure.washAccountReference) &&
        Objects.equals(this.intermediaryAccountReference, initiatePaymentExecutionProcedureRequestPaymentExecutionProcedure.intermediaryAccountReference) &&
        Objects.equals(this.paymentMechanismType, initiatePaymentExecutionProcedureRequestPaymentExecutionProcedure.paymentMechanismType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionInitiatorReference, paymentOrderReference, payerReference, payerBankReference, payerProductInstanceReference, payeeReference, payeeBankReference, payeeProductInstanceReference, amount, currency, dateType, washAccountReference, intermediaryAccountReference, paymentMechanismType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure {\n");
    
    sb.append("    paymentTransactionInitiatorReference: ").append(toIndentedString(paymentTransactionInitiatorReference)).append("\n");
    sb.append("    paymentOrderReference: ").append(toIndentedString(paymentOrderReference)).append("\n");
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
    sb.append("    payerProductInstanceReference: ").append(toIndentedString(payerProductInstanceReference)).append("\n");
    sb.append("    payeeReference: ").append(toIndentedString(payeeReference)).append("\n");
    sb.append("    payeeBankReference: ").append(toIndentedString(payeeBankReference)).append("\n");
    sb.append("    payeeProductInstanceReference: ").append(toIndentedString(payeeProductInstanceReference)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    washAccountReference: ").append(toIndentedString(washAccountReference)).append("\n");
    sb.append("    intermediaryAccountReference: ").append(toIndentedString(intermediaryAccountReference)).append("\n");
    sb.append("    paymentMechanismType: ").append(toIndentedString(paymentMechanismType)).append("\n");
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

