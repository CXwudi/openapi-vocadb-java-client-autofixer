package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.client.ApiClient;


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
@Component("mikufan.cx.vocadbapiclient.api.ResourcesApiApi")
public class ResourcesApiApi {
    private ApiClient apiClient;

    public ResourcesApiApi() {
        this(new ApiClient());
    }

    @Autowired
    public ResourcesApiApi(ApiClient apiClient) {
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
     * @param cultureCode  (required)
     * @param setNames  (optional)
     * @return Map&lt;String, Map&lt;String, String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Map<String, Map<String, String>> apiResourcesCultureCodeGet(String cultureCode, List<String> setNames) throws RestClientException {
        return apiResourcesCultureCodeGetWithHttpInfo(cultureCode, setNames).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param cultureCode  (required)
     * @param setNames  (optional)
     * @return ResponseEntity&lt;Map&lt;String, Map&lt;String, String&gt;&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Map<String, Map<String, String>>> apiResourcesCultureCodeGetWithHttpInfo(String cultureCode, List<String> setNames) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cultureCode' is set
        if (cultureCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cultureCode' when calling apiResourcesCultureCodeGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cultureCode", cultureCode);
        String path = apiClient.expandPath("/api/resources/{cultureCode}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "setNames[]", setNames));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Map<String, Map<String, String>>> returnType = new ParameterizedTypeReference<Map<String, Map<String, String>>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
