package com.ibm.dip.model.checkbalance;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InternalBankAccountLog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:17.694Z[GMT]")

public class InternalBankAccountLog   {
  @JsonProperty("InternalBankAccountLogParameterType")
  private String internalBankAccountLogParameterType;

  @JsonProperty("InternalBankAccountLogSelectedOption")
  private String internalBankAccountLogSelectedOption;

  @JsonProperty("InternalBankAccountLogType")
  private String internalBankAccountLogType;

  @JsonProperty("InternalBankAccountLogSchedule")
  private Object internalBankAccountLogSchedule;

  @JsonProperty("InternalBankAccountLogUsageLog")
  private String internalBankAccountLogUsageLog;

  @JsonProperty("InternalBankAccountLogUpdateLog")
  private String internalBankAccountLogUpdateLog;

  @JsonProperty("InternalBankAccountLogAssociatedParty")
  private Object internalBankAccountLogAssociatedParty;

  @JsonProperty("InternalBankAccountLogBusinessUnitReference")
  private Object internalBankAccountLogBusinessUnitReference;

  @JsonProperty("InternalBankAccountLogCustomerReference")
  private Object internalBankAccountLogCustomerReference;

  @JsonProperty("InternalBankAccountLogServiceConfiguration")
  private String internalBankAccountLogServiceConfiguration;

  @JsonProperty("InternalBankAccountLogPosition")
  private String internalBankAccountLogPosition;

  @JsonProperty("InternalBankAccountLogPositionType")
  private String internalBankAccountLogPositionType;

  @JsonProperty("InternalBankAccountLogPositionLimitTime")
  private String internalBankAccountLogPositionLimitTime;

  @JsonProperty("InternalBankAccountLogReference")
  private String internalBankAccountLogReference;

  public InternalBankAccountLog internalBankAccountLogParameterType(String internalBankAccountLogParameterType) {
    this.internalBankAccountLogParameterType = internalBankAccountLogParameterType;
    return this;
  }

  /**
   * Get internalBankAccountLogParameterType
   * @return internalBankAccountLogParameterType
  */
  @ApiModelProperty(value = "")


  public String getInternalBankAccountLogParameterType() {
    return internalBankAccountLogParameterType;
  }

  public void setInternalBankAccountLogParameterType(String internalBankAccountLogParameterType) {
    this.internalBankAccountLogParameterType = internalBankAccountLogParameterType;
  }

  public InternalBankAccountLog internalBankAccountLogSelectedOption(String internalBankAccountLogSelectedOption) {
    this.internalBankAccountLogSelectedOption = internalBankAccountLogSelectedOption;
    return this;
  }

  /**
   * Get internalBankAccountLogSelectedOption
   * @return internalBankAccountLogSelectedOption
  */
  @ApiModelProperty(value = "")


  public String getInternalBankAccountLogSelectedOption() {
    return internalBankAccountLogSelectedOption;
  }

  public void setInternalBankAccountLogSelectedOption(String internalBankAccountLogSelectedOption) {
    this.internalBankAccountLogSelectedOption = internalBankAccountLogSelectedOption;
  }

  public InternalBankAccountLog internalBankAccountLogType(String internalBankAccountLogType) {
    this.internalBankAccountLogType = internalBankAccountLogType;
    return this;
  }

  /**
   * Get internalBankAccountLogType
   * @return internalBankAccountLogType
  */
  @ApiModelProperty(value = "")


  public String getInternalBankAccountLogType() {
    return internalBankAccountLogType;
  }

  public void setInternalBankAccountLogType(String internalBankAccountLogType) {
    this.internalBankAccountLogType = internalBankAccountLogType;
  }

  public InternalBankAccountLog internalBankAccountLogSchedule(Object internalBankAccountLogSchedule) {
    this.internalBankAccountLogSchedule = internalBankAccountLogSchedule;
    return this;
  }

