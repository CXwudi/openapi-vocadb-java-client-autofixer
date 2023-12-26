package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.client.ApiClient;

import mikufan.cx.vocadbapiclient.model.CommentForApiContract;
import mikufan.cx.vocadbapiclient.model.CommentForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.CommentOptionalFields;
import mikufan.cx.vocadbapiclient.model.CommentSortRule;
import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-26T07:29:58.607748373Z[Etc/UTC]")
public class CommentApiApi {
    private ApiClient apiClient;

    public CommentApiApi() {
        this(new ApiClient());
    }

    public CommentApiApi(ApiClient apiClient) {
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
     * @param commentId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiCommentsEntryTypeCommentsCommentIdDelete(EntryType entryType, Integer commentId) throws RestClientException {
        apiCommentsEntryTypeCommentsCommentIdDeleteWithHttpInfo(entryType, commentId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param entryType  (required)
     * @param commentId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiCommentsEntryTypeCommentsCommentIdDeleteWithHttpInfo(EntryType entryType, Integer commentId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'entryType' is set
        if (entryType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entryType' when calling apiCommentsEntryTypeCommentsCommentIdDelete");
        }
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling apiCommentsEntryTypeCommentsCommentIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entryType", entryType);
        uriVariables.put("commentId", commentId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/comments/{entryType}-comments/{commentId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param entryType  (required)
     * @param commentId  (required)
     * @param commentForApiContract  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiCommentsEntryTypeCommentsCommentIdPost(EntryType entryType, Integer commentId, CommentForApiContract commentForApiContract) throws RestClientException {
        apiCommentsEntryTypeCommentsCommentIdPostWithHttpInfo(entryType, commentId, commentForApiContract);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param entryType  (required)
     * @param commentId  (required)
     * @param commentForApiContract  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiCommentsEntryTypeCommentsCommentIdPostWithHttpInfo(EntryType entryType, Integer commentId, CommentForApiContract commentForApiContract) throws RestClientException {
        Object localVarPostBody = commentForApiContract;
        
        // verify the required parameter 'entryType' is set
        if (entryType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entryType' when calling apiCommentsEntryTypeCommentsCommentIdPost");
        }
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling apiCommentsEntryTypeCommentsCommentIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entryType", entryType);
        uriVariables.put("commentId", commentId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/*+json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/comments/{entryType}-comments/{commentId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param entryType  (required)
     * @param entryId  (optional)
     * @return CommentForApiContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentForApiContractPartialFindResult apiCommentsEntryTypeCommentsGet(EntryType entryType, Integer entryId) throws RestClientException {
        return apiCommentsEntryTypeCommentsGetWithHttpInfo(entryType, entryId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param entryType  (required)
     * @param entryId  (optional)
     * @return ResponseEntity&lt;CommentForApiContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommentForApiContractPartialFindResult> apiCommentsEntryTypeCommentsGetWithHttpInfo(EntryType entryType, Integer entryId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'entryType' is set
        if (entryType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entryType' when calling apiCommentsEntryTypeCommentsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entryType", entryType);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "entryId", entryId));


        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CommentForApiContractPartialFindResult> localReturnType = new ParameterizedTypeReference<CommentForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI("/api/comments/{entryType}-comments", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param entryType  (required)
     * @param commentForApiContract  (optional)
     * @return CommentForApiContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentForApiContract apiCommentsEntryTypeCommentsPost(EntryType entryType, CommentForApiContract commentForApiContract) throws RestClientException {
        return apiCommentsEntryTypeCommentsPostWithHttpInfo(entryType, commentForApiContract).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param entryType  (required)
     * @param commentForApiContract  (optional)
     * @return ResponseEntity&lt;CommentForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommentForApiContract> apiCommentsEntryTypeCommentsPostWithHttpInfo(EntryType entryType, CommentForApiContract commentForApiContract) throws RestClientException {
        Object localVarPostBody = commentForApiContract;
        
        // verify the required parameter 'entryType' is set
        if (entryType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entryType' when calling apiCommentsEntryTypeCommentsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entryType", entryType);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/*+json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CommentForApiContract> localReturnType = new ParameterizedTypeReference<CommentForApiContract>() {};
        return apiClient.invokeAPI("/api/comments/{entryType}-comments", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param before  (optional)
     * @param since  (optional)
     * @param userId  (optional)
     * @param entryType  (optional)
     * @param maxResults  (optional, default to 50)
     * @param getTotalCount  (optional, default to false)
     * @param fields  (optional)
     * @param entryFields  (optional)
     * @param lang  (optional)
     * @param sortRule  (optional)
     * @return CommentForApiContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentForApiContractPartialFindResult apiCommentsGet(LocalDateTime before, LocalDateTime since, Integer userId, EntryType entryType, Integer maxResults, Boolean getTotalCount, CommentOptionalFields fields, EntryOptionalFields entryFields, ContentLanguagePreference lang, CommentSortRule sortRule) throws RestClientException {
        return apiCommentsGetWithHttpInfo(before, since, userId, entryType, maxResults, getTotalCount, fields, entryFields, lang, sortRule).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param before  (optional)
     * @param since  (optional)
     * @param userId  (optional)
     * @param entryType  (optional)
     * @param maxResults  (optional, default to 50)
     * @param getTotalCount  (optional, default to false)
     * @param fields  (optional)
     * @param entryFields  (optional)
     * @param lang  (optional)
     * @param sortRule  (optional)
     * @return ResponseEntity&lt;CommentForApiContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommentForApiContractPartialFindResult> apiCommentsGetWithHttpInfo(LocalDateTime before, LocalDateTime since, Integer userId, EntryType entryType, Integer maxResults, Boolean getTotalCount, CommentOptionalFields fields, EntryOptionalFields entryFields, ContentLanguagePreference lang, CommentSortRule sortRule) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "since", since));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
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

        ParameterizedTypeReference<CommentForApiContractPartialFindResult> localReturnType = new ParameterizedTypeReference<CommentForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI("/api/comments", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
