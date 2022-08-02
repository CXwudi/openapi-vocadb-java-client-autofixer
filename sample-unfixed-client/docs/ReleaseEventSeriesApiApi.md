# ReleaseEventSeriesApiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiReleaseEventSeriesGet**](ReleaseEventSeriesApiApi.md#apiReleaseEventSeriesGet) | **GET** /api/releaseEventSeries |  |
| [**apiReleaseEventSeriesIdDelete**](ReleaseEventSeriesApiApi.md#apiReleaseEventSeriesIdDelete) | **DELETE** /api/releaseEventSeries/{id} |  |
| [**apiReleaseEventSeriesIdForEditGet**](ReleaseEventSeriesApiApi.md#apiReleaseEventSeriesIdForEditGet) | **GET** /api/releaseEventSeries/{id}/for-edit |  |
| [**apiReleaseEventSeriesIdGet**](ReleaseEventSeriesApiApi.md#apiReleaseEventSeriesIdGet) | **GET** /api/releaseEventSeries/{id} |  |



## apiReleaseEventSeriesGet

> ReleaseEventSeriesForApiContractPartialFindResult apiReleaseEventSeriesGet(query, fields, start, maxResults, getTotalCount, nameMatchMode, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.ReleaseEventSeriesApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ReleaseEventSeriesApiApi apiInstance = new ReleaseEventSeriesApiApi(defaultClient);
        String query = ""; // String | 
        ReleaseEventSeriesOptionalFields fields = ReleaseEventSeriesOptionalFields.fromValue("None"); // ReleaseEventSeriesOptionalFields | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            ReleaseEventSeriesForApiContractPartialFindResult result = apiInstance.apiReleaseEventSeriesGet(query, fields, start, maxResults, getTotalCount, nameMatchMode, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReleaseEventSeriesApiApi#apiReleaseEventSeriesGet");
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
| **fields** | [**ReleaseEventSeriesOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Description, Events, MainPicture, Names, WebLinks] |
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **getTotalCount** | **Boolean**|  | [optional] [default to false] |
| **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**ReleaseEventSeriesForApiContractPartialFindResult**](ReleaseEventSeriesForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiReleaseEventSeriesIdDelete

> apiReleaseEventSeriesIdDelete(id, notes, hardDelete)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.ReleaseEventSeriesApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ReleaseEventSeriesApiApi apiInstance = new ReleaseEventSeriesApiApi(defaultClient);
        Integer id = 56; // Integer | 
        String notes = ""; // String | 
        Boolean hardDelete = false; // Boolean | 
        try {
            apiInstance.apiReleaseEventSeriesIdDelete(id, notes, hardDelete);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReleaseEventSeriesApiApi#apiReleaseEventSeriesIdDelete");
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


## apiReleaseEventSeriesIdForEditGet

> ReleaseEventSeriesForEditForApiContract apiReleaseEventSeriesIdForEditGet(id)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.ReleaseEventSeriesApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ReleaseEventSeriesApiApi apiInstance = new ReleaseEventSeriesApiApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            ReleaseEventSeriesForEditForApiContract result = apiInstance.apiReleaseEventSeriesIdForEditGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReleaseEventSeriesApiApi#apiReleaseEventSeriesIdForEditGet");
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

### Return type

[**ReleaseEventSeriesForEditForApiContract**](ReleaseEventSeriesForEditForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiReleaseEventSeriesIdGet

> ReleaseEventSeriesForApiContract apiReleaseEventSeriesIdGet(id, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.ReleaseEventSeriesApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ReleaseEventSeriesApiApi apiInstance = new ReleaseEventSeriesApiApi(defaultClient);
        Integer id = 56; // Integer | 
        ReleaseEventSeriesOptionalFields fields = ReleaseEventSeriesOptionalFields.fromValue("None"); // ReleaseEventSeriesOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            ReleaseEventSeriesForApiContract result = apiInstance.apiReleaseEventSeriesIdGet(id, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReleaseEventSeriesApiApi#apiReleaseEventSeriesIdGet");
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
| **fields** | [**ReleaseEventSeriesOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Description, Events, MainPicture, Names, WebLinks] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**ReleaseEventSeriesForApiContract**](ReleaseEventSeriesForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

