package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals   {
  @JsonProperty("DepositTransactionDate")
  private String depositTransactionDate;

  @JsonProperty("WithdrawalTransactionDate")
  private String withdrawalTransactionDate;

  public ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals depositTransactionDate(String depositTransactionDate) {
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

  public ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals withdrawalTransactionDate(String withdrawalTransactionDate) {
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
    ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals executeDepositsandWithdrawalsResponseDepositsandWithdrawals = (ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals) o;
    return Objects.equals(this.depositTransactionDate, executeDepositsandWithdrawalsResponseDepositsandWithdrawals.depositTransactionDate) &&
        Objects.equals(this.withdrawalTransactionDate, executeDepositsandWithdrawalsResponseDepositsandWithdrawals.withdrawalTransactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositTransactionDate, withdrawalTransactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals {\n");
    
    sb.append("    depositTransactionDate: ").append(toIndentedString(depositTransactionDate)).append("\n");
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

