package com.ibm.dip.model.checkbalance;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InternalBankAccountOutcome
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:17.694Z[GMT]")

public class InternalBankAccountOutcome   {
  @JsonProperty("InternalBankAccountIncident")
  private String internalBankAccountIncident;

  @JsonProperty("InternalBankAccountLog")
  private String internalBankAccountLog;

  public InternalBankAccountOutcome internalBankAccountIncident(String internalBankAccountIncident) {
    this.internalBankAccountIncident = internalBankAccountIncident;
    return this;
  }

  /**
   * Get internalBankAccountIncident
   * @return internalBankAccountIncident
  */
  @ApiModelProperty(value = "")


  public String getInternalBankAccountIncident() {
    return internalBankAccountIncident;
  }

  public void setInternalBankAccountIncident(String internalBankAccountIncident) {
    this.internalBankAccountIncident = internalBankAccountIncident;
  }

  public InternalBankAccountOutcome internalBankAccountLog(String internalBankAccountLog) {
    this.internalBankAccountLog = internalBankAccountLog;
    return this;
  }

  /**
   * Get internalBankAccountLog
   * @return internalBankAccountLog
  */
  @ApiModelProperty(value = "")


  public String getInternalBankAccountLog() {
    return internalBankAccountLog;
  }

  public void setInternalBankAccountLog(String internalBankAccountLog) {
    this.internalBankAccountLog = internalBankAccountLog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalBankAccountOutcome internalBankAccountOutcome = (InternalBankAccountOutcome) o;
    return Objects.equals(this.internalBankAccountIncident, internalBankAccountOutcome.internalBankAccountIncident) &&
        Objects.equals(this.internalBankAccountLog, internalBankAccountOutcome.internalBankAccountLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalBankAccountIncident, internalBankAccountLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalBankAccountOutcome {\n");
    
    sb.append("    internalBankAccountIncident: ").append(toIndentedString(internalBankAccountIncident)).append("\n");
    sb.append("    internalBankAccountLog: ").append(toIndentedString(internalBankAccountLog)).append("\n");
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

