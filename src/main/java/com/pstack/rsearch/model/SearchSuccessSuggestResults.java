/**
 * ParallelStack RSearch API
 * REST API Specification for ParallelStack RSearch API
 *
 * OpenAPI spec version: 1.1.0
 * Contact: team@parallelstack.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.pstack.rsearch.model;

import com.pstack.rsearch.model.SearchSuccessSuggestResultsMetadata;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class SearchSuccessSuggestResults implements Serializable {
  
  @SerializedName("results")
  private List<Object> results = null;
  @SerializedName("metadata")
  private SearchSuccessSuggestResultsMetadata metadata = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Object> getResults() {
    return results;
  }
  public void setResults(List<Object> results) {
    this.results = results;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public SearchSuccessSuggestResultsMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(SearchSuccessSuggestResultsMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSuccessSuggestResults searchSuccessSuggestResults = (SearchSuccessSuggestResults) o;
    return (this.results == null ? searchSuccessSuggestResults.results == null : this.results.equals(searchSuccessSuggestResults.results)) &&
        (this.metadata == null ? searchSuccessSuggestResults.metadata == null : this.metadata.equals(searchSuccessSuggestResults.metadata));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.results == null ? 0: this.results.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSuccessSuggestResults {\n");
    
    sb.append("  results: ").append(results).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}