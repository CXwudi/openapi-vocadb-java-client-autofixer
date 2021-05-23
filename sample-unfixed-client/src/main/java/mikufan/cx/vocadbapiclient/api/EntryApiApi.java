package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.client.ApiClient;

import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
import mikufan.cx.vocadbapiclient.model.EntryForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.EntryOptionalFields;
import mikufan.cx.vocadbapiclient.model.EntrySortRule;
import mikufan.cx.vocadbapiclient.model.EntryStatus;
import mikufan.cx.vocadbapiclient.model.EntryTypes;
import mikufan.cx.vocadbapiclient.model.NameMatchMode;

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
@Component("mikufan.cx.vocadbapiclient.api.EntryApiApi")
public class EntryApiApi {
    private ApiClient apiClient;

    public EntryApiApi() {
        this(new ApiClient());
    }

    @Autowired
    public EntryApiApi(ApiClient apiClient) {
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
     * @param query  (optional, default to )
     * @param tagName  (optional)
     * @param tagId  (optional)
     * @param childTags  (optional, default to false)
     * @param entryTypes  (optional)
     * @param status  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param nameMatchMode  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return EntryForApiContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EntryForApiContractPartialFindResult apiEntriesGet(String query, List<String> tagName, List<Integer> tagId, Boolean childTags, EntryTypes entryTypes, EntryStatus status, Integer start, Integer maxResults, Boolean getTotalCount, EntrySortRule sort, NameMatchMode nameMatchMode, EntryOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        return apiEntriesGetWithHttpInfo(query, tagName, tagId, childTags, entryTypes, status, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query  (optional, default to )
     * @param tagName  (optional)
     * @param tagId  (optional)
     * @param childTags  (optional, default to false)
     * @param entryTypes  (optional)
     * @param status  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param nameMatchMode  (optional)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;EntryForApiContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EntryForApiContractPartialFindResult> apiEntriesGetWithHttpInfo(String query, List<String> tagName, List<Integer> tagId, Boolean childTags, EntryTypes entryTypes, EntryStatus status, Integer start, Integer maxResults, Boolean getTotalCount, EntrySortRule sort, NameMatchMode nameMatchMode, EntryOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/entries", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "tagName[]", tagName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "tagId[]", tagId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "childTags", childTags));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entryTypes", entryTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
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

        ParameterizedTypeReference<EntryForApiContractPartialFindResult> returnType = new ParameterizedTypeReference<EntryForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query  (optional, default to )
     * @param nameMatchMode  (optional)
     * @param maxResults  (optional, default to 10)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> apiEntriesNamesGet(String query, NameMatchMode nameMatchMode, Integer maxResults) throws RestClientException {
        return apiEntriesNamesGetWithHttpInfo(query, nameMatchMode, maxResults).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query  (optional, default to )
     * @param nameMatchMode  (optional)
     * @param maxResults  (optional, default to 10)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> apiEntriesNamesGetWithHttpInfo(String query, NameMatchMode nameMatchMode, Integer maxResults) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/entries/names", Collections.<String, Object>emptyMap());

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
}
