package com.ibm.dip.model.compliancecheck;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:11.500Z[GMT]")

public class RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment   {
  @JsonProperty("RegulatoryAssessmentType")
  private String regulatoryAssessmentType;

  @JsonProperty("BusinessUnitReference")
  private Object businessUnitReference;

  @JsonProperty("ProductandServiceReference")
  private Object productandServiceReference;

  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("RegulatoryAuthorityReference")
  private Object regulatoryAuthorityReference;

  @JsonProperty("RegulationReference")
  private Object regulationReference;

  @JsonProperty("DocumentReference")
  private Object documentReference;

  @JsonProperty("RegulatoryAssessmentWorkProducts")
  private String regulatoryAssessmentWorkProducts;

  @JsonProperty("RegulatoryAssessmentResult")
  private String regulatoryAssessmentResult;

  public RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulatoryAssessmentType(String regulatoryAssessmentType) {
    this.regulatoryAssessmentType = regulatoryAssessmentType;
    return this;
  }

  /**
   * Get regulatoryAssessmentType
   * @return regulatoryAssessmentType
  */
  @ApiModelProperty(value = "")


  public String getRegulatoryAssessmentType() {
    return regulatoryAssessmentType;
  }

  public void setRegulatoryAssessmentType(String regulatoryAssessmentType) {
    this.regulatoryAssessmentType = regulatoryAssessmentType;
  }

  public RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment businessUnitReference(Object businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
    return this;
  }

  /**
   * Get businessUnitReference
   * @return businessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(Object businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }

  public RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment productandServiceReference(Object productandServiceReference) {
    this.productandServiceReference = productandServiceReference;
    return this;
  }

  /**
   * Get productandServiceReference
   * @return productandServiceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductandServiceReference() {
    return productandServiceReference;
  }

  public void setProductandServiceReference(Object productandServiceReference) {
    this.productandServiceReference = productandServiceReference;
  }

  public RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulatoryAuthorityReference(Object regulatoryAuthorityReference) {
    this.regulatoryAuthorityReference = regulatoryAuthorityReference;
    return this;
  }

  /**
   * Get regulatoryAuthorityReference
   * @return regulatoryAuthorityReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getRegulatoryAuthorityReference() {
    return regulatoryAuthorityReference;
  }

  public void setRegulatoryAuthorityReference(Object regulatoryAuthorityReference) {
    this.regulatoryAuthorityReference = regulatoryAuthorityReference;
  }

  public RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulationReference(Object regulationReference) {
    this.regulationReference = regulationReference;
    return this;
  }

  /**
   * Get regulationReference
   * @return regulationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getRegulationReference() {
    return regulationReference;
  }

  public void setRegulationReference(Object regulationReference) {
    this.regulationReference = regulationReference;
  }

  public RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment documentReference(Object documentReference) {
    this.documentReference = documentReference;
    return this;
  }

  /**
   * Get documentReference
   * @return documentReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(Object documentReference) {
    this.documentReference = documentReference;
  }

  public RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulatoryAssessmentWorkProducts(String regulatoryAssessmentWorkProducts) {
    this.regulatoryAssessmentWorkProducts = regulatoryAssessmentWorkProducts;
    return this;
  }

  /**
   * Get regulatoryAssessmentWorkProducts
   * @return regulatoryAssessmentWorkProducts
  */
  @ApiModelProperty(value = "")


  public String getRegulatoryAssessmentWorkProducts() {
    return regulatoryAssessmentWorkProducts;
  }

  public void setRegulatoryAssessmentWorkProducts(String regulatoryAssessmentWorkProducts) {
    this.regulatoryAssessmentWorkProducts = regulatoryAssessmentWorkProducts;
  }

  public RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulatoryAssessmentResult(String regulatoryAssessmentResult) {
    this.regulatoryAssessmentResult = regulatoryAssessmentResult;
    return this;
  }

  /**
   * Get regulatoryAssessmentResult
   * @return regulatoryAssessmentResult
  */
  @ApiModelProperty(value = "")


  public String getRegulatoryAssessmentResult() {
    return regulatoryAssessmentResult;
  }

  public void setRegulatoryAssessmentResult(String regulatoryAssessmentResult) {
    this.regulatoryAssessmentResult = regulatoryAssessmentResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment requestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment = (RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment) o;
    return Objects.equals(this.regulatoryAssessmentType, requestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.regulatoryAssessmentType) &&
        Objects.equals(this.businessUnitReference, requestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.businessUnitReference) &&
        Objects.equals(this.productandServiceReference, requestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.productandServiceReference) &&
        Objects.equals(this.customerReference, requestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.customerReference) &&
        Objects.equals(this.regulatoryAuthorityReference, requestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.regulatoryAuthorityReference) &&
        Objects.equals(this.regulationReference, requestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.regulationReference) &&
        Objects.equals(this.documentReference, requestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.documentReference) &&
        Objects.equals(this.regulatoryAssessmentWorkProducts, requestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.regulatoryAssessmentWorkProducts) &&
        Objects.equals(this.regulatoryAssessmentResult, requestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.regulatoryAssessmentResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatoryAssessmentType, businessUnitReference, productandServiceReference, customerReference, regulatoryAuthorityReference, regulationReference, documentReference, regulatoryAssessmentWorkProducts, regulatoryAssessmentResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment {\n");
    
    sb.append("    regulatoryAssessmentType: ").append(toIndentedString(regulatoryAssessmentType)).append("\n");
    sb.append("    businessUnitReference: ").append(toIndentedString(businessUnitReference)).append("\n");
    sb.append("    productandServiceReference: ").append(toIndentedString(productandServiceReference)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    regulatoryAuthorityReference: ").append(toIndentedString(regulatoryAuthorityReference)).append("\n");
    sb.append("    regulationReference: ").append(toIndentedString(regulationReference)).append("\n");
    sb.append("    documentReference: ").append(toIndentedString(documentReference)).append("\n");
    sb.append("    regulatoryAssessmentWorkProducts: ").append(toIndentedString(regulatoryAssessmentWorkProducts)).append("\n");
    sb.append("    regulatoryAssessmentResult: ").append(toIndentedString(regulatoryAssessmentResult)).append("\n");
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

