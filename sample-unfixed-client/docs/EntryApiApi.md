# EntryApiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiEntriesGet**](EntryApiApi.md#apiEntriesGet) | **GET** /api/entries |  |
| [**apiEntriesNamesGet**](EntryApiApi.md#apiEntriesNamesGet) | **GET** /api/entries/names |  |



## apiEntriesGet

> EntryForApiContractPartialFindResult apiEntriesGet(query, tagName, tagId, childTags, entryTypes, status, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.EntryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        EntryApiApi apiInstance = new EntryApiApi(defaultClient);
        String query = ""; // String | 
        List<String> tagName = Arrays.asList(); // List<String> | 
        List<Integer> tagId = Arrays.asList(); // List<Integer> | 
        Boolean childTags = false; // Boolean | 
        EntryTypes entryTypes = EntryTypes.fromValue("Nothing"); // EntryTypes | 
        EntryStatus status = EntryStatus.fromValue("Draft"); // EntryStatus | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        EntrySortRule sort = EntrySortRule.fromValue("None"); // EntrySortRule | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        EntryOptionalFields fields = EntryOptionalFields.fromValue("None"); // EntryOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            EntryForApiContractPartialFindResult result = apiInstance.apiEntriesGet(query, tagName, tagId, childTags, entryTypes, status, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EntryApiApi#apiEntriesGet");
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
| **tagName** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tagId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **childTags** | **Boolean**|  | [optional] [default to false] |
| **entryTypes** | [**EntryTypes**](.md)|  | [optional] [enum: Nothing, Album, Artist, DiscussionTopic, PV, ReleaseEvent, ReleaseEventSeries, Song, SongList, Tag, User, Venue] |
| **status** | [**EntryStatus**](.md)|  | [optional] [enum: Draft, Finished, Approved, Locked] |
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **getTotalCount** | **Boolean**|  | [optional] [default to false] |
| **sort** | [**EntrySortRule**](.md)|  | [optional] [enum: None, Name, AdditionDate, ActivityDate] |
| **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words] |
| **fields** | [**EntryOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Description, MainPicture, Names, PVs, Tags, WebLinks] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**EntryForApiContractPartialFindResult**](EntryForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiEntriesNamesGet

> List&lt;String&gt; apiEntriesNamesGet(query, nameMatchMode, maxResults)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.EntryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        EntryApiApi apiInstance = new EntryApiApi(defaultClient);
        String query = ""; // String | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        Integer maxResults = 10; // Integer | 
        try {
            List<String> result = apiInstance.apiEntriesNamesGet(query, nameMatchMode, maxResults);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EntryApiApi#apiEntriesNamesGet");
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

