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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-23T13:02:48.301797700-04:00[America/New_York]")
@Component("mikufan.cx.vocadbapiclient.api.CommentApiApi")
public class CommentApiApi {
    private ApiClient apiClient;

    public CommentApiApi() {
        this(new ApiClient());
    }

    @Autowired
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
        Object postBody = null;
        
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
        String path = apiClient.expandPath("/api/comments/{entryType}-comments/{commentId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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
        Object postBody = commentForApiContract;
        
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
        String path = apiClient.expandPath("/api/comments/{entryType}-comments/{commentId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
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
        Object postBody = null;
        
        // verify the required parameter 'entryType' is set
        if (entryType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entryType' when calling apiCommentsEntryTypeCommentsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entryType", entryType);
        String path = apiClient.expandPath("/api/comments/{entryType}-comments", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entryId", entryId));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CommentForApiContractPartialFindResult> returnType = new ParameterizedTypeReference<CommentForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
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
        Object postBody = commentForApiContract;
        
        // verify the required parameter 'entryType' is set
        if (entryType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entryType' when calling apiCommentsEntryTypeCommentsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entryType", entryType);
        String path = apiClient.expandPath("/api/comments/{entryType}-comments", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CommentForApiContract> returnType = new ParameterizedTypeReference<CommentForApiContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
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
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/comments", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "since", since));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
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

        ParameterizedTypeReference<CommentForApiContractPartialFindResult> returnType = new ParameterizedTypeReference<CommentForApiContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
