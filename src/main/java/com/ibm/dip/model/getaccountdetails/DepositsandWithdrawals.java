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
 * DepositsandWithdrawals
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class DepositsandWithdrawals   {
  @JsonProperty("DepositType")
  private String depositType;

  @JsonProperty("WithdrawalType")
  private String withdrawalType;

  @JsonProperty("AccountLimitBreachResponse")
  private String accountLimitBreachResponse;

  @JsonProperty("DepositTransaction")
  private String depositTransaction;

  @JsonProperty("DepositTransactionSourceReference")
  private Object depositTransactionSourceReference;

  @JsonProperty("DepositTransactionDepositType")
  private String depositTransactionDepositType;

  @JsonProperty("DepositTransactionDescription")
  private String depositTransactionDescription;

  @JsonProperty("DepositTransactionAmount")
  private BigDecimal depositTransactionAmount;

  @JsonProperty("DepositTransactionDate")
  private String depositTransactionDate;

  @JsonProperty("WithdrawalTransaction")
  private String withdrawalTransaction;

  @JsonProperty("WithdrawalTransactionSourceReference")
  private Object withdrawalTransactionSourceReference;

  @JsonProperty("WithdrawalTransactionWithdrawalType")
  private String withdrawalTransactionWithdrawalType;

  @JsonProperty("WithdrawalTransactionDescription")
  private String withdrawalTransactionDescription;

  @JsonProperty("WihdrawalTransactionAmount")
  private BigDecimal wihdrawalTransactionAmount;

  @JsonProperty("WithdrawalTransactionDate")
  private String withdrawalTransactionDate;

  public DepositsandWithdrawals depositType(String depositType) {
    this.depositType = depositType;
    return this;
  }

  /**
   * Get depositType
   * @return depositType
  */
  @ApiModelProperty(value = "")


  public String getDepositType() {
    return depositType;
  }

  public void setDepositType(String depositType) {
    this.depositType = depositType;
  }

  public DepositsandWithdrawals withdrawalType(String withdrawalType) {
    this.withdrawalType = withdrawalType;
    return this;
  }

  /**
   * Get withdrawalType
   * @return withdrawalType
  */
  @ApiModelProperty(value = "")


  public String getWithdrawalType() {
    return withdrawalType;
  }

  public void setWithdrawalType(String withdrawalType) {
    this.withdrawalType = withdrawalType;
  }

  public DepositsandWithdrawals accountLimitBreachResponse(String accountLimitBreachResponse) {
    this.accountLimitBreachResponse = accountLimitBreachResponse;
    return this;
  }

  /**
   * Get accountLimitBreachResponse
   * @return accountLimitBreachResponse
  */
  @ApiModelProperty(value = "")


  public String getAccountLimitBreachResponse() {
    return accountLimitBreachResponse;
  }

  public void setAccountLimitBreachResponse(String accountLimitBreachResponse) {
    this.accountLimitBreachResponse = accountLimitBreachResponse;
  }

  public DepositsandWithdrawals depositTransaction(String depositTransaction) {
    this.depositTransaction = depositTransaction;
    return this;
  }

  /**
   * Get depositTransaction
   * @return depositTransaction
  */
  @ApiModelProperty(value = "")


  public String getDepositTransaction() {
    return depositTransaction;
  }

  public void setDepositTransaction(String depositTransaction) {
    this.depositTransaction = depositTransaction;
  }

  public DepositsandWithdrawals depositTransactionSourceReference(Object depositTransactionSourceReference) {
    this.depositTransactionSourceReference = depositTransactionSourceReference;
    return this;
  }

  /**
   * Get depositTransactionSourceReference
   * @return depositTransactionSourceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDepositTransactionSourceReference() {
    return depositTransactionSourceReference;
  }

  public void setDepositTransactionSourceReference(Object depositTransactionSourceReference) {
    this.depositTransactionSourceReference = depositTransactionSourceReference;
  }

  public DepositsandWithdrawals depositTransactionDepositType(String depositTransactionDepositType) {
    this.depositTransactionDepositType = depositTransactionDepositType;
    return this;
  }

  /**
   * Get depositTransactionDepositType
   * @return depositTransactionDepositType
  */
  @ApiModelProperty(value = "")


  public String getDepositTransactionDepositType() {
    return depositTransactionDepositType;
  }

  public void setDepositTransactionDepositType(String depositTransactionDepositType) {
    this.depositTransactionDepositType = depositTransactionDepositType;
  }

  public DepositsandWithdrawals depositTransactionDescription(String depositTransactionDescription) {
    this.depositTransactionDescription = depositTransactionDescription;
    return this;
  }

  /**
   * Get depositTransactionDescription
   * @return depositTransactionDescription
  */
  @ApiModelProperty(value = "")


  public String getDepositTransactionDescription() {
    return depositTransactionDescription;
  }

  public void setDepositTransactionDescription(String depositTransactionDescription) {
    this.depositTransactionDescription = depositTransactionDescription;
  }

  public DepositsandWithdrawals depositTransactionAmount(BigDecimal depositTransactionAmount) {
    this.depositTransactionAmount = depositTransactionAmount;
    return this;
  }

  /**
   * Get depositTransactionAmount
   * @return depositTransactionAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getDepositTransactionAmount() {
    return depositTransactionAmount;
  }

  public void setDepositTransactionAmount(BigDecimal depositTransactionAmount) {
    this.depositTransactionAmount = depositTransactionAmount;
  }

  public DepositsandWithdrawals depositTransactionDate(String depositTransactionDate) {
    this.depositTransactionDate = depositTransactionDate;
    return this;
  }

  /**
   * Get depositTransactionDate
   * @return depositTransactionDate
  */
  @ApiModelProperty(value = "")


  public String getDepositTransactionDate() {
    return depositTransactionDate;
  }

  public void setDepositTransactionDate(String depositTransactionDate) {
    this.depositTransactionDate = depositTransactionDate;
  }

  public DepositsandWithdrawals withdrawalTransaction(String withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
    return this;
  }

  /**
   * Get withdrawalTransaction
   * @return withdrawalTransaction
  */
  @ApiModelProperty(value = "")


  public String getWithdrawalTransaction() {
    return withdrawalTransaction;
  }

  public void setWithdrawalTransaction(String withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
  }

  public DepositsandWithdrawals withdrawalTransactionSourceReference(Object withdrawalTransactionSourceReference) {
    this.withdrawalTransactionSourceReference = withdrawalTransactionSourceReference;
    return this;
  }

  /**
   * Get withdrawalTransactionSourceReference
   * @return withdrawalTransactionSourceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getWithdrawalTransactionSourceReference() {
    return withdrawalTransactionSourceReference;
  }

  public void setWithdrawalTransactionSourceReference(Object withdrawalTransactionSourceReference) {
    this.withdrawalTransactionSourceReference = withdrawalTransactionSourceReference;
  }

  public DepositsandWithdrawals withdrawalTransactionWithdrawalType(String withdrawalTransactionWithdrawalType) {
    this.withdrawalTransactionWithdrawalType = withdrawalTransactionWithdrawalType;
    return this;
  }

  /**
   * Get withdrawalTransactionWithdrawalType
   * @return withdrawalTransactionWithdrawalType
  */
  @ApiModelProperty(value = "")


  public String getWithdrawalTransactionWithdrawalType() {
    return withdrawalTransactionWithdrawalType;
  }

  public void setWithdrawalTransactionWithdrawalType(String withdrawalTransactionWithdrawalType) {
    this.withdrawalTransactionWithdrawalType = withdrawalTransactionWithdrawalType;
  }

  public DepositsandWithdrawals withdrawalTransactionDescription(String withdrawalTransactionDescription) {
    this.withdrawalTransactionDescription = withdrawalTransactionDescription;
    return this;
  }

  /**
   * Get withdrawalTransactionDescription
   * @return withdrawalTransactionDescription
  */
  @ApiModelProperty(value = "")


  public String getWithdrawalTransactionDescription() {
    return withdrawalTransactionDescription;
  }

  public void setWithdrawalTransactionDescription(String withdrawalTransactionDescription) {
    this.withdrawalTransactionDescription = withdrawalTransactionDescription;
  }

  public DepositsandWithdrawals wihdrawalTransactionAmount(BigDecimal wihdrawalTransactionAmount) {
    this.wihdrawalTransactionAmount = wihdrawalTransactionAmount;
    return this;
  }

  /**
   * Get wihdrawalTransactionAmount
   * @return wihdrawalTransactionAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getWihdrawalTransactionAmount() {
    return wihdrawalTransactionAmount;
  }

  public void setWihdrawalTransactionAmount(BigDecimal wihdrawalTransactionAmount) {
    this.wihdrawalTransactionAmount = wihdrawalTransactionAmount;
  }

  public DepositsandWithdrawals withdrawalTransactionDate(String withdrawalTransactionDate) {
    this.withdrawalTransactionDate = withdrawalTransactionDate;
    return this;
  }

  /**
   * Get withdrawalTransactionDate
   * @return withdrawalTransactionDate
  */
  @ApiModelProperty(value = "")


  public String getWithdrawalTransactionDate() {
    return withdrawalTransactionDate;
  }

  public void setWithdrawalTransactionDate(String withdrawalTransactionDate) {
    this.withdrawalTransactionDate = withdrawalTransactionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositsandWithdrawals depositsandWithdrawals = (DepositsandWithdrawals) o;
    return Objects.equals(this.depositType, depositsandWithdrawals.depositType) &&
        Objects.equals(this.withdrawalType, depositsandWithdrawals.withdrawalType) &&
        Objects.equals(this.accountLimitBreachResponse, depositsandWithdrawals.accountLimitBreachResponse) &&
        Objects.equals(this.depositTransaction, depositsandWithdrawals.depositTransaction) &&
        Objects.equals(this.depositTransactionSourceReference, depositsandWithdrawals.depositTransactionSourceReference) &&
        Objects.equals(this.depositTransactionDepositType, depositsandWithdrawals.depositTransactionDepositType) &&
        Objects.equals(this.depositTransactionDescription, depositsandWithdrawals.depositTransactionDescription) &&
        Objects.equals(this.depositTransactionAmount, depositsandWithdrawals.depositTransactionAmount) &&
        Objects.equals(this.depositTransactionDate, depositsandWithdrawals.depositTransactionDate) &&
        Objects.equals(this.withdrawalTransaction, depositsandWithdrawals.withdrawalTransaction) &&
        Objects.equals(this.withdrawalTransactionSourceReference, depositsandWithdrawals.withdrawalTransactionSourceReference) &&
        Objects.equals(this.withdrawalTransactionWithdrawalType, depositsandWithdrawals.withdrawalTransactionWithdrawalType) &&
        Objects.equals(this.withdrawalTransactionDescription, depositsandWithdrawals.withdrawalTransactionDescription) &&
        Objects.equals(this.wihdrawalTransactionAmount, depositsandWithdrawals.wihdrawalTransactionAmount) &&
        Objects.equals(this.withdrawalTransactionDate, depositsandWithdrawals.withdrawalTransactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositType, withdrawalType, accountLimitBreachResponse, depositTransaction, depositTransactionSourceReference, depositTransactionDepositType, depositTransactionDescription, depositTransactionAmount, depositTransactionDate, withdrawalTransaction, withdrawalTransactionSourceReference, withdrawalTransactionWithdrawalType, withdrawalTransactionDescription, wihdrawalTransactionAmount, withdrawalTransactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositsandWithdrawals {\n");
    
    sb.append("    depositType: ").append(toIndentedString(depositType)).append("\n");
    sb.append("    withdrawalType: ").append(toIndentedString(withdrawalType)).append("\n");
    sb.append("    accountLimitBreachResponse: ").append(toIndentedString(accountLimitBreachResponse)).append("\n");
    sb.append("    depositTransaction: ").append(toIndentedString(depositTransaction)).append("\n");
    sb.append("    depositTransactionSourceReference: ").append(toIndentedString(depositTransactionSourceReference)).append("\n");
    sb.append("    depositTransactionDepositType: ").append(toIndentedString(depositTransactionDepositType)).append("\n");
    sb.append("    depositTransactionDescription: ").append(toIndentedString(depositTransactionDescription)).append("\n");
    sb.append("    depositTransactionAmount: ").append(toIndentedString(depositTransactionAmount)).append("\n");
    sb.append("    depositTransactionDate: ").append(toIndentedString(depositTransactionDate)).append("\n");
    sb.append("    withdrawalTransaction: ").append(toIndentedString(withdrawalTransaction)).append("\n");
    sb.append("    withdrawalTransactionSourceReference: ").append(toIndentedString(withdrawalTransactionSourceReference)).append("\n");
    sb.append("    withdrawalTransactionWithdrawalType: ").append(toIndentedString(withdrawalTransactionWithdrawalType)).append("\n");
    sb.append("    withdrawalTransactionDescription: ").append(toIndentedString(withdrawalTransactionDescription)).append("\n");
    sb.append("    wihdrawalTransactionAmount: ").append(toIndentedString(wihdrawalTransactionAmount)).append("\n");
    sb.append("    withdrawalTransactionDate: ").append(toIndentedString(withdrawalTransactionDate)).append("\n");
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

