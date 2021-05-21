package cx.mikufan.vocadbapiclient.api;

import cx.mikufan.vocadbapiclient.client.ApiClient;

import cx.mikufan.vocadbapiclient.model.ContentLanguagePreference;
import cx.mikufan.vocadbapiclient.model.PVForSongContractPartialFindResult;
import cx.mikufan.vocadbapiclient.model.PVService;

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
@Component("cx.mikufan.vocadbapiclient.api.PvApiApi")
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
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/pvs/for-songs", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "author", author));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "service", service));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PVForSongContractPartialFindResult> returnType = new ParameterizedTypeReference<PVForSongContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
