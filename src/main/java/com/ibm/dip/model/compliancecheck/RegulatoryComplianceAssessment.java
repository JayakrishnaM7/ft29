package com.ibm.dip.model.compliancecheck;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegulatoryComplianceAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:11.500Z[GMT]")

public class RegulatoryComplianceAssessment   {
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

  @JsonProperty("RegulationDefinition")
  private String regulationDefinition;

  @JsonProperty("RegulationComplianceandReportingRequirements")
  private String regulationComplianceandReportingRequirements;

  @JsonProperty("RegulationAccountability")
  private String regulationAccountability;

  @JsonProperty("RegulationPenalties")
  private String regulationPenalties;

  @JsonProperty("RegulationGuideline")
  private String regulationGuideline;

  @JsonProperty("DocumentReference")
  private Object documentReference;

  @JsonProperty("RegulatoryAssessmentWorkProducts")
  private String regulatoryAssessmentWorkProducts;

  @JsonProperty("RegulatoryAssessmentResult")
  private String regulatoryAssessmentResult;

  public RegulatoryComplianceAssessment regulatoryAssessmentType(String regulatoryAssessmentType) {
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

  public RegulatoryComplianceAssessment businessUnitReference(Object businessUnitReference) {
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

  public RegulatoryComplianceAssessment productandServiceReference(Object productandServiceReference) {
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

  public RegulatoryComplianceAssessment customerReference(Object customerReference) {
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

  public RegulatoryComplianceAssessment regulatoryAuthorityReference(Object regulatoryAuthorityReference) {
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

  public RegulatoryComplianceAssessment regulationReference(Object regulationReference) {
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

  public RegulatoryComplianceAssessment regulationDefinition(String regulationDefinition) {
    this.regulationDefinition = regulationDefinition;
    return this;
  }

  /**
   * Get regulationDefinition
   * @return regulationDefinition
  */
  @ApiModelProperty(value = "")


  public String getRegulationDefinition() {
    return regulationDefinition;
  }

  public void setRegulationDefinition(String regulationDefinition) {
    this.regulationDefinition = regulationDefinition;
  }

  public RegulatoryComplianceAssessment regulationComplianceandReportingRequirements(String regulationComplianceandReportingRequirements) {
    this.regulationComplianceandReportingRequirements = regulationComplianceandReportingRequirements;
    return this;
  }

  /**
   * Get regulationComplianceandReportingRequirements
   * @return regulationComplianceandReportingRequirements
  */
  @ApiModelProperty(value = "")


  public String getRegulationComplianceandReportingRequirements() {
    return regulationComplianceandReportingRequirements;
  }

  public void setRegulationComplianceandReportingRequirements(String regulationComplianceandReportingRequirements) {
    this.regulationComplianceandReportingRequirements = regulationComplianceandReportingRequirements;
  }

  public RegulatoryComplianceAssessment regulationAccountability(String regulationAccountability) {
    this.regulationAccountability = regulationAccountability;
    return this;
  }

  /**
   * Get regulationAccountability
   * @return regulationAccountability
  */
  @ApiModelProperty(value = "")


  public String getRegulationAccountability() {
    return regulationAccountability;
  }

  public void setRegulationAccountability(String regulationAccountability) {
    this.regulationAccountability = regulationAccountability;
  }

  public RegulatoryComplianceAssessment regulationPenalties(String regulationPenalties) {
    this.regulationPenalties = regulationPenalties;
    return this;
  }

  /**
   * Get regulationPenalties
   * @return regulationPenalties
  */
  @ApiModelProperty(value = "")


  public String getRegulationPenalties() {
    return regulationPenalties;
  }

  public void setRegulationPenalties(String regulationPenalties) {
    this.regulationPenalties = regulationPenalties;
  }

  public RegulatoryComplianceAssessment regulationGuideline(String regulationGuideline) {
    this.regulationGuideline = regulationGuideline;
    return this;
  }

  /**
   * Get regulationGuideline
   * @return regulationGuideline
  */
  @ApiModelProperty(value = "")


  public String getRegulationGuideline() {
    return regulationGuideline;
  }

  public void setRegulationGuideline(String regulationGuideline) {
    this.regulationGuideline = regulationGuideline;
  }

  public RegulatoryComplianceAssessment documentReference(Object documentReference) {
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

  public RegulatoryComplianceAssessment regulatoryAssessmentWorkProducts(String regulatoryAssessmentWorkProducts) {
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

  public RegulatoryComplianceAssessment regulatoryAssessmentResult(String regulatoryAssessmentResult) {
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
    RegulatoryComplianceAssessment regulatoryComplianceAssessment = (RegulatoryComplianceAssessment) o;
    return Objects.equals(this.regulatoryAssessmentType, regulatoryComplianceAssessment.regulatoryAssessmentType) &&
        Objects.equals(this.businessUnitReference, regulatoryComplianceAssessment.businessUnitReference) &&
        Objects.equals(this.productandServiceReference, regulatoryComplianceAssessment.productandServiceReference) &&
        Objects.equals(this.customerReference, regulatoryComplianceAssessment.customerReference) &&
        Objects.equals(this.regulatoryAuthorityReference, regulatoryComplianceAssessment.regulatoryAuthorityReference) &&
        Objects.equals(this.regulationReference, regulatoryComplianceAssessment.regulationReference) &&
        Objects.equals(this.regulationDefinition, regulatoryComplianceAssessment.regulationDefinition) &&
        Objects.equals(this.regulationComplianceandReportingRequirements, regulatoryComplianceAssessment.regulationComplianceandReportingRequirements) &&
        Objects.equals(this.regulationAccountability, regulatoryComplianceAssessment.regulationAccountability) &&
        Objects.equals(this.regulationPenalties, regulatoryComplianceAssessment.regulationPenalties) &&
        Objects.equals(this.regulationGuideline, regulatoryComplianceAssessment.regulationGuideline) &&
        Objects.equals(this.documentReference, regulatoryComplianceAssessment.documentReference) &&
        Objects.equals(this.regulatoryAssessmentWorkProducts, regulatoryComplianceAssessment.regulatoryAssessmentWorkProducts) &&
        Objects.equals(this.regulatoryAssessmentResult, regulatoryComplianceAssessment.regulatoryAssessmentResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatoryAssessmentType, businessUnitReference, productandServiceReference, customerReference, regulatoryAuthorityReference, regulationReference, regulationDefinition, regulationComplianceandReportingRequirements, regulationAccountability, regulationPenalties, regulationGuideline, documentReference, regulatoryAssessmentWorkProducts, regulatoryAssessmentResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryComplianceAssessment {\n");
    
    sb.append("    regulatoryAssessmentType: ").append(toIndentedString(regulatoryAssessmentType)).append("\n");
    sb.append("    businessUnitReference: ").append(toIndentedString(businessUnitReference)).append("\n");
    sb.append("    productandServiceReference: ").append(toIndentedString(productandServiceReference)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    regulatoryAuthorityReference: ").append(toIndentedString(regulatoryAuthorityReference)).append("\n");
    sb.append("    regulationReference: ").append(toIndentedString(regulationReference)).append("\n");
    sb.append("    regulationDefinition: ").append(toIndentedString(regulationDefinition)).append("\n");
    sb.append("    regulationComplianceandReportingRequirements: ").append(toIndentedString(regulationComplianceandReportingRequirements)).append("\n");
    sb.append("    regulationAccountability: ").append(toIndentedString(regulationAccountability)).append("\n");
    sb.append("    regulationPenalties: ").append(toIndentedString(regulationPenalties)).append("\n");
    sb.append("    regulationGuideline: ").append(toIndentedString(regulationGuideline)).append("\n");
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

