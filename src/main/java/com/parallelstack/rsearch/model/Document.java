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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Document {
  
  @SerializedName("document_id")
  private String documentId = null;
  @SerializedName("fields")
  private List<Object> fields = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Object> getFields() {
    return fields;
  }
  public void setFields(List<Object> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return (this.documentId == null ? document.documentId == null : this.documentId.equals(document.documentId)) &&
        (this.fields == null ? document.fields == null : this.fields.equals(document.fields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.documentId == null ? 0: this.documentId.hashCode());
    result = 31 * result + (this.fields == null ? 0: this.fields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("  documentId: ").append(documentId).append("\n");
    sb.append("  fields: ").append(fields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
