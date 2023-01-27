package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.client.ApiClient;

import mikufan.cx.vocadbapiclient.model.EntryType;
import mikufan.cx.vocadbapiclient.model.TagForApiContract;
import mikufan.cx.vocadbapiclient.model.TagOptionalFields;

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
@Component("mikufan.cx.vocadbapiclient.api.EntryTypesApiApi")
public class EntryTypesApiApi {
    private ApiClient apiClient;

    public EntryTypesApiApi() {
        this(new ApiClient());
    }

    @Autowired
    public EntryTypesApiApi(ApiClient apiClient) {
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
     * @param entryType  (required)
     * @param subType  (required)
     * @param fields  (optional)
     * @return TagForApiContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TagForApiContract apiEntryTypesEntryTypeSubTypeTagGet(EntryType entryType, String subType, TagOptionalFields fields) throws RestClientException {
        return apiEntryTypesEntryTypeSubTypeTagGetWithHttpInfo(entryType, subType, fields).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param entryType  (required)
     * @param subType  (required)
     * @param fields  (optional)
     * @return ResponseEntity&lt;TagForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TagForApiContract> apiEntryTypesEntryTypeSubTypeTagGetWithHttpInfo(EntryType entryType, String subType, TagOptionalFields fields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'entryType' is set
        if (entryType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entryType' when calling apiEntryTypesEntryTypeSubTypeTagGet");
        }
        
        // verify the required parameter 'subType' is set
        if (subType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subType' when calling apiEntryTypesEntryTypeSubTypeTagGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entryType", entryType);
        uriVariables.put("subType", subType);

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

        ParameterizedTypeReference<TagForApiContract> localReturnType = new ParameterizedTypeReference<TagForApiContract>() {};
        return apiClient.invokeAPI("/api/entry-types/{entryType}/{subType}/tag", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
