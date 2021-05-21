package cx.mikufan.vocadbapiclient.api;

import cx.mikufan.vocadbapiclient.client.ApiClient;

import cx.mikufan.vocadbapiclient.model.EntryType;
import cx.mikufan.vocadbapiclient.model.TagForApiContract;
import cx.mikufan.vocadbapiclient.model.TagOptionalFields;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-20T13:35:02.772911500-04:00[America/New_York]")
@Component("cx.mikufan.vocadbapiclient.api.EntryTypesApiApi")
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
        Object postBody = null;
        
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
        String path = apiClient.expandPath("/api/entry-types/{entryType}/{subType}/tag", uriVariables);

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

        ParameterizedTypeReference<TagForApiContract> returnType = new ParameterizedTypeReference<TagForApiContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
