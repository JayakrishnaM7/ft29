package com.ibm.dip.model.paymentexecution;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:14.904Z[GMT]")

public class RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure   {
  @JsonProperty("ACHAccessServiceSessionReference")
  private Object acHAccessServiceSessionReference;

  @JsonProperty("ACHAccessSchedule")
  private String acHAccessSchedule;

  @JsonProperty("CorrespondentServiceSessionReference")
  private Object correspondentServiceSessionReference;

  @JsonProperty("CorrespondentServiceAccessSchedule")
  private String correspondentServiceAccessSchedule;

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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure acHAccessServiceSessionReference(Object acHAccessServiceSessionReference) {
    this.acHAccessServiceSessionReference = acHAccessServiceSessionReference;
    return this;
  }

  /**
   * Get acHAccessServiceSessionReference
   * @return acHAccessServiceSessionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getAcHAccessServiceSessionReference() {
    return acHAccessServiceSessionReference;
  }

  public void setAcHAccessServiceSessionReference(Object acHAccessServiceSessionReference) {
    this.acHAccessServiceSessionReference = acHAccessServiceSessionReference;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure acHAccessSchedule(String acHAccessSchedule) {
    this.acHAccessSchedule = acHAccessSchedule;
    return this;
  }

  /**
   * Get acHAccessSchedule
   * @return acHAccessSchedule
  */
  @ApiModelProperty(value = "")


  public String getAcHAccessSchedule() {
    return acHAccessSchedule;
  }

  public void setAcHAccessSchedule(String acHAccessSchedule) {
    this.acHAccessSchedule = acHAccessSchedule;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure correspondentServiceSessionReference(Object correspondentServiceSessionReference) {
    this.correspondentServiceSessionReference = correspondentServiceSessionReference;
    return this;
  }

  /**
   * Get correspondentServiceSessionReference
   * @return correspondentServiceSessionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCorrespondentServiceSessionReference() {
    return correspondentServiceSessionReference;
  }

  public void setCorrespondentServiceSessionReference(Object correspondentServiceSessionReference) {
    this.correspondentServiceSessionReference = correspondentServiceSessionReference;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure correspondentServiceAccessSchedule(String correspondentServiceAccessSchedule) {
    this.correspondentServiceAccessSchedule = correspondentServiceAccessSchedule;
    return this;
  }

  /**
   * Get correspondentServiceAccessSchedule
   * @return correspondentServiceAccessSchedule
  */
  @ApiModelProperty(value = "")


  public String getCorrespondentServiceAccessSchedule() {
    return correspondentServiceAccessSchedule;
  }

  public void setCorrespondentServiceAccessSchedule(String correspondentServiceAccessSchedule) {
    this.correspondentServiceAccessSchedule = correspondentServiceAccessSchedule;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentTransactionInitiatorReference(Object paymentTransactionInitiatorReference) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentOrderReference(Object paymentOrderReference) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure payerReference(Object payerReference) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure payerBankReference(Object payerBankReference) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure payerProductInstanceReference(Object payerProductInstanceReference) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure payeeReference(Object payeeReference) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure payeeBankReference(Object payeeBankReference) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure payeeProductInstanceReference(Object payeeProductInstanceReference) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure amount(String amount) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure currency(String currency) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure dateType(String dateType) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure washAccountReference(Object washAccountReference) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure intermediaryAccountReference(Object intermediaryAccountReference) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentMechanismType(String paymentMechanismType) {
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
    RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure = (RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure) o;
    return Objects.equals(this.acHAccessServiceSessionReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.acHAccessServiceSessionReference) &&
        Objects.equals(this.acHAccessSchedule, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.acHAccessSchedule) &&
        Objects.equals(this.correspondentServiceSessionReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.correspondentServiceSessionReference) &&
        Objects.equals(this.correspondentServiceAccessSchedule, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.correspondentServiceAccessSchedule) &&
        Objects.equals(this.paymentTransactionInitiatorReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.paymentTransactionInitiatorReference) &&
        Objects.equals(this.paymentOrderReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.paymentOrderReference) &&
        Objects.equals(this.payerReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.payerReference) &&
        Objects.equals(this.payerBankReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.payerBankReference) &&
        Objects.equals(this.payerProductInstanceReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.payeeReference) &&
        Objects.equals(this.payeeBankReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.payeeBankReference) &&
        Objects.equals(this.payeeProductInstanceReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.payeeProductInstanceReference) &&
        Objects.equals(this.amount, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.amount) &&
        Objects.equals(this.currency, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.currency) &&
        Objects.equals(this.dateType, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.dateType) &&
        Objects.equals(this.washAccountReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.washAccountReference) &&
        Objects.equals(this.intermediaryAccountReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.intermediaryAccountReference) &&
        Objects.equals(this.paymentMechanismType, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.paymentMechanismType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acHAccessServiceSessionReference, acHAccessSchedule, correspondentServiceSessionReference, correspondentServiceAccessSchedule, paymentTransactionInitiatorReference, paymentOrderReference, payerReference, payerBankReference, payerProductInstanceReference, payeeReference, payeeBankReference, payeeProductInstanceReference, amount, currency, dateType, washAccountReference, intermediaryAccountReference, paymentMechanismType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure {\n");
    
    sb.append("    acHAccessServiceSessionReference: ").append(toIndentedString(acHAccessServiceSessionReference)).append("\n");
    sb.append("    acHAccessSchedule: ").append(toIndentedString(acHAccessSchedule)).append("\n");
    sb.append("    correspondentServiceSessionReference: ").append(toIndentedString(correspondentServiceSessionReference)).append("\n");
    sb.append("    correspondentServiceAccessSchedule: ").append(toIndentedString(correspondentServiceAccessSchedule)).append("\n");
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

