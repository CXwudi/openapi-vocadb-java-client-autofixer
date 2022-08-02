package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.client.ApiClient;

import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
import mikufan.cx.vocadbapiclient.model.PVForSongContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.PVService;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-02T18:31:43.684348Z[Etc/UTC]")
@Component("mikufan.cx.vocadbapiclient.api.PvApiApi")
public class PvApiApi {
    private ApiClient apiClient;

    public PvApiApi() {
        this(new ApiClient());
    }

    @Autowired
    public PvApiApi(ApiClient apiClient) {
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
     * @param name  (optional)
     * @param author  (optional)
     * @param service  (optional)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param lang  (optional)
     * @return PVForSongContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PVForSongContractPartialFindResult apiPvsForSongsGet(String name, String author, PVService service, Integer maxResults, Boolean getTotalCount, ContentLanguagePreference lang) throws RestClientException {
        return apiPvsForSongsGetWithHttpInfo(name, author, service, maxResults, getTotalCount, lang).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param name  (optional)
     * @param author  (optional)
     * @param service  (optional)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param lang  (optional)
     * @return ResponseEntity&lt;PVForSongContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PVForSongContractPartialFindResult> apiPvsForSongsGetWithHttpInfo(String name, String author, PVService service, Integer maxResults, Boolean getTotalCount, ContentLanguagePreference lang) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "author", author));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "service", service));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PVForSongContractPartialFindResult> localReturnType = new ParameterizedTypeReference<PVForSongContractPartialFindResult>() {};
        return apiClient.invokeAPI("/api/pvs/for-songs", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
