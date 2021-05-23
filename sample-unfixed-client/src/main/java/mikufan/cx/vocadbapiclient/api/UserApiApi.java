package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.client.ApiClient;

import mikufan.cx.vocadbapiclient.model.AdvancedSearchFilterParams;
import mikufan.cx.vocadbapiclient.model.AlbumForUserForApiContract;
import mikufan.cx.vocadbapiclient.model.AlbumForUserForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.AlbumOptionalFields;
import mikufan.cx.vocadbapiclient.model.AlbumSortRule;
import mikufan.cx.vocadbapiclient.model.ArtistForUserForApiContract;
import mikufan.cx.vocadbapiclient.model.ArtistForUserForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.ArtistOptionalFields;
import mikufan.cx.vocadbapiclient.model.ArtistSortRule;
import mikufan.cx.vocadbapiclient.model.ArtistType;
import mikufan.cx.vocadbapiclient.model.CommentForApiContract;
import mikufan.cx.vocadbapiclient.model.CommentForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
import mikufan.cx.vocadbapiclient.model.CreateReportModel;
import mikufan.cx.vocadbapiclient.model.DiscType;
import mikufan.cx.vocadbapiclient.model.EntryType;
import java.time.LocalDateTime;
import mikufan.cx.vocadbapiclient.model.LogicalGrouping;
import mikufan.cx.vocadbapiclient.model.NameMatchMode;
import mikufan.cx.vocadbapiclient.model.PVServices;
import mikufan.cx.vocadbapiclient.model.PurchaseStatus;
import mikufan.cx.vocadbapiclient.model.PurchaseStatuses;
import mikufan.cx.vocadbapiclient.model.RatedSongForUserForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.RatedSongForUserSortRule;
import mikufan.cx.vocadbapiclient.model.ReleaseEventForApiContract;
import mikufan.cx.vocadbapiclient.model.SongListForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.SongListOptionalFields;
import mikufan.cx.vocadbapiclient.model.SongListSortRule;
import mikufan.cx.vocadbapiclient.model.SongOptionalFields;
import mikufan.cx.vocadbapiclient.model.SongVoteRating;
import mikufan.cx.vocadbapiclient.model.TagBaseContract;
import mikufan.cx.vocadbapiclient.model.UserEventRelationshipType;
import mikufan.cx.vocadbapiclient.model.UserForApiContract;
import mikufan.cx.vocadbapiclient.model.UserForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.UserGroupId;
import mikufan.cx.vocadbapiclient.model.UserInboxType;
import mikufan.cx.vocadbapiclient.model.UserMessageContract;
import mikufan.cx.vocadbapiclient.model.UserMessageContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.UserOptionalFields;
import mikufan.cx.vocadbapiclient.model.UserSortRule;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-23T13:02:48.301797700-04:00[America/New_York]")
@Component("mikufan.cx.vocadbapiclient.api.UserApiApi")
public class UserApiApi {
    private ApiClient apiClient;

