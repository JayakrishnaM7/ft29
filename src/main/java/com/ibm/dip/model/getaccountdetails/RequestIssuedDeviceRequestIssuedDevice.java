package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestIssuedDeviceRequestIssuedDevice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class RequestIssuedDeviceRequestIssuedDevice   {
  @JsonProperty("IssuedInventoryType")
  private String issuedInventoryType;

  @JsonProperty("IssuedInventoryOptionSetting")
  private String issuedInventoryOptionSetting;

  @JsonProperty("IssuedInventoryPropertyValue")
  private String issuedInventoryPropertyValue;

  @JsonProperty("IssuedInventoryStatus")
  private String issuedInventoryStatus;

  public RequestIssuedDeviceRequestIssuedDevice issuedInventoryType(String issuedInventoryType) {
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

  public RequestIssuedDeviceRequestIssuedDevice issuedInventoryOptionSetting(String issuedInventoryOptionSetting) {
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

  public RequestIssuedDeviceRequestIssuedDevice issuedInventoryPropertyValue(String issuedInventoryPropertyValue) {
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

  public RequestIssuedDeviceRequestIssuedDevice issuedInventoryStatus(String issuedInventoryStatus) {
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
    RequestIssuedDeviceRequestIssuedDevice requestIssuedDeviceRequestIssuedDevice = (RequestIssuedDeviceRequestIssuedDevice) o;
    return Objects.equals(this.issuedInventoryType, requestIssuedDeviceRequestIssuedDevice.issuedInventoryType) &&
        Objects.equals(this.issuedInventoryOptionSetting, requestIssuedDeviceRequestIssuedDevice.issuedInventoryOptionSetting) &&
        Objects.equals(this.issuedInventoryPropertyValue, requestIssuedDeviceRequestIssuedDevice.issuedInventoryPropertyValue) &&
        Objects.equals(this.issuedInventoryStatus, requestIssuedDeviceRequestIssuedDevice.issuedInventoryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedInventoryType, issuedInventoryOptionSetting, issuedInventoryPropertyValue, issuedInventoryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestIssuedDeviceRequestIssuedDevice {\n");
    
    sb.append("    issuedInventoryType: ").append(toIndentedString(issuedInventoryType)).append("\n");
    sb.append("    issuedInventoryOptionSetting: ").append(toIndentedString(issuedInventoryOptionSetting)).append("\n");
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

