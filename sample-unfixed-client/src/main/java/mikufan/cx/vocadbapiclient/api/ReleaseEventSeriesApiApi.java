package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.client.ApiClient;

import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
import mikufan.cx.vocadbapiclient.model.NameMatchMode;
import mikufan.cx.vocadbapiclient.model.ReleaseEventSeriesForApiContract;
import mikufan.cx.vocadbapiclient.model.ReleaseEventSeriesForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.ReleaseEventSeriesOptionalFields;

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
@Component("mikufan.cx.vocadbapiclient.api.ReleaseEventSeriesApiApi")
public class ReleaseEventSeriesApiApi {
    private ApiClient apiClient;

    public ReleaseEventSeriesApiApi() {
        this(new ApiClient());
    }

    @Autowired
    public ReleaseEventSeriesApiApi(ApiClient apiClient) {
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
     * @param fields  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param nameMatchMode  (optional)
     * @param lang  (optional)
     * @return ReleaseEventSeriesForApiContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleaseEventSeriesForApiContractPartialFindResult apiReleaseEventSeriesGet(String query, ReleaseEventSeriesOptionalFields fields, Integer start, Integer maxResults, Boolean getTotalCount, NameMatchMode nameMatchMode, ContentLanguagePreference lang) throws RestClientException {
        return apiReleaseEventSeriesGetWithHttpInfo(query, fields, start, maxResults, getTotalCount, nameMatchMode, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query  (optional, default to )
     * @param fields  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param nameMatchMode  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;ReleaseEventSeriesForApiContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReleaseEventSeriesForApiContractPartialFindResult> apiReleaseEventSeriesGetWithHttpInfo(String query, ReleaseEventSeriesOptionalFields fields, Integer start, Integer maxResults, Boolean getTotalCount, NameMatchMode nameMatchMode, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/releaseEventSeries", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchMode", nameMatchMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ReleaseEventSeriesForApiContractPartialFindResult> returnType = new ParameterizedTypeReference<ReleaseEventSeriesForApiContractPartialFindResult>() {};
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
    public void apiReleaseEventSeriesIdDelete(Integer id, String notes, Boolean hardDelete) throws RestClientException {
        apiReleaseEventSeriesIdDeleteWithHttpInfo(id, notes, hardDelete);
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
    public ResponseEntity<Void> apiReleaseEventSeriesIdDeleteWithHttpInfo(Integer id, String notes, Boolean hardDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiReleaseEventSeriesIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/releaseEventSeries/{id}", uriVariables);

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
     * @return ReleaseEventSeriesForApiContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleaseEventSeriesForApiContract apiReleaseEventSeriesIdGet(Integer id, ReleaseEventSeriesOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        return apiReleaseEventSeriesIdGetWithHttpInfo(id, fields, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param id  (required)
     * @param fields  (optional)
     * @param lang  (optional)
     * @return ResponseEntity&lt;ReleaseEventSeriesForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReleaseEventSeriesForApiContract> apiReleaseEventSeriesIdGetWithHttpInfo(Integer id, ReleaseEventSeriesOptionalFields fields, ContentLanguagePreference lang) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiReleaseEventSeriesIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/releaseEventSeries/{id}", uriVariables);

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

        ParameterizedTypeReference<ReleaseEventSeriesForApiContract> returnType = new ParameterizedTypeReference<ReleaseEventSeriesForApiContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
