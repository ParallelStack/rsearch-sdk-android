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

import com.parallelstack.rsearch.model.IndexesSearchQuerySearch;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class IndexesSearchQuery {
  
  @SerializedName("search")
  private IndexesSearchQuerySearch search = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public IndexesSearchQuerySearch getSearch() {
    return search;
  }
  public void setSearch(IndexesSearchQuerySearch search) {
    this.search = search;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexesSearchQuery indexesSearchQuery = (IndexesSearchQuery) o;
    return (this.search == null ? indexesSearchQuery.search == null : this.search.equals(indexesSearchQuery.search));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.search == null ? 0: this.search.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexesSearchQuery {\n");
    
    sb.append("  search: ").append(search).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}