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

import com.pstack.rsearch.model.GetIndexesFailureIndexes;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class GetDocTypeFailure implements Serializable {
  
  @SerializedName("document_types")
  private GetIndexesFailureIndexes documentTypes = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public GetIndexesFailureIndexes getDocumentTypes() {
    return documentTypes;
  }
  public void setDocumentTypes(GetIndexesFailureIndexes documentTypes) {
    this.documentTypes = documentTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocTypeFailure getDocTypeFailure = (GetDocTypeFailure) o;
    return (this.documentTypes == null ? getDocTypeFailure.documentTypes == null : this.documentTypes.equals(getDocTypeFailure.documentTypes));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.documentTypes == null ? 0: this.documentTypes.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocTypeFailure {\n");
    
    sb.append("  documentTypes: ").append(documentTypes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
