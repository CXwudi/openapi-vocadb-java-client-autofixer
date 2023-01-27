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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-27T01:04:32.642512Z[Etc/UTC]")
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
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "since", since));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "editEvent", editEvent));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "entryType", entryType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "entryFields", entryFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortRule", sortRule));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ActivityEntryForApiContractPartialFindResult> localReturnType = new ParameterizedTypeReference<ActivityEntryForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI("/api/activityEntries", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
