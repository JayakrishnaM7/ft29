package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAccountLienResponseAccountLien
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class InitiateAccountLienResponseAccountLien   {
  @JsonProperty("LienDefinition")
  private String lienDefinition;

  @JsonProperty("LienRecord")
  private String lienRecord;

  public InitiateAccountLienResponseAccountLien lienDefinition(String lienDefinition) {
    this.lienDefinition = lienDefinition;
    return this;
  }

  /**
   * Get lienDefinition
   * @return lienDefinition
  */
  @ApiModelProperty(value = "")


  public String getLienDefinition() {
    return lienDefinition;
  }

  public void setLienDefinition(String lienDefinition) {
    this.lienDefinition = lienDefinition;
  }

  public InitiateAccountLienResponseAccountLien lienRecord(String lienRecord) {
    this.lienRecord = lienRecord;
    return this;
  }

  /**
   * Get lienRecord
   * @return lienRecord
  */
  @ApiModelProperty(value = "")


  public String getLienRecord() {
    return lienRecord;
  }

  public void setLienRecord(String lienRecord) {
    this.lienRecord = lienRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateAccountLienResponseAccountLien initiateAccountLienResponseAccountLien = (InitiateAccountLienResponseAccountLien) o;
    return Objects.equals(this.lienDefinition, initiateAccountLienResponseAccountLien.lienDefinition) &&
        Objects.equals(this.lienRecord, initiateAccountLienResponseAccountLien.lienRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lienDefinition, lienRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountLienResponseAccountLien {\n");
    
    sb.append("    lienDefinition: ").append(toIndentedString(lienDefinition)).append("\n");
    sb.append("    lienRecord: ").append(toIndentedString(lienRecord)).append("\n");
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

