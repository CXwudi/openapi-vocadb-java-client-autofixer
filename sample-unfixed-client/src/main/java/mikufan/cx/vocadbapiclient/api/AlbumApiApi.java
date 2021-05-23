package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.client.ApiClient;

import mikufan.cx.vocadbapiclient.model.AdvancedSearchFilterParams;
import mikufan.cx.vocadbapiclient.model.AlbumForApiContract;
import mikufan.cx.vocadbapiclient.model.AlbumForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.AlbumForUserForApiContract;
import mikufan.cx.vocadbapiclient.model.AlbumOptionalFields;
import mikufan.cx.vocadbapiclient.model.AlbumReviewContract;
import mikufan.cx.vocadbapiclient.model.AlbumSortRule;
import mikufan.cx.vocadbapiclient.model.ArtistAlbumParticipationStatus;
import mikufan.cx.vocadbapiclient.model.CommentForApiContract;
import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
import mikufan.cx.vocadbapiclient.model.DiscType;
import mikufan.cx.vocadbapiclient.model.EntryStatus;
import java.time.LocalDateTime;
import mikufan.cx.vocadbapiclient.model.NameMatchMode;
import mikufan.cx.vocadbapiclient.model.SongInAlbumForApiContract;
import mikufan.cx.vocadbapiclient.model.SongOptionalFields;

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
@Component("mikufan.cx.vocadbapiclient.api.AlbumApiApi")
public class AlbumApiApi {
    private ApiClient apiClient;

    public AlbumApiApi() {
        this(new ApiClient());
    }

