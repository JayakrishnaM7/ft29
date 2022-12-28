package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecutePaymentsRequestPayments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class ExecutePaymentsRequestPayments   {
  @JsonProperty("PaymentTransaction")
  private String paymentTransaction;

  @JsonProperty("PaymentTransactionType")
  private String paymentTransactionType;

  @JsonProperty("PaymentTransactionPayeeReference")
  private Object paymentTransactionPayeeReference;

  @JsonProperty("PaymentTransactionPayeeAccountReference")
  private Object paymentTransactionPayeeAccountReference;

  @JsonProperty("PaymentTransactionPayeeBankReference")
  private Object paymentTransactionPayeeBankReference;

  @JsonProperty("PaymentTransactionAmount")
  private BigDecimal paymentTransactionAmount;

  @JsonProperty("PaymentTransactionFeeType")
  private String paymentTransactionFeeType;

  @JsonProperty("PaymentTransactionFeeCharge")
  private String paymentTransactionFeeCharge;

  @JsonProperty("PaymentTransactionDate")
  private String paymentTransactionDate;

  @JsonProperty("PaymentTransactionPaymentMechanism")
  private String paymentTransactionPaymentMechanism;

  @JsonProperty("PaymentTransactionPaymentPurpose")
  private String paymentTransactionPaymentPurpose;

  @JsonProperty("PaymentTransactionBankBranchOrLocationReference")
  private Object paymentTransactionBankBranchOrLocationReference;

  @JsonProperty("PaymentTransactionStatus")
  private String paymentTransactionStatus;

  public ExecutePaymentsRequestPayments paymentTransaction(String paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
    return this;
  }

  /**
   * Get paymentTransaction
   * @return paymentTransaction
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(String paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }

  public ExecutePaymentsRequestPayments paymentTransactionType(String paymentTransactionType) {
    this.paymentTransactionType = paymentTransactionType;
    return this;
  }

  /**
   * Get paymentTransactionType
   * @return paymentTransactionType
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionType() {
    return paymentTransactionType;
  }

  public void setPaymentTransactionType(String paymentTransactionType) {
    this.paymentTransactionType = paymentTransactionType;
  }

  public ExecutePaymentsRequestPayments paymentTransactionPayeeReference(Object paymentTransactionPayeeReference) {
    this.paymentTransactionPayeeReference = paymentTransactionPayeeReference;
    return this;
  }

  /**
   * Get paymentTransactionPayeeReference
   * @return paymentTransactionPayeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionPayeeReference() {
    return paymentTransactionPayeeReference;
  }

  public void setPaymentTransactionPayeeReference(Object paymentTransactionPayeeReference) {
    this.paymentTransactionPayeeReference = paymentTransactionPayeeReference;
  }

  public ExecutePaymentsRequestPayments paymentTransactionPayeeAccountReference(Object paymentTransactionPayeeAccountReference) {
    this.paymentTransactionPayeeAccountReference = paymentTransactionPayeeAccountReference;
    return this;
  }

  /**
   * Get paymentTransactionPayeeAccountReference
   * @return paymentTransactionPayeeAccountReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionPayeeAccountReference() {
    return paymentTransactionPayeeAccountReference;
  }

  public void setPaymentTransactionPayeeAccountReference(Object paymentTransactionPayeeAccountReference) {
    this.paymentTransactionPayeeAccountReference = paymentTransactionPayeeAccountReference;
  }

  public ExecutePaymentsRequestPayments paymentTransactionPayeeBankReference(Object paymentTransactionPayeeBankReference) {
    this.paymentTransactionPayeeBankReference = paymentTransactionPayeeBankReference;
    return this;
  }

  /**
   * Get paymentTransactionPayeeBankReference
   * @return paymentTransactionPayeeBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionPayeeBankReference() {
    return paymentTransactionPayeeBankReference;
  }

  public void setPaymentTransactionPayeeBankReference(Object paymentTransactionPayeeBankReference) {
    this.paymentTransactionPayeeBankReference = paymentTransactionPayeeBankReference;
  }

  public ExecutePaymentsRequestPayments paymentTransactionAmount(BigDecimal paymentTransactionAmount) {
    this.paymentTransactionAmount = paymentTransactionAmount;
    return this;
  }

  /**
   * Get paymentTransactionAmount
   * @return paymentTransactionAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPaymentTransactionAmount() {
    return paymentTransactionAmount;
  }

  public void setPaymentTransactionAmount(BigDecimal paymentTransactionAmount) {
    this.paymentTransactionAmount = paymentTransactionAmount;
  }

  public ExecutePaymentsRequestPayments paymentTransactionFeeType(String paymentTransactionFeeType) {
    this.paymentTransactionFeeType = paymentTransactionFeeType;
    return this;
  }

  /**
   * Get paymentTransactionFeeType
   * @return paymentTransactionFeeType
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionFeeType() {
    return paymentTransactionFeeType;
  }

  public void setPaymentTransactionFeeType(String paymentTransactionFeeType) {
    this.paymentTransactionFeeType = paymentTransactionFeeType;
  }

  public ExecutePaymentsRequestPayments paymentTransactionFeeCharge(String paymentTransactionFeeCharge) {
    this.paymentTransactionFeeCharge = paymentTransactionFeeCharge;
    return this;
  }

  /**
   * Get paymentTransactionFeeCharge
   * @return paymentTransactionFeeCharge
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionFeeCharge() {
    return paymentTransactionFeeCharge;
  }

  public void setPaymentTransactionFeeCharge(String paymentTransactionFeeCharge) {
    this.paymentTransactionFeeCharge = paymentTransactionFeeCharge;
  }

  public ExecutePaymentsRequestPayments paymentTransactionDate(String paymentTransactionDate) {
    this.paymentTransactionDate = paymentTransactionDate;
    return this;
  }

  /**
   * Get paymentTransactionDate
   * @return paymentTransactionDate
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionDate() {
    return paymentTransactionDate;
  }

  public void setPaymentTransactionDate(String paymentTransactionDate) {
    this.paymentTransactionDate = paymentTransactionDate;
  }

  public ExecutePaymentsRequestPayments paymentTransactionPaymentMechanism(String paymentTransactionPaymentMechanism) {
    this.paymentTransactionPaymentMechanism = paymentTransactionPaymentMechanism;
    return this;
  }

  /**
   * Get paymentTransactionPaymentMechanism
   * @return paymentTransactionPaymentMechanism
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionPaymentMechanism() {
    return paymentTransactionPaymentMechanism;
  }

  public void setPaymentTransactionPaymentMechanism(String paymentTransactionPaymentMechanism) {
    this.paymentTransactionPaymentMechanism = paymentTransactionPaymentMechanism;
  }

  public ExecutePaymentsRequestPayments paymentTransactionPaymentPurpose(String paymentTransactionPaymentPurpose) {
    this.paymentTransactionPaymentPurpose = paymentTransactionPaymentPurpose;
    return this;
  }

  /**
   * Get paymentTransactionPaymentPurpose
   * @return paymentTransactionPaymentPurpose
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionPaymentPurpose() {
    return paymentTransactionPaymentPurpose;
  }

  public void setPaymentTransactionPaymentPurpose(String paymentTransactionPaymentPurpose) {
    this.paymentTransactionPaymentPurpose = paymentTransactionPaymentPurpose;
  }

  public ExecutePaymentsRequestPayments paymentTransactionBankBranchOrLocationReference(Object paymentTransactionBankBranchOrLocationReference) {
    this.paymentTransactionBankBranchOrLocationReference = paymentTransactionBankBranchOrLocationReference;
    return this;
  }

  /**
   * Get paymentTransactionBankBranchOrLocationReference
   * @return paymentTransactionBankBranchOrLocationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionBankBranchOrLocationReference() {
    return paymentTransactionBankBranchOrLocationReference;
  }

  public void setPaymentTransactionBankBranchOrLocationReference(Object paymentTransactionBankBranchOrLocationReference) {
    this.paymentTransactionBankBranchOrLocationReference = paymentTransactionBankBranchOrLocationReference;
  }

  public ExecutePaymentsRequestPayments paymentTransactionStatus(String paymentTransactionStatus) {
    this.paymentTransactionStatus = paymentTransactionStatus;
    return this;
  }

  /**
   * Get paymentTransactionStatus
   * @return paymentTransactionStatus
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionStatus() {
    return paymentTransactionStatus;
  }

  public void setPaymentTransactionStatus(String paymentTransactionStatus) {
    this.paymentTransactionStatus = paymentTransactionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutePaymentsRequestPayments executePaymentsRequestPayments = (ExecutePaymentsRequestPayments) o;
    return Objects.equals(this.paymentTransaction, executePaymentsRequestPayments.paymentTransaction) &&
        Objects.equals(this.paymentTransactionType, executePaymentsRequestPayments.paymentTransactionType) &&
        Objects.equals(this.paymentTransactionPayeeReference, executePaymentsRequestPayments.paymentTransactionPayeeReference) &&
        Objects.equals(this.paymentTransactionPayeeAccountReference, executePaymentsRequestPayments.paymentTransactionPayeeAccountReference) &&
        Objects.equals(this.paymentTransactionPayeeBankReference, executePaymentsRequestPayments.paymentTransactionPayeeBankReference) &&
        Objects.equals(this.paymentTransactionAmount, executePaymentsRequestPayments.paymentTransactionAmount) &&
        Objects.equals(this.paymentTransactionFeeType, executePaymentsRequestPayments.paymentTransactionFeeType) &&
        Objects.equals(this.paymentTransactionFeeCharge, executePaymentsRequestPayments.paymentTransactionFeeCharge) &&
        Objects.equals(this.paymentTransactionDate, executePaymentsRequestPayments.paymentTransactionDate) &&
        Objects.equals(this.paymentTransactionPaymentMechanism, executePaymentsRequestPayments.paymentTransactionPaymentMechanism) &&
        Objects.equals(this.paymentTransactionPaymentPurpose, executePaymentsRequestPayments.paymentTransactionPaymentPurpose) &&
        Objects.equals(this.paymentTransactionBankBranchOrLocationReference, executePaymentsRequestPayments.paymentTransactionBankBranchOrLocationReference) &&
        Objects.equals(this.paymentTransactionStatus, executePaymentsRequestPayments.paymentTransactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransaction, paymentTransactionType, paymentTransactionPayeeReference, paymentTransactionPayeeAccountReference, paymentTransactionPayeeBankReference, paymentTransactionAmount, paymentTransactionFeeType, paymentTransactionFeeCharge, paymentTransactionDate, paymentTransactionPaymentMechanism, paymentTransactionPaymentPurpose, paymentTransactionBankBranchOrLocationReference, paymentTransactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutePaymentsRequestPayments {\n");
    
    sb.append("    paymentTransaction: ").append(toIndentedString(paymentTransaction)).append("\n");
    sb.append("    paymentTransactionType: ").append(toIndentedString(paymentTransactionType)).append("\n");
    sb.append("    paymentTransactionPayeeReference: ").append(toIndentedString(paymentTransactionPayeeReference)).append("\n");
    sb.append("    paymentTransactionPayeeAccountReference: ").append(toIndentedString(paymentTransactionPayeeAccountReference)).append("\n");
    sb.append("    paymentTransactionPayeeBankReference: ").append(toIndentedString(paymentTransactionPayeeBankReference)).append("\n");
    sb.append("    paymentTransactionAmount: ").append(toIndentedString(paymentTransactionAmount)).append("\n");
    sb.append("    paymentTransactionFeeType: ").append(toIndentedString(paymentTransactionFeeType)).append("\n");
    sb.append("    paymentTransactionFeeCharge: ").append(toIndentedString(paymentTransactionFeeCharge)).append("\n");
    sb.append("    paymentTransactionDate: ").append(toIndentedString(paymentTransactionDate)).append("\n");
    sb.append("    paymentTransactionPaymentMechanism: ").append(toIndentedString(paymentTransactionPaymentMechanism)).append("\n");
    sb.append("    paymentTransactionPaymentPurpose: ").append(toIndentedString(paymentTransactionPaymentPurpose)).append("\n");
    sb.append("    paymentTransactionBankBranchOrLocationReference: ").append(toIndentedString(paymentTransactionBankBranchOrLocationReference)).append("\n");
    sb.append("    paymentTransactionStatus: ").append(toIndentedString(paymentTransactionStatus)).append("\n");
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

