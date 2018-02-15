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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SearchFailureSearchResults {
  
  @SerializedName("error")
  private String error = null;
  @SerializedName("metadata")
  private Object metadata = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
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
    SearchFailureSearchResults searchFailureSearchResults = (SearchFailureSearchResults) o;
    return (this.error == null ? searchFailureSearchResults.error == null : this.error.equals(searchFailureSearchResults.error)) &&
        (this.metadata == null ? searchFailureSearchResults.metadata == null : this.metadata.equals(searchFailureSearchResults.metadata));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.error == null ? 0: this.error.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchFailureSearchResults {\n");
    
    sb.append("  error: ").append(error).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
