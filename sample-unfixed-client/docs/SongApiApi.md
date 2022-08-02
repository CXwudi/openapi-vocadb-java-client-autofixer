# SongApiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiSongsByPvGet**](SongApiApi.md#apiSongsByPvGet) | **GET** /api/songs/byPv |  |
| [**apiSongsCommentsCommentIdDelete**](SongApiApi.md#apiSongsCommentsCommentIdDelete) | **DELETE** /api/songs/comments/{commentId} |  |
| [**apiSongsCommentsCommentIdPost**](SongApiApi.md#apiSongsCommentsCommentIdPost) | **POST** /api/songs/comments/{commentId} |  |
| [**apiSongsGet**](SongApiApi.md#apiSongsGet) | **GET** /api/songs |  |
| [**apiSongsHighlightedGet**](SongApiApi.md#apiSongsHighlightedGet) | **GET** /api/songs/highlighted |  |
| [**apiSongsIdCommentsGet**](SongApiApi.md#apiSongsIdCommentsGet) | **GET** /api/songs/{id}/comments |  |
| [**apiSongsIdCommentsPost**](SongApiApi.md#apiSongsIdCommentsPost) | **POST** /api/songs/{id}/comments |  |
| [**apiSongsIdDelete**](SongApiApi.md#apiSongsIdDelete) | **DELETE** /api/songs/{id} |  |
| [**apiSongsIdDerivedGet**](SongApiApi.md#apiSongsIdDerivedGet) | **GET** /api/songs/{id}/derived |  |
| [**apiSongsIdGet**](SongApiApi.md#apiSongsIdGet) | **GET** /api/songs/{id} |  |
| [**apiSongsIdRatingsGet**](SongApiApi.md#apiSongsIdRatingsGet) | **GET** /api/songs/{id}/ratings |  |
| [**apiSongsIdRatingsPost**](SongApiApi.md#apiSongsIdRatingsPost) | **POST** /api/songs/{id}/ratings |  |
| [**apiSongsIdRelatedGet**](SongApiApi.md#apiSongsIdRelatedGet) | **GET** /api/songs/{id}/related |  |
| [**apiSongsLyricsLyricsIdGet**](SongApiApi.md#apiSongsLyricsLyricsIdGet) | **GET** /api/songs/lyrics/{lyricsId} |  |
| [**apiSongsNamesGet**](SongApiApi.md#apiSongsNamesGet) | **GET** /api/songs/names |  |
| [**apiSongsTopRatedGet**](SongApiApi.md#apiSongsTopRatedGet) | **GET** /api/songs/top-rated |  |



## apiSongsByPvGet

> SongForApiContract apiSongsByPvGet(pvService, pvId, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        PVService pvService = PVService.fromValue("NicoNicoDouga"); // PVService | 
        String pvId = "pvId_example"; // String | 
        SongOptionalFields fields = SongOptionalFields.fromValue("None"); // SongOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            SongForApiContract result = apiInstance.apiSongsByPvGet(pvService, pvId, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsByPvGet");
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
| **pvService** | [**PVService**](.md)|  | [optional] [enum: NicoNicoDouga, Youtube, SoundCloud, Vimeo, Piapro, Bilibili, File, LocalFile, Creofuga, Bandcamp] |
| **pvId** | **String**|  | [optional] |
| **fields** | [**SongOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Albums, Artists, Lyrics, MainPicture, Names, PVs, ReleaseEvent, Tags, ThumbUrl, WebLinks, Bpm] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**SongForApiContract**](SongForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiSongsCommentsCommentIdDelete

> apiSongsCommentsCommentIdDelete(commentId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        Integer commentId = 56; // Integer | 
        try {
            apiInstance.apiSongsCommentsCommentIdDelete(commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsCommentsCommentIdDelete");
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


## apiSongsCommentsCommentIdPost

> apiSongsCommentsCommentIdPost(commentId, commentForApiContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        Integer commentId = 56; // Integer | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            apiInstance.apiSongsCommentsCommentIdPost(commentId, commentForApiContract);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsCommentsCommentIdPost");
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


## apiSongsGet

> SongForApiContractPartialFindResult apiSongsGet(query, songTypes, afterDate, beforeDate, tagName, tagId, childTags, unifyTypesAndTags, artistId, artistParticipationStatus, childVoicebanks, includeMembers, onlyWithPvs, pvServices, since, minScore, userCollectionId, releaseEventId, parentSongId, status, advancedFilters, start, maxResults, getTotalCount, sort, preferAccurateMatches, nameMatchMode, fields, lang, minMilliBpm, maxMilliBpm, minLength, maxLength)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        String query = ""; // String | 
        String songTypes = "songTypes_example"; // String | 
        LocalDateTime afterDate = new LocalDateTime(); // LocalDateTime | 
        LocalDateTime beforeDate = new LocalDateTime(); // LocalDateTime | 
        List<String> tagName = Arrays.asList(); // List<String> | 
        List<Integer> tagId = Arrays.asList(); // List<Integer> | 
        Boolean childTags = false; // Boolean | 
        Boolean unifyTypesAndTags = false; // Boolean | 
        List<Integer> artistId = Arrays.asList(); // List<Integer> | 
        ArtistAlbumParticipationStatus artistParticipationStatus = ArtistAlbumParticipationStatus.fromValue("Everything"); // ArtistAlbumParticipationStatus | 
        Boolean childVoicebanks = false; // Boolean | 
        Boolean includeMembers = false; // Boolean | 
        Boolean onlyWithPvs = false; // Boolean | 
        PVServices pvServices = PVServices.fromValue("Nothing"); // PVServices | 
        Integer since = 56; // Integer | 
        Integer minScore = 56; // Integer | 
        Integer userCollectionId = 56; // Integer | 
        Integer releaseEventId = 56; // Integer | 
        Integer parentSongId = 56; // Integer | 
        EntryStatus status = EntryStatus.fromValue("Draft"); // EntryStatus | 
        List<AdvancedSearchFilterParams> advancedFilters = Arrays.asList(); // List<AdvancedSearchFilterParams> | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        SongSortRule sort = SongSortRule.fromValue("None"); // SongSortRule | 
        Boolean preferAccurateMatches = false; // Boolean | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        SongOptionalFields fields = SongOptionalFields.fromValue("None"); // SongOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        Integer minMilliBpm = 56; // Integer | 
        Integer maxMilliBpm = 56; // Integer | 
        Integer minLength = 56; // Integer | 
        Integer maxLength = 56; // Integer | 
        try {
            SongForApiContractPartialFindResult result = apiInstance.apiSongsGet(query, songTypes, afterDate, beforeDate, tagName, tagId, childTags, unifyTypesAndTags, artistId, artistParticipationStatus, childVoicebanks, includeMembers, onlyWithPvs, pvServices, since, minScore, userCollectionId, releaseEventId, parentSongId, status, advancedFilters, start, maxResults, getTotalCount, sort, preferAccurateMatches, nameMatchMode, fields, lang, minMilliBpm, maxMilliBpm, minLength, maxLength);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsGet");
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
| **songTypes** | **String**|  | [optional] |
| **afterDate** | **LocalDateTime**|  | [optional] |
| **beforeDate** | **LocalDateTime**|  | [optional] |
| **tagName** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tagId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **childTags** | **Boolean**|  | [optional] [default to false] |
| **unifyTypesAndTags** | **Boolean**|  | [optional] [default to false] |
| **artistId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **artistParticipationStatus** | [**ArtistAlbumParticipationStatus**](.md)|  | [optional] [enum: Everything, OnlyMainAlbums, OnlyCollaborations] |
| **childVoicebanks** | **Boolean**|  | [optional] [default to false] |
| **includeMembers** | **Boolean**|  | [optional] [default to false] |
| **onlyWithPvs** | **Boolean**|  | [optional] [default to false] |
| **pvServices** | [**PVServices**](.md)|  | [optional] [enum: Nothing, NicoNicoDouga, Youtube, SoundCloud, Vimeo, Piapro, Bilibili, File, LocalFile, Creofuga, Bandcamp] |
| **since** | **Integer**|  | [optional] |
| **minScore** | **Integer**|  | [optional] |
| **userCollectionId** | **Integer**|  | [optional] |
| **releaseEventId** | **Integer**|  | [optional] |
| **parentSongId** | **Integer**|  | [optional] |
| **status** | [**EntryStatus**](.md)|  | [optional] [enum: Draft, Finished, Approved, Locked] |
| **advancedFilters** | [**List&lt;AdvancedSearchFilterParams&gt;**](AdvancedSearchFilterParams.md)|  | [optional] |
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **getTotalCount** | **Boolean**|  | [optional] [default to false] |
| **sort** | [**SongSortRule**](.md)|  | [optional] [enum: None, Name, AdditionDate, PublishDate, FavoritedTimes, RatingScore, TagUsageCount] |
| **preferAccurateMatches** | **Boolean**|  | [optional] [default to false] |
| **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words] |
| **fields** | [**SongOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Albums, Artists, Lyrics, MainPicture, Names, PVs, ReleaseEvent, Tags, ThumbUrl, WebLinks, Bpm] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |
| **minMilliBpm** | **Integer**|  | [optional] |
| **maxMilliBpm** | **Integer**|  | [optional] |
| **minLength** | **Integer**|  | [optional] |
| **maxLength** | **Integer**|  | [optional] |

### Return type

[**SongForApiContractPartialFindResult**](SongForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiSongsHighlightedGet

> List&lt;SongForApiContract&gt; apiSongsHighlightedGet(languagePreference, fields)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        ContentLanguagePreference languagePreference = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        SongOptionalFields fields = SongOptionalFields.fromValue("None"); // SongOptionalFields | 
        try {
            List<SongForApiContract> result = apiInstance.apiSongsHighlightedGet(languagePreference, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsHighlightedGet");
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
| **fields** | [**SongOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Albums, Artists, Lyrics, MainPicture, Names, PVs, ReleaseEvent, Tags, ThumbUrl, WebLinks, Bpm] |

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


## apiSongsIdCommentsGet

> List&lt;CommentForApiContract&gt; apiSongsIdCommentsGet(id)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            List<CommentForApiContract> result = apiInstance.apiSongsIdCommentsGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsIdCommentsGet");
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


## apiSongsIdCommentsPost

> CommentForApiContract apiSongsIdCommentsPost(id, commentForApiContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        Integer id = 56; // Integer | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            CommentForApiContract result = apiInstance.apiSongsIdCommentsPost(id, commentForApiContract);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsIdCommentsPost");
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


## apiSongsIdDelete

> apiSongsIdDelete(id, notes)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        Integer id = 56; // Integer | 
        String notes = ""; // String | 
        try {
            apiInstance.apiSongsIdDelete(id, notes);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsIdDelete");
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


## apiSongsIdDerivedGet

> List&lt;SongForApiContract&gt; apiSongsIdDerivedGet(id, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        Integer id = 56; // Integer | 
        SongOptionalFields fields = SongOptionalFields.fromValue("None"); // SongOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            List<SongForApiContract> result = apiInstance.apiSongsIdDerivedGet(id, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsIdDerivedGet");
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
| **fields** | [**SongOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Albums, Artists, Lyrics, MainPicture, Names, PVs, ReleaseEvent, Tags, ThumbUrl, WebLinks, Bpm] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

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


## apiSongsIdGet

> SongForApiContract apiSongsIdGet(id, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        Integer id = 56; // Integer | 
        SongOptionalFields fields = SongOptionalFields.fromValue("None"); // SongOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            SongForApiContract result = apiInstance.apiSongsIdGet(id, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsIdGet");
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
| **fields** | [**SongOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Albums, Artists, Lyrics, MainPicture, Names, PVs, ReleaseEvent, Tags, ThumbUrl, WebLinks, Bpm] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**SongForApiContract**](SongForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiSongsIdRatingsGet

> List&lt;RatedSongForUserForApiContract&gt; apiSongsIdRatingsGet(id, userFields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        Integer id = 56; // Integer | 
        UserOptionalFields userFields = UserOptionalFields.fromValue("None"); // UserOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            List<RatedSongForUserForApiContract> result = apiInstance.apiSongsIdRatingsGet(id, userFields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsIdRatingsGet");
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
| **userFields** | [**UserOptionalFields**](.md)|  | [optional] [enum: None, KnownLanguages, MainPicture, OldUsernames] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**List&lt;RatedSongForUserForApiContract&gt;**](RatedSongForUserForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiSongsIdRatingsPost

> apiSongsIdRatingsPost(id, songRatingContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        Integer id = 56; // Integer | 
        SongRatingContract songRatingContract = new SongRatingContract(); // SongRatingContract | 
        try {
            apiInstance.apiSongsIdRatingsPost(id, songRatingContract);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsIdRatingsPost");
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
| **songRatingContract** | [**SongRatingContract**](SongRatingContract.md)|  | [optional] |

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


## apiSongsIdRelatedGet

> RelatedSongsContract apiSongsIdRelatedGet(id, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        Integer id = 56; // Integer | 
        SongOptionalFields fields = SongOptionalFields.fromValue("None"); // SongOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            RelatedSongsContract result = apiInstance.apiSongsIdRelatedGet(id, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsIdRelatedGet");
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
| **fields** | [**SongOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Albums, Artists, Lyrics, MainPicture, Names, PVs, ReleaseEvent, Tags, ThumbUrl, WebLinks, Bpm] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**RelatedSongsContract**](RelatedSongsContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiSongsLyricsLyricsIdGet

> LyricsForSongContract apiSongsLyricsLyricsIdGet(lyricsId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        Integer lyricsId = 56; // Integer | 
        try {
            LyricsForSongContract result = apiInstance.apiSongsLyricsLyricsIdGet(lyricsId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsLyricsLyricsIdGet");
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
| **lyricsId** | **Integer**|  | |

### Return type

[**LyricsForSongContract**](LyricsForSongContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiSongsNamesGet

> List&lt;String&gt; apiSongsNamesGet(query, nameMatchMode, maxResults)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        String query = ""; // String | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        Integer maxResults = 15; // Integer | 
        try {
            List<String> result = apiInstance.apiSongsNamesGet(query, nameMatchMode, maxResults);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsNamesGet");
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


## apiSongsTopRatedGet

> List&lt;SongForApiContract&gt; apiSongsTopRatedGet(durationHours, startDate, filterBy, vocalist, maxResults, fields, languagePreference)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.SongApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SongApiApi apiInstance = new SongApiApi(defaultClient);
        Integer durationHours = 56; // Integer | 
        LocalDateTime startDate = new LocalDateTime(); // LocalDateTime | 
        TopSongsDateFilterType filterBy = TopSongsDateFilterType.fromValue("CreateDate"); // TopSongsDateFilterType | 
        SongVocalistSelection vocalist = SongVocalistSelection.fromValue("Nothing"); // SongVocalistSelection | 
        Integer maxResults = 25; // Integer | 
        SongOptionalFields fields = SongOptionalFields.fromValue("None"); // SongOptionalFields | 
        ContentLanguagePreference languagePreference = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            List<SongForApiContract> result = apiInstance.apiSongsTopRatedGet(durationHours, startDate, filterBy, vocalist, maxResults, fields, languagePreference);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SongApiApi#apiSongsTopRatedGet");
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
| **durationHours** | **Integer**|  | [optional] |
| **startDate** | **LocalDateTime**|  | [optional] |
| **filterBy** | [**TopSongsDateFilterType**](.md)|  | [optional] [enum: CreateDate, PublishDate, Popularity] |
| **vocalist** | [**SongVocalistSelection**](.md)|  | [optional] [enum: Nothing, Vocaloid, UTAU, Other] |
| **maxResults** | **Integer**|  | [optional] [default to 25] |
| **fields** | [**SongOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Albums, Artists, Lyrics, MainPicture, Names, PVs, ReleaseEvent, Tags, ThumbUrl, WebLinks, Bpm] |
| **languagePreference** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

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

