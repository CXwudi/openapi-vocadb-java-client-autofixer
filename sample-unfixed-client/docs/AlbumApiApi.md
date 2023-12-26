# AlbumApiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiAlbumsCommentsCommentIdDelete**](AlbumApiApi.md#apiAlbumsCommentsCommentIdDelete) | **DELETE** /api/albums/comments/{commentId} |  |
| [**apiAlbumsCommentsCommentIdPost**](AlbumApiApi.md#apiAlbumsCommentsCommentIdPost) | **POST** /api/albums/comments/{commentId} |  |
| [**apiAlbumsGet**](AlbumApiApi.md#apiAlbumsGet) | **GET** /api/albums |  |
| [**apiAlbumsIdCommentsGet**](AlbumApiApi.md#apiAlbumsIdCommentsGet) | **GET** /api/albums/{id}/comments |  |
| [**apiAlbumsIdCommentsPost**](AlbumApiApi.md#apiAlbumsIdCommentsPost) | **POST** /api/albums/{id}/comments |  |
| [**apiAlbumsIdDelete**](AlbumApiApi.md#apiAlbumsIdDelete) | **DELETE** /api/albums/{id} |  |
| [**apiAlbumsIdGet**](AlbumApiApi.md#apiAlbumsIdGet) | **GET** /api/albums/{id} |  |
| [**apiAlbumsIdRelatedGet**](AlbumApiApi.md#apiAlbumsIdRelatedGet) | **GET** /api/albums/{id}/related |  |
| [**apiAlbumsIdReviewsGet**](AlbumApiApi.md#apiAlbumsIdReviewsGet) | **GET** /api/albums/{id}/reviews |  |
| [**apiAlbumsIdReviewsPost**](AlbumApiApi.md#apiAlbumsIdReviewsPost) | **POST** /api/albums/{id}/reviews |  |
| [**apiAlbumsIdReviewsReviewIdDelete**](AlbumApiApi.md#apiAlbumsIdReviewsReviewIdDelete) | **DELETE** /api/albums/{id}/reviews/{reviewId} |  |
| [**apiAlbumsIdTracksFieldsGet**](AlbumApiApi.md#apiAlbumsIdTracksFieldsGet) | **GET** /api/albums/{id}/tracks/fields |  |
| [**apiAlbumsIdTracksGet**](AlbumApiApi.md#apiAlbumsIdTracksGet) | **GET** /api/albums/{id}/tracks |  |
| [**apiAlbumsIdUserCollectionsGet**](AlbumApiApi.md#apiAlbumsIdUserCollectionsGet) | **GET** /api/albums/{id}/user-collections |  |
| [**apiAlbumsNamesGet**](AlbumApiApi.md#apiAlbumsNamesGet) | **GET** /api/albums/names |  |
| [**apiAlbumsNewGet**](AlbumApiApi.md#apiAlbumsNewGet) | **GET** /api/albums/new |  |
| [**apiAlbumsTopGet**](AlbumApiApi.md#apiAlbumsTopGet) | **GET** /api/albums/top |  |



## apiAlbumsCommentsCommentIdDelete

> apiAlbumsCommentsCommentIdDelete(commentId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        Integer commentId = 56; // Integer | 
        try {
            apiInstance.apiAlbumsCommentsCommentIdDelete(commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsCommentsCommentIdDelete");
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


## apiAlbumsCommentsCommentIdPost

> apiAlbumsCommentsCommentIdPost(commentId, commentForApiContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        Integer commentId = 56; // Integer | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            apiInstance.apiAlbumsCommentsCommentIdPost(commentId, commentForApiContract);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsCommentsCommentIdPost");
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


## apiAlbumsGet

> AlbumForApiContractPartialFindResult apiAlbumsGet(query, discTypes, tagName, tagId, childTags, artistId, artistParticipationStatus, childVoicebanks, includeMembers, barcode, status, releaseDateAfter, releaseDateBefore, advancedFilters, start, maxResults, getTotalCount, sort, preferAccurateMatches, deleted, nameMatchMode, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        String query = ""; // String | 
        DiscType discTypes = DiscType.fromValue("Unknown"); // DiscType | 
        List<String> tagName = Arrays.asList(); // List<String> | 
        List<Integer> tagId = Arrays.asList(); // List<Integer> | 
        Boolean childTags = false; // Boolean | 
        List<Integer> artistId = Arrays.asList(); // List<Integer> | 
        ArtistAlbumParticipationStatus artistParticipationStatus = ArtistAlbumParticipationStatus.fromValue("Everything"); // ArtistAlbumParticipationStatus | 
        Boolean childVoicebanks = false; // Boolean | 
        Boolean includeMembers = false; // Boolean | 
        String barcode = "barcode_example"; // String | 
        EntryStatus status = EntryStatus.fromValue("Draft"); // EntryStatus | 
        LocalDateTime releaseDateAfter = new LocalDateTime(); // LocalDateTime | 
        LocalDateTime releaseDateBefore = new LocalDateTime(); // LocalDateTime | 
        List<AdvancedSearchFilterParams> advancedFilters = Arrays.asList(); // List<AdvancedSearchFilterParams> | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        AlbumSortRule sort = AlbumSortRule.fromValue("None"); // AlbumSortRule | 
        Boolean preferAccurateMatches = false; // Boolean | 
        Boolean deleted = false; // Boolean | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        AlbumOptionalFields fields = AlbumOptionalFields.fromValue("None"); // AlbumOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            AlbumForApiContractPartialFindResult result = apiInstance.apiAlbumsGet(query, discTypes, tagName, tagId, childTags, artistId, artistParticipationStatus, childVoicebanks, includeMembers, barcode, status, releaseDateAfter, releaseDateBefore, advancedFilters, start, maxResults, getTotalCount, sort, preferAccurateMatches, deleted, nameMatchMode, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsGet");
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
| **discTypes** | [**DiscType**](.md)|  | [optional] [enum: Unknown, Album, Single, EP, SplitAlbum, Compilation, Video, Artbook, Game, Fanmade, Instrumental, Other] |
| **tagName** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tagId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **childTags** | **Boolean**|  | [optional] [default to false] |
| **artistId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **artistParticipationStatus** | [**ArtistAlbumParticipationStatus**](.md)|  | [optional] [enum: Everything, OnlyMainAlbums, OnlyCollaborations] |
| **childVoicebanks** | **Boolean**|  | [optional] [default to false] |
| **includeMembers** | **Boolean**|  | [optional] [default to false] |
| **barcode** | **String**|  | [optional] |
| **status** | [**EntryStatus**](.md)|  | [optional] [enum: Draft, Finished, Approved, Locked] |
| **releaseDateAfter** | **LocalDateTime**|  | [optional] |
| **releaseDateBefore** | **LocalDateTime**|  | [optional] |
| **advancedFilters** | [**List&lt;AdvancedSearchFilterParams&gt;**](AdvancedSearchFilterParams.md)|  | [optional] |
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **getTotalCount** | **Boolean**|  | [optional] [default to false] |
| **sort** | [**AlbumSortRule**](.md)|  | [optional] [enum: None, Name, ReleaseDate, ReleaseDateWithNulls, AdditionDate, RatingAverage, RatingTotal, NameThenReleaseDate, CollectionCount] |
| **preferAccurateMatches** | **Boolean**|  | [optional] [default to false] |
| **deleted** | **Boolean**|  | [optional] [default to false] |
| **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words] |
| **fields** | [**AlbumOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Artists, Description, Discs, Identifiers, MainPicture, Names, PVs, ReleaseEvent, Tags, Tracks, WebLinks] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**AlbumForApiContractPartialFindResult**](AlbumForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiAlbumsIdCommentsGet

> List&lt;CommentForApiContract&gt; apiAlbumsIdCommentsGet(id)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            List<CommentForApiContract> result = apiInstance.apiAlbumsIdCommentsGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsIdCommentsGet");
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

[**List&lt;CommentForApiContract&gt;**](CommentForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiAlbumsIdCommentsPost

> CommentForApiContract apiAlbumsIdCommentsPost(id, commentForApiContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        Integer id = 56; // Integer | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            CommentForApiContract result = apiInstance.apiAlbumsIdCommentsPost(id, commentForApiContract);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsIdCommentsPost");
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


## apiAlbumsIdDelete

> apiAlbumsIdDelete(id, notes)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        Integer id = 56; // Integer | 
        String notes = ""; // String | 
        try {
            apiInstance.apiAlbumsIdDelete(id, notes);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsIdDelete");
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


## apiAlbumsIdGet

> AlbumForApiContract apiAlbumsIdGet(id, fields, songFields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        Integer id = 56; // Integer | 
        AlbumOptionalFields fields = AlbumOptionalFields.fromValue("None"); // AlbumOptionalFields | 
        SongOptionalFields songFields = SongOptionalFields.fromValue("None"); // SongOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            AlbumForApiContract result = apiInstance.apiAlbumsIdGet(id, fields, songFields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsIdGet");
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
| **fields** | [**AlbumOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Artists, Description, Discs, Identifiers, MainPicture, Names, PVs, ReleaseEvent, Tags, Tracks, WebLinks] |
| **songFields** | [**SongOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Albums, Artists, Lyrics, MainPicture, Names, PVs, ReleaseEvent, Tags, ThumbUrl, WebLinks, Bpm, CultureCodes] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**AlbumForApiContract**](AlbumForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiAlbumsIdRelatedGet

> RelatedAlbumsContract apiAlbumsIdRelatedGet(id, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        Integer id = 56; // Integer | 
        AlbumOptionalFields fields = AlbumOptionalFields.fromValue("None"); // AlbumOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            RelatedAlbumsContract result = apiInstance.apiAlbumsIdRelatedGet(id, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsIdRelatedGet");
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
| **fields** | [**AlbumOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Artists, Description, Discs, Identifiers, MainPicture, Names, PVs, ReleaseEvent, Tags, Tracks, WebLinks] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**RelatedAlbumsContract**](RelatedAlbumsContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiAlbumsIdReviewsGet

> List&lt;AlbumReviewContract&gt; apiAlbumsIdReviewsGet(id, languageCode)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        Integer id = 56; // Integer | 
        String languageCode = "languageCode_example"; // String | 
        try {
            List<AlbumReviewContract> result = apiInstance.apiAlbumsIdReviewsGet(id, languageCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsIdReviewsGet");
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
| **languageCode** | **String**|  | [optional] |

### Return type

[**List&lt;AlbumReviewContract&gt;**](AlbumReviewContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiAlbumsIdReviewsPost

> AlbumReviewContract apiAlbumsIdReviewsPost(id, albumReviewContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        Integer id = 56; // Integer | 
        AlbumReviewContract albumReviewContract = new AlbumReviewContract(); // AlbumReviewContract | 
        try {
            AlbumReviewContract result = apiInstance.apiAlbumsIdReviewsPost(id, albumReviewContract);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsIdReviewsPost");
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
| **albumReviewContract** | [**AlbumReviewContract**](AlbumReviewContract.md)|  | [optional] |

### Return type

[**AlbumReviewContract**](AlbumReviewContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiAlbumsIdReviewsReviewIdDelete

> apiAlbumsIdReviewsReviewIdDelete(reviewId, id)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        Integer reviewId = 56; // Integer | 
        String id = "id_example"; // String | 
        try {
            apiInstance.apiAlbumsIdReviewsReviewIdDelete(reviewId, id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsIdReviewsReviewIdDelete");
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
| **reviewId** | **Integer**|  | |
| **id** | **String**|  | |

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


## apiAlbumsIdTracksFieldsGet

> List&lt;Map&lt;String, String&gt;&gt; apiAlbumsIdTracksFieldsGet(id, field, discNumber, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        Integer id = 56; // Integer | 
        List<String> field = Arrays.asList(); // List<String> | 
        Integer discNumber = 56; // Integer | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            List<Map<String, String>> result = apiInstance.apiAlbumsIdTracksFieldsGet(id, field, discNumber, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsIdTracksFieldsGet");
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
| **field** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **discNumber** | **Integer**|  | [optional] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**List&lt;Map&lt;String, String&gt;&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiAlbumsIdTracksGet

> List&lt;SongInAlbumForApiContract&gt; apiAlbumsIdTracksGet(id, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        Integer id = 56; // Integer | 
        SongOptionalFields fields = SongOptionalFields.fromValue("None"); // SongOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            List<SongInAlbumForApiContract> result = apiInstance.apiAlbumsIdTracksGet(id, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsIdTracksGet");
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
| **fields** | [**SongOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Albums, Artists, Lyrics, MainPicture, Names, PVs, ReleaseEvent, Tags, ThumbUrl, WebLinks, Bpm, CultureCodes] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**List&lt;SongInAlbumForApiContract&gt;**](SongInAlbumForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiAlbumsIdUserCollectionsGet

> List&lt;AlbumForUserForApiContract&gt; apiAlbumsIdUserCollectionsGet(id, languagePreference)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        Integer id = 56; // Integer | 
        ContentLanguagePreference languagePreference = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            List<AlbumForUserForApiContract> result = apiInstance.apiAlbumsIdUserCollectionsGet(id, languagePreference);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsIdUserCollectionsGet");
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
| **languagePreference** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**List&lt;AlbumForUserForApiContract&gt;**](AlbumForUserForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiAlbumsNamesGet

> List&lt;String&gt; apiAlbumsNamesGet(query, nameMatchMode, maxResults)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        String query = ""; // String | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        Integer maxResults = 15; // Integer | 
        try {
            List<String> result = apiInstance.apiAlbumsNamesGet(query, nameMatchMode, maxResults);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsNamesGet");
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
| **maxResults** | **Integer**|  | [optional] [default to 15] |

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


## apiAlbumsNewGet

> List&lt;AlbumForApiContract&gt; apiAlbumsNewGet(languagePreference, fields)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        ContentLanguagePreference languagePreference = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        AlbumOptionalFields fields = AlbumOptionalFields.fromValue("None"); // AlbumOptionalFields | 
        try {
            List<AlbumForApiContract> result = apiInstance.apiAlbumsNewGet(languagePreference, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsNewGet");
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
| **languagePreference** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |
| **fields** | [**AlbumOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Artists, Description, Discs, Identifiers, MainPicture, Names, PVs, ReleaseEvent, Tags, Tracks, WebLinks] |

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


## apiAlbumsTopGet

> List&lt;AlbumForApiContract&gt; apiAlbumsTopGet(ignoreIds, languagePreference, fields)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.AlbumApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AlbumApiApi apiInstance = new AlbumApiApi(defaultClient);
        List<Integer> ignoreIds = Arrays.asList(); // List<Integer> | 
        ContentLanguagePreference languagePreference = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        AlbumOptionalFields fields = AlbumOptionalFields.fromValue("None"); // AlbumOptionalFields | 
        try {
            List<AlbumForApiContract> result = apiInstance.apiAlbumsTopGet(ignoreIds, languagePreference, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumApiApi#apiAlbumsTopGet");
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
| **ignoreIds** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **languagePreference** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |
| **fields** | [**AlbumOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Artists, Description, Discs, Identifiers, MainPicture, Names, PVs, ReleaseEvent, Tags, Tracks, WebLinks] |

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

