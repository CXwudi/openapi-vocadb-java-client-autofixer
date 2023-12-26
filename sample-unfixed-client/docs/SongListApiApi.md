# SongListApiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiSongListsCommentsCommentIdDelete**](SongListApiApi.md#apiSongListsCommentsCommentIdDelete) | **DELETE** /api/songLists/comments/{commentId} |  |
| [**apiSongListsCommentsCommentIdPost**](SongListApiApi.md#apiSongListsCommentsCommentIdPost) | **POST** /api/songLists/comments/{commentId} |  |
| [**apiSongListsFeaturedGet**](SongListApiApi.md#apiSongListsFeaturedGet) | **GET** /api/songLists/featured |  |
| [**apiSongListsFeaturedNamesGet**](SongListApiApi.md#apiSongListsFeaturedNamesGet) | **GET** /api/songLists/featured/names |  |
| [**apiSongListsIdDelete**](SongListApiApi.md#apiSongListsIdDelete) | **DELETE** /api/songLists/{id} |  |
| [**apiSongListsListIdCommentsGet**](SongListApiApi.md#apiSongListsListIdCommentsGet) | **GET** /api/songLists/{listId}/comments |  |
| [**apiSongListsListIdCommentsPost**](SongListApiApi.md#apiSongListsListIdCommentsPost) | **POST** /api/songLists/{listId}/comments |  |
| [**apiSongListsListIdSongsGet**](SongListApiApi.md#apiSongListsListIdSongsGet) | **GET** /api/songLists/{listId}/songs |  |
| [**apiSongListsPost**](SongListApiApi.md#apiSongListsPost) | **POST** /api/songLists |  |



## apiSongListsCommentsCommentIdDelete

> apiSongListsCommentsCommentIdDelete(commentId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongListApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongListApiApi apiInstance = new SongListApiApi(defaultClient);
        Integer commentId = 56; // Integer | 
        try {
            apiInstance.apiSongListsCommentsCommentIdDelete(commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongListApiApi#apiSongListsCommentsCommentIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **Integer**|  | |

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


## apiSongListsCommentsCommentIdPost

> apiSongListsCommentsCommentIdPost(commentId, commentForApiContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongListApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongListApiApi apiInstance = new SongListApiApi(defaultClient);
        Integer commentId = 56; // Integer | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            apiInstance.apiSongListsCommentsCommentIdPost(commentId, commentForApiContract);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongListApiApi#apiSongListsCommentsCommentIdPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **Integer**|  | |
| **commentForApiContract** | [**CommentForApiContract**](CommentForApiContract.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiSongListsFeaturedGet

> SongListForApiContractPartialFindResult apiSongListsFeaturedGet(query, tagId, childTags, nameMatchMode, featuredCategory, start, maxResults, getTotalCount, sort, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongListApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongListApiApi apiInstance = new SongListApiApi(defaultClient);
        String query = ""; // String | 
        List<Integer> tagId = Arrays.asList(); // List<Integer> | 
        Boolean childTags = false; // Boolean | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        SongListFeaturedCategory featuredCategory = SongListFeaturedCategory.fromValue("Nothing"); // SongListFeaturedCategory | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        SongListSortRule sort = SongListSortRule.fromValue("None"); // SongListSortRule | 
        SongListOptionalFields fields = SongListOptionalFields.fromValue("None"); // SongListOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            SongListForApiContractPartialFindResult result = apiInstance.apiSongListsFeaturedGet(query, tagId, childTags, nameMatchMode, featuredCategory, start, maxResults, getTotalCount, sort, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongListApiApi#apiSongListsFeaturedGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**|  | [optional] [default to ] |
| **tagId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **childTags** | **Boolean**|  | [optional] [default to false] |
| **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words] |
| **featuredCategory** | [**SongListFeaturedCategory**](.md)|  | [optional] [enum: Nothing, Concerts, VocaloidRanking, Pools, Other] |
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **getTotalCount** | **Boolean**|  | [optional] [default to false] |
| **sort** | [**SongListSortRule**](.md)|  | [optional] [enum: None, Name, Date, CreateDate] |
| **fields** | [**SongListOptionalFields**](.md)|  | [optional] [enum: None, Description, Events, MainPicture, Tags] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**SongListForApiContractPartialFindResult**](SongListForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiSongListsFeaturedNamesGet

> List&lt;String&gt; apiSongListsFeaturedNamesGet(query, nameMatchMode, featuredCategory, maxResults)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongListApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongListApiApi apiInstance = new SongListApiApi(defaultClient);
        String query = ""; // String | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        SongListFeaturedCategory featuredCategory = SongListFeaturedCategory.fromValue("Nothing"); // SongListFeaturedCategory | 
        Integer maxResults = 10; // Integer | 
        try {
            List<String> result = apiInstance.apiSongListsFeaturedNamesGet(query, nameMatchMode, featuredCategory, maxResults);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongListApiApi#apiSongListsFeaturedNamesGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**|  | [optional] [default to ] |
| **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words] |
| **featuredCategory** | [**SongListFeaturedCategory**](.md)|  | [optional] [enum: Nothing, Concerts, VocaloidRanking, Pools, Other] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiSongListsIdDelete

> apiSongListsIdDelete(id, notes, hardDelete)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongListApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongListApiApi apiInstance = new SongListApiApi(defaultClient);
        Integer id = 56; // Integer | 
        String notes = ""; // String | 
        Boolean hardDelete = false; // Boolean | 
        try {
            apiInstance.apiSongListsIdDelete(id, notes, hardDelete);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongListApiApi#apiSongListsIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **notes** | **String**|  | [optional] [default to ] |
| **hardDelete** | **Boolean**|  | [optional] [default to false] |

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


## apiSongListsListIdCommentsGet

> CommentForApiContractPartialFindResult apiSongListsListIdCommentsGet(listId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongListApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongListApiApi apiInstance = new SongListApiApi(defaultClient);
        Integer listId = 56; // Integer | 
        try {
            CommentForApiContractPartialFindResult result = apiInstance.apiSongListsListIdCommentsGet(listId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongListApiApi#apiSongListsListIdCommentsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **Integer**|  | |

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


## apiSongListsListIdCommentsPost

> CommentForApiContract apiSongListsListIdCommentsPost(listId, commentForApiContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongListApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongListApiApi apiInstance = new SongListApiApi(defaultClient);
        Integer listId = 56; // Integer | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            CommentForApiContract result = apiInstance.apiSongListsListIdCommentsPost(listId, commentForApiContract);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongListApiApi#apiSongListsListIdCommentsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **Integer**|  | |
| **commentForApiContract** | [**CommentForApiContract**](CommentForApiContract.md)|  | [optional] |

### Return type

[**CommentForApiContract**](CommentForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiSongListsListIdSongsGet

> SongInListForApiContractPartialFindResult apiSongListsListIdSongsGet(listId, query, songTypes, pvServices, tagId, artistId, childVoicebanks, advancedFilters, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongListApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongListApiApi apiInstance = new SongListApiApi(defaultClient);
        Integer listId = 56; // Integer | 
        String query = ""; // String | 
        String songTypes = "songTypes_example"; // String | 
        PVServices pvServices = PVServices.fromValue("Nothing"); // PVServices | 
        List<Integer> tagId = Arrays.asList(); // List<Integer> | 
        List<Integer> artistId = Arrays.asList(); // List<Integer> | 
        Boolean childVoicebanks = false; // Boolean | 
        List<AdvancedSearchFilterParams> advancedFilters = Arrays.asList(); // List<AdvancedSearchFilterParams> | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        SongSortRule sort = SongSortRule.fromValue("None"); // SongSortRule | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        SongOptionalFields fields = SongOptionalFields.fromValue("None"); // SongOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            SongInListForApiContractPartialFindResult result = apiInstance.apiSongListsListIdSongsGet(listId, query, songTypes, pvServices, tagId, artistId, childVoicebanks, advancedFilters, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongListApiApi#apiSongListsListIdSongsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **Integer**|  | |
| **query** | **String**|  | [optional] [default to ] |
| **songTypes** | **String**|  | [optional] |
| **pvServices** | [**PVServices**](.md)|  | [optional] [enum: Nothing, NicoNicoDouga, Youtube, SoundCloud, Vimeo, Piapro, Bilibili, File, LocalFile, Creofuga, Bandcamp] |
| **tagId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **artistId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **childVoicebanks** | **Boolean**|  | [optional] [default to false] |
| **advancedFilters** | [**List&lt;AdvancedSearchFilterParams&gt;**](AdvancedSearchFilterParams.md)|  | [optional] |
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **getTotalCount** | **Boolean**|  | [optional] [default to false] |
| **sort** | [**SongSortRule**](.md)|  | [optional] [enum: None, Name, AdditionDate, PublishDate, FavoritedTimes, RatingScore, TagUsageCount, SongType] |
| **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words] |
| **fields** | [**SongOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Albums, Artists, Lyrics, MainPicture, Names, PVs, ReleaseEvent, Tags, ThumbUrl, WebLinks, Bpm, CultureCodes] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**SongInListForApiContractPartialFindResult**](SongInListForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiSongListsPost

> Integer apiSongListsPost(songListForEditForApiContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongListApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongListApiApi apiInstance = new SongListApiApi(defaultClient);
        SongListForEditForApiContract songListForEditForApiContract = new SongListForEditForApiContract(); // SongListForEditForApiContract | 
        try {
            Integer result = apiInstance.apiSongListsPost(songListForEditForApiContract);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongListApiApi#apiSongListsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **songListForEditForApiContract** | [**SongListForEditForApiContract**](SongListForEditForApiContract.md)|  | [optional] |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

