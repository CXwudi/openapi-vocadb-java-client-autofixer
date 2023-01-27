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
import mikufan.cx.vocadbapiclient.model.EntryEditDataContract;
import mikufan.cx.vocadbapiclient.model.EntryType;
import java.time.LocalDateTime;
import mikufan.cx.vocadbapiclient.model.LogicalGrouping;
import mikufan.cx.vocadbapiclient.model.MediaType;
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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-27T01:04:32.642512Z[Etc/UTC]")
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'albumId' is set
        if (albumId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'albumId' when calling apiUsersCurrentAlbumCollectionStatusesAlbumIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("albumId", albumId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AlbumForUserForApiContract> localReturnType = new ParameterizedTypeReference<AlbumForUserForApiContract>() {};
        return apiClient.invokeAPI("/api/users/current/album-collection-statuses/{albumId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
    public String apiUsersCurrentAlbumsAlbumIdPost(Integer albumId, PurchaseStatus collectionStatus, MediaType mediaType, Integer rating) throws RestClientException {
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
    public ResponseEntity<String> apiUsersCurrentAlbumsAlbumIdPostWithHttpInfo(Integer albumId, PurchaseStatus collectionStatus, MediaType mediaType, Integer rating) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'albumId' is set
        if (albumId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'albumId' when calling apiUsersCurrentAlbumsAlbumIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("albumId", albumId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "collectionStatus", collectionStatus));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "mediaType", mediaType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "rating", rating));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/api/users/current/albums/{albumId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'artistId' is set
        if (artistId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'artistId' when calling apiUsersCurrentFollowedArtistsArtistIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("artistId", artistId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ArtistForUserForApiContract> localReturnType = new ParameterizedTypeReference<ArtistForUserForApiContract>() {};
        return apiClient.invokeAPI("/api/users/current/followedArtists/{artistId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tagId' when calling apiUsersCurrentFollowedTagsTagIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tagId", tagId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/users/current/followedTags/{tagId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tagId' when calling apiUsersCurrentFollowedTagsTagIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tagId", tagId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/users/current/followedTags/{tagId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<UserForApiContract> localReturnType = new ParameterizedTypeReference<UserForApiContract>() {};
        return apiClient.invokeAPI("/api/users/current", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'songId' is set
        if (songId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'songId' when calling apiUsersCurrentRatedSongsSongIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("songId", songId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SongVoteRating> localReturnType = new ParameterizedTypeReference<SongVoteRating>() {};
        return apiClient.invokeAPI("/api/users/current/ratedSongs/{songId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param entryType  (optional)
     * @param entryId  (optional)
     * @return EntryEditDataContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EntryEditDataContract apiUsersCurrentRefreshEntryEditPost(EntryType entryType, Integer entryId) throws RestClientException {
        return apiUsersCurrentRefreshEntryEditPostWithHttpInfo(entryType, entryId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param entryType  (optional)
     * @param entryId  (optional)
     * @return ResponseEntity&lt;EntryEditDataContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EntryEditDataContract> apiUsersCurrentRefreshEntryEditPostWithHttpInfo(EntryType entryType, Integer entryId) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "entryType", entryType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "entryId", entryId));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<EntryEditDataContract> localReturnType = new ParameterizedTypeReference<EntryEditDataContract>() {};
        return apiClient.invokeAPI("/api/users/current/refreshEntryEdit", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param songId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiUsersCurrentSongTagsSongIdPost(Integer songId) throws RestClientException {
        apiUsersCurrentSongTagsSongIdPostWithHttpInfo(songId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param songId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiUsersCurrentSongTagsSongIdPostWithHttpInfo(Integer songId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'songId' is set
        if (songId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'songId' when calling apiUsersCurrentSongTagsSongIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("songId", songId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/users/current/songTags/{songId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "groups", groups));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "joinDateAfter", joinDateAfter));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "joinDateBefore", joinDateBefore));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeDisabled", includeDisabled));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "onlyVerified", onlyVerified));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "knowsLanguage", knowsLanguage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<UserForApiContractPartialFindResult> localReturnType = new ParameterizedTypeReference<UserForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI("/api/users", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
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

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AlbumForUserForApiContract> localReturnType = new ParameterizedTypeReference<AlbumForUserForApiContract>() {};
        return apiClient.invokeAPI("/api/users/{id}/album-collection-statuses/{albumId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
     * @param mediaType  (optional)
     * @return AlbumForUserForApiContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AlbumForUserForApiContractPartialFindResult apiUsersIdAlbumsGet(Integer id, String query, Integer tagId, String tag, Integer artistId, PurchaseStatuses purchaseStatuses, Integer releaseEventId, DiscType albumTypes, List<AdvancedSearchFilterParams> advancedFilters, Integer start, Integer maxResults, Boolean getTotalCount, AlbumSortRule sort, NameMatchMode nameMatchMode, AlbumOptionalFields fields, ContentLanguagePreference lang, MediaType mediaType) throws RestClientException {
        return apiUsersIdAlbumsGetWithHttpInfo(id, query, tagId, tag, artistId, purchaseStatuses, releaseEventId, albumTypes, advancedFilters, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang, mediaType).getBody();
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
     * @param mediaType  (optional)
     * @return ResponseEntity&lt;AlbumForUserForApiContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AlbumForUserForApiContractPartialFindResult> apiUsersIdAlbumsGetWithHttpInfo(Integer id, String query, Integer tagId, String tag, Integer artistId, PurchaseStatuses purchaseStatuses, Integer releaseEventId, DiscType albumTypes, List<AdvancedSearchFilterParams> advancedFilters, Integer start, Integer maxResults, Boolean getTotalCount, AlbumSortRule sort, NameMatchMode nameMatchMode, AlbumOptionalFields fields, ContentLanguagePreference lang, MediaType mediaType) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdAlbumsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "tagId", tagId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "tag", tag));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "artistId", artistId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "purchaseStatuses", purchaseStatuses));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "releaseEventId", releaseEventId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "albumTypes", albumTypes));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "advancedFilters", advancedFilters));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "mediaType", mediaType));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AlbumForUserForApiContractPartialFindResult> localReturnType = new ParameterizedTypeReference<AlbumForUserForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI("/api/users/{id}/albums", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdEventsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "relationshipType", relationshipType));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ReleaseEventForApiContract>> localReturnType = new ParameterizedTypeReference<List<ReleaseEventForApiContract>>() {};
        return apiClient.invokeAPI("/api/users/{id}/events", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
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

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ArtistForUserForApiContract> localReturnType = new ParameterizedTypeReference<ArtistForUserForApiContract>() {};
        return apiClient.invokeAPI("/api/users/{id}/followedArtists/{artistId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdFollowedArtistsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "tagId[]", tagId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "artistType", artistType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ArtistForUserForApiContractPartialFindResult> localReturnType = new ParameterizedTypeReference<ArtistForUserForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI("/api/users/{id}/followedArtists", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<UserForApiContract> localReturnType = new ParameterizedTypeReference<UserForApiContract>() {};
        return apiClient.invokeAPI("/api/users/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdMessagesDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "messageId", messageId));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/users/{id}/messages", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdMessagesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "inbox", inbox));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "unread", unread));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "anotherUserId", anotherUserId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<UserMessageContractPartialFindResult> localReturnType = new ParameterizedTypeReference<UserMessageContractPartialFindResult>() {};
        return apiClient.invokeAPI("/api/users/{id}/messages", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = userMessageContract;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdMessagesPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/*+json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<UserMessageContract> localReturnType = new ParameterizedTypeReference<UserMessageContract>() {};
        return apiClient.invokeAPI("/api/users/{id}/messages", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdProfileCommentsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CommentForApiContractPartialFindResult> localReturnType = new ParameterizedTypeReference<CommentForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI("/api/users/{id}/profileComments", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = commentForApiContract;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdProfileCommentsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/*+json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CommentForApiContract> localReturnType = new ParameterizedTypeReference<CommentForApiContract>() {};
        return apiClient.invokeAPI("/api/users/{id}/profileComments", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdRatedSongsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "tagName", tagName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "tagId[]", tagId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "artistId[]", artistId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "childVoicebanks", childVoicebanks));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "artistGrouping", artistGrouping));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "rating", rating));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "songListId", songListId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupByRating", groupByRating));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pvServices", pvServices));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "advancedFilters", advancedFilters));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<RatedSongForUserForApiContractPartialFindResult> localReturnType = new ParameterizedTypeReference<RatedSongForUserForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI("/api/users/{id}/ratedSongs", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
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

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SongVoteRating> localReturnType = new ParameterizedTypeReference<SongVoteRating>() {};
        return apiClient.invokeAPI("/api/users/{id}/ratedSongs/{songId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = createReportModel;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdReportsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/*+json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Boolean> localReturnType = new ParameterizedTypeReference<Boolean>() {};
        return apiClient.invokeAPI("/api/users/{id}/reports", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = body;
        
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

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/*+json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/users/{id}/settings/{settingName}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdSongListsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "tagId[]", tagId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "childTags", childTags));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SongListForApiContractPartialFindResult> localReturnType = new ParameterizedTypeReference<SongListForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI("/api/users/{id}/songLists", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'messageId' is set
        if (messageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'messageId' when calling apiUsersMessagesMessageIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("messageId", messageId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<UserMessageContract> localReturnType = new ParameterizedTypeReference<UserMessageContract>() {};
        return apiClient.invokeAPI("/api/users/messages/{messageId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeDisabled", includeDisabled));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<String>> localReturnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI("/api/users/names", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling apiUsersProfileCommentsCommentIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("commentId", commentId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/users/profileComments/{commentId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = commentForApiContract;
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling apiUsersProfileCommentsCommentIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("commentId", commentId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/*+json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/users/profileComments/{commentId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
