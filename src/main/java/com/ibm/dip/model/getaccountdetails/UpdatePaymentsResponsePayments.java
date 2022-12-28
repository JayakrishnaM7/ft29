package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdatePaymentsResponsePayments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class UpdatePaymentsResponsePayments   {
  @JsonProperty("PaymentType")
  private String paymentType;

  @JsonProperty("PaymentProcessinngOptionDefinition")
  private String paymentProcessinngOptionDefinition;

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

  @JsonProperty("PaymentTransaction")
  private String paymentTransaction;

  @JsonProperty("PaymentTransactionType")
  private String paymentTransactionType;

  @JsonProperty("PaymentTransactionPayeeReference")
  private Object paymentTransactionPayeeReference;

  @JsonProperty("PaymentTransactionPayeeAccountReference")
  private Object paymentTransactionPayeeAccountReference;

  @JsonProperty("PaymentTransactionPayeeBankReference")
  private Object paymentTransactionPayeeBankReference;

  @JsonProperty("PaymentTransactionAmount")
  private BigDecimal paymentTransactionAmount;

  @JsonProperty("PaymentTransactionFeeType")
  private String paymentTransactionFeeType;

  @JsonProperty("PaymentTransactionFeeCharge")
  private String paymentTransactionFeeCharge;

  @JsonProperty("PaymentTransactionDate")
  private String paymentTransactionDate;

  @JsonProperty("PaymentTransactionPaymentMechanism")
  private String paymentTransactionPaymentMechanism;

  @JsonProperty("PaymentTransactionPaymentPurpose")
  private String paymentTransactionPaymentPurpose;

  @JsonProperty("PaymentTransactionBankBranchOrLocationReference")
  private Object paymentTransactionBankBranchOrLocationReference;

  @JsonProperty("PaymentTransactionStatus")
  private String paymentTransactionStatus;

  public UpdatePaymentsResponsePayments paymentType(String paymentType) {
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

  public UpdatePaymentsResponsePayments paymentProcessinngOptionDefinition(String paymentProcessinngOptionDefinition) {
    this.paymentProcessinngOptionDefinition = paymentProcessinngOptionDefinition;
    return this;
  }

  /**
   * Get paymentProcessinngOptionDefinition
   * @return paymentProcessinngOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getPaymentProcessinngOptionDefinition() {
    return paymentProcessinngOptionDefinition;
  }

  public void setPaymentProcessinngOptionDefinition(String paymentProcessinngOptionDefinition) {
    this.paymentProcessinngOptionDefinition = paymentProcessinngOptionDefinition;
  }

  public UpdatePaymentsResponsePayments paymentProcessingOptionSetting(String paymentProcessingOptionSetting) {
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

  public UpdatePaymentsResponsePayments paymentConfiguration(String paymentConfiguration) {
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

  public UpdatePaymentsResponsePayments paymentSchedule(String paymentSchedule) {
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

  public UpdatePaymentsResponsePayments directDebitMandateReference(Object directDebitMandateReference) {
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

  public UpdatePaymentsResponsePayments directDebitMandateSettings(String directDebitMandateSettings) {
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

  public UpdatePaymentsResponsePayments billPayMandateReference(Object billPayMandateReference) {
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

  public UpdatePaymentsResponsePayments bilPayMandateSettings(String bilPayMandateSettings) {
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

  public UpdatePaymentsResponsePayments paymentTransaction(String paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
    return this;
  }

  /**
   * Get paymentTransaction
   * @return paymentTransaction
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(String paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }

  public UpdatePaymentsResponsePayments paymentTransactionType(String paymentTransactionType) {
    this.paymentTransactionType = paymentTransactionType;
    return this;
  }

  /**
   * Get paymentTransactionType
   * @return paymentTransactionType
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionType() {
    return paymentTransactionType;
  }

  public void setPaymentTransactionType(String paymentTransactionType) {
    this.paymentTransactionType = paymentTransactionType;
  }

  public UpdatePaymentsResponsePayments paymentTransactionPayeeReference(Object paymentTransactionPayeeReference) {
    this.paymentTransactionPayeeReference = paymentTransactionPayeeReference;
    return this;
  }

  /**
   * Get paymentTransactionPayeeReference
   * @return paymentTransactionPayeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionPayeeReference() {
    return paymentTransactionPayeeReference;
  }

  public void setPaymentTransactionPayeeReference(Object paymentTransactionPayeeReference) {
    this.paymentTransactionPayeeReference = paymentTransactionPayeeReference;
  }

  public UpdatePaymentsResponsePayments paymentTransactionPayeeAccountReference(Object paymentTransactionPayeeAccountReference) {
    this.paymentTransactionPayeeAccountReference = paymentTransactionPayeeAccountReference;
    return this;
  }

  /**
   * Get paymentTransactionPayeeAccountReference
   * @return paymentTransactionPayeeAccountReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionPayeeAccountReference() {
    return paymentTransactionPayeeAccountReference;
  }

  public void setPaymentTransactionPayeeAccountReference(Object paymentTransactionPayeeAccountReference) {
    this.paymentTransactionPayeeAccountReference = paymentTransactionPayeeAccountReference;
  }

  public UpdatePaymentsResponsePayments paymentTransactionPayeeBankReference(Object paymentTransactionPayeeBankReference) {
    this.paymentTransactionPayeeBankReference = paymentTransactionPayeeBankReference;
    return this;
  }

  /**
   * Get paymentTransactionPayeeBankReference
   * @return paymentTransactionPayeeBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionPayeeBankReference() {
    return paymentTransactionPayeeBankReference;
  }

  public void setPaymentTransactionPayeeBankReference(Object paymentTransactionPayeeBankReference) {
    this.paymentTransactionPayeeBankReference = paymentTransactionPayeeBankReference;
  }

  public UpdatePaymentsResponsePayments paymentTransactionAmount(BigDecimal paymentTransactionAmount) {
    this.paymentTransactionAmount = paymentTransactionAmount;
    return this;
  }

  /**
   * Get paymentTransactionAmount
   * @return paymentTransactionAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPaymentTransactionAmount() {
    return paymentTransactionAmount;
  }

  public void setPaymentTransactionAmount(BigDecimal paymentTransactionAmount) {
    this.paymentTransactionAmount = paymentTransactionAmount;
  }

  public UpdatePaymentsResponsePayments paymentTransactionFeeType(String paymentTransactionFeeType) {
    this.paymentTransactionFeeType = paymentTransactionFeeType;
    return this;
  }

  /**
   * Get paymentTransactionFeeType
   * @return paymentTransactionFeeType
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionFeeType() {
    return paymentTransactionFeeType;
  }

  public void setPaymentTransactionFeeType(String paymentTransactionFeeType) {
    this.paymentTransactionFeeType = paymentTransactionFeeType;
  }

  public UpdatePaymentsResponsePayments paymentTransactionFeeCharge(String paymentTransactionFeeCharge) {
    this.paymentTransactionFeeCharge = paymentTransactionFeeCharge;
    return this;
  }

  /**
   * Get paymentTransactionFeeCharge
   * @return paymentTransactionFeeCharge
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionFeeCharge() {
    return paymentTransactionFeeCharge;
  }

  public void setPaymentTransactionFeeCharge(String paymentTransactionFeeCharge) {
    this.paymentTransactionFeeCharge = paymentTransactionFeeCharge;
  }

  public UpdatePaymentsResponsePayments paymentTransactionDate(String paymentTransactionDate) {
    this.paymentTransactionDate = paymentTransactionDate;
    return this;
  }

  /**
   * Get paymentTransactionDate
   * @return paymentTransactionDate
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionDate() {
    return paymentTransactionDate;
  }

  public void setPaymentTransactionDate(String paymentTransactionDate) {
    this.paymentTransactionDate = paymentTransactionDate;
  }

  public UpdatePaymentsResponsePayments paymentTransactionPaymentMechanism(String paymentTransactionPaymentMechanism) {
    this.paymentTransactionPaymentMechanism = paymentTransactionPaymentMechanism;
    return this;
  }

  /**
   * Get paymentTransactionPaymentMechanism
   * @return paymentTransactionPaymentMechanism
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionPaymentMechanism() {
    return paymentTransactionPaymentMechanism;
  }

  public void setPaymentTransactionPaymentMechanism(String paymentTransactionPaymentMechanism) {
    this.paymentTransactionPaymentMechanism = paymentTransactionPaymentMechanism;
  }

  public UpdatePaymentsResponsePayments paymentTransactionPaymentPurpose(String paymentTransactionPaymentPurpose) {
    this.paymentTransactionPaymentPurpose = paymentTransactionPaymentPurpose;
    return this;
  }

  /**
   * Get paymentTransactionPaymentPurpose
   * @return paymentTransactionPaymentPurpose
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionPaymentPurpose() {
    return paymentTransactionPaymentPurpose;
  }

  public void setPaymentTransactionPaymentPurpose(String paymentTransactionPaymentPurpose) {
    this.paymentTransactionPaymentPurpose = paymentTransactionPaymentPurpose;
  }

  public UpdatePaymentsResponsePayments paymentTransactionBankBranchOrLocationReference(Object paymentTransactionBankBranchOrLocationReference) {
    this.paymentTransactionBankBranchOrLocationReference = paymentTransactionBankBranchOrLocationReference;
    return this;
  }

  /**
   * Get paymentTransactionBankBranchOrLocationReference
   * @return paymentTransactionBankBranchOrLocationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionBankBranchOrLocationReference() {
    return paymentTransactionBankBranchOrLocationReference;
  }

  public void setPaymentTransactionBankBranchOrLocationReference(Object paymentTransactionBankBranchOrLocationReference) {
    this.paymentTransactionBankBranchOrLocationReference = paymentTransactionBankBranchOrLocationReference;
  }

  public UpdatePaymentsResponsePayments paymentTransactionStatus(String paymentTransactionStatus) {
    this.paymentTransactionStatus = paymentTransactionStatus;
    return this;
  }

  /**
   * Get paymentTransactionStatus
   * @return paymentTransactionStatus
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionStatus() {
    return paymentTransactionStatus;
  }

  public void setPaymentTransactionStatus(String paymentTransactionStatus) {
    this.paymentTransactionStatus = paymentTransactionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentsResponsePayments updatePaymentsResponsePayments = (UpdatePaymentsResponsePayments) o;
    return Objects.equals(this.paymentType, updatePaymentsResponsePayments.paymentType) &&
        Objects.equals(this.paymentProcessinngOptionDefinition, updatePaymentsResponsePayments.paymentProcessinngOptionDefinition) &&
        Objects.equals(this.paymentProcessingOptionSetting, updatePaymentsResponsePayments.paymentProcessingOptionSetting) &&
        Objects.equals(this.paymentConfiguration, updatePaymentsResponsePayments.paymentConfiguration) &&
        Objects.equals(this.paymentSchedule, updatePaymentsResponsePayments.paymentSchedule) &&
        Objects.equals(this.directDebitMandateReference, updatePaymentsResponsePayments.directDebitMandateReference) &&
        Objects.equals(this.directDebitMandateSettings, updatePaymentsResponsePayments.directDebitMandateSettings) &&
        Objects.equals(this.billPayMandateReference, updatePaymentsResponsePayments.billPayMandateReference) &&
        Objects.equals(this.bilPayMandateSettings, updatePaymentsResponsePayments.bilPayMandateSettings) &&
        Objects.equals(this.paymentTransaction, updatePaymentsResponsePayments.paymentTransaction) &&
        Objects.equals(this.paymentTransactionType, updatePaymentsResponsePayments.paymentTransactionType) &&
        Objects.equals(this.paymentTransactionPayeeReference, updatePaymentsResponsePayments.paymentTransactionPayeeReference) &&
        Objects.equals(this.paymentTransactionPayeeAccountReference, updatePaymentsResponsePayments.paymentTransactionPayeeAccountReference) &&
        Objects.equals(this.paymentTransactionPayeeBankReference, updatePaymentsResponsePayments.paymentTransactionPayeeBankReference) &&
        Objects.equals(this.paymentTransactionAmount, updatePaymentsResponsePayments.paymentTransactionAmount) &&
        Objects.equals(this.paymentTransactionFeeType, updatePaymentsResponsePayments.paymentTransactionFeeType) &&
        Objects.equals(this.paymentTransactionFeeCharge, updatePaymentsResponsePayments.paymentTransactionFeeCharge) &&
        Objects.equals(this.paymentTransactionDate, updatePaymentsResponsePayments.paymentTransactionDate) &&
        Objects.equals(this.paymentTransactionPaymentMechanism, updatePaymentsResponsePayments.paymentTransactionPaymentMechanism) &&
        Objects.equals(this.paymentTransactionPaymentPurpose, updatePaymentsResponsePayments.paymentTransactionPaymentPurpose) &&
        Objects.equals(this.paymentTransactionBankBranchOrLocationReference, updatePaymentsResponsePayments.paymentTransactionBankBranchOrLocationReference) &&
        Objects.equals(this.paymentTransactionStatus, updatePaymentsResponsePayments.paymentTransactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentType, paymentProcessinngOptionDefinition, paymentProcessingOptionSetting, paymentConfiguration, paymentSchedule, directDebitMandateReference, directDebitMandateSettings, billPayMandateReference, bilPayMandateSettings, paymentTransaction, paymentTransactionType, paymentTransactionPayeeReference, paymentTransactionPayeeAccountReference, paymentTransactionPayeeBankReference, paymentTransactionAmount, paymentTransactionFeeType, paymentTransactionFeeCharge, paymentTransactionDate, paymentTransactionPaymentMechanism, paymentTransactionPaymentPurpose, paymentTransactionBankBranchOrLocationReference, paymentTransactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentsResponsePayments {\n");
    
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentProcessinngOptionDefinition: ").append(toIndentedString(paymentProcessinngOptionDefinition)).append("\n");
    sb.append("    paymentProcessingOptionSetting: ").append(toIndentedString(paymentProcessingOptionSetting)).append("\n");
    sb.append("    paymentConfiguration: ").append(toIndentedString(paymentConfiguration)).append("\n");
    sb.append("    paymentSchedule: ").append(toIndentedString(paymentSchedule)).append("\n");
    sb.append("    directDebitMandateReference: ").append(toIndentedString(directDebitMandateReference)).append("\n");
    sb.append("    directDebitMandateSettings: ").append(toIndentedString(directDebitMandateSettings)).append("\n");
    sb.append("    billPayMandateReference: ").append(toIndentedString(billPayMandateReference)).append("\n");
    sb.append("    bilPayMandateSettings: ").append(toIndentedString(bilPayMandateSettings)).append("\n");
    sb.append("    paymentTransaction: ").append(toIndentedString(paymentTransaction)).append("\n");
    sb.append("    paymentTransactionType: ").append(toIndentedString(paymentTransactionType)).append("\n");
    sb.append("    paymentTransactionPayeeReference: ").append(toIndentedString(paymentTransactionPayeeReference)).append("\n");
    sb.append("    paymentTransactionPayeeAccountReference: ").append(toIndentedString(paymentTransactionPayeeAccountReference)).append("\n");
    sb.append("    paymentTransactionPayeeBankReference: ").append(toIndentedString(paymentTransactionPayeeBankReference)).append("\n");
    sb.append("    paymentTransactionAmount: ").append(toIndentedString(paymentTransactionAmount)).append("\n");
    sb.append("    paymentTransactionFeeType: ").append(toIndentedString(paymentTransactionFeeType)).append("\n");
    sb.append("    paymentTransactionFeeCharge: ").append(toIndentedString(paymentTransactionFeeCharge)).append("\n");
    sb.append("    paymentTransactionDate: ").append(toIndentedString(paymentTransactionDate)).append("\n");
    sb.append("    paymentTransactionPaymentMechanism: ").append(toIndentedString(paymentTransactionPaymentMechanism)).append("\n");
    sb.append("    paymentTransactionPaymentPurpose: ").append(toIndentedString(paymentTransactionPaymentPurpose)).append("\n");
    sb.append("    paymentTransactionBankBranchOrLocationReference: ").append(toIndentedString(paymentTransactionBankBranchOrLocationReference)).append("\n");
    sb.append("    paymentTransactionStatus: ").append(toIndentedString(paymentTransactionStatus)).append("\n");
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

