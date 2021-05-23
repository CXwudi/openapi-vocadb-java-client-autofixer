package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.client.ApiClient;

import mikufan.cx.vocadbapiclient.model.AdvancedSearchFilterParams;
import mikufan.cx.vocadbapiclient.model.ArtistAlbumParticipationStatus;
import mikufan.cx.vocadbapiclient.model.CommentForApiContract;
import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
import mikufan.cx.vocadbapiclient.model.EntryStatus;
import java.time.LocalDateTime;
import mikufan.cx.vocadbapiclient.model.LyricsForSongContract;
import mikufan.cx.vocadbapiclient.model.NameMatchMode;
import mikufan.cx.vocadbapiclient.model.PVService;
import mikufan.cx.vocadbapiclient.model.PVServices;
import mikufan.cx.vocadbapiclient.model.RatedSongForUserForApiContract;
import mikufan.cx.vocadbapiclient.model.RelatedSongsContract;
import mikufan.cx.vocadbapiclient.model.SongForApiContract;
import mikufan.cx.vocadbapiclient.model.SongForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.SongOptionalFields;
import mikufan.cx.vocadbapiclient.model.SongRatingContract;
import mikufan.cx.vocadbapiclient.model.SongSortRule;
import mikufan.cx.vocadbapiclient.model.SongVocalistSelection;
import mikufan.cx.vocadbapiclient.model.TopSongsDateFilterType;
import mikufan.cx.vocadbapiclient.model.UserOptionalFields;

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
@Component("mikufan.cx.vocadbapiclient.api.SongApiApi")
public class SongApiApi {
    private ApiClient apiClient;

    public SongApiApi() {
        this(new ApiClient());
    }

