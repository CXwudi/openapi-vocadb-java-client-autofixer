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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-23T13:02:48.301797700-04:00[America/New_York]")
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
        Object postBody = null;
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling apiDiscussionsCommentsCommentIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("commentId", commentId);
        String path = apiClient.expandPath("/api/discussions/comments/{commentId}", uriVariables);

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
        Object postBody = commentForApiContract;
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling apiDiscussionsCommentsCommentIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("commentId", commentId);
        String path = apiClient.expandPath("/api/discussions/comments/{commentId}", uriVariables);

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
     * @param folderId  (required)
     * @param fields  (optional)
     * @return List&lt;DiscussionTopicContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
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
     */
    @Deprecated
    public ResponseEntity<List<DiscussionTopicContract>> apiDiscussionsFoldersFolderIdTopicsGetWithHttpInfo(Integer folderId, DiscussionTopicOptionalFields fields) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'folderId' when calling apiDiscussionsFoldersFolderIdTopicsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("folderId", folderId);
        String path = apiClient.expandPath("/api/discussions/folders/{folderId}/topics", uriVariables);

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

        ParameterizedTypeReference<List<DiscussionTopicContract>> returnType = new ParameterizedTypeReference<List<DiscussionTopicContract>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
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
        Object postBody = discussionTopicContract;
        
        // verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'folderId' when calling apiDiscussionsFoldersFolderIdTopicsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("folderId", folderId);
        String path = apiClient.expandPath("/api/discussions/folders/{folderId}/topics", uriVariables);

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

        ParameterizedTypeReference<DiscussionTopicContract> returnType = new ParameterizedTypeReference<DiscussionTopicContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
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
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/discussions/folders", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<DiscussionFolderContract>> returnType = new ParameterizedTypeReference<List<DiscussionFolderContract>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
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
        Object postBody = discussionFolderContract;
        
        String path = apiClient.expandPath("/api/discussions/folders", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<DiscussionFolderContract> returnType = new ParameterizedTypeReference<DiscussionFolderContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
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
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/discussions/topics", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "folderId", folderId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getTotalCount", getTotalCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<DiscussionTopicContractPartialFindResult> returnType = new ParameterizedTypeReference<DiscussionTopicContractPartialFindResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
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
        Object postBody = commentForApiContract;
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling apiDiscussionsTopicsTopicIdCommentsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("topicId", topicId);
        String path = apiClient.expandPath("/api/discussions/topics/{topicId}/comments", uriVariables);

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
        Object postBody = null;
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling apiDiscussionsTopicsTopicIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("topicId", topicId);
        String path = apiClient.expandPath("/api/discussions/topics/{topicId}", uriVariables);

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
        Object postBody = null;
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling apiDiscussionsTopicsTopicIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("topicId", topicId);
        String path = apiClient.expandPath("/api/discussions/topics/{topicId}", uriVariables);

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

        ParameterizedTypeReference<DiscussionTopicContract> returnType = new ParameterizedTypeReference<DiscussionTopicContract>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
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
        Object postBody = discussionTopicContract;
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling apiDiscussionsTopicsTopicIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("topicId", topicId);
        String path = apiClient.expandPath("/api/discussions/topics/{topicId}", uriVariables);

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
}
