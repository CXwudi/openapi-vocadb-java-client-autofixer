# CommentApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCommentsEntryTypeCommentsCommentIdDelete**](CommentApiApi.md#apiCommentsEntryTypeCommentsCommentIdDelete) | **DELETE** /api/comments/{entryType}-comments/{commentId} | 
[**apiCommentsEntryTypeCommentsCommentIdPost**](CommentApiApi.md#apiCommentsEntryTypeCommentsCommentIdPost) | **POST** /api/comments/{entryType}-comments/{commentId} | 
[**apiCommentsEntryTypeCommentsGet**](CommentApiApi.md#apiCommentsEntryTypeCommentsGet) | **GET** /api/comments/{entryType}-comments | 
[**apiCommentsEntryTypeCommentsPost**](CommentApiApi.md#apiCommentsEntryTypeCommentsPost) | **POST** /api/comments/{entryType}-comments | 
[**apiCommentsGet**](CommentApiApi.md#apiCommentsGet) | **GET** /api/comments | 



## apiCommentsEntryTypeCommentsCommentIdDelete

> apiCommentsEntryTypeCommentsCommentIdDelete(entryType, commentId)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.CommentApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CommentApiApi apiInstance = new CommentApiApi(defaultClient);
        EntryType entryType = EntryType.fromValue("Undefined"); // EntryType | 
        Integer commentId = 56; // Integer | 
        try {
            apiInstance.apiCommentsEntryTypeCommentsCommentIdDelete(entryType, commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentApiApi#apiCommentsEntryTypeCommentsCommentIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryType** | [**EntryType**](.md)|  | [enum: Undefined, Album, Artist, DiscussionTopic, PV, ReleaseEvent, ReleaseEventSeries, Song, SongList, Tag, User, Venue]
 **commentId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiCommentsEntryTypeCommentsCommentIdPost

> apiCommentsEntryTypeCommentsCommentIdPost(entryType, commentId, commentForApiContract)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.CommentApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CommentApiApi apiInstance = new CommentApiApi(defaultClient);
        EntryType entryType = EntryType.fromValue("Undefined"); // EntryType | 
        Integer commentId = 56; // Integer | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            apiInstance.apiCommentsEntryTypeCommentsCommentIdPost(entryType, commentId, commentForApiContract);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentApiApi#apiCommentsEntryTypeCommentsCommentIdPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryType** | [**EntryType**](.md)|  | [enum: Undefined, Album, Artist, DiscussionTopic, PV, ReleaseEvent, ReleaseEventSeries, Song, SongList, Tag, User, Venue]
 **commentId** | **Integer**|  |
 **commentForApiContract** | [**CommentForApiContract**](CommentForApiContract.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiCommentsEntryTypeCommentsGet

> CommentForApiContractPartialFindResult apiCommentsEntryTypeCommentsGet(entryType, entryId)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.CommentApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CommentApiApi apiInstance = new CommentApiApi(defaultClient);
        EntryType entryType = EntryType.fromValue("Undefined"); // EntryType | 
        Integer entryId = 56; // Integer | 
        try {
            CommentForApiContractPartialFindResult result = apiInstance.apiCommentsEntryTypeCommentsGet(entryType, entryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentApiApi#apiCommentsEntryTypeCommentsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryType** | [**EntryType**](.md)|  | [enum: Undefined, Album, Artist, DiscussionTopic, PV, ReleaseEvent, ReleaseEventSeries, Song, SongList, Tag, User, Venue]
 **entryId** | **Integer**|  | [optional]

### Return type

[**CommentForApiContractPartialFindResult**](CommentForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiCommentsEntryTypeCommentsPost

> CommentForApiContract apiCommentsEntryTypeCommentsPost(entryType, commentForApiContract)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.CommentApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CommentApiApi apiInstance = new CommentApiApi(defaultClient);
        EntryType entryType = EntryType.fromValue("Undefined"); // EntryType | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            CommentForApiContract result = apiInstance.apiCommentsEntryTypeCommentsPost(entryType, commentForApiContract);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentApiApi#apiCommentsEntryTypeCommentsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryType** | [**EntryType**](.md)|  | [enum: Undefined, Album, Artist, DiscussionTopic, PV, ReleaseEvent, ReleaseEventSeries, Song, SongList, Tag, User, Venue]
 **commentForApiContract** | [**CommentForApiContract**](CommentForApiContract.md)|  | [optional]

### Return type

[**CommentForApiContract**](CommentForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiCommentsGet

> CommentForApiContractPartialFindResult apiCommentsGet(before, since, userId, entryType, maxResults, getTotalCount, fields, entryFields, lang, sortRule)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.CommentApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CommentApiApi apiInstance = new CommentApiApi(defaultClient);
        LocalDateTime before = new LocalDateTime(); // LocalDateTime | 
        LocalDateTime since = new LocalDateTime(); // LocalDateTime | 
        Integer userId = 56; // Integer | 
        EntryType entryType = EntryType.fromValue("Undefined"); // EntryType | 
        Integer maxResults = 50; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        CommentOptionalFields fields = CommentOptionalFields.fromValue("None"); // CommentOptionalFields | 
        EntryOptionalFields entryFields = EntryOptionalFields.fromValue("None"); // EntryOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        CommentSortRule sortRule = CommentSortRule.fromValue("CreateDateDescending"); // CommentSortRule | 
        try {
            CommentForApiContractPartialFindResult result = apiInstance.apiCommentsGet(before, since, userId, entryType, maxResults, getTotalCount, fields, entryFields, lang, sortRule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentApiApi#apiCommentsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **before** | **LocalDateTime**|  | [optional]
 **since** | **LocalDateTime**|  | [optional]
 **userId** | **Integer**|  | [optional]
 **entryType** | [**EntryType**](.md)|  | [optional] [enum: Undefined, Album, Artist, DiscussionTopic, PV, ReleaseEvent, ReleaseEventSeries, Song, SongList, Tag, User, Venue]
 **maxResults** | **Integer**|  | [optional] [default to 50]
 **getTotalCount** | **Boolean**|  | [optional] [default to false]
 **fields** | [**CommentOptionalFields**](.md)|  | [optional] [enum: None, Entry]
 **entryFields** | [**EntryOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Description, MainPicture, Names, PVs, Tags, WebLinks]
 **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English]
 **sortRule** | [**CommentSortRule**](.md)|  | [optional] [enum: CreateDateDescending, CreateDate]

### Return type

[**CommentForApiContractPartialFindResult**](CommentForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

