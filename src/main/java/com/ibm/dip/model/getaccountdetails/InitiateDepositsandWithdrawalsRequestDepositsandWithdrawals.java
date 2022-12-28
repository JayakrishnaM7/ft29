package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals   {
  @JsonProperty("DepositType")
  private String depositType;

  @JsonProperty("WithdrawalType")
  private String withdrawalType;

  @JsonProperty("AccountLimitBreachResponse")
  private String accountLimitBreachResponse;

  public InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals depositType(String depositType) {
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

  public InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals withdrawalType(String withdrawalType) {
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

  public InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals accountLimitBreachResponse(String accountLimitBreachResponse) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals initiateDepositsandWithdrawalsRequestDepositsandWithdrawals = (InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals) o;
    return Objects.equals(this.depositType, initiateDepositsandWithdrawalsRequestDepositsandWithdrawals.depositType) &&
        Objects.equals(this.withdrawalType, initiateDepositsandWithdrawalsRequestDepositsandWithdrawals.withdrawalType) &&
        Objects.equals(this.accountLimitBreachResponse, initiateDepositsandWithdrawalsRequestDepositsandWithdrawals.accountLimitBreachResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositType, withdrawalType, accountLimitBreachResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals {\n");
    
    sb.append("    depositType: ").append(toIndentedString(depositType)).append("\n");
    sb.append("    withdrawalType: ").append(toIndentedString(withdrawalType)).append("\n");
    sb.append("    accountLimitBreachResponse: ").append(toIndentedString(accountLimitBreachResponse)).append("\n");
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

