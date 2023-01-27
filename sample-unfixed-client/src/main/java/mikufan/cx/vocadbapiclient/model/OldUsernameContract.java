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
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OldUsernameContract
 */
@JsonPropertyOrder({
  OldUsernameContract.JSON_PROPERTY_DATE,
  OldUsernameContract.JSON_PROPERTY_OLD_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-27T01:04:32.642512Z[Etc/UTC]")
public class OldUsernameContract {
  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDateTime date;

  public static final String JSON_PROPERTY_OLD_NAME = "oldName";
  private String oldName;

  public OldUsernameContract() {
  }

  public OldUsernameContract date(LocalDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDateTime getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(LocalDateTime date) {
    this.date = date;
  }


  public OldUsernameContract oldName(String oldName) {
    
    this.oldName = oldName;
    return this;
  }

   /**
   * Get oldName
   * @return oldName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OLD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOldName() {
    return oldName;
  }


  @JsonProperty(JSON_PROPERTY_OLD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOldName(String oldName) {
    this.oldName = oldName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OldUsernameContract oldUsernameContract = (OldUsernameContract) o;
    return Objects.equals(this.date, oldUsernameContract.date) &&
        Objects.equals(this.oldName, oldUsernameContract.oldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, oldName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OldUsernameContract {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    oldName: ").append(toIndentedString(oldName)).append("\n");
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

