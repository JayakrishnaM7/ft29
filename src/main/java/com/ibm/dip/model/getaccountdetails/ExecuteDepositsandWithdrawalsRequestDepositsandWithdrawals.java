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
 * ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals   {
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

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositTransaction(String depositTransaction) {
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

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositTransactionSourceReference(Object depositTransactionSourceReference) {
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

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositTransactionDepositType(String depositTransactionDepositType) {
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

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositTransactionDescription(String depositTransactionDescription) {
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

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositTransactionAmount(BigDecimal depositTransactionAmount) {
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

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositTransactionDate(String depositTransactionDate) {
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

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals withdrawalTransaction(String withdrawalTransaction) {
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

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals withdrawalTransactionSourceReference(Object withdrawalTransactionSourceReference) {
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

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals withdrawalTransactionWithdrawalType(String withdrawalTransactionWithdrawalType) {
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

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals withdrawalTransactionDescription(String withdrawalTransactionDescription) {
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

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals wihdrawalTransactionAmount(BigDecimal wihdrawalTransactionAmount) {
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

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals withdrawalTransactionDate(String withdrawalTransactionDate) {
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
    ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals executeDepositsandWithdrawalsRequestDepositsandWithdrawals = (ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals) o;
    return Objects.equals(this.depositTransaction, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.depositTransaction) &&
        Objects.equals(this.depositTransactionSourceReference, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.depositTransactionSourceReference) &&
        Objects.equals(this.depositTransactionDepositType, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.depositTransactionDepositType) &&
        Objects.equals(this.depositTransactionDescription, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.depositTransactionDescription) &&
        Objects.equals(this.depositTransactionAmount, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.depositTransactionAmount) &&
        Objects.equals(this.depositTransactionDate, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.depositTransactionDate) &&
        Objects.equals(this.withdrawalTransaction, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.withdrawalTransaction) &&
        Objects.equals(this.withdrawalTransactionSourceReference, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.withdrawalTransactionSourceReference) &&
        Objects.equals(this.withdrawalTransactionWithdrawalType, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.withdrawalTransactionWithdrawalType) &&
        Objects.equals(this.withdrawalTransactionDescription, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.withdrawalTransactionDescription) &&
        Objects.equals(this.wihdrawalTransactionAmount, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.wihdrawalTransactionAmount) &&
        Objects.equals(this.withdrawalTransactionDate, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.withdrawalTransactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositTransaction, depositTransactionSourceReference, depositTransactionDepositType, depositTransactionDescription, depositTransactionAmount, depositTransactionDate, withdrawalTransaction, withdrawalTransactionSourceReference, withdrawalTransactionWithdrawalType, withdrawalTransactionDescription, wihdrawalTransactionAmount, withdrawalTransactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals {\n");
    
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