    public UserApiApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param albumId  (required)
     * @return AlbumForUserForApiContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AlbumForUserForApiContract apiUsersCurrentAlbumCollectionStatusesAlbumIdGet(Integer albumId) throws RestClientException {
        return apiUsersCurrentAlbumCollectionStatusesAlbumIdGetWithHttpInfo(albumId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param albumId  (required)
     * @return ResponseEntity&lt;AlbumForUserForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AlbumForUserForApiContract> apiUsersCurrentAlbumCollectionStatusesAlbumIdGetWithHttpInfo(Integer albumId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'albumId' is set
        if (albumId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'albumId' when calling apiUsersCurrentAlbumCollectionStatusesAlbumIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("albumId", albumId);
        String path = apiClient.expandPath("/api/users/current/album-collection-statuses/{albumId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<AlbumForUserForApiContract> returnType = new ParameterizedTypeReference<AlbumForUserForApiContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param albumId  (required)
     * @param collectionStatus  (optional)
     * @param mediaType  (optional)
     * @param rating  (optional)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String apiUsersCurrentAlbumsAlbumIdPost(Integer albumId, PurchaseStatus collectionStatus, mikufan.cx.vocadbapiclient.model.MediaType mediaType, Integer rating) throws RestClientException {
        return apiUsersCurrentAlbumsAlbumIdPostWithHttpInfo(albumId, collectionStatus, mediaType, rating).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param albumId  (required)
     * @param collectionStatus  (optional)
     * @param mediaType  (optional)
     * @param rating  (optional)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> apiUsersCurrentAlbumsAlbumIdPostWithHttpInfo(Integer albumId, PurchaseStatus collectionStatus, mikufan.cx.vocadbapiclient.model.MediaType mediaType, Integer rating) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'albumId' is set
        if (albumId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'albumId' when calling apiUsersCurrentAlbumsAlbumIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("albumId", albumId);
        String path = apiClient.expandPath("/api/users/current/albums/{albumId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "collectionStatus", collectionStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mediaType", mediaType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "rating", rating));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param artistId  (required)
     * @return ArtistForUserForApiContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ArtistForUserForApiContract apiUsersCurrentFollowedArtistsArtistIdGet(Integer artistId) throws RestClientException {
        return apiUsersCurrentFollowedArtistsArtistIdGetWithHttpInfo(artistId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param artistId  (required)
     * @return ResponseEntity&lt;ArtistForUserForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ArtistForUserForApiContract> apiUsersCurrentFollowedArtistsArtistIdGetWithHttpInfo(Integer artistId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'artistId' is set
        if (artistId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'artistId' when calling apiUsersCurrentFollowedArtistsArtistIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("artistId", artistId);
        String path = apiClient.expandPath("/api/users/current/followedArtists/{artistId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ArtistForUserForApiContract> returnType = new ParameterizedTypeReference<ArtistForUserForApiContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param tagId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiUsersCurrentFollowedTagsTagIdDelete(Integer tagId) throws RestClientException {
        apiUsersCurrentFollowedTagsTagIdDeleteWithHttpInfo(tagId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param tagId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiUsersCurrentFollowedTagsTagIdDeleteWithHttpInfo(Integer tagId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tagId' when calling apiUsersCurrentFollowedTagsTagIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tagId", tagId);
        String path = apiClient.expandPath("/api/users/current/followedTags/{tagId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param tagId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiUsersCurrentFollowedTagsTagIdPost(Integer tagId) throws RestClientException {
        apiUsersCurrentFollowedTagsTagIdPostWithHttpInfo(tagId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param tagId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiUsersCurrentFollowedTagsTagIdPostWithHttpInfo(Integer tagId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tagId' when calling apiUsersCurrentFollowedTagsTagIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tagId", tagId);
        String path = apiClient.expandPath("/api/users/current/followedTags/{tagId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param fields  (optional)
     * @return UserForApiContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserForApiContract apiUsersCurrentGet(UserOptionalFields fields) throws RestClientException {
        return apiUsersCurrentGetWithHttpInfo(fields).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param fields  (optional)
     * @return ResponseEntity&lt;UserForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserForApiContract> apiUsersCurrentGetWithHttpInfo(UserOptionalFields fields) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/users/current", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<UserForApiContract> returnType = new ParameterizedTypeReference<UserForApiContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param songId  (required)
     * @return SongVoteRating
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SongVoteRating apiUsersCurrentRatedSongsSongIdGet(Integer songId) throws RestClientException {
        return apiUsersCurrentRatedSongsSongIdGetWithHttpInfo(songId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param songId  (required)
     * @return ResponseEntity&lt;SongVoteRating&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SongVoteRating> apiUsersCurrentRatedSongsSongIdGetWithHttpInfo(Integer songId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'songId' is set
        if (songId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'songId' when calling apiUsersCurrentRatedSongsSongIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("songId", songId);
        String path = apiClient.expandPath("/api/users/current/ratedSongs/{songId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SongVoteRating> returnType = new ParameterizedTypeReference<SongVoteRating>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param entryType  (optional)
     * @param entryId  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiUsersCurrentRefreshEntryEditPost(EntryType entryType, Integer entryId) throws RestClientException {
        apiUsersCurrentRefreshEntryEditPostWithHttpInfo(entryType, entryId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param entryType  (optional)
     * @param entryId  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiUsersCurrentRefreshEntryEditPostWithHttpInfo(EntryType entryType, Integer entryId) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/users/current/refreshEntryEdit", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entryType", entryType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entryId", entryId));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param songId  (required)
     * @param tagBaseContract  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiUsersCurrentSongTagsSongIdPost(Integer songId, List<TagBaseContract> tagBaseContract) throws RestClientException {
        apiUsersCurrentSongTagsSongIdPostWithHttpInfo(songId, tagBaseContract);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param songId  (required)
     * @param tagBaseContract  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiUsersCurrentSongTagsSongIdPostWithHttpInfo(Integer songId, List<TagBaseContract> tagBaseContract) throws RestClientException {
        Object postBody = tagBaseContract;
        
        // verify the required parameter 'songId' is set
        if (songId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'songId' when calling apiUsersCurrentSongTagsSongIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("songId", songId);
        String path = apiClient.expandPath("/api/users/current/songTags/{songId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query  (optional, default to )
     * @param groups  (optional)
     * @param joinDateAfter  (optional)
     * @param joinDateBefore  (optional)
     * @param nameMatchMode  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param includeDisabled  (optional, default to false)
     * @param onlyVerified  (optional, default to false)
     * @param knowsLanguage  (optional)
     * @param fields  (optional)
     * @return UserForApiContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserForApiContractPartialFindResult apiUsersGet(String query, UserGroupId groups, LocalDateTime joinDateAfter, LocalDateTime joinDateBefore, NameMatchMode nameMatchMode, Integer start, Integer maxResults, Boolean getTotalCount, UserSortRule sort, Boolean includeDisabled, Boolean onlyVerified, String knowsLanguage, UserOptionalFields fields) throws RestClientException {
        return apiUsersGetWithHttpInfo(query, groups, joinDateAfter, joinDateBefore, nameMatchMode, start, maxResults, getTotalCount, sort, includeDisabled, onlyVerified, knowsLanguage, fields).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query  (optional, default to )
     * @param groups  (optional)
     * @param joinDateAfter  (optional)
     * @param joinDateBefore  (optional)
     * @param nameMatchMode  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param includeDisabled  (optional, default to false)
     * @param onlyVerified  (optional, default to false)
     * @param knowsLanguage  (optional)
     * @param fields  (optional)
     * @return ResponseEntity&lt;UserForApiContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserForApiContractPartialFindResult> apiUsersGetWithHttpInfo(String query, UserGroupId groups, LocalDateTime joinDateAfter, LocalDateTime joinDateBefore, NameMatchMode nameMatchMode, Integer start, Integer maxResults, Boolean getTotalCount, UserSortRule sort, Boolean includeDisabled, Boolean onlyVerified, String knowsLanguage, UserOptionalFields fields) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/users", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groups", groups));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "joinDateAfter", joinDateAfter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "joinDateBefore", joinDateBefore));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeDisabled", includeDisabled));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "onlyVerified", onlyVerified));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "knowsLanguage", knowsLanguage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<UserForApiContractPartialFindResult> returnType = new ParameterizedTypeReference<UserForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param albumId  (required)
     * @return AlbumForUserForApiContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AlbumForUserForApiContract apiUsersIdAlbumCollectionStatusesAlbumIdGet(Integer id, Integer albumId) throws RestClientException {
        return apiUsersIdAlbumCollectionStatusesAlbumIdGetWithHttpInfo(id, albumId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param albumId  (required)
     * @return ResponseEntity&lt;AlbumForUserForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AlbumForUserForApiContract> apiUsersIdAlbumCollectionStatusesAlbumIdGetWithHttpInfo(Integer id, Integer albumId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdAlbumCollectionStatusesAlbumIdGet");
        }
        
        // verify the required parameter 'albumId' is set
        if (albumId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'albumId' when calling apiUsersIdAlbumCollectionStatusesAlbumIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("albumId", albumId);
        String path = apiClient.expandPath("/api/users/{id}/album-collection-statuses/{albumId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<AlbumForUserForApiContract> returnType = new ParameterizedTypeReference<AlbumForUserForApiContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param query  (optional, default to )
     * @param tagId  (optional)
     * @param tag  (optional)
     * @param artistId  (optional)
     * @param purchaseStatuses  (optional)
     * @param releaseEventId  (optional, default to 0)
     * @param albumTypes  (optional)
     * @param advancedFilters  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param nameMatchMode  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return AlbumForUserForApiContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AlbumForUserForApiContractPartialFindResult apiUsersIdAlbumsGet(Integer id, String query, Integer tagId, String tag, Integer artistId, PurchaseStatuses purchaseStatuses, Integer releaseEventId, DiscType albumTypes, List<AdvancedSearchFilterParams> advancedFilters, Integer start, Integer maxResults, Boolean getTotalCount, AlbumSortRule sort, NameMatchMode nameMatchMode, AlbumOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        return apiUsersIdAlbumsGetWithHttpInfo(id, query, tagId, tag, artistId, purchaseStatuses, releaseEventId, albumTypes, advancedFilters, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param query  (optional, default to )
     * @param tagId  (optional)
     * @param tag  (optional)
     * @param artistId  (optional)
     * @param purchaseStatuses  (optional)
     * @param releaseEventId  (optional, default to 0)
     * @param albumTypes  (optional)
     * @param advancedFilters  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param nameMatchMode  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;AlbumForUserForApiContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AlbumForUserForApiContractPartialFindResult> apiUsersIdAlbumsGetWithHttpInfo(Integer id, String query, Integer tagId, String tag, Integer artistId, PurchaseStatuses purchaseStatuses, Integer releaseEventId, DiscType albumTypes, List<AdvancedSearchFilterParams> advancedFilters, Integer start, Integer maxResults, Boolean getTotalCount, AlbumSortRule sort, NameMatchMode nameMatchMode, AlbumOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdAlbumsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/users/{id}/albums", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tagId", tagId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tag", tag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "artistId", artistId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "purchaseStatuses", purchaseStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "releaseEventId", releaseEventId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "albumTypes", albumTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "advancedFilters", advancedFilters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<AlbumForUserForApiContractPartialFindResult> returnType = new ParameterizedTypeReference<AlbumForUserForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param relationshipType  (optional)
     * @return List&lt;ReleaseEventForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ReleaseEventForApiContract> apiUsersIdEventsGet(Integer id, UserEventRelationshipType relationshipType) throws RestClientException {
        return apiUsersIdEventsGetWithHttpInfo(id, relationshipType).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param relationshipType  (optional)
     * @return ResponseEntity&lt;List&lt;ReleaseEventForApiContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ReleaseEventForApiContract>> apiUsersIdEventsGetWithHttpInfo(Integer id, UserEventRelationshipType relationshipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdEventsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/users/{id}/events", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "relationshipType", relationshipType));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<ReleaseEventForApiContract>> returnType = new ParameterizedTypeReference<List<ReleaseEventForApiContract>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param artistId  (required)
     * @return ArtistForUserForApiContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ArtistForUserForApiContract apiUsersIdFollowedArtistsArtistIdGet(Integer id, Integer artistId) throws RestClientException {
        return apiUsersIdFollowedArtistsArtistIdGetWithHttpInfo(id, artistId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param artistId  (required)
     * @return ResponseEntity&lt;ArtistForUserForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ArtistForUserForApiContract> apiUsersIdFollowedArtistsArtistIdGetWithHttpInfo(Integer id, Integer artistId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdFollowedArtistsArtistIdGet");
        }
        
        // verify the required parameter 'artistId' is set
        if (artistId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'artistId' when calling apiUsersIdFollowedArtistsArtistIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("artistId", artistId);
        String path = apiClient.expandPath("/api/users/{id}/followedArtists/{artistId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ArtistForUserForApiContract> returnType = new ParameterizedTypeReference<ArtistForUserForApiContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param query  (optional, default to )
     * @param tagId  (optional)
     * @param artistType  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param nameMatchMode  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ArtistForUserForApiContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ArtistForUserForApiContractPartialFindResult apiUsersIdFollowedArtistsGet(Integer id, String query, List<Integer> tagId, ArtistType artistType, Integer start, Integer maxResults, Boolean getTotalCount, ArtistSortRule sort, NameMatchMode nameMatchMode, ArtistOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        return apiUsersIdFollowedArtistsGetWithHttpInfo(id, query, tagId, artistType, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param query  (optional, default to )
     * @param tagId  (optional)
     * @param artistType  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param nameMatchMode  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;ArtistForUserForApiContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ArtistForUserForApiContractPartialFindResult> apiUsersIdFollowedArtistsGetWithHttpInfo(Integer id, String query, List<Integer> tagId, ArtistType artistType, Integer start, Integer maxResults, Boolean getTotalCount, ArtistSortRule sort, NameMatchMode nameMatchMode, ArtistOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdFollowedArtistsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/users/{id}/followedArtists", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "tagId[]", tagId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "artistType", artistType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ArtistForUserForApiContractPartialFindResult> returnType = new ParameterizedTypeReference<ArtistForUserForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param fields  (optional)
     * @return UserForApiContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserForApiContract apiUsersIdGet(Integer id, UserOptionalFields fields) throws RestClientException {
        return apiUsersIdGetWithHttpInfo(id, fields).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param fields  (optional)
     * @return ResponseEntity&lt;UserForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserForApiContract> apiUsersIdGetWithHttpInfo(Integer id, UserOptionalFields fields) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/users/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<UserForApiContract> returnType = new ParameterizedTypeReference<UserForApiContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param messageId  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiUsersIdMessagesDelete(Integer id, List<Integer> messageId) throws RestClientException {
        apiUsersIdMessagesDeleteWithHttpInfo(id, messageId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param messageId  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiUsersIdMessagesDeleteWithHttpInfo(Integer id, List<Integer> messageId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdMessagesDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/users/{id}/messages", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "messageId", messageId));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param inbox  (optional)
     * @param unread  (optional, default to false)
     * @param anotherUserId  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @return UserMessageContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserMessageContractPartialFindResult apiUsersIdMessagesGet(Integer id, UserInboxType inbox, Boolean unread, Integer anotherUserId, Integer start, Integer maxResults, Boolean getTotalCount) throws RestClientException {
        return apiUsersIdMessagesGetWithHttpInfo(id, inbox, unread, anotherUserId, start, maxResults, getTotalCount).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param inbox  (optional)
     * @param unread  (optional, default to false)
     * @param anotherUserId  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @return ResponseEntity&lt;UserMessageContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserMessageContractPartialFindResult> apiUsersIdMessagesGetWithHttpInfo(Integer id, UserInboxType inbox, Boolean unread, Integer anotherUserId, Integer start, Integer maxResults, Boolean getTotalCount) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdMessagesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/users/{id}/messages", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inbox", inbox));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "unread", unread));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "anotherUserId", anotherUserId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<UserMessageContractPartialFindResult> returnType = new ParameterizedTypeReference<UserMessageContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param userMessageContract  (optional)
     * @return UserMessageContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserMessageContract apiUsersIdMessagesPost(Integer id, UserMessageContract userMessageContract) throws RestClientException {
        return apiUsersIdMessagesPostWithHttpInfo(id, userMessageContract).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param userMessageContract  (optional)
     * @return ResponseEntity&lt;UserMessageContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserMessageContract> apiUsersIdMessagesPostWithHttpInfo(Integer id, UserMessageContract userMessageContract) throws RestClientException {
        Object postBody = userMessageContract;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdMessagesPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/users/{id}/messages", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<UserMessageContract> returnType = new ParameterizedTypeReference<UserMessageContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @return CommentForApiContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentForApiContractPartialFindResult apiUsersIdProfileCommentsGet(Integer id, Integer start, Integer maxResults, Boolean getTotalCount) throws RestClientException {
        return apiUsersIdProfileCommentsGetWithHttpInfo(id, start, maxResults, getTotalCount).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @return ResponseEntity&lt;CommentForApiContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommentForApiContractPartialFindResult> apiUsersIdProfileCommentsGetWithHttpInfo(Integer id, Integer start, Integer maxResults, Boolean getTotalCount) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdProfileCommentsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/users/{id}/profileComments", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CommentForApiContractPartialFindResult> returnType = new ParameterizedTypeReference<CommentForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param commentForApiContract  (optional)
     * @return CommentForApiContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentForApiContract apiUsersIdProfileCommentsPost(Integer id, CommentForApiContract commentForApiContract) throws RestClientException {
        return apiUsersIdProfileCommentsPostWithHttpInfo(id, commentForApiContract).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param commentForApiContract  (optional)
     * @return ResponseEntity&lt;CommentForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommentForApiContract> apiUsersIdProfileCommentsPostWithHttpInfo(Integer id, CommentForApiContract commentForApiContract) throws RestClientException {
        Object postBody = commentForApiContract;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdProfileCommentsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/users/{id}/profileComments", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CommentForApiContract> returnType = new ParameterizedTypeReference<CommentForApiContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param query  (optional, default to )
     * @param tagName  (optional)
     * @param tagId  (optional)
     * @param artistId  (optional)
     * @param childVoicebanks  (optional, default to false)
     * @param artistGrouping  (optional)
     * @param rating  (optional)
     * @param songListId  (optional)
     * @param groupByRating  (optional, default to true)
     * @param pvServices  (optional)
     * @param advancedFilters  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param nameMatchMode  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return RatedSongForUserForApiContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RatedSongForUserForApiContractPartialFindResult apiUsersIdRatedSongsGet(Integer id, String query, String tagName, List<Integer> tagId, List<Integer> artistId, Boolean childVoicebanks, LogicalGrouping artistGrouping, SongVoteRating rating, Integer songListId, Boolean groupByRating, PVServices pvServices, List<AdvancedSearchFilterParams> advancedFilters, Integer start, Integer maxResults, Boolean getTotalCount, RatedSongForUserSortRule sort, NameMatchMode nameMatchMode, SongOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        return apiUsersIdRatedSongsGetWithHttpInfo(id, query, tagName, tagId, artistId, childVoicebanks, artistGrouping, rating, songListId, groupByRating, pvServices, advancedFilters, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param query  (optional, default to )
     * @param tagName  (optional)
     * @param tagId  (optional)
     * @param artistId  (optional)
     * @param childVoicebanks  (optional, default to false)
     * @param artistGrouping  (optional)
     * @param rating  (optional)
     * @param songListId  (optional)
     * @param groupByRating  (optional, default to true)
     * @param pvServices  (optional)
     * @param advancedFilters  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param nameMatchMode  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;RatedSongForUserForApiContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RatedSongForUserForApiContractPartialFindResult> apiUsersIdRatedSongsGetWithHttpInfo(Integer id, String query, String tagName, List<Integer> tagId, List<Integer> artistId, Boolean childVoicebanks, LogicalGrouping artistGrouping, SongVoteRating rating, Integer songListId, Boolean groupByRating, PVServices pvServices, List<AdvancedSearchFilterParams> advancedFilters, Integer start, Integer maxResults, Boolean getTotalCount, RatedSongForUserSortRule sort, NameMatchMode nameMatchMode, SongOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdRatedSongsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/users/{id}/ratedSongs", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tagName", tagName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "tagId[]", tagId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "artistId[]", artistId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "childVoicebanks", childVoicebanks));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "artistGrouping", artistGrouping));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "rating", rating));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "songListId", songListId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupByRating", groupByRating));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pvServices", pvServices));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "advancedFilters", advancedFilters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<RatedSongForUserForApiContractPartialFindResult> returnType = new ParameterizedTypeReference<RatedSongForUserForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param songId  (required)
     * @return SongVoteRating
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SongVoteRating apiUsersIdRatedSongsSongIdGet(Integer id, Integer songId) throws RestClientException {
        return apiUsersIdRatedSongsSongIdGetWithHttpInfo(id, songId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param songId  (required)
     * @return ResponseEntity&lt;SongVoteRating&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SongVoteRating> apiUsersIdRatedSongsSongIdGetWithHttpInfo(Integer id, Integer songId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdRatedSongsSongIdGet");
        }
        
        // verify the required parameter 'songId' is set
        if (songId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'songId' when calling apiUsersIdRatedSongsSongIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("songId", songId);
        String path = apiClient.expandPath("/api/users/{id}/ratedSongs/{songId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SongVoteRating> returnType = new ParameterizedTypeReference<SongVoteRating>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param createReportModel  (optional)
     * @return Boolean
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Boolean apiUsersIdReportsPost(Integer id, CreateReportModel createReportModel) throws RestClientException {
        return apiUsersIdReportsPostWithHttpInfo(id, createReportModel).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param createReportModel  (optional)
     * @return ResponseEntity&lt;Boolean&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Boolean> apiUsersIdReportsPostWithHttpInfo(Integer id, CreateReportModel createReportModel) throws RestClientException {
        Object postBody = createReportModel;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdReportsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/users/{id}/reports", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param settingName  (required)
     * @param body  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiUsersIdSettingsSettingNamePost(Integer id, String settingName, String body) throws RestClientException {
        apiUsersIdSettingsSettingNamePostWithHttpInfo(id, settingName, body);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param settingName  (required)
     * @param body  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiUsersIdSettingsSettingNamePostWithHttpInfo(Integer id, String settingName, String body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdSettingsSettingNamePost");
        }
        
        // verify the required parameter 'settingName' is set
        if (settingName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'settingName' when calling apiUsersIdSettingsSettingNamePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("settingName", settingName);
        String path = apiClient.expandPath("/api/users/{id}/settings/{settingName}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param query  (optional, default to )
     * @param tagId  (optional)
     * @param childTags  (optional, default to false)
     * @param nameMatchMode  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param fields  (optional)
     * @return SongListForApiContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SongListForApiContractPartialFindResult apiUsersIdSongListsGet(Integer id, String query, List<Integer> tagId, Boolean childTags, NameMatchMode nameMatchMode, Integer start, Integer maxResults, Boolean getTotalCount, SongListSortRule sort, SongListOptionalFields fields) throws RestClientException {
        return apiUsersIdSongListsGetWithHttpInfo(id, query, tagId, childTags, nameMatchMode, start, maxResults, getTotalCount, sort, fields).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param query  (optional, default to )
     * @param tagId  (optional)
     * @param childTags  (optional, default to false)
     * @param nameMatchMode  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param fields  (optional)
     * @return ResponseEntity&lt;SongListForApiContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SongListForApiContractPartialFindResult> apiUsersIdSongListsGetWithHttpInfo(Integer id, String query, List<Integer> tagId, Boolean childTags, NameMatchMode nameMatchMode, Integer start, Integer maxResults, Boolean getTotalCount, SongListSortRule sort, SongListOptionalFields fields) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdSongListsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/users/{id}/songLists", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "tagId[]", tagId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "childTags", childTags));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SongListForApiContractPartialFindResult> returnType = new ParameterizedTypeReference<SongListForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param messageId  (required)
     * @return UserMessageContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserMessageContract apiUsersMessagesMessageIdGet(Integer messageId) throws RestClientException {
        return apiUsersMessagesMessageIdGetWithHttpInfo(messageId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param messageId  (required)
     * @return ResponseEntity&lt;UserMessageContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserMessageContract> apiUsersMessagesMessageIdGetWithHttpInfo(Integer messageId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'messageId' is set
        if (messageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'messageId' when calling apiUsersMessagesMessageIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("messageId", messageId);
        String path = apiClient.expandPath("/api/users/messages/{messageId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<UserMessageContract> returnType = new ParameterizedTypeReference<UserMessageContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query  (optional, default to )
     * @param nameMatchMode  (optional)
     * @param maxResults  (optional, default to 10)
     * @param includeDisabled  (optional, default to false)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> apiUsersNamesGet(String query, NameMatchMode nameMatchMode, Integer maxResults, Boolean includeDisabled) throws RestClientException {
        return apiUsersNamesGetWithHttpInfo(query, nameMatchMode, maxResults, includeDisabled).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query  (optional, default to )
     * @param nameMatchMode  (optional)
     * @param maxResults  (optional, default to 10)
     * @param includeDisabled  (optional, default to false)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> apiUsersNamesGetWithHttpInfo(String query, NameMatchMode nameMatchMode, Integer maxResults, Boolean includeDisabled) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/users/names", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeDisabled", includeDisabled));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param commentId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiUsersProfileCommentsCommentIdDelete(Integer commentId) throws RestClientException {
        apiUsersProfileCommentsCommentIdDeleteWithHttpInfo(commentId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param commentId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiUsersProfileCommentsCommentIdDeleteWithHttpInfo(Integer commentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling apiUsersProfileCommentsCommentIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("commentId", commentId);
        String path = apiClient.expandPath("/api/users/profileComments/{commentId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param commentId  (required)
     * @param commentForApiContract  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiUsersProfileCommentsCommentIdPost(Integer commentId, CommentForApiContract commentForApiContract) throws RestClientException {
        apiUsersProfileCommentsCommentIdPostWithHttpInfo(commentId, commentForApiContract);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param commentId  (required)
     * @param commentForApiContract  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiUsersProfileCommentsCommentIdPostWithHttpInfo(Integer commentId, CommentForApiContract commentForApiContract) throws RestClientException {
        Object postBody = commentForApiContract;
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling apiUsersProfileCommentsCommentIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("commentId", commentId);
        String path = apiClient.expandPath("/api/users/profileComments/{commentId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
