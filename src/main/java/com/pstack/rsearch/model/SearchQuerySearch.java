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

import com.pstack.rsearch.model.SearchQuerySearchAggregations;
import java.math.BigDecimal;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class SearchQuerySearch implements Serializable {
  
  @SerializedName("query")
  private String query = null;
  @SerializedName("fuzzy")
  private BigDecimal fuzzy = null;
  @SerializedName("result_fields")
  private List<String> resultFields = null;
  @SerializedName("search_fields")
  private List<String> searchFields = null;
  @SerializedName("page_num")
  private BigDecimal pageNum = null;
  @SerializedName("page_count")
  private BigDecimal pageCount = null;
  @SerializedName("filters")
  private Object filters = null;
  @SerializedName("aggregations")
  private List<SearchQuerySearchAggregations> aggregations = null;

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
  public List<String> getResultFields() {
    return resultFields;
  }
  public void setResultFields(List<String> resultFields) {
    this.resultFields = resultFields;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getSearchFields() {
    return searchFields;
  }
  public void setSearchFields(List<String> searchFields) {
    this.searchFields = searchFields;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPageNum() {
    return pageNum;
  }
  public void setPageNum(BigDecimal pageNum) {
    this.pageNum = pageNum;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPageCount() {
    return pageCount;
  }
  public void setPageCount(BigDecimal pageCount) {
    this.pageCount = pageCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getFilters() {
    return filters;
  }
  public void setFilters(Object filters) {
    this.filters = filters;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<SearchQuerySearchAggregations> getAggregations() {
    return aggregations;
  }
  public void setAggregations(List<SearchQuerySearchAggregations> aggregations) {
    this.aggregations = aggregations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchQuerySearch searchQuerySearch = (SearchQuerySearch) o;
    return (this.query == null ? searchQuerySearch.query == null : this.query.equals(searchQuerySearch.query)) &&
        (this.fuzzy == null ? searchQuerySearch.fuzzy == null : this.fuzzy.equals(searchQuerySearch.fuzzy)) &&
        (this.resultFields == null ? searchQuerySearch.resultFields == null : this.resultFields.equals(searchQuerySearch.resultFields)) &&
        (this.searchFields == null ? searchQuerySearch.searchFields == null : this.searchFields.equals(searchQuerySearch.searchFields)) &&
        (this.pageNum == null ? searchQuerySearch.pageNum == null : this.pageNum.equals(searchQuerySearch.pageNum)) &&
        (this.pageCount == null ? searchQuerySearch.pageCount == null : this.pageCount.equals(searchQuerySearch.pageCount)) &&
        (this.filters == null ? searchQuerySearch.filters == null : this.filters.equals(searchQuerySearch.filters)) &&
        (this.aggregations == null ? searchQuerySearch.aggregations == null : this.aggregations.equals(searchQuerySearch.aggregations));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.query == null ? 0: this.query.hashCode());
    result = 31 * result + (this.fuzzy == null ? 0: this.fuzzy.hashCode());
    result = 31 * result + (this.resultFields == null ? 0: this.resultFields.hashCode());
    result = 31 * result + (this.searchFields == null ? 0: this.searchFields.hashCode());
    result = 31 * result + (this.pageNum == null ? 0: this.pageNum.hashCode());
    result = 31 * result + (this.pageCount == null ? 0: this.pageCount.hashCode());
    result = 31 * result + (this.filters == null ? 0: this.filters.hashCode());
    result = 31 * result + (this.aggregations == null ? 0: this.aggregations.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchQuerySearch {\n");
    
    sb.append("  query: ").append(query).append("\n");
    sb.append("  fuzzy: ").append(fuzzy).append("\n");
    sb.append("  resultFields: ").append(resultFields).append("\n");
    sb.append("  searchFields: ").append(searchFields).append("\n");
    sb.append("  pageNum: ").append(pageNum).append("\n");
    sb.append("  pageCount: ").append(pageCount).append("\n");
    sb.append("  filters: ").append(filters).append("\n");
    sb.append("  aggregations: ").append(aggregations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}