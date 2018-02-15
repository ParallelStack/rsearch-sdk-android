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

import com.parallelstack.rsearch.model.GetIndexesFailureIndexes;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class DeleteDocumentFailure {
  
  @SerializedName("document")
  private GetIndexesFailureIndexes document = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public GetIndexesFailureIndexes getDocument() {
    return document;
  }
  public void setDocument(GetIndexesFailureIndexes document) {
    this.document = document;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDocumentFailure deleteDocumentFailure = (DeleteDocumentFailure) o;
    return (this.document == null ? deleteDocumentFailure.document == null : this.document.equals(deleteDocumentFailure.document));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.document == null ? 0: this.document.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDocumentFailure {\n");
    
    sb.append("  document: ").append(document).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