  /**
   * Get internalBankAccountLogSchedule
   * @return internalBankAccountLogSchedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInternalBankAccountLogSchedule() {
    return internalBankAccountLogSchedule;
  }

  public void setInternalBankAccountLogSchedule(Object internalBankAccountLogSchedule) {
    this.internalBankAccountLogSchedule = internalBankAccountLogSchedule;
  }

  public InternalBankAccountLog internalBankAccountLogUsageLog(String internalBankAccountLogUsageLog) {
    this.internalBankAccountLogUsageLog = internalBankAccountLogUsageLog;
    return this;
  }

  /**
   * Get internalBankAccountLogUsageLog
   * @return internalBankAccountLogUsageLog
  */
  @ApiModelProperty(value = "")


  public String getInternalBankAccountLogUsageLog() {
    return internalBankAccountLogUsageLog;
  }

  public void setInternalBankAccountLogUsageLog(String internalBankAccountLogUsageLog) {
    this.internalBankAccountLogUsageLog = internalBankAccountLogUsageLog;
  }

  public InternalBankAccountLog internalBankAccountLogUpdateLog(String internalBankAccountLogUpdateLog) {
    this.internalBankAccountLogUpdateLog = internalBankAccountLogUpdateLog;
    return this;
  }

  /**
   * Get internalBankAccountLogUpdateLog
   * @return internalBankAccountLogUpdateLog
  */
  @ApiModelProperty(value = "")


  public String getInternalBankAccountLogUpdateLog() {
    return internalBankAccountLogUpdateLog;
  }

  public void setInternalBankAccountLogUpdateLog(String internalBankAccountLogUpdateLog) {
    this.internalBankAccountLogUpdateLog = internalBankAccountLogUpdateLog;
  }

  public InternalBankAccountLog internalBankAccountLogAssociatedParty(Object internalBankAccountLogAssociatedParty) {
    this.internalBankAccountLogAssociatedParty = internalBankAccountLogAssociatedParty;
    return this;
  }

  /**
   * Get internalBankAccountLogAssociatedParty
   * @return internalBankAccountLogAssociatedParty
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInternalBankAccountLogAssociatedParty() {
    return internalBankAccountLogAssociatedParty;
  }

  public void setInternalBankAccountLogAssociatedParty(Object internalBankAccountLogAssociatedParty) {
    this.internalBankAccountLogAssociatedParty = internalBankAccountLogAssociatedParty;
  }

  public InternalBankAccountLog internalBankAccountLogBusinessUnitReference(Object internalBankAccountLogBusinessUnitReference) {
    this.internalBankAccountLogBusinessUnitReference = internalBankAccountLogBusinessUnitReference;
    return this;
  }

  /**
   * Get internalBankAccountLogBusinessUnitReference
   * @return internalBankAccountLogBusinessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInternalBankAccountLogBusinessUnitReference() {
    return internalBankAccountLogBusinessUnitReference;
  }

  public void setInternalBankAccountLogBusinessUnitReference(Object internalBankAccountLogBusinessUnitReference) {
    this.internalBankAccountLogBusinessUnitReference = internalBankAccountLogBusinessUnitReference;
  }

  public InternalBankAccountLog internalBankAccountLogCustomerReference(Object internalBankAccountLogCustomerReference) {
    this.internalBankAccountLogCustomerReference = internalBankAccountLogCustomerReference;
    return this;
  }

  /**
   * Get internalBankAccountLogCustomerReference
   * @return internalBankAccountLogCustomerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInternalBankAccountLogCustomerReference() {
    return internalBankAccountLogCustomerReference;
  }

  public void setInternalBankAccountLogCustomerReference(Object internalBankAccountLogCustomerReference) {
    this.internalBankAccountLogCustomerReference = internalBankAccountLogCustomerReference;
  }

  public InternalBankAccountLog internalBankAccountLogServiceConfiguration(String internalBankAccountLogServiceConfiguration) {
    this.internalBankAccountLogServiceConfiguration = internalBankAccountLogServiceConfiguration;
    return this;
  }

  /**
   * Get internalBankAccountLogServiceConfiguration
   * @return internalBankAccountLogServiceConfiguration
  */
  @ApiModelProperty(value = "")


