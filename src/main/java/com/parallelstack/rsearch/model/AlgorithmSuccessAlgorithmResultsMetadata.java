/**
 * ParallelStack RSearch API
 * REST API Specification for ParallelStack RSearch API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: team@parallelstack.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.parallelstack.rsearch.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AlgorithmSuccessAlgorithmResultsMetadata {
  
  @SerializedName("number_algorithm_results")
  private BigDecimal numberAlgorithmResults = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getNumberAlgorithmResults() {
    return numberAlgorithmResults;
  }
  public void setNumberAlgorithmResults(BigDecimal numberAlgorithmResults) {
    this.numberAlgorithmResults = numberAlgorithmResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlgorithmSuccessAlgorithmResultsMetadata algorithmSuccessAlgorithmResultsMetadata = (AlgorithmSuccessAlgorithmResultsMetadata) o;
    return (this.numberAlgorithmResults == null ? algorithmSuccessAlgorithmResultsMetadata.numberAlgorithmResults == null : this.numberAlgorithmResults.equals(algorithmSuccessAlgorithmResultsMetadata.numberAlgorithmResults));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.numberAlgorithmResults == null ? 0: this.numberAlgorithmResults.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlgorithmSuccessAlgorithmResultsMetadata {\n");
    
    sb.append("  numberAlgorithmResults: ").append(numberAlgorithmResults).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}