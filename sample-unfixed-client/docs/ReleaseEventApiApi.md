# ReleaseEventApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiReleaseEventsEventIdAlbumsGet**](ReleaseEventApiApi.md#apiReleaseEventsEventIdAlbumsGet) | **GET** /api/releaseEvents/{eventId}/albums | 
[**apiReleaseEventsEventIdPublishedSongsGet**](ReleaseEventApiApi.md#apiReleaseEventsEventIdPublishedSongsGet) | **GET** /api/releaseEvents/{eventId}/published-songs | 
[**apiReleaseEventsEventIdReportsPost**](ReleaseEventApiApi.md#apiReleaseEventsEventIdReportsPost) | **POST** /api/releaseEvents/{eventId}/reports | 
[**apiReleaseEventsGet**](ReleaseEventApiApi.md#apiReleaseEventsGet) | **GET** /api/releaseEvents | 
[**apiReleaseEventsIdDelete**](ReleaseEventApiApi.md#apiReleaseEventsIdDelete) | **DELETE** /api/releaseEvents/{id} | 
[**apiReleaseEventsIdGet**](ReleaseEventApiApi.md#apiReleaseEventsIdGet) | **GET** /api/releaseEvents/{id} | 
[**apiReleaseEventsNamesGet**](ReleaseEventApiApi.md#apiReleaseEventsNamesGet) | **GET** /api/releaseEvents/names | 



## apiReleaseEventsEventIdAlbumsGet

> List&lt;AlbumForApiContract&gt; apiReleaseEventsEventIdAlbumsGet(eventId, fields, lang)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.ReleaseEventApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ReleaseEventApiApi apiInstance = new ReleaseEventApiApi(defaultClient);
        Integer eventId = 56; // Integer | 
        AlbumOptionalFields fields = AlbumOptionalFields.fromValue("None"); // AlbumOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            List<AlbumForApiContract> result = apiInstance.apiReleaseEventsEventIdAlbumsGet(eventId, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReleaseEventApiApi#apiReleaseEventsEventIdAlbumsGet");
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
 **eventId** | **Integer**|  |
 **fields** | [**AlbumOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Artists, Description, Discs, Identifiers, MainPicture, Names, PVs, ReleaseEvent, Tags, Tracks, WebLinks]
 **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English]

### Return type

[**List&lt;AlbumForApiContract&gt;**](AlbumForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiReleaseEventsEventIdPublishedSongsGet

> List&lt;SongForApiContract&gt; apiReleaseEventsEventIdPublishedSongsGet(eventId, fields, lang)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.ReleaseEventApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ReleaseEventApiApi apiInstance = new ReleaseEventApiApi(defaultClient);
        Integer eventId = 56; // Integer | 
        SongOptionalFields fields = SongOptionalFields.fromValue("None"); // SongOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            List<SongForApiContract> result = apiInstance.apiReleaseEventsEventIdPublishedSongsGet(eventId, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReleaseEventApiApi#apiReleaseEventsEventIdPublishedSongsGet");
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
 **eventId** | **Integer**|  |
 **fields** | [**SongOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Albums, Artists, Lyrics, MainPicture, Names, PVs, ReleaseEvent, Tags, ThumbUrl, WebLinks, Bpm]
 **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English]

### Return type

[**List&lt;SongForApiContract&gt;**](SongForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiReleaseEventsEventIdReportsPost

> apiReleaseEventsEventIdReportsPost(eventId, reportType, notes, versionNumber)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.ReleaseEventApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ReleaseEventApiApi apiInstance = new ReleaseEventApiApi(defaultClient);
        Integer eventId = 56; // Integer | 
        EventReportType reportType = EventReportType.fromValue("InvalidInfo"); // EventReportType | 
        String notes = "notes_example"; // String | 
        Integer versionNumber = 56; // Integer | 
        try {
            apiInstance.apiReleaseEventsEventIdReportsPost(eventId, reportType, notes, versionNumber);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReleaseEventApiApi#apiReleaseEventsEventIdReportsPost");
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
 **eventId** | **Integer**|  |
 **reportType** | [**EventReportType**](.md)|  | [optional] [enum: InvalidInfo, Duplicate, Inappropriate, Other]
 **notes** | **String**|  | [optional]
 **versionNumber** | **Integer**|  | [optional]

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


## apiReleaseEventsGet

> ReleaseEventForApiContractPartialFindResult apiReleaseEventsGet(query, nameMatchMode, seriesId, afterDate, beforeDate, category, userCollectionId, tagId, childTags, artistId, childVoicebanks, includeMembers, status, start, maxResults, getTotalCount, sort, fields, lang)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.ReleaseEventApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ReleaseEventApiApi apiInstance = new ReleaseEventApiApi(defaultClient);
        String query = "\"\""; // String | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        Integer seriesId = 0; // Integer | 
        LocalDateTime afterDate = new LocalDateTime(); // LocalDateTime | 
        LocalDateTime beforeDate = new LocalDateTime(); // LocalDateTime | 
        EventCategory category = EventCategory.fromValue("Unspecified"); // EventCategory | 
        Integer userCollectionId = 56; // Integer | 
        List<Integer> tagId = Arrays.asList(); // List<Integer> | 
        Boolean childTags = false; // Boolean | 
        List<Integer> artistId = Arrays.asList(); // List<Integer> | 
        Boolean childVoicebanks = false; // Boolean | 
        Boolean includeMembers = false; // Boolean | 
        EntryStatus status = EntryStatus.fromValue("Draft"); // EntryStatus | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        EventSortRule sort = EventSortRule.fromValue("None"); // EventSortRule | 
        ReleaseEventOptionalFields fields = ReleaseEventOptionalFields.fromValue("None"); // ReleaseEventOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            ReleaseEventForApiContractPartialFindResult result = apiInstance.apiReleaseEventsGet(query, nameMatchMode, seriesId, afterDate, beforeDate, category, userCollectionId, tagId, childTags, artistId, childVoicebanks, includeMembers, status, start, maxResults, getTotalCount, sort, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReleaseEventApiApi#apiReleaseEventsGet");
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
 **query** | **String**|  | [optional] [default to &quot;&quot;]
 **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words]
 **seriesId** | **Integer**|  | [optional] [default to 0]
 **afterDate** | **LocalDateTime**|  | [optional]
 **beforeDate** | **LocalDateTime**|  | [optional]
 **category** | [**EventCategory**](.md)|  | [optional] [enum: Unspecified, AlbumRelease, Anniversary, Club, Concert, Contest, Convention, Other]
 **userCollectionId** | **Integer**|  | [optional]
 **tagId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]
 **childTags** | **Boolean**|  | [optional] [default to false]
 **artistId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]
 **childVoicebanks** | **Boolean**|  | [optional] [default to false]
 **includeMembers** | **Boolean**|  | [optional] [default to false]
 **status** | [**EntryStatus**](.md)|  | [optional] [enum: Draft, Finished, Approved, Locked]
 **start** | **Integer**|  | [optional] [default to 0]
 **maxResults** | **Integer**|  | [optional] [default to 10]
 **getTotalCount** | **Boolean**|  | [optional] [default to false]
 **sort** | [**EventSortRule**](.md)|  | [optional] [enum: None, Name, Date, AdditionDate, SeriesName, VenueName]
 **fields** | [**ReleaseEventOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Artists, Description, MainPicture, Names, Series, SongList, Tags, Venue, WebLinks]
 **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English]

### Return type

[**ReleaseEventForApiContractPartialFindResult**](ReleaseEventForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiReleaseEventsIdDelete

> apiReleaseEventsIdDelete(id, notes, hardDelete)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.ReleaseEventApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ReleaseEventApiApi apiInstance = new ReleaseEventApiApi(defaultClient);
        Integer id = 56; // Integer | 
        String notes = "\"\""; // String | 
        Boolean hardDelete = false; // Boolean | 
        try {
            apiInstance.apiReleaseEventsIdDelete(id, notes, hardDelete);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReleaseEventApiApi#apiReleaseEventsIdDelete");
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
 **id** | **Integer**|  |
 **notes** | **String**|  | [optional] [default to &quot;&quot;]
 **hardDelete** | **Boolean**|  | [optional] [default to false]

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


## apiReleaseEventsIdGet

> ReleaseEventForApiContract apiReleaseEventsIdGet(id, fields, lang)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.ReleaseEventApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ReleaseEventApiApi apiInstance = new ReleaseEventApiApi(defaultClient);
        Integer id = 56; // Integer | 
        ReleaseEventOptionalFields fields = ReleaseEventOptionalFields.fromValue("None"); // ReleaseEventOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            ReleaseEventForApiContract result = apiInstance.apiReleaseEventsIdGet(id, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReleaseEventApiApi#apiReleaseEventsIdGet");
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
 **id** | **Integer**|  |
 **fields** | [**ReleaseEventOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Artists, Description, MainPicture, Names, Series, SongList, Tags, Venue, WebLinks]
 **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English]

### Return type

[**ReleaseEventForApiContract**](ReleaseEventForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiReleaseEventsNamesGet

> List&lt;String&gt; apiReleaseEventsNamesGet(query, maxResults)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.ReleaseEventApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ReleaseEventApiApi apiInstance = new ReleaseEventApiApi(defaultClient);
        String query = "\"\""; // String | 
        Integer maxResults = 10; // Integer | 
        try {
            List<String> result = apiInstance.apiReleaseEventsNamesGet(query, maxResults);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReleaseEventApiApi#apiReleaseEventsNamesGet");
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
 **query** | **String**|  | [optional] [default to &quot;&quot;]
 **maxResults** | **Integer**|  | [optional] [default to 10]

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

