package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePaymentsRequestPayments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class InitiatePaymentsRequestPayments   {
  @JsonProperty("PaymentType")
  private String paymentType;

  @JsonProperty("PaymentDefinition")
  private String paymentDefinition;

  @JsonProperty("PaymentProcessingOptionSetting")
  private String paymentProcessingOptionSetting;

  @JsonProperty("PaymentConfiguration")
  private String paymentConfiguration;

  @JsonProperty("PaymentSchedule")
  private String paymentSchedule;

  @JsonProperty("DirectDebitMandateReference")
  private Object directDebitMandateReference;

  @JsonProperty("DirectDebitMandateSettings")
  private String directDebitMandateSettings;

  @JsonProperty("BillPayMandateReference")
  private Object billPayMandateReference;

  @JsonProperty("BilPayMandateSettings")
  private String bilPayMandateSettings;

  public InitiatePaymentsRequestPayments paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
  */
  @ApiModelProperty(value = "")


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public InitiatePaymentsRequestPayments paymentDefinition(String paymentDefinition) {
    this.paymentDefinition = paymentDefinition;
    return this;
  }

  /**
   * Get paymentDefinition
   * @return paymentDefinition
  */
  @ApiModelProperty(value = "")


  public String getPaymentDefinition() {
    return paymentDefinition;
  }

  public void setPaymentDefinition(String paymentDefinition) {
    this.paymentDefinition = paymentDefinition;
  }

  public InitiatePaymentsRequestPayments paymentProcessingOptionSetting(String paymentProcessingOptionSetting) {
    this.paymentProcessingOptionSetting = paymentProcessingOptionSetting;
    return this;
  }

  /**
   * Get paymentProcessingOptionSetting
   * @return paymentProcessingOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getPaymentProcessingOptionSetting() {
    return paymentProcessingOptionSetting;
  }

  public void setPaymentProcessingOptionSetting(String paymentProcessingOptionSetting) {
    this.paymentProcessingOptionSetting = paymentProcessingOptionSetting;
  }

  public InitiatePaymentsRequestPayments paymentConfiguration(String paymentConfiguration) {
    this.paymentConfiguration = paymentConfiguration;
    return this;
  }

  /**
   * Get paymentConfiguration
   * @return paymentConfiguration
  */
  @ApiModelProperty(value = "")


  public String getPaymentConfiguration() {
    return paymentConfiguration;
  }

  public void setPaymentConfiguration(String paymentConfiguration) {
    this.paymentConfiguration = paymentConfiguration;
  }

  public InitiatePaymentsRequestPayments paymentSchedule(String paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
    return this;
  }

  /**
   * Get paymentSchedule
   * @return paymentSchedule
  */
  @ApiModelProperty(value = "")


  public String getPaymentSchedule() {
    return paymentSchedule;
  }

  public void setPaymentSchedule(String paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
  }

  public InitiatePaymentsRequestPayments directDebitMandateReference(Object directDebitMandateReference) {
    this.directDebitMandateReference = directDebitMandateReference;
    return this;
  }

  /**
   * Get directDebitMandateReference
   * @return directDebitMandateReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDirectDebitMandateReference() {
    return directDebitMandateReference;
  }

  public void setDirectDebitMandateReference(Object directDebitMandateReference) {
    this.directDebitMandateReference = directDebitMandateReference;
  }

  public InitiatePaymentsRequestPayments directDebitMandateSettings(String directDebitMandateSettings) {
    this.directDebitMandateSettings = directDebitMandateSettings;
    return this;
  }

  /**
   * Get directDebitMandateSettings
   * @return directDebitMandateSettings
  */
  @ApiModelProperty(value = "")


  public String getDirectDebitMandateSettings() {
    return directDebitMandateSettings;
  }

  public void setDirectDebitMandateSettings(String directDebitMandateSettings) {
    this.directDebitMandateSettings = directDebitMandateSettings;
  }

  public InitiatePaymentsRequestPayments billPayMandateReference(Object billPayMandateReference) {
    this.billPayMandateReference = billPayMandateReference;
    return this;
  }

  /**
   * Get billPayMandateReference
   * @return billPayMandateReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBillPayMandateReference() {
    return billPayMandateReference;
  }

  public void setBillPayMandateReference(Object billPayMandateReference) {
    this.billPayMandateReference = billPayMandateReference;
  }

  public InitiatePaymentsRequestPayments bilPayMandateSettings(String bilPayMandateSettings) {
    this.bilPayMandateSettings = bilPayMandateSettings;
    return this;
  }

  /**
   * Get bilPayMandateSettings
   * @return bilPayMandateSettings
  */
  @ApiModelProperty(value = "")


  public String getBilPayMandateSettings() {
    return bilPayMandateSettings;
  }

  public void setBilPayMandateSettings(String bilPayMandateSettings) {
    this.bilPayMandateSettings = bilPayMandateSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentsRequestPayments initiatePaymentsRequestPayments = (InitiatePaymentsRequestPayments) o;
    return Objects.equals(this.paymentType, initiatePaymentsRequestPayments.paymentType) &&
        Objects.equals(this.paymentDefinition, initiatePaymentsRequestPayments.paymentDefinition) &&
        Objects.equals(this.paymentProcessingOptionSetting, initiatePaymentsRequestPayments.paymentProcessingOptionSetting) &&
        Objects.equals(this.paymentConfiguration, initiatePaymentsRequestPayments.paymentConfiguration) &&
        Objects.equals(this.paymentSchedule, initiatePaymentsRequestPayments.paymentSchedule) &&
        Objects.equals(this.directDebitMandateReference, initiatePaymentsRequestPayments.directDebitMandateReference) &&
        Objects.equals(this.directDebitMandateSettings, initiatePaymentsRequestPayments.directDebitMandateSettings) &&
        Objects.equals(this.billPayMandateReference, initiatePaymentsRequestPayments.billPayMandateReference) &&
        Objects.equals(this.bilPayMandateSettings, initiatePaymentsRequestPayments.bilPayMandateSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentType, paymentDefinition, paymentProcessingOptionSetting, paymentConfiguration, paymentSchedule, directDebitMandateReference, directDebitMandateSettings, billPayMandateReference, bilPayMandateSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentsRequestPayments {\n");
    
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentDefinition: ").append(toIndentedString(paymentDefinition)).append("\n");
    sb.append("    paymentProcessingOptionSetting: ").append(toIndentedString(paymentProcessingOptionSetting)).append("\n");
    sb.append("    paymentConfiguration: ").append(toIndentedString(paymentConfiguration)).append("\n");
    sb.append("    paymentSchedule: ").append(toIndentedString(paymentSchedule)).append("\n");
    sb.append("    directDebitMandateReference: ").append(toIndentedString(directDebitMandateReference)).append("\n");
    sb.append("    directDebitMandateSettings: ").append(toIndentedString(directDebitMandateSettings)).append("\n");
    sb.append("    billPayMandateReference: ").append(toIndentedString(billPayMandateReference)).append("\n");
    sb.append("    bilPayMandateSettings: ").append(toIndentedString(bilPayMandateSettings)).append("\n");
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

