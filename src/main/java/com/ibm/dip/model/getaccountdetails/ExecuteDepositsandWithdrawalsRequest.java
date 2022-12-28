package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.getaccountdetails.ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteDepositsandWithdrawalsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class ExecuteDepositsandWithdrawalsRequest   {
  @JsonProperty("DepositsandWithdrawals")
  private ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals;

  public ExecuteDepositsandWithdrawalsRequest depositsandWithdrawals(ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals) {
    this.depositsandWithdrawals = depositsandWithdrawals;
    return this;
  }

  /**
   * Get depositsandWithdrawals
   * @return depositsandWithdrawals
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals getDepositsandWithdrawals() {
    return depositsandWithdrawals;
  }

  public void setDepositsandWithdrawals(ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals) {
    this.depositsandWithdrawals = depositsandWithdrawals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteDepositsandWithdrawalsRequest executeDepositsandWithdrawalsRequest = (ExecuteDepositsandWithdrawalsRequest) o;
    return Objects.equals(this.depositsandWithdrawals, executeDepositsandWithdrawalsRequest.depositsandWithdrawals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositsandWithdrawals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteDepositsandWithdrawalsRequest {\n");
    
    sb.append("    depositsandWithdrawals: ").append(toIndentedString(depositsandWithdrawals)).append("\n");
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

