package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.getaccountdetails.InitiateAccountSweepRequestAccountSweep;
import com.ibm.dip.model.getaccountdetails.InitiateAccountSweepRequestCurrentAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAccountSweepRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class InitiateAccountSweepRequest   {
  @JsonProperty("CurrentAccountFacility")
  private InitiateAccountSweepRequestCurrentAccountFacility currentAccountFacility;

  @JsonProperty("AccountSweep")
  private InitiateAccountSweepRequestAccountSweep accountSweep;

  public InitiateAccountSweepRequest currentAccountFacility(InitiateAccountSweepRequestCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
    return this;
  }

  /**
   * Get currentAccountFacility
   * @return currentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountSweepRequestCurrentAccountFacility getCurrentAccountFacility() {
    return currentAccountFacility;
  }

  public void setCurrentAccountFacility(InitiateAccountSweepRequestCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
  }

  public InitiateAccountSweepRequest accountSweep(InitiateAccountSweepRequestAccountSweep accountSweep) {
    this.accountSweep = accountSweep;
    return this;
  }

  /**
   * Get accountSweep
   * @return accountSweep
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountSweepRequestAccountSweep getAccountSweep() {
    return accountSweep;
  }

  public void setAccountSweep(InitiateAccountSweepRequestAccountSweep accountSweep) {
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
    InitiateAccountSweepRequest initiateAccountSweepRequest = (InitiateAccountSweepRequest) o;
    return Objects.equals(this.currentAccountFacility, initiateAccountSweepRequest.currentAccountFacility) &&
        Objects.equals(this.accountSweep, initiateAccountSweepRequest.accountSweep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFacility, accountSweep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountSweepRequest {\n");
    
    sb.append("    currentAccountFacility: ").append(toIndentedString(currentAccountFacility)).append("\n");
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

