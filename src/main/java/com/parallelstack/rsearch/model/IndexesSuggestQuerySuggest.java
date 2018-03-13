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
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class IndexesSuggestQuerySuggest {
  
  @SerializedName("query")
  private String query = null;
  @SerializedName("indexes")
  private List<String> indexes = null;
  @SerializedName("fields")
  private List<String> fields = null;
  @SerializedName("fuzzy")
  private BigDecimal fuzzy = null;
  @SerializedName("size")
  private BigDecimal size = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getIndexes() {
    return indexes;
  }
  public void setIndexes(List<String> indexes) {
    this.indexes = indexes;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getFields() {
    return fields;
  }
  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getFuzzy() {
    return fuzzy;
  }
  public void setFuzzy(BigDecimal fuzzy) {
    this.fuzzy = fuzzy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getSize() {
    return size;
  }
  public void setSize(BigDecimal size) {
    this.size = size;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexesSuggestQuerySuggest indexesSuggestQuerySuggest = (IndexesSuggestQuerySuggest) o;
    return (this.query == null ? indexesSuggestQuerySuggest.query == null : this.query.equals(indexesSuggestQuerySuggest.query)) &&
        (this.indexes == null ? indexesSuggestQuerySuggest.indexes == null : this.indexes.equals(indexesSuggestQuerySuggest.indexes)) &&
        (this.fields == null ? indexesSuggestQuerySuggest.fields == null : this.fields.equals(indexesSuggestQuerySuggest.fields)) &&
        (this.fuzzy == null ? indexesSuggestQuerySuggest.fuzzy == null : this.fuzzy.equals(indexesSuggestQuerySuggest.fuzzy)) &&
        (this.size == null ? indexesSuggestQuerySuggest.size == null : this.size.equals(indexesSuggestQuerySuggest.size));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.query == null ? 0: this.query.hashCode());
    result = 31 * result + (this.indexes == null ? 0: this.indexes.hashCode());
    result = 31 * result + (this.fields == null ? 0: this.fields.hashCode());
    result = 31 * result + (this.fuzzy == null ? 0: this.fuzzy.hashCode());
    result = 31 * result + (this.size == null ? 0: this.size.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexesSuggestQuerySuggest {\n");
    
    sb.append("  query: ").append(query).append("\n");
    sb.append("  indexes: ").append(indexes).append("\n");
    sb.append("  fields: ").append(fields).append("\n");
    sb.append("  fuzzy: ").append(fuzzy).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
