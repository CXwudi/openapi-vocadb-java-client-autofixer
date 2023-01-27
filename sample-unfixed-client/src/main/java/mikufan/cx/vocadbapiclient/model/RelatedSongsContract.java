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
import java.util.ArrayList;
import java.util.List;
import mikufan.cx.vocadbapiclient.model.SongForApiContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RelatedSongsContract
 */
@JsonPropertyOrder({
  RelatedSongsContract.JSON_PROPERTY_ARTIST_MATCHES,
  RelatedSongsContract.JSON_PROPERTY_LIKE_MATCHES,
  RelatedSongsContract.JSON_PROPERTY_TAG_MATCHES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-27T01:04:32.642512Z[Etc/UTC]")
public class RelatedSongsContract {
  public static final String JSON_PROPERTY_ARTIST_MATCHES = "artistMatches";
  private List<SongForApiContract> artistMatches = null;

  public static final String JSON_PROPERTY_LIKE_MATCHES = "likeMatches";
  private List<SongForApiContract> likeMatches = null;

  public static final String JSON_PROPERTY_TAG_MATCHES = "tagMatches";
  private List<SongForApiContract> tagMatches = null;

  public RelatedSongsContract() {
  }

  public RelatedSongsContract artistMatches(List<SongForApiContract> artistMatches) {
    
    this.artistMatches = artistMatches;
    return this;
  }

  public RelatedSongsContract addArtistMatchesItem(SongForApiContract artistMatchesItem) {
    if (this.artistMatches == null) {
      this.artistMatches = new ArrayList<>();
    }
    this.artistMatches.add(artistMatchesItem);
    return this;
  }

   /**
   * Get artistMatches
   * @return artistMatches
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARTIST_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SongForApiContract> getArtistMatches() {
    return artistMatches;
  }


  @JsonProperty(JSON_PROPERTY_ARTIST_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtistMatches(List<SongForApiContract> artistMatches) {
    this.artistMatches = artistMatches;
  }


  public RelatedSongsContract likeMatches(List<SongForApiContract> likeMatches) {
    
    this.likeMatches = likeMatches;
    return this;
  }

  public RelatedSongsContract addLikeMatchesItem(SongForApiContract likeMatchesItem) {
    if (this.likeMatches == null) {
      this.likeMatches = new ArrayList<>();
    }
    this.likeMatches.add(likeMatchesItem);
    return this;
  }

   /**
   * Get likeMatches
   * @return likeMatches
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIKE_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SongForApiContract> getLikeMatches() {
    return likeMatches;
  }


  @JsonProperty(JSON_PROPERTY_LIKE_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLikeMatches(List<SongForApiContract> likeMatches) {
    this.likeMatches = likeMatches;
  }


  public RelatedSongsContract tagMatches(List<SongForApiContract> tagMatches) {
    
    this.tagMatches = tagMatches;
    return this;
  }

  public RelatedSongsContract addTagMatchesItem(SongForApiContract tagMatchesItem) {
    if (this.tagMatches == null) {
      this.tagMatches = new ArrayList<>();
    }
    this.tagMatches.add(tagMatchesItem);
    return this;
  }

   /**
   * Get tagMatches
   * @return tagMatches
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SongForApiContract> getTagMatches() {
    return tagMatches;
  }


  @JsonProperty(JSON_PROPERTY_TAG_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTagMatches(List<SongForApiContract> tagMatches) {
    this.tagMatches = tagMatches;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedSongsContract relatedSongsContract = (RelatedSongsContract) o;
    return Objects.equals(this.artistMatches, relatedSongsContract.artistMatches) &&
        Objects.equals(this.likeMatches, relatedSongsContract.likeMatches) &&
        Objects.equals(this.tagMatches, relatedSongsContract.tagMatches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistMatches, likeMatches, tagMatches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedSongsContract {\n");
    sb.append("    artistMatches: ").append(toIndentedString(artistMatches)).append("\n");
    sb.append("    likeMatches: ").append(toIndentedString(likeMatches)).append("\n");
    sb.append("    tagMatches: ").append(toIndentedString(tagMatches)).append("\n");
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

