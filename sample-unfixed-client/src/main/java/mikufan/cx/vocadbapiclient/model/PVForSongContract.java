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
import java.time.LocalDateTime;
import mikufan.cx.vocadbapiclient.model.PVExtendedMetadata;
import mikufan.cx.vocadbapiclient.model.PVService;
import mikufan.cx.vocadbapiclient.model.PVType;
import mikufan.cx.vocadbapiclient.model.SongContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PVForSongContract
 */
@JsonPropertyOrder({
  PVForSongContract.JSON_PROPERTY_SONG,
  PVForSongContract.JSON_PROPERTY_AUTHOR,
  PVForSongContract.JSON_PROPERTY_CREATED_BY,
  PVForSongContract.JSON_PROPERTY_DISABLED,
  PVForSongContract.JSON_PROPERTY_EXTENDED_METADATA,
  PVForSongContract.JSON_PROPERTY_ID,
  PVForSongContract.JSON_PROPERTY_LENGTH,
  PVForSongContract.JSON_PROPERTY_NAME,
  PVForSongContract.JSON_PROPERTY_PUBLISH_DATE,
  PVForSongContract.JSON_PROPERTY_PV_ID,
  PVForSongContract.JSON_PROPERTY_SERVICE,
  PVForSongContract.JSON_PROPERTY_PV_TYPE,
  PVForSongContract.JSON_PROPERTY_THUMB_URL,
  PVForSongContract.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-02T18:31:43.684348Z[Etc/UTC]")
public class PVForSongContract {
  public static final String JSON_PROPERTY_SONG = "song";
  private SongContract song;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  private String author;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private Integer createdBy;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_EXTENDED_METADATA = "extendedMetadata";
  private PVExtendedMetadata extendedMetadata;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_LENGTH = "length";
  private Integer length;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PUBLISH_DATE = "publishDate";
  private LocalDateTime publishDate;

  public static final String JSON_PROPERTY_PV_ID = "pvId";
  private String pvId;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private PVService service;

  public static final String JSON_PROPERTY_PV_TYPE = "pvType";
  private PVType pvType;

  public static final String JSON_PROPERTY_THUMB_URL = "thumbUrl";
  private String thumbUrl;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public PVForSongContract() {
  }

  public PVForSongContract song(SongContract song) {
    
    this.song = song;
    return this;
  }

   /**
   * Get song
   * @return song
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SONG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SongContract getSong() {
    return song;
  }


  @JsonProperty(JSON_PROPERTY_SONG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSong(SongContract song) {
    this.song = song;
  }


  public PVForSongContract author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthor() {
    return author;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthor(String author) {
    this.author = author;
  }


  public PVForSongContract createdBy(Integer createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }


  public PVForSongContract disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisabled() {
    return disabled;
  }


  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public PVForSongContract extendedMetadata(PVExtendedMetadata extendedMetadata) {
    
    this.extendedMetadata = extendedMetadata;
    return this;
  }

   /**
   * Get extendedMetadata
   * @return extendedMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTENDED_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PVExtendedMetadata getExtendedMetadata() {
    return extendedMetadata;
  }


  @JsonProperty(JSON_PROPERTY_EXTENDED_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtendedMetadata(PVExtendedMetadata extendedMetadata) {
    this.extendedMetadata = extendedMetadata;
  }


  public PVForSongContract id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public PVForSongContract length(Integer length) {
    
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLength() {
    return length;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLength(Integer length) {
    this.length = length;
  }


  public PVForSongContract name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public PVForSongContract publishDate(LocalDateTime publishDate) {
    
    this.publishDate = publishDate;
    return this;
  }

   /**
   * Get publishDate
   * @return publishDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUBLISH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDateTime getPublishDate() {
    return publishDate;
  }


  @JsonProperty(JSON_PROPERTY_PUBLISH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublishDate(LocalDateTime publishDate) {
    this.publishDate = publishDate;
  }


  public PVForSongContract pvId(String pvId) {
    
    this.pvId = pvId;
    return this;
  }

   /**
   * Get pvId
   * @return pvId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PV_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPvId() {
    return pvId;
  }


  @JsonProperty(JSON_PROPERTY_PV_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPvId(String pvId) {
    this.pvId = pvId;
  }


  public PVForSongContract service(PVService service) {
    
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PVService getService() {
    return service;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setService(PVService service) {
    this.service = service;
  }


  public PVForSongContract pvType(PVType pvType) {
    
    this.pvType = pvType;
    return this;
  }

   /**
   * Get pvType
   * @return pvType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PV_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PVType getPvType() {
    return pvType;
  }


  @JsonProperty(JSON_PROPERTY_PV_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPvType(PVType pvType) {
    this.pvType = pvType;
  }


  public PVForSongContract thumbUrl(String thumbUrl) {
    
    this.thumbUrl = thumbUrl;
    return this;
  }

   /**
   * Get thumbUrl
   * @return thumbUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THUMB_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThumbUrl() {
    return thumbUrl;
  }


  @JsonProperty(JSON_PROPERTY_THUMB_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbUrl(String thumbUrl) {
    this.thumbUrl = thumbUrl;
  }


  public PVForSongContract url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PVForSongContract pvForSongContract = (PVForSongContract) o;
    return Objects.equals(this.song, pvForSongContract.song) &&
        Objects.equals(this.author, pvForSongContract.author) &&
        Objects.equals(this.createdBy, pvForSongContract.createdBy) &&
        Objects.equals(this.disabled, pvForSongContract.disabled) &&
        Objects.equals(this.extendedMetadata, pvForSongContract.extendedMetadata) &&
        Objects.equals(this.id, pvForSongContract.id) &&
        Objects.equals(this.length, pvForSongContract.length) &&
        Objects.equals(this.name, pvForSongContract.name) &&
        Objects.equals(this.publishDate, pvForSongContract.publishDate) &&
        Objects.equals(this.pvId, pvForSongContract.pvId) &&
        Objects.equals(this.service, pvForSongContract.service) &&
        Objects.equals(this.pvType, pvForSongContract.pvType) &&
        Objects.equals(this.thumbUrl, pvForSongContract.thumbUrl) &&
        Objects.equals(this.url, pvForSongContract.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(song, author, createdBy, disabled, extendedMetadata, id, length, name, publishDate, pvId, service, pvType, thumbUrl, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PVForSongContract {\n");
    sb.append("    song: ").append(toIndentedString(song)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    extendedMetadata: ").append(toIndentedString(extendedMetadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    pvId: ").append(toIndentedString(pvId)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    pvType: ").append(toIndentedString(pvType)).append("\n");
    sb.append("    thumbUrl: ").append(toIndentedString(thumbUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

