package com.ibm.dip.model.paymentexecution;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:14.904Z[GMT]")

public class InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure   {
  @JsonProperty("ACHAccessServiceSessionReference")
  private Object acHAccessServiceSessionReference;

  @JsonProperty("ACHAccessSchedule")
  private String acHAccessSchedule;

  @JsonProperty("CorrespondentServiceSessionReference")
  private Object correspondentServiceSessionReference;

  @JsonProperty("CorrespondentServiceAccessSchedule")
  private String correspondentServiceAccessSchedule;

  public InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure acHAccessServiceSessionReference(Object acHAccessServiceSessionReference) {
    this.acHAccessServiceSessionReference = acHAccessServiceSessionReference;
    return this;
  }

  /**
   * Get acHAccessServiceSessionReference
   * @return acHAccessServiceSessionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getAcHAccessServiceSessionReference() {
    return acHAccessServiceSessionReference;
  }

  public void setAcHAccessServiceSessionReference(Object acHAccessServiceSessionReference) {
    this.acHAccessServiceSessionReference = acHAccessServiceSessionReference;
  }

  public InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure acHAccessSchedule(String acHAccessSchedule) {
    this.acHAccessSchedule = acHAccessSchedule;
    return this;
  }

  /**
   * Get acHAccessSchedule
   * @return acHAccessSchedule
  */
  @ApiModelProperty(value = "")


  public String getAcHAccessSchedule() {
    return acHAccessSchedule;
  }

  public void setAcHAccessSchedule(String acHAccessSchedule) {
    this.acHAccessSchedule = acHAccessSchedule;
  }

  public InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure correspondentServiceSessionReference(Object correspondentServiceSessionReference) {
    this.correspondentServiceSessionReference = correspondentServiceSessionReference;
    return this;
  }

  /**
   * Get correspondentServiceSessionReference
   * @return correspondentServiceSessionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCorrespondentServiceSessionReference() {
    return correspondentServiceSessionReference;
  }

  public void setCorrespondentServiceSessionReference(Object correspondentServiceSessionReference) {
    this.correspondentServiceSessionReference = correspondentServiceSessionReference;
  }

  public InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure correspondentServiceAccessSchedule(String correspondentServiceAccessSchedule) {
    this.correspondentServiceAccessSchedule = correspondentServiceAccessSchedule;
    return this;
  }

  /**
   * Get correspondentServiceAccessSchedule
   * @return correspondentServiceAccessSchedule
  */
  @ApiModelProperty(value = "")


  public String getCorrespondentServiceAccessSchedule() {
    return correspondentServiceAccessSchedule;
  }

  public void setCorrespondentServiceAccessSchedule(String correspondentServiceAccessSchedule) {
    this.correspondentServiceAccessSchedule = correspondentServiceAccessSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure initiatePaymentExecutionProcedureResponsePaymentExecutionProcedure = (InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure) o;
    return Objects.equals(this.acHAccessServiceSessionReference, initiatePaymentExecutionProcedureResponsePaymentExecutionProcedure.acHAccessServiceSessionReference) &&
        Objects.equals(this.acHAccessSchedule, initiatePaymentExecutionProcedureResponsePaymentExecutionProcedure.acHAccessSchedule) &&
        Objects.equals(this.correspondentServiceSessionReference, initiatePaymentExecutionProcedureResponsePaymentExecutionProcedure.correspondentServiceSessionReference) &&
        Objects.equals(this.correspondentServiceAccessSchedule, initiatePaymentExecutionProcedureResponsePaymentExecutionProcedure.correspondentServiceAccessSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acHAccessServiceSessionReference, acHAccessSchedule, correspondentServiceSessionReference, correspondentServiceAccessSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure {\n");
    
    sb.append("    acHAccessServiceSessionReference: ").append(toIndentedString(acHAccessServiceSessionReference)).append("\n");
    sb.append("    acHAccessSchedule: ").append(toIndentedString(acHAccessSchedule)).append("\n");
    sb.append("    correspondentServiceSessionReference: ").append(toIndentedString(correspondentServiceSessionReference)).append("\n");
    sb.append("    correspondentServiceAccessSchedule: ").append(toIndentedString(correspondentServiceAccessSchedule)).append("\n");
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

