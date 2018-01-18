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

import com.pstack.rsearch.model.SuggestQuerySuggest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class SuggestQuery implements Serializable {
  
  @SerializedName("suggest")
  private SuggestQuerySuggest suggest = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public SuggestQuerySuggest getSuggest() {
    return suggest;
  }
  public void setSuggest(SuggestQuerySuggest suggest) {
    this.suggest = suggest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestQuery suggestQuery = (SuggestQuery) o;
    return (this.suggest == null ? suggestQuery.suggest == null : this.suggest.equals(suggestQuery.suggest));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.suggest == null ? 0: this.suggest.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestQuery {\n");
    
    sb.append("  suggest: ").append(suggest).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
