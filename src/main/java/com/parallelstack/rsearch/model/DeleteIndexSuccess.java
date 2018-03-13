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

import com.parallelstack.rsearch.model.DeleteIndexSuccessIndex;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class DeleteIndexSuccess {
  
  @SerializedName("index")
  private DeleteIndexSuccessIndex index = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public DeleteIndexSuccessIndex getIndex() {
    return index;
  }
  public void setIndex(DeleteIndexSuccessIndex index) {
    this.index = index;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteIndexSuccess deleteIndexSuccess = (DeleteIndexSuccess) o;
    return (this.index == null ? deleteIndexSuccess.index == null : this.index.equals(deleteIndexSuccess.index));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.index == null ? 0: this.index.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteIndexSuccess {\n");
    
    sb.append("  index: ").append(index).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