  public String getInternalBankAccountLogServiceConfiguration() {
    return internalBankAccountLogServiceConfiguration;
  }

  public void setInternalBankAccountLogServiceConfiguration(String internalBankAccountLogServiceConfiguration) {
    this.internalBankAccountLogServiceConfiguration = internalBankAccountLogServiceConfiguration;
  }

  public InternalBankAccountLog internalBankAccountLogPosition(String internalBankAccountLogPosition) {
    this.internalBankAccountLogPosition = internalBankAccountLogPosition;
    return this;
  }

  /**
   * Get internalBankAccountLogPosition
   * @return internalBankAccountLogPosition
  */
  @ApiModelProperty(value = "")


  public String getInternalBankAccountLogPosition() {
    return internalBankAccountLogPosition;
  }

  public void setInternalBankAccountLogPosition(String internalBankAccountLogPosition) {
    this.internalBankAccountLogPosition = internalBankAccountLogPosition;
  }

  public InternalBankAccountLog internalBankAccountLogPositionType(String internalBankAccountLogPositionType) {
    this.internalBankAccountLogPositionType = internalBankAccountLogPositionType;
    return this;
  }

  /**
   * Get internalBankAccountLogPositionType
   * @return internalBankAccountLogPositionType
  */
  @ApiModelProperty(value = "")


  public String getInternalBankAccountLogPositionType() {
    return internalBankAccountLogPositionType;
  }

  public void setInternalBankAccountLogPositionType(String internalBankAccountLogPositionType) {
    this.internalBankAccountLogPositionType = internalBankAccountLogPositionType;
  }

  public InternalBankAccountLog internalBankAccountLogPositionLimitTime(String internalBankAccountLogPositionLimitTime) {
    this.internalBankAccountLogPositionLimitTime = internalBankAccountLogPositionLimitTime;
    return this;
  }

  /**
   * Get internalBankAccountLogPositionLimitTime
   * @return internalBankAccountLogPositionLimitTime
  */
  @ApiModelProperty(value = "")


  public String getInternalBankAccountLogPositionLimitTime() {
    return internalBankAccountLogPositionLimitTime;
  }

  public void setInternalBankAccountLogPositionLimitTime(String internalBankAccountLogPositionLimitTime) {
    this.internalBankAccountLogPositionLimitTime = internalBankAccountLogPositionLimitTime;
  }

  public InternalBankAccountLog internalBankAccountLogReference(String internalBankAccountLogReference) {
    this.internalBankAccountLogReference = internalBankAccountLogReference;
    return this;
  }

  /**
   * Get internalBankAccountLogReference
   * @return internalBankAccountLogReference
  */
  @ApiModelProperty(value = "")


  public String getInternalBankAccountLogReference() {
    return internalBankAccountLogReference;
  }