    @Autowired
    public SongApiApi(ApiClient apiClient) {
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
     * @param pvService  (optional)
     * @param pvId  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return SongForApiContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SongForApiContract apiSongsByPvGet(PVService pvService, String pvId, SongOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        return apiSongsByPvGetWithHttpInfo(pvService, pvId, fields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param pvService  (optional)
     * @param pvId  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;SongForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SongForApiContract> apiSongsByPvGetWithHttpInfo(PVService pvService, String pvId, SongOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/songs/byPv", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pvService", pvService));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pvId", pvId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SongForApiContract> returnType = new ParameterizedTypeReference<SongForApiContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param commentId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiSongsCommentsCommentIdDelete(Integer commentId) throws RestClientException {
        apiSongsCommentsCommentIdDeleteWithHttpInfo(commentId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param commentId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiSongsCommentsCommentIdDeleteWithHttpInfo(Integer commentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling apiSongsCommentsCommentIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("commentId", commentId);
        String path = apiClient.expandPath("/api/songs/comments/{commentId}", uriVariables);

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
    public void apiSongsCommentsCommentIdPost(Integer commentId, CommentForApiContract commentForApiContract) throws RestClientException {
        apiSongsCommentsCommentIdPostWithHttpInfo(commentId, commentForApiContract);
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
    public ResponseEntity<Void> apiSongsCommentsCommentIdPostWithHttpInfo(Integer commentId, CommentForApiContract commentForApiContract) throws RestClientException {
        Object postBody = commentForApiContract;
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling apiSongsCommentsCommentIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("commentId", commentId);
        String path = apiClient.expandPath("/api/songs/comments/{commentId}", uriVariables);

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
     * @param songTypes  (optional)
     * @param afterDate  (optional)
     * @param beforeDate  (optional)
     * @param tagName  (optional)
     * @param tagId  (optional)
     * @param childTags  (optional, default to false)
     * @param unifyTypesAndTags  (optional, default to false)
     * @param artistId  (optional)
     * @param artistParticipationStatus  (optional)
     * @param childVoicebanks  (optional, default to false)
     * @param includeMembers  (optional, default to false)
     * @param onlyWithPvs  (optional, default to false)
     * @param pvServices  (optional)
     * @param since  (optional)
     * @param minScore  (optional)
     * @param userCollectionId  (optional)
     * @param releaseEventId  (optional)
     * @param parentSongId  (optional)
     * @param status  (optional)
     * @param advancedFilters  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param preferAccurateMatches  (optional, default to false)
     * @param nameMatchMode  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @param minMilliBpm  (optional)
     * @param maxMilliBpm  (optional)
     * @param minLength  (optional)
     * @param maxLength  (optional)
     * @return SongForApiContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SongForApiContractPartialFindResult apiSongsGet(String query, String songTypes, LocalDateTime afterDate, LocalDateTime beforeDate, List<String> tagName, List<Integer> tagId, Boolean childTags, Boolean unifyTypesAndTags, List<Integer> artistId, ArtistAlbumParticipationStatus artistParticipationStatus, Boolean childVoicebanks, Boolean includeMembers, Boolean onlyWithPvs, PVServices pvServices, Integer since, Integer minScore, Integer userCollectionId, Integer releaseEventId, Integer parentSongId, EntryStatus status, List<AdvancedSearchFilterParams> advancedFilters, Integer start, Integer maxResults, Boolean getTotalCount, SongSortRule sort, Boolean preferAccurateMatches, NameMatchMode nameMatchMode, SongOptionalFields fields, ContentLanguagePreference lang, Integer minMilliBpm, Integer maxMilliBpm, Integer minLength, Integer maxLength) throws RestClientException {
        return apiSongsGetWithHttpInfo(query, songTypes, afterDate, beforeDate, tagName, tagId, childTags, unifyTypesAndTags, artistId, artistParticipationStatus, childVoicebanks, includeMembers, onlyWithPvs, pvServices, since, minScore, userCollectionId, releaseEventId, parentSongId, status, advancedFilters, start, maxResults, getTotalCount, sort, preferAccurateMatches, nameMatchMode, fields, lang, minMilliBpm, maxMilliBpm, minLength, maxLength).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query  (optional, default to )
     * @param songTypes  (optional)
     * @param afterDate  (optional)
     * @param beforeDate  (optional)
     * @param tagName  (optional)
     * @param tagId  (optional)
     * @param childTags  (optional, default to false)
     * @param unifyTypesAndTags  (optional, default to false)
     * @param artistId  (optional)
     * @param artistParticipationStatus  (optional)
     * @param childVoicebanks  (optional, default to false)
     * @param includeMembers  (optional, default to false)
     * @param onlyWithPvs  (optional, default to false)
     * @param pvServices  (optional)
     * @param since  (optional)
     * @param minScore  (optional)
     * @param userCollectionId  (optional)
     * @param releaseEventId  (optional)
     * @param parentSongId  (optional)
     * @param status  (optional)
     * @param advancedFilters  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param preferAccurateMatches  (optional, default to false)
     * @param nameMatchMode  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @param minMilliBpm  (optional)
     * @param maxMilliBpm  (optional)
     * @param minLength  (optional)
     * @param maxLength  (optional)
     * @return ResponseEntity&lt;SongForApiContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SongForApiContractPartialFindResult> apiSongsGetWithHttpInfo(String query, String songTypes, LocalDateTime afterDate, LocalDateTime beforeDate, List<String> tagName, List<Integer> tagId, Boolean childTags, Boolean unifyTypesAndTags, List<Integer> artistId, ArtistAlbumParticipationStatus artistParticipationStatus, Boolean childVoicebanks, Boolean includeMembers, Boolean onlyWithPvs, PVServices pvServices, Integer since, Integer minScore, Integer userCollectionId, Integer releaseEventId, Integer parentSongId, EntryStatus status, List<AdvancedSearchFilterParams> advancedFilters, Integer start, Integer maxResults, Boolean getTotalCount, SongSortRule sort, Boolean preferAccurateMatches, NameMatchMode nameMatchMode, SongOptionalFields fields, ContentLanguagePreference lang, Integer minMilliBpm, Integer maxMilliBpm, Integer minLength, Integer maxLength) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/songs", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "songTypes", songTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "afterDate", afterDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "beforeDate", beforeDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "tagName[]", tagName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "tagId[]", tagId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "childTags", childTags));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "unifyTypesAndTags", unifyTypesAndTags));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "artistId[]", artistId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "artistParticipationStatus", artistParticipationStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "childVoicebanks", childVoicebanks));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeMembers", includeMembers));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "onlyWithPvs", onlyWithPvs));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pvServices", pvServices));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "since", since));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "minScore", minScore));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userCollectionId", userCollectionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "releaseEventId", releaseEventId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentSongId", parentSongId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "advancedFilters", advancedFilters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "preferAccurateMatches", preferAccurateMatches));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "minMilliBpm", minMilliBpm));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxMilliBpm", maxMilliBpm));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "minLength", minLength));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxLength", maxLength));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SongForApiContractPartialFindResult> returnType = new ParameterizedTypeReference<SongForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param languagePreference  (optional)
     * @param fields  (optional)
     * @return List&lt;SongForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SongForApiContract> apiSongsHighlightedGet(ContentLanguagePreference languagePreference, SongOptionalFields fields) throws RestClientException {
        return apiSongsHighlightedGetWithHttpInfo(languagePreference, fields).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param languagePreference  (optional)
     * @param fields  (optional)
     * @return ResponseEntity&lt;List&lt;SongForApiContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SongForApiContract>> apiSongsHighlightedGetWithHttpInfo(ContentLanguagePreference languagePreference, SongOptionalFields fields) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/songs/highlighted", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<SongForApiContract>> returnType = new ParameterizedTypeReference<List<SongForApiContract>>() {};
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
    public List<CommentForApiContract> apiSongsIdCommentsGet(Integer id) throws RestClientException {
        return apiSongsIdCommentsGetWithHttpInfo(id).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @return ResponseEntity&lt;List&lt;CommentForApiContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CommentForApiContract>> apiSongsIdCommentsGetWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiSongsIdCommentsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/songs/{id}/comments", uriVariables);

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
    public CommentForApiContract apiSongsIdCommentsPost(Integer id, CommentForApiContract commentForApiContract) throws RestClientException {
        return apiSongsIdCommentsPostWithHttpInfo(id, commentForApiContract).getBody();
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
    public ResponseEntity<CommentForApiContract> apiSongsIdCommentsPostWithHttpInfo(Integer id, CommentForApiContract commentForApiContract) throws RestClientException {
        Object postBody = commentForApiContract;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiSongsIdCommentsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/songs/{id}/comments", uriVariables);

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
    public void apiSongsIdDelete(Integer id, String notes) throws RestClientException {
        apiSongsIdDeleteWithHttpInfo(id, notes);
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
    public ResponseEntity<Void> apiSongsIdDeleteWithHttpInfo(Integer id, String notes) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiSongsIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/songs/{id}", uriVariables);

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
     * @param lang  (optional)
     * @return List&lt;SongForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SongForApiContract> apiSongsIdDerivedGet(Integer id, SongOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        return apiSongsIdDerivedGetWithHttpInfo(id, fields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;List&lt;SongForApiContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SongForApiContract>> apiSongsIdDerivedGetWithHttpInfo(Integer id, SongOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiSongsIdDerivedGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/songs/{id}/derived", uriVariables);

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

        ParameterizedTypeReference<List<SongForApiContract>> returnType = new ParameterizedTypeReference<List<SongForApiContract>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return SongForApiContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SongForApiContract apiSongsIdGet(Integer id, SongOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        return apiSongsIdGetWithHttpInfo(id, fields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;SongForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SongForApiContract> apiSongsIdGetWithHttpInfo(Integer id, SongOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiSongsIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/songs/{id}", uriVariables);

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

        ParameterizedTypeReference<SongForApiContract> returnType = new ParameterizedTypeReference<SongForApiContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param userFields  (optional)
     * @param lang  (optional)
     * @return List&lt;RatedSongForUserForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<RatedSongForUserForApiContract> apiSongsIdRatingsGet(Integer id, UserOptionalFields userFields, ContentLanguagePreference lang) throws RestClientException {
        return apiSongsIdRatingsGetWithHttpInfo(id, userFields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param userFields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;List&lt;RatedSongForUserForApiContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<RatedSongForUserForApiContract>> apiSongsIdRatingsGetWithHttpInfo(Integer id, UserOptionalFields userFields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiSongsIdRatingsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/songs/{id}/ratings", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userFields", userFields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<RatedSongForUserForApiContract>> returnType = new ParameterizedTypeReference<List<RatedSongForUserForApiContract>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param songRatingContract  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiSongsIdRatingsPost(Integer id, SongRatingContract songRatingContract) throws RestClientException {
        apiSongsIdRatingsPostWithHttpInfo(id, songRatingContract);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param songRatingContract  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiSongsIdRatingsPostWithHttpInfo(Integer id, SongRatingContract songRatingContract) throws RestClientException {
        Object postBody = songRatingContract;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiSongsIdRatingsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/songs/{id}/ratings", uriVariables);

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
     * @param fields  (optional)
     * @param lang  (optional)
     * @return RelatedSongsContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RelatedSongsContract apiSongsIdRelatedGet(Integer id, SongOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        return apiSongsIdRelatedGetWithHttpInfo(id, fields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;RelatedSongsContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RelatedSongsContract> apiSongsIdRelatedGetWithHttpInfo(Integer id, SongOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiSongsIdRelatedGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/songs/{id}/related", uriVariables);

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

        ParameterizedTypeReference<RelatedSongsContract> returnType = new ParameterizedTypeReference<RelatedSongsContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param lyricsId  (required)
     * @return LyricsForSongContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LyricsForSongContract apiSongsLyricsLyricsIdGet(Integer lyricsId) throws RestClientException {
        return apiSongsLyricsLyricsIdGetWithHttpInfo(lyricsId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param lyricsId  (required)
     * @return ResponseEntity&lt;LyricsForSongContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LyricsForSongContract> apiSongsLyricsLyricsIdGetWithHttpInfo(Integer lyricsId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'lyricsId' is set
        if (lyricsId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lyricsId' when calling apiSongsLyricsLyricsIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("lyricsId", lyricsId);
        String path = apiClient.expandPath("/api/songs/lyrics/{lyricsId}", uriVariables);

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

        ParameterizedTypeReference<LyricsForSongContract> returnType = new ParameterizedTypeReference<LyricsForSongContract>() {};
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
    public List<String> apiSongsNamesGet(String query, NameMatchMode nameMatchMode, Integer maxResults) throws RestClientException {
        return apiSongsNamesGetWithHttpInfo(query, nameMatchMode, maxResults).getBody();
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
    public ResponseEntity<List<String>> apiSongsNamesGetWithHttpInfo(String query, NameMatchMode nameMatchMode, Integer maxResults) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/songs/names", Collections.<String, Object>emptyMap());

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
     * @param durationHours  (optional)
     * @param startDate  (optional)
     * @param filterBy  (optional)
     * @param vocalist  (optional)
     * @param maxResults  (optional, default to 25)
     * @param fields  (optional)
     * @param languagePreference  (optional)
     * @return List&lt;SongForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SongForApiContract> apiSongsTopRatedGet(Integer durationHours, LocalDateTime startDate, TopSongsDateFilterType filterBy, SongVocalistSelection vocalist, Integer maxResults, SongOptionalFields fields, ContentLanguagePreference languagePreference) throws RestClientException {
        return apiSongsTopRatedGetWithHttpInfo(durationHours, startDate, filterBy, vocalist, maxResults, fields, languagePreference).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param durationHours  (optional)
     * @param startDate  (optional)
     * @param filterBy  (optional)
     * @param vocalist  (optional)
     * @param maxResults  (optional, default to 25)
     * @param fields  (optional)
     * @param languagePreference  (optional)
     * @return ResponseEntity&lt;List&lt;SongForApiContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SongForApiContract>> apiSongsTopRatedGetWithHttpInfo(Integer durationHours, LocalDateTime startDate, TopSongsDateFilterType filterBy, SongVocalistSelection vocalist, Integer maxResults, SongOptionalFields fields, ContentLanguagePreference languagePreference) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/songs/top-rated", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "durationHours", durationHours));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filterBy", filterBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "vocalist", vocalist));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "languagePreference", languagePreference));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<SongForApiContract>> returnType = new ParameterizedTypeReference<List<SongForApiContract>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
