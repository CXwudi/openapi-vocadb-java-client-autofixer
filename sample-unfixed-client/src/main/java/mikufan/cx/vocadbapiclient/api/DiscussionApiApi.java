package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.client.ApiClient;

import mikufan.cx.vocadbapiclient.model.CommentForApiContract;
import mikufan.cx.vocadbapiclient.model.DiscussionFolderContract;
import mikufan.cx.vocadbapiclient.model.DiscussionFolderOptionalFields;
import mikufan.cx.vocadbapiclient.model.DiscussionTopicContract;
import mikufan.cx.vocadbapiclient.model.DiscussionTopicContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.DiscussionTopicOptionalFields;
import mikufan.cx.vocadbapiclient.model.DiscussionTopicSortRule;

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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-26T19:00:44.138376Z[Etc/UTC]")
@Component("mikufan.cx.vocadbapiclient.api.DiscussionApiApi")
public class DiscussionApiApi {
    private ApiClient apiClient;

    public DiscussionApiApi() {
        this(new ApiClient());
    }

    @Autowired
    public DiscussionApiApi(ApiClient apiClient) {
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
     * @param commentId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiDiscussionsCommentsCommentIdDelete(Integer commentId) throws RestClientException {
        apiDiscussionsCommentsCommentIdDeleteWithHttpInfo(commentId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param commentId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiDiscussionsCommentsCommentIdDeleteWithHttpInfo(Integer commentId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling apiDiscussionsCommentsCommentIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
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
        return apiClient.invokeAPI("/api/discussions/comments/{commentId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param commentId  (required)
     * @param commentForApiContract  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiDiscussionsCommentsCommentIdPost(Integer commentId, CommentForApiContract commentForApiContract) throws RestClientException {
        apiDiscussionsCommentsCommentIdPostWithHttpInfo(commentId, commentForApiContract);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param commentId  (required)
     * @param commentForApiContract  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiDiscussionsCommentsCommentIdPostWithHttpInfo(Integer commentId, CommentForApiContract commentForApiContract) throws RestClientException {
        Object localVarPostBody = commentForApiContract;
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling apiDiscussionsCommentsCommentIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
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
        return apiClient.invokeAPI("/api/discussions/comments/{commentId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param folderId  (required)
     * @param fields  (optional)
     * @return List&lt;DiscussionTopicContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public List<DiscussionTopicContract> apiDiscussionsFoldersFolderIdTopicsGet(Integer folderId, DiscussionTopicOptionalFields fields) throws RestClientException {
        return apiDiscussionsFoldersFolderIdTopicsGetWithHttpInfo(folderId, fields).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param folderId  (required)
     * @param fields  (optional)
     * @return ResponseEntity&lt;List&lt;DiscussionTopicContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<List<DiscussionTopicContract>> apiDiscussionsFoldersFolderIdTopicsGetWithHttpInfo(Integer folderId, DiscussionTopicOptionalFields fields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'folderId' when calling apiDiscussionsFoldersFolderIdTopicsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("folderId", folderId);

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

        ParameterizedTypeReference<List<DiscussionTopicContract>> localReturnType = new ParameterizedTypeReference<List<DiscussionTopicContract>>() {};
        return apiClient.invokeAPI("/api/discussions/folders/{folderId}/topics", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param folderId  (required)
     * @param discussionTopicContract  (optional)
     * @return DiscussionTopicContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DiscussionTopicContract apiDiscussionsFoldersFolderIdTopicsPost(Integer folderId, DiscussionTopicContract discussionTopicContract) throws RestClientException {
        return apiDiscussionsFoldersFolderIdTopicsPostWithHttpInfo(folderId, discussionTopicContract).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param folderId  (required)
     * @param discussionTopicContract  (optional)
     * @return ResponseEntity&lt;DiscussionTopicContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DiscussionTopicContract> apiDiscussionsFoldersFolderIdTopicsPostWithHttpInfo(Integer folderId, DiscussionTopicContract discussionTopicContract) throws RestClientException {
        Object localVarPostBody = discussionTopicContract;
        
        // verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'folderId' when calling apiDiscussionsFoldersFolderIdTopicsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("folderId", folderId);

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

        ParameterizedTypeReference<DiscussionTopicContract> localReturnType = new ParameterizedTypeReference<DiscussionTopicContract>() {};
        return apiClient.invokeAPI("/api/discussions/folders/{folderId}/topics", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param fields  (optional)
     * @return List&lt;DiscussionFolderContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<DiscussionFolderContract> apiDiscussionsFoldersGet(DiscussionFolderOptionalFields fields) throws RestClientException {
        return apiDiscussionsFoldersGetWithHttpInfo(fields).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param fields  (optional)
     * @return ResponseEntity&lt;List&lt;DiscussionFolderContract&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<DiscussionFolderContract>> apiDiscussionsFoldersGetWithHttpInfo(DiscussionFolderOptionalFields fields) throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<List<DiscussionFolderContract>> localReturnType = new ParameterizedTypeReference<List<DiscussionFolderContract>>() {};
        return apiClient.invokeAPI("/api/discussions/folders", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param discussionFolderContract  (optional)
     * @return DiscussionFolderContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DiscussionFolderContract apiDiscussionsFoldersPost(DiscussionFolderContract discussionFolderContract) throws RestClientException {
        return apiDiscussionsFoldersPostWithHttpInfo(discussionFolderContract).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param discussionFolderContract  (optional)
     * @return ResponseEntity&lt;DiscussionFolderContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DiscussionFolderContract> apiDiscussionsFoldersPostWithHttpInfo(DiscussionFolderContract discussionFolderContract) throws RestClientException {
        Object localVarPostBody = discussionFolderContract;
        

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

        ParameterizedTypeReference<DiscussionFolderContract> localReturnType = new ParameterizedTypeReference<DiscussionFolderContract>() {};
        return apiClient.invokeAPI("/api/discussions/folders", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param folderId  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param fields  (optional)
     * @return DiscussionTopicContractPartialFindResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DiscussionTopicContractPartialFindResult apiDiscussionsTopicsGet(Integer folderId, Integer start, Integer maxResults, Boolean getTotalCount, DiscussionTopicSortRule sort, DiscussionTopicOptionalFields fields) throws RestClientException {
        return apiDiscussionsTopicsGetWithHttpInfo(folderId, start, maxResults, getTotalCount, sort, fields).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param folderId  (optional)
     * @param start  (optional, default to 0)
     * @param maxResults  (optional, default to 10)
     * @param getTotalCount  (optional, default to false)
     * @param sort  (optional)
     * @param fields  (optional)
     * @return ResponseEntity&lt;DiscussionTopicContractPartialFindResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DiscussionTopicContractPartialFindResult> apiDiscussionsTopicsGetWithHttpInfo(Integer folderId, Integer start, Integer maxResults, Boolean getTotalCount, DiscussionTopicSortRule sort, DiscussionTopicOptionalFields fields) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "folderId", folderId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<DiscussionTopicContractPartialFindResult> localReturnType = new ParameterizedTypeReference<DiscussionTopicContractPartialFindResult>() {};
        return apiClient.invokeAPI("/api/discussions/topics", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param topicId  (required)
     * @param commentForApiContract  (optional)
     * @return CommentForApiContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentForApiContract apiDiscussionsTopicsTopicIdCommentsPost(Integer topicId, CommentForApiContract commentForApiContract) throws RestClientException {
        return apiDiscussionsTopicsTopicIdCommentsPostWithHttpInfo(topicId, commentForApiContract).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param topicId  (required)
     * @param commentForApiContract  (optional)
     * @return ResponseEntity&lt;CommentForApiContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommentForApiContract> apiDiscussionsTopicsTopicIdCommentsPostWithHttpInfo(Integer topicId, CommentForApiContract commentForApiContract) throws RestClientException {
        Object localVarPostBody = commentForApiContract;
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling apiDiscussionsTopicsTopicIdCommentsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("topicId", topicId);

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
        return apiClient.invokeAPI("/api/discussions/topics/{topicId}/comments", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param topicId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiDiscussionsTopicsTopicIdDelete(Integer topicId) throws RestClientException {
        apiDiscussionsTopicsTopicIdDeleteWithHttpInfo(topicId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param topicId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiDiscussionsTopicsTopicIdDeleteWithHttpInfo(Integer topicId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling apiDiscussionsTopicsTopicIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("topicId", topicId);

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
        return apiClient.invokeAPI("/api/discussions/topics/{topicId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param topicId  (required)
     * @param fields  (optional)
     * @return DiscussionTopicContract
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DiscussionTopicContract apiDiscussionsTopicsTopicIdGet(Integer topicId, DiscussionTopicOptionalFields fields) throws RestClientException {
        return apiDiscussionsTopicsTopicIdGetWithHttpInfo(topicId, fields).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param topicId  (required)
     * @param fields  (optional)
     * @return ResponseEntity&lt;DiscussionTopicContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DiscussionTopicContract> apiDiscussionsTopicsTopicIdGetWithHttpInfo(Integer topicId, DiscussionTopicOptionalFields fields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling apiDiscussionsTopicsTopicIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("topicId", topicId);

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

        ParameterizedTypeReference<DiscussionTopicContract> localReturnType = new ParameterizedTypeReference<DiscussionTopicContract>() {};
        return apiClient.invokeAPI("/api/discussions/topics/{topicId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param topicId  (required)
     * @param discussionTopicContract  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiDiscussionsTopicsTopicIdPost(Integer topicId, DiscussionTopicContract discussionTopicContract) throws RestClientException {
        apiDiscussionsTopicsTopicIdPostWithHttpInfo(topicId, discussionTopicContract);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param topicId  (required)
     * @param discussionTopicContract  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiDiscussionsTopicsTopicIdPostWithHttpInfo(Integer topicId, DiscussionTopicContract discussionTopicContract) throws RestClientException {
        Object localVarPostBody = discussionTopicContract;
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling apiDiscussionsTopicsTopicIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("topicId", topicId);

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
        return apiClient.invokeAPI("/api/discussions/topics/{topicId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
