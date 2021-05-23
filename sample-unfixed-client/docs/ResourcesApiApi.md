# ResourcesApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiResourcesCultureCodeGet**](ResourcesApiApi.md#apiResourcesCultureCodeGet) | **GET** /api/resources/{cultureCode} | 



## apiResourcesCultureCodeGet

> Map&lt;String, Map&lt;String, String&gt;&gt; apiResourcesCultureCodeGet(cultureCode, setNames)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.ResourcesApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ResourcesApiApi apiInstance = new ResourcesApiApi(defaultClient);
        String cultureCode = "cultureCode_example"; // String | 
        List<String> setNames = Arrays.asList(); // List<String> | 
        try {
            Map<String, Map<String, String>> result = apiInstance.apiResourcesCultureCodeGet(cultureCode, setNames);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResourcesApiApi#apiResourcesCultureCodeGet");
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
 **cultureCode** | **String**|  |
 **setNames** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