    @Autowired
    public AlbumApiApi(ApiClient apiClient) {
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
     * @param commentId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiAlbumsCommentsCommentIdDelete(Integer commentId) throws RestClientException {
        apiAlbumsCommentsCommentIdDeleteWithHttpInfo(commentId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param commentId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiAlbumsCommentsCommentIdDeleteWithHttpInfo(Integer commentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling apiAlbumsCommentsCommentIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("commentId", commentId);
        String path = apiClient.expandPath("/api/albums/comments/{commentId}", uriVariables);

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
    public void apiAlbumsCommentsCommentIdPost(Integer commentId, CommentForApiContract commentForApiContract) throws RestClientException {
        apiAlbumsCommentsCommentIdPostWithHttpInfo(commentId, commentForApiContract);
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
    public ResponseEntity<Void> apiAlbumsCommentsCommentIdPostWithHttpInfo(Integer commentId, CommentForApiContract commentForApiContract) throws RestClientException {
        Object postBody = commentForApiContract;
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling apiAlbumsCommentsCommentIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("commentId", commentId);
        String path = apiClient.expandPath("/api/albums/comments/{commentId}", uriVariables);

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
     * @param discTypes  (optional)
     * @param tagName  (optional)
     * @param tagId  (optional)
     * @param childTags  (optional, default to false)
     * @param artistId  (optional)
     * @param artistParticipationStatus  (optional)
     * @param childVoicebanks  (optional, default to false)
     * @param includeMembers  (optional, default to false)
     * @param barcode  (optional)
     * @param status  (optional)
     * @param releaseDateAfter  (optional)
     * @param releaseDateBefore  (optional)
     * @param advancedFilters  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param preferAccurateMatches  (optional, default to false)
     * @param deleted  (optional, default to false)
     * @param nameMatchMode  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return AlbumForApiContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AlbumForApiContractPartialFindResult apiAlbumsGet(String query, DiscType discTypes, List<String> tagName, List<Integer> tagId, Boolean childTags, List<Integer> artistId, ArtistAlbumParticipationStatus artistParticipationStatus, Boolean childVoicebanks, Boolean includeMembers, String barcode, EntryStatus status, LocalDateTime releaseDateAfter, LocalDateTime releaseDateBefore, List<AdvancedSearchFilterParams> advancedFilters, Integer start, Integer maxResults, Boolean getTotalCount, AlbumSortRule sort, Boolean preferAccurateMatches, Boolean deleted, NameMatchMode nameMatchMode, AlbumOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        return apiAlbumsGetWithHttpInfo(query, discTypes, tagName, tagId, childTags, artistId, artistParticipationStatus, childVoicebanks, includeMembers, barcode, status, releaseDateAfter, releaseDateBefore, advancedFilters, start, maxResults, getTotalCount, sort, preferAccurateMatches, deleted, nameMatchMode, fields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query  (optional, default to )
     * @param discTypes  (optional)
     * @param tagName  (optional)
     * @param tagId  (optional)
     * @param childTags  (optional, default to false)
     * @param artistId  (optional)
     * @param artistParticipationStatus  (optional)
     * @param childVoicebanks  (optional, default to false)
     * @param includeMembers  (optional, default to false)
     * @param barcode  (optional)
     * @param status  (optional)
     * @param releaseDateAfter  (optional)
     * @param releaseDateBefore  (optional)
     * @param advancedFilters  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param preferAccurateMatches  (optional, default to false)
     * @param deleted  (optional, default to false)
     * @param nameMatchMode  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;AlbumForApiContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AlbumForApiContractPartialFindResult> apiAlbumsGetWithHttpInfo(String query, DiscType discTypes, List<String> tagName, List<Integer> tagId, Boolean childTags, List<Integer> artistId, ArtistAlbumParticipationStatus artistParticipationStatus, Boolean childVoicebanks, Boolean includeMembers, String barcode, EntryStatus status, LocalDateTime releaseDateAfter, LocalDateTime releaseDateBefore, List<AdvancedSearchFilterParams> advancedFilters, Integer start, Integer maxResults, Boolean getTotalCount, AlbumSortRule sort, Boolean preferAccurateMatches, Boolean deleted, NameMatchMode nameMatchMode, AlbumOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/albums", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "discTypes", discTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "tagName[]", tagName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "tagId[]", tagId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "childTags", childTags));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "artistId[]", artistId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "artistParticipationStatus", artistParticipationStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "childVoicebanks", childVoicebanks));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeMembers", includeMembers));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "barcode", barcode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "releaseDateAfter", releaseDateAfter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "releaseDateBefore", releaseDateBefore));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "advancedFilters", advancedFilters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "preferAccurateMatches", preferAccurateMatches));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "deleted", deleted));
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

        ParameterizedTypeReference<AlbumForApiContractPartialFindResult> returnType = new ParameterizedTypeReference<AlbumForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @return List&lt;CommentForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CommentForApiContract> apiAlbumsIdCommentsGet(Integer id) throws RestClientException {
        return apiAlbumsIdCommentsGetWithHttpInfo(id).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @return ResponseEntity&lt;List&lt;CommentForApiContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CommentForApiContract>> apiAlbumsIdCommentsGetWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiAlbumsIdCommentsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/albums/{id}/comments", uriVariables);

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

        ParameterizedTypeReference<List<CommentForApiContract>> returnType = new ParameterizedTypeReference<List<CommentForApiContract>>() {};
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
    public CommentForApiContract apiAlbumsIdCommentsPost(Integer id, CommentForApiContract commentForApiContract) throws RestClientException {
        return apiAlbumsIdCommentsPostWithHttpInfo(id, commentForApiContract).getBody();
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
    public ResponseEntity<CommentForApiContract> apiAlbumsIdCommentsPostWithHttpInfo(Integer id, CommentForApiContract commentForApiContract) throws RestClientException {
        Object postBody = commentForApiContract;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiAlbumsIdCommentsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/albums/{id}/comments", uriVariables);

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
     * @param notes  (optional, default to )
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiAlbumsIdDelete(Integer id, String notes) throws RestClientException {
        apiAlbumsIdDeleteWithHttpInfo(id, notes);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param notes  (optional, default to )
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiAlbumsIdDeleteWithHttpInfo(Integer id, String notes) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiAlbumsIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/albums/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "notes", notes));

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
     * @param fields  (optional)
     * @param songFields  (optional)
     * @param lang  (optional)
     * @return AlbumForApiContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AlbumForApiContract apiAlbumsIdGet(Integer id, AlbumOptionalFields fields, SongOptionalFields songFields, ContentLanguagePreference lang) throws RestClientException {
        return apiAlbumsIdGetWithHttpInfo(id, fields, songFields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param fields  (optional)
     * @param songFields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;AlbumForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AlbumForApiContract> apiAlbumsIdGetWithHttpInfo(Integer id, AlbumOptionalFields fields, SongOptionalFields songFields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiAlbumsIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/albums/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "songFields", songFields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<AlbumForApiContract> returnType = new ParameterizedTypeReference<AlbumForApiContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param languageCode  (optional)
     * @return List&lt;AlbumReviewContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AlbumReviewContract> apiAlbumsIdReviewsGet(Integer id, String languageCode) throws RestClientException {
        return apiAlbumsIdReviewsGetWithHttpInfo(id, languageCode).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param languageCode  (optional)
     * @return ResponseEntity&lt;List&lt;AlbumReviewContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AlbumReviewContract>> apiAlbumsIdReviewsGetWithHttpInfo(Integer id, String languageCode) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiAlbumsIdReviewsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/albums/{id}/reviews", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "languageCode", languageCode));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<AlbumReviewContract>> returnType = new ParameterizedTypeReference<List<AlbumReviewContract>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param albumReviewContract  (optional)
     * @return AlbumReviewContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AlbumReviewContract apiAlbumsIdReviewsPost(Integer id, AlbumReviewContract albumReviewContract) throws RestClientException {
        return apiAlbumsIdReviewsPostWithHttpInfo(id, albumReviewContract).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param albumReviewContract  (optional)
     * @return ResponseEntity&lt;AlbumReviewContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AlbumReviewContract> apiAlbumsIdReviewsPostWithHttpInfo(Integer id, AlbumReviewContract albumReviewContract) throws RestClientException {
        Object postBody = albumReviewContract;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiAlbumsIdReviewsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/albums/{id}/reviews", uriVariables);

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

        ParameterizedTypeReference<AlbumReviewContract> returnType = new ParameterizedTypeReference<AlbumReviewContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param reviewId  (required)
     * @param id  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiAlbumsIdReviewsReviewIdDelete(Integer reviewId, String id) throws RestClientException {
        apiAlbumsIdReviewsReviewIdDeleteWithHttpInfo(reviewId, id);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param reviewId  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiAlbumsIdReviewsReviewIdDeleteWithHttpInfo(Integer reviewId, String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'reviewId' is set
        if (reviewId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reviewId' when calling apiAlbumsIdReviewsReviewIdDelete");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiAlbumsIdReviewsReviewIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("reviewId", reviewId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/albums/{id}/reviews/{reviewId}", uriVariables);

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
     * @param id  (required)
     * @param field  (optional)
     * @param discNumber  (optional)
     * @param lang  (optional)
     * @return List&lt;Map&lt;String, String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Map<String, String>> apiAlbumsIdTracksFieldsGet(Integer id, List<String> field, Integer discNumber, ContentLanguagePreference lang) throws RestClientException {
        return apiAlbumsIdTracksFieldsGetWithHttpInfo(id, field, discNumber, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param field  (optional)
     * @param discNumber  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;List&lt;Map&lt;String, String&gt;&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Map<String, String>>> apiAlbumsIdTracksFieldsGetWithHttpInfo(Integer id, List<String> field, Integer discNumber, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiAlbumsIdTracksFieldsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/albums/{id}/tracks/fields", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "field[]", field));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "discNumber", discNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Map<String, String>>> returnType = new ParameterizedTypeReference<List<Map<String, String>>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return List&lt;SongInAlbumForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SongInAlbumForApiContract> apiAlbumsIdTracksGet(Integer id, SongOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        return apiAlbumsIdTracksGetWithHttpInfo(id, fields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;List&lt;SongInAlbumForApiContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SongInAlbumForApiContract>> apiAlbumsIdTracksGetWithHttpInfo(Integer id, SongOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiAlbumsIdTracksGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/albums/{id}/tracks", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<SongInAlbumForApiContract>> returnType = new ParameterizedTypeReference<List<SongInAlbumForApiContract>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param languagePreference  (optional)
     * @return List&lt;AlbumForUserForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AlbumForUserForApiContract> apiAlbumsIdUserCollectionsGet(Integer id, ContentLanguagePreference languagePreference) throws RestClientException {
        return apiAlbumsIdUserCollectionsGetWithHttpInfo(id, languagePreference).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param languagePreference  (optional)
     * @return ResponseEntity&lt;List&lt;AlbumForUserForApiContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AlbumForUserForApiContract>> apiAlbumsIdUserCollectionsGetWithHttpInfo(Integer id, ContentLanguagePreference languagePreference) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiAlbumsIdUserCollectionsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/albums/{id}/user-collections", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "languagePreference", languagePreference));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<AlbumForUserForApiContract>> returnType = new ParameterizedTypeReference<List<AlbumForUserForApiContract>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query  (optional, default to )
     * @param nameMatchMode  (optional)
     * @param maxResults  (optional, default to 15)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> apiAlbumsNamesGet(String query, NameMatchMode nameMatchMode, Integer maxResults) throws RestClientException {
        return apiAlbumsNamesGetWithHttpInfo(query, nameMatchMode, maxResults).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query  (optional, default to )
     * @param nameMatchMode  (optional)
     * @param maxResults  (optional, default to 15)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> apiAlbumsNamesGetWithHttpInfo(String query, NameMatchMode nameMatchMode, Integer maxResults) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/albums/names", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));

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
     * @param languagePreference  (optional)
     * @param fields  (optional)
     * @return List&lt;AlbumForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AlbumForApiContract> apiAlbumsNewGet(ContentLanguagePreference languagePreference, AlbumOptionalFields fields) throws RestClientException {
        return apiAlbumsNewGetWithHttpInfo(languagePreference, fields).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param languagePreference  (optional)
     * @param fields  (optional)
     * @return ResponseEntity&lt;List&lt;AlbumForApiContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AlbumForApiContract>> apiAlbumsNewGetWithHttpInfo(ContentLanguagePreference languagePreference, AlbumOptionalFields fields) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/albums/new", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "languagePreference", languagePreference));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<AlbumForApiContract>> returnType = new ParameterizedTypeReference<List<AlbumForApiContract>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param ignoreIds  (optional)
     * @param languagePreference  (optional)
     * @param fields  (optional)
     * @return List&lt;AlbumForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AlbumForApiContract> apiAlbumsTopGet(List<Integer> ignoreIds, ContentLanguagePreference languagePreference, AlbumOptionalFields fields) throws RestClientException {
        return apiAlbumsTopGetWithHttpInfo(ignoreIds, languagePreference, fields).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param ignoreIds  (optional)
     * @param languagePreference  (optional)
     * @param fields  (optional)
     * @return ResponseEntity&lt;List&lt;AlbumForApiContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AlbumForApiContract>> apiAlbumsTopGetWithHttpInfo(List<Integer> ignoreIds, ContentLanguagePreference languagePreference, AlbumOptionalFields fields) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/albums/top", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "ignoreIds[]", ignoreIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "languagePreference", languagePreference));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<AlbumForApiContract>> returnType = new ParameterizedTypeReference<List<AlbumForApiContract>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
