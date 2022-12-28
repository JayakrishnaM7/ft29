package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateIssuedDeviceRequestIssuedDevice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class InitiateIssuedDeviceRequestIssuedDevice   {
  @JsonProperty("IssuedInventoryType")
  private String issuedInventoryType;

  @JsonProperty("IssuedInventoryDescription")
  private String issuedInventoryDescription;

  @JsonProperty("IssuedInventoryOptionDefinition")
  private String issuedInventoryOptionDefinition;

  @JsonProperty("IssuedInventoryOptionSetting")
  private String issuedInventoryOptionSetting;

  @JsonProperty("IssuedInventoryPropertyType")
  private String issuedInventoryPropertyType;

  @JsonProperty("IssuedInventoryPropertyValue")
  private String issuedInventoryPropertyValue;

  @JsonProperty("IssuedInventoryStatus")
  private String issuedInventoryStatus;

  public InitiateIssuedDeviceRequestIssuedDevice issuedInventoryType(String issuedInventoryType) {
    this.issuedInventoryType = issuedInventoryType;
    return this;
  }

  /**
   * Get issuedInventoryType
   * @return issuedInventoryType
  */
  @ApiModelProperty(value = "")


  public String getIssuedInventoryType() {
    return issuedInventoryType;
  }

  public void setIssuedInventoryType(String issuedInventoryType) {
    this.issuedInventoryType = issuedInventoryType;
  }

  public InitiateIssuedDeviceRequestIssuedDevice issuedInventoryDescription(String issuedInventoryDescription) {
    this.issuedInventoryDescription = issuedInventoryDescription;
    return this;
  }

  /**
   * Get issuedInventoryDescription
   * @return issuedInventoryDescription
  */
  @ApiModelProperty(value = "")


  public String getIssuedInventoryDescription() {
    return issuedInventoryDescription;
  }

  public void setIssuedInventoryDescription(String issuedInventoryDescription) {
    this.issuedInventoryDescription = issuedInventoryDescription;
  }

  public InitiateIssuedDeviceRequestIssuedDevice issuedInventoryOptionDefinition(String issuedInventoryOptionDefinition) {
    this.issuedInventoryOptionDefinition = issuedInventoryOptionDefinition;
    return this;
  }

  /**
   * Get issuedInventoryOptionDefinition
   * @return issuedInventoryOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getIssuedInventoryOptionDefinition() {
    return issuedInventoryOptionDefinition;
  }

  public void setIssuedInventoryOptionDefinition(String issuedInventoryOptionDefinition) {
    this.issuedInventoryOptionDefinition = issuedInventoryOptionDefinition;
  }

  public InitiateIssuedDeviceRequestIssuedDevice issuedInventoryOptionSetting(String issuedInventoryOptionSetting) {
    this.issuedInventoryOptionSetting = issuedInventoryOptionSetting;
    return this;
  }

  /**
   * Get issuedInventoryOptionSetting
   * @return issuedInventoryOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getIssuedInventoryOptionSetting() {
    return issuedInventoryOptionSetting;
  }

  public void setIssuedInventoryOptionSetting(String issuedInventoryOptionSetting) {
    this.issuedInventoryOptionSetting = issuedInventoryOptionSetting;
  }

  public InitiateIssuedDeviceRequestIssuedDevice issuedInventoryPropertyType(String issuedInventoryPropertyType) {
    this.issuedInventoryPropertyType = issuedInventoryPropertyType;
    return this;
  }

  /**
   * Get issuedInventoryPropertyType
   * @return issuedInventoryPropertyType
  */
  @ApiModelProperty(value = "")


  public String getIssuedInventoryPropertyType() {
    return issuedInventoryPropertyType;
  }

  public void setIssuedInventoryPropertyType(String issuedInventoryPropertyType) {
    this.issuedInventoryPropertyType = issuedInventoryPropertyType;
  }

  public InitiateIssuedDeviceRequestIssuedDevice issuedInventoryPropertyValue(String issuedInventoryPropertyValue) {
    this.issuedInventoryPropertyValue = issuedInventoryPropertyValue;
    return this;
  }

  /**
   * Get issuedInventoryPropertyValue
   * @return issuedInventoryPropertyValue
  */
  @ApiModelProperty(value = "")


  public String getIssuedInventoryPropertyValue() {
    return issuedInventoryPropertyValue;
  }

  public void setIssuedInventoryPropertyValue(String issuedInventoryPropertyValue) {
    this.issuedInventoryPropertyValue = issuedInventoryPropertyValue;
  }

  public InitiateIssuedDeviceRequestIssuedDevice issuedInventoryStatus(String issuedInventoryStatus) {
    this.issuedInventoryStatus = issuedInventoryStatus;
    return this;
  }

  /**
   * Get issuedInventoryStatus
   * @return issuedInventoryStatus
  */
  @ApiModelProperty(value = "")


  public String getIssuedInventoryStatus() {
    return issuedInventoryStatus;
  }

  public void setIssuedInventoryStatus(String issuedInventoryStatus) {
    this.issuedInventoryStatus = issuedInventoryStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateIssuedDeviceRequestIssuedDevice initiateIssuedDeviceRequestIssuedDevice = (InitiateIssuedDeviceRequestIssuedDevice) o;
    return Objects.equals(this.issuedInventoryType, initiateIssuedDeviceRequestIssuedDevice.issuedInventoryType) &&
        Objects.equals(this.issuedInventoryDescription, initiateIssuedDeviceRequestIssuedDevice.issuedInventoryDescription) &&
        Objects.equals(this.issuedInventoryOptionDefinition, initiateIssuedDeviceRequestIssuedDevice.issuedInventoryOptionDefinition) &&
        Objects.equals(this.issuedInventoryOptionSetting, initiateIssuedDeviceRequestIssuedDevice.issuedInventoryOptionSetting) &&
        Objects.equals(this.issuedInventoryPropertyType, initiateIssuedDeviceRequestIssuedDevice.issuedInventoryPropertyType) &&
        Objects.equals(this.issuedInventoryPropertyValue, initiateIssuedDeviceRequestIssuedDevice.issuedInventoryPropertyValue) &&
        Objects.equals(this.issuedInventoryStatus, initiateIssuedDeviceRequestIssuedDevice.issuedInventoryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedInventoryType, issuedInventoryDescription, issuedInventoryOptionDefinition, issuedInventoryOptionSetting, issuedInventoryPropertyType, issuedInventoryPropertyValue, issuedInventoryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateIssuedDeviceRequestIssuedDevice {\n");
    
    sb.append("    issuedInventoryType: ").append(toIndentedString(issuedInventoryType)).append("\n");
    sb.append("    issuedInventoryDescription: ").append(toIndentedString(issuedInventoryDescription)).append("\n");
    sb.append("    issuedInventoryOptionDefinition: ").append(toIndentedString(issuedInventoryOptionDefinition)).append("\n");
    sb.append("    issuedInventoryOptionSetting: ").append(toIndentedString(issuedInventoryOptionSetting)).append("\n");
    sb.append("    issuedInventoryPropertyType: ").append(toIndentedString(issuedInventoryPropertyType)).append("\n");
    sb.append("    issuedInventoryPropertyValue: ").append(toIndentedString(issuedInventoryPropertyValue)).append("\n");
    sb.append("    issuedInventoryStatus: ").append(toIndentedString(issuedInventoryStatus)).append("\n");
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

