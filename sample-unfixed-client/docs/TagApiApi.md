# TagApiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiTagsByNameNameGet**](TagApiApi.md#apiTagsByNameNameGet) | **GET** /api/tags/byName/{name} |  |
| [**apiTagsCategoryNamesGet**](TagApiApi.md#apiTagsCategoryNamesGet) | **GET** /api/tags/categoryNames |  |
| [**apiTagsCommentsCommentIdDelete**](TagApiApi.md#apiTagsCommentsCommentIdDelete) | **DELETE** /api/tags/comments/{commentId} |  |
| [**apiTagsCommentsCommentIdPost**](TagApiApi.md#apiTagsCommentsCommentIdPost) | **POST** /api/tags/comments/{commentId} |  |
| [**apiTagsGet**](TagApiApi.md#apiTagsGet) | **GET** /api/tags |  |
| [**apiTagsIdDelete**](TagApiApi.md#apiTagsIdDelete) | **DELETE** /api/tags/{id} |  |
| [**apiTagsIdGet**](TagApiApi.md#apiTagsIdGet) | **GET** /api/tags/{id} |  |
| [**apiTagsNamesGet**](TagApiApi.md#apiTagsNamesGet) | **GET** /api/tags/names |  |
| [**apiTagsPost**](TagApiApi.md#apiTagsPost) | **POST** /api/tags |  |
| [**apiTagsTagIdChildrenGet**](TagApiApi.md#apiTagsTagIdChildrenGet) | **GET** /api/tags/{tagId}/children |  |
| [**apiTagsTagIdCommentsGet**](TagApiApi.md#apiTagsTagIdCommentsGet) | **GET** /api/tags/{tagId}/comments |  |
| [**apiTagsTagIdCommentsPost**](TagApiApi.md#apiTagsTagIdCommentsPost) | **POST** /api/tags/{tagId}/comments |  |
| [**apiTagsTagIdReportsPost**](TagApiApi.md#apiTagsTagIdReportsPost) | **POST** /api/tags/{tagId}/reports |  |
| [**apiTagsTopGet**](TagApiApi.md#apiTagsTopGet) | **GET** /api/tags/top |  |



## apiTagsByNameNameGet

> TagForApiContract apiTagsByNameNameGet(name, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.TagApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApiApi apiInstance = new TagApiApi(defaultClient);
        String name = "name_example"; // String | 
        TagOptionalFields fields = TagOptionalFields.fromValue("None"); // TagOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            TagForApiContract result = apiInstance.apiTagsByNameNameGet(name, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApiApi#apiTagsByNameNameGet");
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
| **name** | **String**|  | |
| **fields** | [**TagOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, AliasedTo, Description, MainPicture, Names, Parent, RelatedTags, TranslatedDescription, WebLinks] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

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


## apiTagsCategoryNamesGet

> List&lt;String&gt; apiTagsCategoryNamesGet(query, nameMatchMode)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.TagApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApiApi apiInstance = new TagApiApi(defaultClient);
        String query = ""; // String | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        try {
            List<String> result = apiInstance.apiTagsCategoryNamesGet(query, nameMatchMode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApiApi#apiTagsCategoryNamesGet");
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


## apiTagsCommentsCommentIdDelete

> apiTagsCommentsCommentIdDelete(commentId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.TagApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApiApi apiInstance = new TagApiApi(defaultClient);
        Integer commentId = 56; // Integer | 
        try {
            apiInstance.apiTagsCommentsCommentIdDelete(commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApiApi#apiTagsCommentsCommentIdDelete");
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


## apiTagsCommentsCommentIdPost

> apiTagsCommentsCommentIdPost(commentId, commentForApiContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.TagApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApiApi apiInstance = new TagApiApi(defaultClient);
        Integer commentId = 56; // Integer | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            apiInstance.apiTagsCommentsCommentIdPost(commentId, commentForApiContract);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApiApi#apiTagsCommentsCommentIdPost");
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


## apiTagsGet

> TagForApiContractPartialFindResult apiTagsGet(query, allowChildren, categoryName, start, maxResults, getTotalCount, nameMatchMode, sort, preferAccurateMatches, fields, lang, target)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.TagApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApiApi apiInstance = new TagApiApi(defaultClient);
        String query = ""; // String | 
        Boolean allowChildren = true; // Boolean | 
        String categoryName = ""; // String | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        TagSortRule sort = TagSortRule.fromValue("Nothing"); // TagSortRule | 
        Boolean preferAccurateMatches = false; // Boolean | 
        TagOptionalFields fields = TagOptionalFields.fromValue("None"); // TagOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        TagTargetTypes target = TagTargetTypes.fromValue("Nothing"); // TagTargetTypes | 
        try {
            TagForApiContractPartialFindResult result = apiInstance.apiTagsGet(query, allowChildren, categoryName, start, maxResults, getTotalCount, nameMatchMode, sort, preferAccurateMatches, fields, lang, target);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApiApi#apiTagsGet");
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
| **allowChildren** | **Boolean**|  | [optional] [default to true] |
| **categoryName** | **String**|  | [optional] [default to ] |
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **getTotalCount** | **Boolean**|  | [optional] [default to false] |
| **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words] |
| **sort** | [**TagSortRule**](.md)|  | [optional] [enum: Nothing, Name, AdditionDate, UsageCount] |
| **preferAccurateMatches** | **Boolean**|  | [optional] [default to false] |
| **fields** | [**TagOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, AliasedTo, Description, MainPicture, Names, Parent, RelatedTags, TranslatedDescription, WebLinks] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |
| **target** | [**TagTargetTypes**](.md)|  | [optional] [enum: Nothing, Album, Artist, AlbumArtist, Event, Song, AlbumSong, ArtistSong, SongList, All] |

### Return type

[**TagForApiContractPartialFindResult**](TagForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiTagsIdDelete

> apiTagsIdDelete(id, notes, hardDelete)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.TagApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApiApi apiInstance = new TagApiApi(defaultClient);
        Integer id = 56; // Integer | 
        String notes = ""; // String | 
        Boolean hardDelete = false; // Boolean | 
        try {
            apiInstance.apiTagsIdDelete(id, notes, hardDelete);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApiApi#apiTagsIdDelete");
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


## apiTagsIdGet

> TagForApiContract apiTagsIdGet(id, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.TagApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApiApi apiInstance = new TagApiApi(defaultClient);
        Integer id = 56; // Integer | 
        TagOptionalFields fields = TagOptionalFields.fromValue("None"); // TagOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            TagForApiContract result = apiInstance.apiTagsIdGet(id, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApiApi#apiTagsIdGet");
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
| **fields** | [**TagOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, AliasedTo, Description, MainPicture, Names, Parent, RelatedTags, TranslatedDescription, WebLinks] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

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


## apiTagsNamesGet

> List&lt;String&gt; apiTagsNamesGet(query, allowAliases, maxResults)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.TagApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApiApi apiInstance = new TagApiApi(defaultClient);
        String query = ""; // String | 
        Boolean allowAliases = true; // Boolean | 
        Integer maxResults = 10; // Integer | 
        try {
            List<String> result = apiInstance.apiTagsNamesGet(query, allowAliases, maxResults);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApiApi#apiTagsNamesGet");
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
| **allowAliases** | **Boolean**|  | [optional] [default to true] |
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


## apiTagsPost

> TagBaseContract apiTagsPost(name)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.TagApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApiApi apiInstance = new TagApiApi(defaultClient);
        String name = "name_example"; // String | 
        try {
            TagBaseContract result = apiInstance.apiTagsPost(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApiApi#apiTagsPost");
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
| **name** | **String**|  | [optional] |

### Return type

[**TagBaseContract**](TagBaseContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiTagsTagIdChildrenGet

> List&lt;TagForApiContract&gt; apiTagsTagIdChildrenGet(tagId, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.TagApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApiApi apiInstance = new TagApiApi(defaultClient);
        Integer tagId = 56; // Integer | 
        TagOptionalFields fields = TagOptionalFields.fromValue("None"); // TagOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            List<TagForApiContract> result = apiInstance.apiTagsTagIdChildrenGet(tagId, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApiApi#apiTagsTagIdChildrenGet");
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
| **tagId** | **Integer**|  | |
| **fields** | [**TagOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, AliasedTo, Description, MainPicture, Names, Parent, RelatedTags, TranslatedDescription, WebLinks] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**List&lt;TagForApiContract&gt;**](TagForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiTagsTagIdCommentsGet

> CommentForApiContractPartialFindResult apiTagsTagIdCommentsGet(tagId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.TagApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApiApi apiInstance = new TagApiApi(defaultClient);
        Integer tagId = 56; // Integer | 
        try {
            CommentForApiContractPartialFindResult result = apiInstance.apiTagsTagIdCommentsGet(tagId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApiApi#apiTagsTagIdCommentsGet");
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
| **tagId** | **Integer**|  | |

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


## apiTagsTagIdCommentsPost

> CommentForApiContract apiTagsTagIdCommentsPost(tagId, commentForApiContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.TagApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApiApi apiInstance = new TagApiApi(defaultClient);
        Integer tagId = 56; // Integer | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            CommentForApiContract result = apiInstance.apiTagsTagIdCommentsPost(tagId, commentForApiContract);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApiApi#apiTagsTagIdCommentsPost");
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
| **tagId** | **Integer**|  | |
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


## apiTagsTagIdReportsPost

> apiTagsTagIdReportsPost(tagId, reportType, notes, versionNumber)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.TagApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApiApi apiInstance = new TagApiApi(defaultClient);
        Integer tagId = 56; // Integer | 
        TagReportType reportType = TagReportType.fromValue("InvalidInfo"); // TagReportType | 
        String notes = "notes_example"; // String | 
        Integer versionNumber = 56; // Integer | 
        try {
            apiInstance.apiTagsTagIdReportsPost(tagId, reportType, notes, versionNumber);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApiApi#apiTagsTagIdReportsPost");
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
| **tagId** | **Integer**|  | |
| **reportType** | [**TagReportType**](.md)|  | [optional] [enum: InvalidInfo, Duplicate, Inappropriate, Other] |
| **notes** | **String**|  | [optional] |
| **versionNumber** | **Integer**|  | [optional] |

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


## apiTagsTopGet

> List&lt;TagBaseContract&gt; apiTagsTopGet(categoryName, entryType, maxResults, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.TagApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApiApi apiInstance = new TagApiApi(defaultClient);
        String categoryName = "categoryName_example"; // String | 
        EntryType entryType = EntryType.fromValue("Undefined"); // EntryType | 
        Integer maxResults = 15; // Integer | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            List<TagBaseContract> result = apiInstance.apiTagsTopGet(categoryName, entryType, maxResults, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApiApi#apiTagsTopGet");
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
| **categoryName** | **String**|  | [optional] |
| **entryType** | [**EntryType**](.md)|  | [optional] [enum: Undefined, Album, Artist, DiscussionTopic, PV, ReleaseEvent, ReleaseEventSeries, Song, SongList, Tag, User, Venue] |
| **maxResults** | **Integer**|  | [optional] [default to 15] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**List&lt;TagBaseContract&gt;**](TagBaseContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

