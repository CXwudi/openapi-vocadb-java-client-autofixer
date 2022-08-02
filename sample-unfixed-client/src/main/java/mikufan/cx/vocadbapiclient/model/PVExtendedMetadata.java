/*
 * VocaDbWeb
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package mikufan.cx.vocadbapiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PVExtendedMetadata
 */
@JsonPropertyOrder({
  PVExtendedMetadata.JSON_PROPERTY_JSON
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-02T18:31:43.684348Z[Etc/UTC]")
public class PVExtendedMetadata {
  public static final String JSON_PROPERTY_JSON = "json";
  private String json;

  public PVExtendedMetadata() {
  }

  public PVExtendedMetadata json(String json) {
    
    this.json = json;
    return this;
  }

   /**
   * Get json
   * @return json
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJson() {
    return json;
  }


  @JsonProperty(JSON_PROPERTY_JSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJson(String json) {
    this.json = json;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PVExtendedMetadata pvExtendedMetadata = (PVExtendedMetadata) o;
    return Objects.equals(this.json, pvExtendedMetadata.json);
  }

  @Override
  public int hashCode() {
    return Objects.hash(json);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PVExtendedMetadata {\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

