package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.getaccountdetails.ExecuteAccountSweepRequestAccountSweep;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteAccountSweepRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class ExecuteAccountSweepRequest   {
  @JsonProperty("AccountSweep")
  private ExecuteAccountSweepRequestAccountSweep accountSweep;

  public ExecuteAccountSweepRequest accountSweep(ExecuteAccountSweepRequestAccountSweep accountSweep) {
    this.accountSweep = accountSweep;
    return this;
  }

  /**
   * Get accountSweep
   * @return accountSweep
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteAccountSweepRequestAccountSweep getAccountSweep() {
    return accountSweep;
  }

  public void setAccountSweep(ExecuteAccountSweepRequestAccountSweep accountSweep) {
    this.accountSweep = accountSweep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteAccountSweepRequest executeAccountSweepRequest = (ExecuteAccountSweepRequest) o;
    return Objects.equals(this.accountSweep, executeAccountSweepRequest.accountSweep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteAccountSweepRequest {\n");
    
    sb.append("    accountSweep: ").append(toIndentedString(accountSweep)).append("\n");
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

