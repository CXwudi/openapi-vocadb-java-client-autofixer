package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.client.ApiClient;

import mikufan.cx.vocadbapiclient.model.AlbumForApiContract;
import mikufan.cx.vocadbapiclient.model.AlbumOptionalFields;
import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
import mikufan.cx.vocadbapiclient.model.EntryStatus;
import mikufan.cx.vocadbapiclient.model.EventCategory;
import mikufan.cx.vocadbapiclient.model.EventReportType;
import mikufan.cx.vocadbapiclient.model.EventSortRule;
import java.time.LocalDateTime;
import mikufan.cx.vocadbapiclient.model.NameMatchMode;
import mikufan.cx.vocadbapiclient.model.ReleaseEventForApiContract;
import mikufan.cx.vocadbapiclient.model.ReleaseEventForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.ReleaseEventOptionalFields;
import mikufan.cx.vocadbapiclient.model.SongForApiContract;
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
@Component("mikufan.cx.vocadbapiclient.api.ReleaseEventApiApi")
public class ReleaseEventApiApi {
    private ApiClient apiClient;

    public ReleaseEventApiApi() {
        this(new ApiClient());
    }

    @Autowired
    public ReleaseEventApiApi(ApiClient apiClient) {
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
     * @param eventId  (required)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return List&lt;AlbumForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AlbumForApiContract> apiReleaseEventsEventIdAlbumsGet(Integer eventId, AlbumOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        return apiReleaseEventsEventIdAlbumsGetWithHttpInfo(eventId, fields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param eventId  (required)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;List&lt;AlbumForApiContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AlbumForApiContract>> apiReleaseEventsEventIdAlbumsGetWithHttpInfo(Integer eventId, AlbumOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventId' when calling apiReleaseEventsEventIdAlbumsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("eventId", eventId);
        String path = apiClient.expandPath("/api/releaseEvents/{eventId}/albums", uriVariables);

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

        ParameterizedTypeReference<List<AlbumForApiContract>> returnType = new ParameterizedTypeReference<List<AlbumForApiContract>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param eventId  (required)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return List&lt;SongForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SongForApiContract> apiReleaseEventsEventIdPublishedSongsGet(Integer eventId, SongOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        return apiReleaseEventsEventIdPublishedSongsGetWithHttpInfo(eventId, fields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param eventId  (required)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;List&lt;SongForApiContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SongForApiContract>> apiReleaseEventsEventIdPublishedSongsGetWithHttpInfo(Integer eventId, SongOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventId' when calling apiReleaseEventsEventIdPublishedSongsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("eventId", eventId);
        String path = apiClient.expandPath("/api/releaseEvents/{eventId}/published-songs", uriVariables);

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
     * @param eventId  (required)
     * @param reportType  (optional)
     * @param notes  (optional)
     * @param versionNumber  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiReleaseEventsEventIdReportsPost(Integer eventId, EventReportType reportType, String notes, Integer versionNumber) throws RestClientException {
        apiReleaseEventsEventIdReportsPostWithHttpInfo(eventId, reportType, notes, versionNumber);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param eventId  (required)
     * @param reportType  (optional)
     * @param notes  (optional)
     * @param versionNumber  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiReleaseEventsEventIdReportsPostWithHttpInfo(Integer eventId, EventReportType reportType, String notes, Integer versionNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventId' when calling apiReleaseEventsEventIdReportsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("eventId", eventId);
        String path = apiClient.expandPath("/api/releaseEvents/{eventId}/reports", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "reportType", reportType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "notes", notes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "versionNumber", versionNumber));

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
     * @param query  (optional, default to )
     * @param nameMatchMode  (optional)
     * @param seriesId  (optional, default to 0)
     * @param afterDate  (optional)
     * @param beforeDate  (optional)
     * @param category  (optional)
     * @param userCollectionId  (optional)
     * @param tagId  (optional)
     * @param childTags  (optional, default to false)
     * @param artistId  (optional)
     * @param childVoicebanks  (optional, default to false)
     * @param includeMembers  (optional, default to false)
     * @param status  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ReleaseEventForApiContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleaseEventForApiContractPartialFindResult apiReleaseEventsGet(String query, NameMatchMode nameMatchMode, Integer seriesId, LocalDateTime afterDate, LocalDateTime beforeDate, EventCategory category, Integer userCollectionId, List<Integer> tagId, Boolean childTags, List<Integer> artistId, Boolean childVoicebanks, Boolean includeMembers, EntryStatus status, Integer start, Integer maxResults, Boolean getTotalCount, EventSortRule sort, ReleaseEventOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        return apiReleaseEventsGetWithHttpInfo(query, nameMatchMode, seriesId, afterDate, beforeDate, category, userCollectionId, tagId, childTags, artistId, childVoicebanks, includeMembers, status, start, maxResults, getTotalCount, sort, fields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query  (optional, default to )
     * @param nameMatchMode  (optional)
     * @param seriesId  (optional, default to 0)
     * @param afterDate  (optional)
     * @param beforeDate  (optional)
     * @param category  (optional)
     * @param userCollectionId  (optional)
     * @param tagId  (optional)
     * @param childTags  (optional, default to false)
     * @param artistId  (optional)
     * @param childVoicebanks  (optional, default to false)
     * @param includeMembers  (optional, default to false)
     * @param status  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;ReleaseEventForApiContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReleaseEventForApiContractPartialFindResult> apiReleaseEventsGetWithHttpInfo(String query, NameMatchMode nameMatchMode, Integer seriesId, LocalDateTime afterDate, LocalDateTime beforeDate, EventCategory category, Integer userCollectionId, List<Integer> tagId, Boolean childTags, List<Integer> artistId, Boolean childVoicebanks, Boolean includeMembers, EntryStatus status, Integer start, Integer maxResults, Boolean getTotalCount, EventSortRule sort, ReleaseEventOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/releaseEvents", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "seriesId", seriesId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "afterDate", afterDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "beforeDate", beforeDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "category", category));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userCollectionId", userCollectionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "tagId[]", tagId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "childTags", childTags));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "artistId[]", artistId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "childVoicebanks", childVoicebanks));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeMembers", includeMembers));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ReleaseEventForApiContractPartialFindResult> returnType = new ParameterizedTypeReference<ReleaseEventForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param notes  (optional, default to )
     * @param hardDelete  (optional, default to false)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiReleaseEventsIdDelete(Integer id, String notes, Boolean hardDelete) throws RestClientException {
        apiReleaseEventsIdDeleteWithHttpInfo(id, notes, hardDelete);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param notes  (optional, default to )
     * @param hardDelete  (optional, default to false)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiReleaseEventsIdDeleteWithHttpInfo(Integer id, String notes, Boolean hardDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiReleaseEventsIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/releaseEvents/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "notes", notes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "hardDelete", hardDelete));

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
     * @return ReleaseEventForApiContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleaseEventForApiContract apiReleaseEventsIdGet(Integer id, ReleaseEventOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        return apiReleaseEventsIdGetWithHttpInfo(id, fields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;ReleaseEventForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReleaseEventForApiContract> apiReleaseEventsIdGetWithHttpInfo(Integer id, ReleaseEventOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiReleaseEventsIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/releaseEvents/{id}", uriVariables);

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

        ParameterizedTypeReference<ReleaseEventForApiContract> returnType = new ParameterizedTypeReference<ReleaseEventForApiContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query  (optional, default to )
     * @param maxResults  (optional, default to 10)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> apiReleaseEventsNamesGet(String query, Integer maxResults) throws RestClientException {
        return apiReleaseEventsNamesGetWithHttpInfo(query, maxResults).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query  (optional, default to )
     * @param maxResults  (optional, default to 10)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> apiReleaseEventsNamesGetWithHttpInfo(String query, Integer maxResults) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/releaseEvents/names", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
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
}
