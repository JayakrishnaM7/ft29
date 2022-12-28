package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateIssuedDeviceResponseIssuedDevice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class InitiateIssuedDeviceResponseIssuedDevice   {
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

  public InitiateIssuedDeviceResponseIssuedDevice issuedInventoryDescription(String issuedInventoryDescription) {
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

  public InitiateIssuedDeviceResponseIssuedDevice issuedInventoryOptionDefinition(String issuedInventoryOptionDefinition) {
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

  public InitiateIssuedDeviceResponseIssuedDevice issuedInventoryOptionSetting(String issuedInventoryOptionSetting) {
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

  public InitiateIssuedDeviceResponseIssuedDevice issuedInventoryPropertyType(String issuedInventoryPropertyType) {
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

  public InitiateIssuedDeviceResponseIssuedDevice issuedInventoryPropertyValue(String issuedInventoryPropertyValue) {
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

  public InitiateIssuedDeviceResponseIssuedDevice issuedInventoryStatus(String issuedInventoryStatus) {
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
    InitiateIssuedDeviceResponseIssuedDevice initiateIssuedDeviceResponseIssuedDevice = (InitiateIssuedDeviceResponseIssuedDevice) o;
    return Objects.equals(this.issuedInventoryDescription, initiateIssuedDeviceResponseIssuedDevice.issuedInventoryDescription) &&
        Objects.equals(this.issuedInventoryOptionDefinition, initiateIssuedDeviceResponseIssuedDevice.issuedInventoryOptionDefinition) &&
        Objects.equals(this.issuedInventoryOptionSetting, initiateIssuedDeviceResponseIssuedDevice.issuedInventoryOptionSetting) &&
        Objects.equals(this.issuedInventoryPropertyType, initiateIssuedDeviceResponseIssuedDevice.issuedInventoryPropertyType) &&
        Objects.equals(this.issuedInventoryPropertyValue, initiateIssuedDeviceResponseIssuedDevice.issuedInventoryPropertyValue) &&
        Objects.equals(this.issuedInventoryStatus, initiateIssuedDeviceResponseIssuedDevice.issuedInventoryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedInventoryDescription, issuedInventoryOptionDefinition, issuedInventoryOptionSetting, issuedInventoryPropertyType, issuedInventoryPropertyValue, issuedInventoryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateIssuedDeviceResponseIssuedDevice {\n");
    
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

