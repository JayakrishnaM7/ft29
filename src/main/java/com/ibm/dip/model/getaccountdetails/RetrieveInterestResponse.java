package com.ibm.dip.model.getaccountdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.getaccountdetails.RetrieveInterestResponseInterest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveInterestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:34:07.193Z[GMT]")

public class RetrieveInterestResponse   {
  @JsonProperty("Interest")
  private RetrieveInterestResponseInterest interest;

  public RetrieveInterestResponse interest(RetrieveInterestResponseInterest interest) {
    this.interest = interest;
    return this;
  }

  /**
   * Get interest
   * @return interest
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveInterestResponseInterest getInterest() {
    return interest;
  }

  public void setInterest(RetrieveInterestResponseInterest interest) {
    this.interest = interest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveInterestResponse retrieveInterestResponse = (RetrieveInterestResponse) o;
    return Objects.equals(this.interest, retrieveInterestResponse.interest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveInterestResponse {\n");
    
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
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

