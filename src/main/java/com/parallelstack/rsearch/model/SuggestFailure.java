/**
 * ParallelStack RSearch API
 * REST API Specification for ParallelStack RSearch API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: team@parallelstack.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.parallelstack.rsearch.model;

import com.parallelstack.rsearch.model.SearchFailureSearchResults;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SuggestFailure {
  
  @SerializedName("suggest_results")
  private SearchFailureSearchResults suggestResults = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public SearchFailureSearchResults getSuggestResults() {
    return suggestResults;
  }
  public void setSuggestResults(SearchFailureSearchResults suggestResults) {
    this.suggestResults = suggestResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestFailure suggestFailure = (SuggestFailure) o;
    return (this.suggestResults == null ? suggestFailure.suggestResults == null : this.suggestResults.equals(suggestFailure.suggestResults));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.suggestResults == null ? 0: this.suggestResults.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestFailure {\n");
    
    sb.append("  suggestResults: ").append(suggestResults).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
