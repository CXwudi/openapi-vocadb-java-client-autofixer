package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.client.ApiClient;

import mikufan.cx.vocadbapiclient.model.ActivityEntryForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.ActivityEntryOptionalFields;
import mikufan.cx.vocadbapiclient.model.ActivityEntrySortRule;
import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
import mikufan.cx.vocadbapiclient.model.EntryEditEvent;
import mikufan.cx.vocadbapiclient.model.EntryOptionalFields;
import mikufan.cx.vocadbapiclient.model.EntryType;
import java.time.LocalDateTime;

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
@Component("mikufan.cx.vocadbapiclient.api.ActivityEntryApiApi")
public class ActivityEntryApiApi {
    private ApiClient apiClient;

    public ActivityEntryApiApi() {
        this(new ApiClient());
    }

    @Autowired
    public ActivityEntryApiApi(ApiClient apiClient) {
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
     * @param before  (optional)
     * @param since  (optional)
     * @param userId  (optional)
     * @param editEvent  (optional)
     * @param entryType  (optional)
     * @param maxResults  (optional, default to 50)
     * @param getTotalCount  (optional, default to false)
     * @param fields  (optional)
     * @param entryFields  (optional)
     * @param lang  (optional)
     * @param sortRule  (optional)
     * @return ActivityEntryForApiContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ActivityEntryForApiContractPartialFindResult apiActivityEntriesGet(LocalDateTime before, LocalDateTime since, Integer userId, EntryEditEvent editEvent, EntryType entryType, Integer maxResults, Boolean getTotalCount, ActivityEntryOptionalFields fields, EntryOptionalFields entryFields, ContentLanguagePreference lang, ActivityEntrySortRule sortRule) throws RestClientException {
        return apiActivityEntriesGetWithHttpInfo(before, since, userId, editEvent, entryType, maxResults, getTotalCount, fields, entryFields, lang, sortRule).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param before  (optional)
     * @param since  (optional)
     * @param userId  (optional)
     * @param editEvent  (optional)
     * @param entryType  (optional)
     * @param maxResults  (optional, default to 50)
     * @param getTotalCount  (optional, default to false)
     * @param fields  (optional)
     * @param entryFields  (optional)
     * @param lang  (optional)
     * @param sortRule  (optional)
     * @return ResponseEntity&lt;ActivityEntryForApiContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ActivityEntryForApiContractPartialFindResult> apiActivityEntriesGetWithHttpInfo(LocalDateTime before, LocalDateTime since, Integer userId, EntryEditEvent editEvent, EntryType entryType, Integer maxResults, Boolean getTotalCount, ActivityEntryOptionalFields fields, EntryOptionalFields entryFields, ContentLanguagePreference lang, ActivityEntrySortRule sortRule) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/activityEntries", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "since", since));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "editEvent", editEvent));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entryType", entryType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entryFields", entryFields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortRule", sortRule));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ActivityEntryForApiContractPartialFindResult> returnType = new ParameterizedTypeReference<ActivityEntryForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
