package com.ibm.dip.model.compliancecheck;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:11.500Z[GMT]")

public class EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment   {
  @JsonProperty("RegulatoryAssessmentType")
  private String regulatoryAssessmentType;

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

  public EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulatoryAssessmentType(String regulatoryAssessmentType) {
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

  public EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulationDefinition(String regulationDefinition) {
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

  public EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulationComplianceandReportingRequirements(String regulationComplianceandReportingRequirements) {
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

  public EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulationAccountability(String regulationAccountability) {
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

  public EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulationPenalties(String regulationPenalties) {
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

  public EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulationGuideline(String regulationGuideline) {
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

  public EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment documentReference(Object documentReference) {
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

  public EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulatoryAssessmentWorkProducts(String regulatoryAssessmentWorkProducts) {
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

  public EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulatoryAssessmentResult(String regulatoryAssessmentResult) {
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
    EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment evaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment = (EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment) o;
    return Objects.equals(this.regulatoryAssessmentType, evaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.regulatoryAssessmentType) &&
        Objects.equals(this.regulationDefinition, evaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.regulationDefinition) &&
        Objects.equals(this.regulationComplianceandReportingRequirements, evaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.regulationComplianceandReportingRequirements) &&
        Objects.equals(this.regulationAccountability, evaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.regulationAccountability) &&
        Objects.equals(this.regulationPenalties, evaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.regulationPenalties) &&
        Objects.equals(this.regulationGuideline, evaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.regulationGuideline) &&
        Objects.equals(this.documentReference, evaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.documentReference) &&
        Objects.equals(this.regulatoryAssessmentWorkProducts, evaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.regulatoryAssessmentWorkProducts) &&
        Objects.equals(this.regulatoryAssessmentResult, evaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment.regulatoryAssessmentResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatoryAssessmentType, regulationDefinition, regulationComplianceandReportingRequirements, regulationAccountability, regulationPenalties, regulationGuideline, documentReference, regulatoryAssessmentWorkProducts, regulatoryAssessmentResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment {\n");
    
    sb.append("    regulatoryAssessmentType: ").append(toIndentedString(regulatoryAssessmentType)).append("\n");
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