  public void setInternalBankAccountLogReference(String internalBankAccountLogReference) {
    this.internalBankAccountLogReference = internalBankAccountLogReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalBankAccountLog internalBankAccountLog = (InternalBankAccountLog) o;
    return Objects.equals(this.internalBankAccountLogParameterType, internalBankAccountLog.internalBankAccountLogParameterType) &&
        Objects.equals(this.internalBankAccountLogSelectedOption, internalBankAccountLog.internalBankAccountLogSelectedOption) &&
        Objects.equals(this.internalBankAccountLogType, internalBankAccountLog.internalBankAccountLogType) &&
        Objects.equals(this.internalBankAccountLogSchedule, internalBankAccountLog.internalBankAccountLogSchedule) &&
        Objects.equals(this.internalBankAccountLogUsageLog, internalBankAccountLog.internalBankAccountLogUsageLog) &&
        Objects.equals(this.internalBankAccountLogUpdateLog, internalBankAccountLog.internalBankAccountLogUpdateLog) &&
        Objects.equals(this.internalBankAccountLogAssociatedParty, internalBankAccountLog.internalBankAccountLogAssociatedParty) &&
        Objects.equals(this.internalBankAccountLogBusinessUnitReference, internalBankAccountLog.internalBankAccountLogBusinessUnitReference) &&
        Objects.equals(this.internalBankAccountLogCustomerReference, internalBankAccountLog.internalBankAccountLogCustomerReference) &&
        Objects.equals(this.internalBankAccountLogServiceConfiguration, internalBankAccountLog.internalBankAccountLogServiceConfiguration) &&
        Objects.equals(this.internalBankAccountLogPosition, internalBankAccountLog.internalBankAccountLogPosition) &&
        Objects.equals(this.internalBankAccountLogPositionType, internalBankAccountLog.internalBankAccountLogPositionType) &&
        Objects.equals(this.internalBankAccountLogPositionLimitTime, internalBankAccountLog.internalBankAccountLogPositionLimitTime) &&
        Objects.equals(this.internalBankAccountLogReference, internalBankAccountLog.internalBankAccountLogReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalBankAccountLogParameterType, internalBankAccountLogSelectedOption, internalBankAccountLogType, internalBankAccountLogSchedule, internalBankAccountLogUsageLog, internalBankAccountLogUpdateLog, internalBankAccountLogAssociatedParty, internalBankAccountLogBusinessUnitReference, internalBankAccountLogCustomerReference, internalBankAccountLogServiceConfiguration, internalBankAccountLogPosition, internalBankAccountLogPositionType, internalBankAccountLogPositionLimitTime, internalBankAccountLogReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalBankAccountLog {\n");
    
    sb.append("    internalBankAccountLogParameterType: ").append(toIndentedString(internalBankAccountLogParameterType)).append("\n");
    sb.append("    internalBankAccountLogSelectedOption: ").append(toIndentedString(internalBankAccountLogSelectedOption)).append("\n");
    sb.append("    internalBankAccountLogType: ").append(toIndentedString(internalBankAccountLogType)).append("\n");
    sb.append("    internalBankAccountLogSchedule: ").append(toIndentedString(internalBankAccountLogSchedule)).append("\n");
    sb.append("    internalBankAccountLogUsageLog: ").append(toIndentedString(internalBankAccountLogUsageLog)).append("\n");
    sb.append("    internalBankAccountLogUpdateLog: ").append(toIndentedString(internalBankAccountLogUpdateLog)).append("\n");
    sb.append("    internalBankAccountLogAssociatedParty: ").append(toIndentedString(internalBankAccountLogAssociatedParty)).append("\n");
    sb.append("    internalBankAccountLogBusinessUnitReference: ").append(toIndentedString(internalBankAccountLogBusinessUnitReference)).append("\n");
    sb.append("    internalBankAccountLogCustomerReference: ").append(toIndentedString(internalBankAccountLogCustomerReference)).append("\n");
    sb.append("    internalBankAccountLogServiceConfiguration: ").append(toIndentedString(internalBankAccountLogServiceConfiguration)).append("\n");
    sb.append("    internalBankAccountLogPosition: ").append(toIndentedString(internalBankAccountLogPosition)).append("\n");
    sb.append("    internalBankAccountLogPositionType: ").append(toIndentedString(internalBankAccountLogPositionType)).append("\n");
    sb.append("    internalBankAccountLogPositionLimitTime: ").append(toIndentedString(internalBankAccountLogPositionLimitTime)).append("\n");
    sb.append("    internalBankAccountLogReference: ").append(toIndentedString(internalBankAccountLogReference)).append("\n");
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

