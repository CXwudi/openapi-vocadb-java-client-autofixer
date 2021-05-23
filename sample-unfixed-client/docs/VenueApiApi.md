# VenueApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiVenuesGet**](VenueApiApi.md#apiVenuesGet) | **GET** /api/venues | 
[**apiVenuesIdDelete**](VenueApiApi.md#apiVenuesIdDelete) | **DELETE** /api/venues/{id} | 
[**apiVenuesIdReportsPost**](VenueApiApi.md#apiVenuesIdReportsPost) | **POST** /api/venues/{id}/reports | 



## apiVenuesGet

> VenueForApiContractPartialFindResult apiVenuesGet(query, fields, start, maxResults, getTotalCount, nameMatchMode, lang, sortRule, latitude, longitude, radius, distanceUnit)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.VenueApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VenueApiApi apiInstance = new VenueApiApi(defaultClient);
        String query = ""; // String | 
        VenueOptionalFields fields = VenueOptionalFields.fromValue("None"); // VenueOptionalFields | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        VenueSortRule sortRule = VenueSortRule.fromValue("None"); // VenueSortRule | 
        Double latitude = 3.4D; // Double | 
        Double longitude = 3.4D; // Double | 
        Double radius = 3.4D; // Double | 
        DistanceUnit distanceUnit = DistanceUnit.fromValue("Kilometers"); // DistanceUnit | 
        try {
            VenueForApiContractPartialFindResult result = apiInstance.apiVenuesGet(query, fields, start, maxResults, getTotalCount, nameMatchMode, lang, sortRule, latitude, longitude, radius, distanceUnit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VenueApiApi#apiVenuesGet");
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
 **query** | **String**|  | [optional] [default to ]
 **fields** | [**VenueOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Description, Events, Names, WebLinks]
 **start** | **Integer**|  | [optional] [default to 0]
 **maxResults** | **Integer**|  | [optional] [default to 10]
 **getTotalCount** | **Boolean**|  | [optional] [default to false]
 **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words]
 **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English]
 **sortRule** | [**VenueSortRule**](.md)|  | [optional] [enum: None, Name, Distance]
 **latitude** | **Double**|  | [optional]
 **longitude** | **Double**|  | [optional]
 **radius** | **Double**|  | [optional]
 **distanceUnit** | [**DistanceUnit**](.md)|  | [optional] [enum: Kilometers, Miles]

### Return type

[**VenueForApiContractPartialFindResult**](VenueForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiVenuesIdDelete

> apiVenuesIdDelete(id, notes, hardDelete)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.VenueApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VenueApiApi apiInstance = new VenueApiApi(defaultClient);
        Integer id = 56; // Integer | 
        String notes = ""; // String | 
        Boolean hardDelete = false; // Boolean | 
        try {
            apiInstance.apiVenuesIdDelete(id, notes, hardDelete);
        } catch (ApiException e) {
            System.err.println("Exception when calling VenueApiApi#apiVenuesIdDelete");
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
 **notes** | **String**|  | [optional] [default to ]
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


## apiVenuesIdReportsPost

> apiVenuesIdReportsPost(id, reportType, notes, versionNumber)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.VenueApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VenueApiApi apiInstance = new VenueApiApi(defaultClient);
        Integer id = 56; // Integer | 
        VenueReportType reportType = VenueReportType.fromValue("InvalidInfo"); // VenueReportType | 
        String notes = "notes_example"; // String | 
        Integer versionNumber = 56; // Integer | 
        try {
            apiInstance.apiVenuesIdReportsPost(id, reportType, notes, versionNumber);
        } catch (ApiException e) {
            System.err.println("Exception when calling VenueApiApi#apiVenuesIdReportsPost");
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
 **reportType** | [**VenueReportType**](.md)|  | [optional] [enum: InvalidInfo, Duplicate, Inappropriate, Other]
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

