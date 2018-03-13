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

import com.parallelstack.rsearch.model.SearchFailureSearchResults;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SearchFailure {
  
  @SerializedName("search_results")
  private SearchFailureSearchResults searchResults = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public SearchFailureSearchResults getSearchResults() {
    return searchResults;
  }
  public void setSearchResults(SearchFailureSearchResults searchResults) {
    this.searchResults = searchResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchFailure searchFailure = (SearchFailure) o;
    return (this.searchResults == null ? searchFailure.searchResults == null : this.searchResults.equals(searchFailure.searchResults));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.searchResults == null ? 0: this.searchResults.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchFailure {\n");
    
    sb.append("  searchResults: ").append(searchResults).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
