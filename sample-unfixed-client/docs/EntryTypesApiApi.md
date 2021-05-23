# EntryTypesApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiEntryTypesEntryTypeSubTypeTagGet**](EntryTypesApiApi.md#apiEntryTypesEntryTypeSubTypeTagGet) | **GET** /api/entry-types/{entryType}/{subType}/tag | 



## apiEntryTypesEntryTypeSubTypeTagGet

> TagForApiContract apiEntryTypesEntryTypeSubTypeTagGet(entryType, subType, fields)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.EntryTypesApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        EntryTypesApiApi apiInstance = new EntryTypesApiApi(defaultClient);
        EntryType entryType = EntryType.fromValue("Undefined"); // EntryType | 
        String subType = "subType_example"; // String | 
        TagOptionalFields fields = TagOptionalFields.fromValue("None"); // TagOptionalFields | 
        try {
            TagForApiContract result = apiInstance.apiEntryTypesEntryTypeSubTypeTagGet(entryType, subType, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EntryTypesApiApi#apiEntryTypesEntryTypeSubTypeTagGet");
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
 **subType** | **String**|  |
 **fields** | [**TagOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, AliasedTo, Description, MainPicture, Names, Parent, RelatedTags, TranslatedDescription, WebLinks]

### Return type

[**TagForApiContract**](TagForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

