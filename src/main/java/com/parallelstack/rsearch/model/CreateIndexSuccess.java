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

import com.parallelstack.rsearch.model.CreateIndexSuccessIndexes;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateIndexSuccess {
  
  @SerializedName("indexes")
  private CreateIndexSuccessIndexes indexes = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public CreateIndexSuccessIndexes getIndexes() {
    return indexes;
  }
  public void setIndexes(CreateIndexSuccessIndexes indexes) {
    this.indexes = indexes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIndexSuccess createIndexSuccess = (CreateIndexSuccess) o;
    return (this.indexes == null ? createIndexSuccess.indexes == null : this.indexes.equals(createIndexSuccess.indexes));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.indexes == null ? 0: this.indexes.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIndexSuccess {\n");
    
    sb.append("  indexes: ").append(indexes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
