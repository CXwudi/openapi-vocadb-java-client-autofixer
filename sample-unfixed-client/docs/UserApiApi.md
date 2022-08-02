# UserApiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiUsersCurrentAlbumCollectionStatusesAlbumIdGet**](UserApiApi.md#apiUsersCurrentAlbumCollectionStatusesAlbumIdGet) | **GET** /api/users/current/album-collection-statuses/{albumId} |  |
| [**apiUsersCurrentAlbumsAlbumIdPost**](UserApiApi.md#apiUsersCurrentAlbumsAlbumIdPost) | **POST** /api/users/current/albums/{albumId} |  |
| [**apiUsersCurrentFollowedArtistsArtistIdGet**](UserApiApi.md#apiUsersCurrentFollowedArtistsArtistIdGet) | **GET** /api/users/current/followedArtists/{artistId} |  |
| [**apiUsersCurrentFollowedTagsTagIdDelete**](UserApiApi.md#apiUsersCurrentFollowedTagsTagIdDelete) | **DELETE** /api/users/current/followedTags/{tagId} |  |
| [**apiUsersCurrentFollowedTagsTagIdPost**](UserApiApi.md#apiUsersCurrentFollowedTagsTagIdPost) | **POST** /api/users/current/followedTags/{tagId} |  |
| [**apiUsersCurrentGet**](UserApiApi.md#apiUsersCurrentGet) | **GET** /api/users/current |  |
| [**apiUsersCurrentRatedSongsSongIdGet**](UserApiApi.md#apiUsersCurrentRatedSongsSongIdGet) | **GET** /api/users/current/ratedSongs/{songId} |  |
| [**apiUsersCurrentRefreshEntryEditPost**](UserApiApi.md#apiUsersCurrentRefreshEntryEditPost) | **POST** /api/users/current/refreshEntryEdit |  |
| [**apiUsersCurrentSongTagsSongIdPost**](UserApiApi.md#apiUsersCurrentSongTagsSongIdPost) | **POST** /api/users/current/songTags/{songId} |  |
| [**apiUsersGet**](UserApiApi.md#apiUsersGet) | **GET** /api/users |  |
| [**apiUsersIdAlbumCollectionStatusesAlbumIdGet**](UserApiApi.md#apiUsersIdAlbumCollectionStatusesAlbumIdGet) | **GET** /api/users/{id}/album-collection-statuses/{albumId} |  |
| [**apiUsersIdAlbumsGet**](UserApiApi.md#apiUsersIdAlbumsGet) | **GET** /api/users/{id}/albums |  |
| [**apiUsersIdEventsGet**](UserApiApi.md#apiUsersIdEventsGet) | **GET** /api/users/{id}/events |  |
| [**apiUsersIdFollowedArtistsArtistIdGet**](UserApiApi.md#apiUsersIdFollowedArtistsArtistIdGet) | **GET** /api/users/{id}/followedArtists/{artistId} |  |
| [**apiUsersIdFollowedArtistsGet**](UserApiApi.md#apiUsersIdFollowedArtistsGet) | **GET** /api/users/{id}/followedArtists |  |
| [**apiUsersIdGet**](UserApiApi.md#apiUsersIdGet) | **GET** /api/users/{id} |  |
| [**apiUsersIdMessagesDelete**](UserApiApi.md#apiUsersIdMessagesDelete) | **DELETE** /api/users/{id}/messages |  |
| [**apiUsersIdMessagesGet**](UserApiApi.md#apiUsersIdMessagesGet) | **GET** /api/users/{id}/messages |  |
| [**apiUsersIdMessagesPost**](UserApiApi.md#apiUsersIdMessagesPost) | **POST** /api/users/{id}/messages |  |
| [**apiUsersIdProfileCommentsGet**](UserApiApi.md#apiUsersIdProfileCommentsGet) | **GET** /api/users/{id}/profileComments |  |
| [**apiUsersIdProfileCommentsPost**](UserApiApi.md#apiUsersIdProfileCommentsPost) | **POST** /api/users/{id}/profileComments |  |
| [**apiUsersIdRatedSongsGet**](UserApiApi.md#apiUsersIdRatedSongsGet) | **GET** /api/users/{id}/ratedSongs |  |
| [**apiUsersIdRatedSongsSongIdGet**](UserApiApi.md#apiUsersIdRatedSongsSongIdGet) | **GET** /api/users/{id}/ratedSongs/{songId} |  |
| [**apiUsersIdReportsPost**](UserApiApi.md#apiUsersIdReportsPost) | **POST** /api/users/{id}/reports |  |
| [**apiUsersIdSettingsSettingNamePost**](UserApiApi.md#apiUsersIdSettingsSettingNamePost) | **POST** /api/users/{id}/settings/{settingName} |  |
| [**apiUsersIdSongListsGet**](UserApiApi.md#apiUsersIdSongListsGet) | **GET** /api/users/{id}/songLists |  |
| [**apiUsersMessagesMessageIdGet**](UserApiApi.md#apiUsersMessagesMessageIdGet) | **GET** /api/users/messages/{messageId} |  |
| [**apiUsersNamesGet**](UserApiApi.md#apiUsersNamesGet) | **GET** /api/users/names |  |
| [**apiUsersProfileCommentsCommentIdDelete**](UserApiApi.md#apiUsersProfileCommentsCommentIdDelete) | **DELETE** /api/users/profileComments/{commentId} |  |
| [**apiUsersProfileCommentsCommentIdPost**](UserApiApi.md#apiUsersProfileCommentsCommentIdPost) | **POST** /api/users/profileComments/{commentId} |  |



## apiUsersCurrentAlbumCollectionStatusesAlbumIdGet

> AlbumForUserForApiContract apiUsersCurrentAlbumCollectionStatusesAlbumIdGet(albumId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer albumId = 56; // Integer | 
        try {
            AlbumForUserForApiContract result = apiInstance.apiUsersCurrentAlbumCollectionStatusesAlbumIdGet(albumId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersCurrentAlbumCollectionStatusesAlbumIdGet");
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
| **albumId** | **Integer**|  | |

### Return type

[**AlbumForUserForApiContract**](AlbumForUserForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersCurrentAlbumsAlbumIdPost

> String apiUsersCurrentAlbumsAlbumIdPost(albumId, collectionStatus, mediaType, rating)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer albumId = 56; // Integer | 
        PurchaseStatus collectionStatus = PurchaseStatus.fromValue("Nothing"); // PurchaseStatus | 
        MediaType mediaType = MediaType.fromValue("PhysicalDisc"); // MediaType | 
        Integer rating = 56; // Integer | 
        try {
            String result = apiInstance.apiUsersCurrentAlbumsAlbumIdPost(albumId, collectionStatus, mediaType, rating);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersCurrentAlbumsAlbumIdPost");
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
| **albumId** | **Integer**|  | |
| **collectionStatus** | [**PurchaseStatus**](.md)|  | [optional] [enum: Nothing, Wishlisted, Ordered, Owned] |
| **mediaType** | [**MediaType**](.md)|  | [optional] [enum: PhysicalDisc, DigitalDownload, Other] |
| **rating** | **Integer**|  | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersCurrentFollowedArtistsArtistIdGet

> ArtistForUserForApiContract apiUsersCurrentFollowedArtistsArtistIdGet(artistId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer artistId = 56; // Integer | 
        try {
            ArtistForUserForApiContract result = apiInstance.apiUsersCurrentFollowedArtistsArtistIdGet(artistId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersCurrentFollowedArtistsArtistIdGet");
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
| **artistId** | **Integer**|  | |

### Return type

[**ArtistForUserForApiContract**](ArtistForUserForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersCurrentFollowedTagsTagIdDelete

> apiUsersCurrentFollowedTagsTagIdDelete(tagId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer tagId = 56; // Integer | 
        try {
            apiInstance.apiUsersCurrentFollowedTagsTagIdDelete(tagId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersCurrentFollowedTagsTagIdDelete");
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


## apiUsersCurrentFollowedTagsTagIdPost

> apiUsersCurrentFollowedTagsTagIdPost(tagId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer tagId = 56; // Integer | 
        try {
            apiInstance.apiUsersCurrentFollowedTagsTagIdPost(tagId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersCurrentFollowedTagsTagIdPost");
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


## apiUsersCurrentGet

> UserForApiContract apiUsersCurrentGet(fields)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        UserOptionalFields fields = UserOptionalFields.fromValue("None"); // UserOptionalFields | 
        try {
            UserForApiContract result = apiInstance.apiUsersCurrentGet(fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersCurrentGet");
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
| **fields** | [**UserOptionalFields**](.md)|  | [optional] [enum: None, KnownLanguages, MainPicture, OldUsernames] |

### Return type

[**UserForApiContract**](UserForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersCurrentRatedSongsSongIdGet

> SongVoteRating apiUsersCurrentRatedSongsSongIdGet(songId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer songId = 56; // Integer | 
        try {
            SongVoteRating result = apiInstance.apiUsersCurrentRatedSongsSongIdGet(songId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersCurrentRatedSongsSongIdGet");
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
| **songId** | **Integer**|  | |

### Return type

[**SongVoteRating**](SongVoteRating.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersCurrentRefreshEntryEditPost

> EntryEditDataContract apiUsersCurrentRefreshEntryEditPost(entryType, entryId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        EntryType entryType = EntryType.fromValue("Undefined"); // EntryType | 
        Integer entryId = 56; // Integer | 
        try {
            EntryEditDataContract result = apiInstance.apiUsersCurrentRefreshEntryEditPost(entryType, entryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersCurrentRefreshEntryEditPost");
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
| **entryType** | [**EntryType**](.md)|  | [optional] [enum: Undefined, Album, Artist, DiscussionTopic, PV, ReleaseEvent, ReleaseEventSeries, Song, SongList, Tag, User, Venue] |
| **entryId** | **Integer**|  | [optional] |

### Return type

[**EntryEditDataContract**](EntryEditDataContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersCurrentSongTagsSongIdPost

> apiUsersCurrentSongTagsSongIdPost(songId, tagBaseContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer songId = 56; // Integer | 
        List<TagBaseContract> tagBaseContract = Arrays.asList(); // List<TagBaseContract> | 
        try {
            apiInstance.apiUsersCurrentSongTagsSongIdPost(songId, tagBaseContract);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersCurrentSongTagsSongIdPost");
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
| **songId** | **Integer**|  | |
| **tagBaseContract** | [**List&lt;TagBaseContract&gt;**](TagBaseContract.md)|  | [optional] |

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


## apiUsersGet

> UserForApiContractPartialFindResult apiUsersGet(query, groups, joinDateAfter, joinDateBefore, nameMatchMode, start, maxResults, getTotalCount, sort, includeDisabled, onlyVerified, knowsLanguage, fields)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        String query = ""; // String | 
        UserGroupId groups = UserGroupId.fromValue("Nothing"); // UserGroupId | 
        LocalDateTime joinDateAfter = new LocalDateTime(); // LocalDateTime | 
        LocalDateTime joinDateBefore = new LocalDateTime(); // LocalDateTime | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        UserSortRule sort = UserSortRule.fromValue("RegisterDate"); // UserSortRule | 
        Boolean includeDisabled = false; // Boolean | 
        Boolean onlyVerified = false; // Boolean | 
        String knowsLanguage = "knowsLanguage_example"; // String | 
        UserOptionalFields fields = UserOptionalFields.fromValue("None"); // UserOptionalFields | 
        try {
            UserForApiContractPartialFindResult result = apiInstance.apiUsersGet(query, groups, joinDateAfter, joinDateBefore, nameMatchMode, start, maxResults, getTotalCount, sort, includeDisabled, onlyVerified, knowsLanguage, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersGet");
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
| **groups** | [**UserGroupId**](.md)|  | [optional] [enum: Nothing, Limited, Regular, Trusted, Moderator, Admin] |
| **joinDateAfter** | **LocalDateTime**|  | [optional] |
| **joinDateBefore** | **LocalDateTime**|  | [optional] |
| **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words] |
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **getTotalCount** | **Boolean**|  | [optional] [default to false] |
| **sort** | [**UserSortRule**](.md)|  | [optional] [enum: RegisterDate, Name, Group] |
| **includeDisabled** | **Boolean**|  | [optional] [default to false] |
| **onlyVerified** | **Boolean**|  | [optional] [default to false] |
| **knowsLanguage** | **String**|  | [optional] |
| **fields** | [**UserOptionalFields**](.md)|  | [optional] [enum: None, KnownLanguages, MainPicture, OldUsernames] |

### Return type

[**UserForApiContractPartialFindResult**](UserForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersIdAlbumCollectionStatusesAlbumIdGet

> AlbumForUserForApiContract apiUsersIdAlbumCollectionStatusesAlbumIdGet(id, albumId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        Integer albumId = 56; // Integer | 
        try {
            AlbumForUserForApiContract result = apiInstance.apiUsersIdAlbumCollectionStatusesAlbumIdGet(id, albumId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdAlbumCollectionStatusesAlbumIdGet");
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
| **albumId** | **Integer**|  | |

### Return type

[**AlbumForUserForApiContract**](AlbumForUserForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersIdAlbumsGet

> AlbumForUserForApiContractPartialFindResult apiUsersIdAlbumsGet(id, query, tagId, tag, artistId, purchaseStatuses, releaseEventId, albumTypes, advancedFilters, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang, mediaType)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        String query = ""; // String | 
        Integer tagId = 56; // Integer | 
        String tag = "tag_example"; // String | 
        Integer artistId = 56; // Integer | 
        PurchaseStatuses purchaseStatuses = PurchaseStatuses.fromValue("Nothing"); // PurchaseStatuses | 
        Integer releaseEventId = 0; // Integer | 
        DiscType albumTypes = DiscType.fromValue("Unknown"); // DiscType | 
        List<AdvancedSearchFilterParams> advancedFilters = Arrays.asList(); // List<AdvancedSearchFilterParams> | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        AlbumSortRule sort = AlbumSortRule.fromValue("None"); // AlbumSortRule | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        AlbumOptionalFields fields = AlbumOptionalFields.fromValue("None"); // AlbumOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        MediaType mediaType = MediaType.fromValue("PhysicalDisc"); // MediaType | 
        try {
            AlbumForUserForApiContractPartialFindResult result = apiInstance.apiUsersIdAlbumsGet(id, query, tagId, tag, artistId, purchaseStatuses, releaseEventId, albumTypes, advancedFilters, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang, mediaType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdAlbumsGet");
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
| **query** | **String**|  | [optional] [default to ] |
| **tagId** | **Integer**|  | [optional] |
| **tag** | **String**|  | [optional] |
| **artistId** | **Integer**|  | [optional] |
| **purchaseStatuses** | [**PurchaseStatuses**](.md)|  | [optional] [enum: Nothing, Wishlisted, Ordered, Owned, All] |
| **releaseEventId** | **Integer**|  | [optional] [default to 0] |
| **albumTypes** | [**DiscType**](.md)|  | [optional] [enum: Unknown, Album, Single, EP, SplitAlbum, Compilation, Video, Artbook, Game, Fanmade, Instrumental, Other] |
| **advancedFilters** | [**List&lt;AdvancedSearchFilterParams&gt;**](AdvancedSearchFilterParams.md)|  | [optional] |
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **getTotalCount** | **Boolean**|  | [optional] [default to false] |
| **sort** | [**AlbumSortRule**](.md)|  | [optional] [enum: None, Name, ReleaseDate, ReleaseDateWithNulls, AdditionDate, RatingAverage, RatingTotal, NameThenReleaseDate, CollectionCount] |
| **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words] |
| **fields** | [**AlbumOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Artists, Description, Discs, Identifiers, MainPicture, Names, PVs, ReleaseEvent, Tags, Tracks, WebLinks] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |
| **mediaType** | [**MediaType**](.md)|  | [optional] [enum: PhysicalDisc, DigitalDownload, Other] |

### Return type

[**AlbumForUserForApiContractPartialFindResult**](AlbumForUserForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersIdEventsGet

> List&lt;ReleaseEventForApiContract&gt; apiUsersIdEventsGet(id, relationshipType)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        UserEventRelationshipType relationshipType = UserEventRelationshipType.fromValue("Interested"); // UserEventRelationshipType | 
        try {
            List<ReleaseEventForApiContract> result = apiInstance.apiUsersIdEventsGet(id, relationshipType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdEventsGet");
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
| **relationshipType** | [**UserEventRelationshipType**](.md)|  | [optional] [enum: Interested, Attending] |

### Return type

[**List&lt;ReleaseEventForApiContract&gt;**](ReleaseEventForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersIdFollowedArtistsArtistIdGet

> ArtistForUserForApiContract apiUsersIdFollowedArtistsArtistIdGet(id, artistId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        Integer artistId = 56; // Integer | 
        try {
            ArtistForUserForApiContract result = apiInstance.apiUsersIdFollowedArtistsArtistIdGet(id, artistId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdFollowedArtistsArtistIdGet");
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
| **artistId** | **Integer**|  | |

### Return type

[**ArtistForUserForApiContract**](ArtistForUserForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersIdFollowedArtistsGet

> ArtistForUserForApiContractPartialFindResult apiUsersIdFollowedArtistsGet(id, query, tagId, artistType, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        String query = ""; // String | 
        List<Integer> tagId = Arrays.asList(); // List<Integer> | 
        ArtistType artistType = ArtistType.fromValue("Unknown"); // ArtistType | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        ArtistSortRule sort = ArtistSortRule.fromValue("None"); // ArtistSortRule | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        ArtistOptionalFields fields = ArtistOptionalFields.fromValue("None"); // ArtistOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            ArtistForUserForApiContractPartialFindResult result = apiInstance.apiUsersIdFollowedArtistsGet(id, query, tagId, artistType, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdFollowedArtistsGet");
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
| **query** | **String**|  | [optional] [default to ] |
| **tagId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **artistType** | [**ArtistType**](.md)|  | [optional] [enum: Unknown, Circle, Label, Producer, Animator, Illustrator, Lyricist, Vocaloid, UTAU, CeVIO, OtherVoiceSynthesizer, OtherVocalist, OtherGroup, OtherIndividual, Utaite, Band, Vocalist, Character, SynthesizerV, CoverArtist] |
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **getTotalCount** | **Boolean**|  | [optional] [default to false] |
| **sort** | [**ArtistSortRule**](.md)|  | [optional] [enum: None, Name, AdditionDate, AdditionDateAsc, ReleaseDate, SongCount, SongRating, FollowerCount] |
| **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words] |
| **fields** | [**ArtistOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, ArtistLinks, ArtistLinksReverse, BaseVoicebank, Description, MainPicture, Names, Tags, WebLinks] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**ArtistForUserForApiContractPartialFindResult**](ArtistForUserForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersIdGet

> UserForApiContract apiUsersIdGet(id, fields)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        UserOptionalFields fields = UserOptionalFields.fromValue("None"); // UserOptionalFields | 
        try {
            UserForApiContract result = apiInstance.apiUsersIdGet(id, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdGet");
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
| **fields** | [**UserOptionalFields**](.md)|  | [optional] [enum: None, KnownLanguages, MainPicture, OldUsernames] |

### Return type

[**UserForApiContract**](UserForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersIdMessagesDelete

> apiUsersIdMessagesDelete(id, messageId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        List<Integer> messageId = Arrays.asList(); // List<Integer> | 
        try {
            apiInstance.apiUsersIdMessagesDelete(id, messageId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdMessagesDelete");
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
| **messageId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |

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


## apiUsersIdMessagesGet

> UserMessageContractPartialFindResult apiUsersIdMessagesGet(id, inbox, unread, anotherUserId, start, maxResults, getTotalCount)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        UserInboxType inbox = UserInboxType.fromValue("Nothing"); // UserInboxType | 
        Boolean unread = false; // Boolean | 
        Integer anotherUserId = 56; // Integer | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        try {
            UserMessageContractPartialFindResult result = apiInstance.apiUsersIdMessagesGet(id, inbox, unread, anotherUserId, start, maxResults, getTotalCount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdMessagesGet");
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
| **inbox** | [**UserInboxType**](.md)|  | [optional] [enum: Nothing, Received, Sent, Notifications] |
| **unread** | **Boolean**|  | [optional] [default to false] |
| **anotherUserId** | **Integer**|  | [optional] |
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **getTotalCount** | **Boolean**|  | [optional] [default to false] |

### Return type

[**UserMessageContractPartialFindResult**](UserMessageContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersIdMessagesPost

> UserMessageContract apiUsersIdMessagesPost(id, userMessageContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        UserMessageContract userMessageContract = new UserMessageContract(); // UserMessageContract | 
        try {
            UserMessageContract result = apiInstance.apiUsersIdMessagesPost(id, userMessageContract);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdMessagesPost");
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
| **userMessageContract** | [**UserMessageContract**](UserMessageContract.md)|  | [optional] |

### Return type

[**UserMessageContract**](UserMessageContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersIdProfileCommentsGet

> CommentForApiContractPartialFindResult apiUsersIdProfileCommentsGet(id, start, maxResults, getTotalCount)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        try {
            CommentForApiContractPartialFindResult result = apiInstance.apiUsersIdProfileCommentsGet(id, start, maxResults, getTotalCount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdProfileCommentsGet");
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
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **getTotalCount** | **Boolean**|  | [optional] [default to false] |

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


## apiUsersIdProfileCommentsPost

> CommentForApiContract apiUsersIdProfileCommentsPost(id, commentForApiContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            CommentForApiContract result = apiInstance.apiUsersIdProfileCommentsPost(id, commentForApiContract);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdProfileCommentsPost");
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


## apiUsersIdRatedSongsGet

> RatedSongForUserForApiContractPartialFindResult apiUsersIdRatedSongsGet(id, query, tagName, tagId, artistId, childVoicebanks, artistGrouping, rating, songListId, groupByRating, pvServices, advancedFilters, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        String query = ""; // String | 
        String tagName = "tagName_example"; // String | 
        List<Integer> tagId = Arrays.asList(); // List<Integer> | 
        List<Integer> artistId = Arrays.asList(); // List<Integer> | 
        Boolean childVoicebanks = false; // Boolean | 
        LogicalGrouping artistGrouping = LogicalGrouping.fromValue("And"); // LogicalGrouping | 
        SongVoteRating rating = SongVoteRating.fromValue("Nothing"); // SongVoteRating | 
        Integer songListId = 56; // Integer | 
        Boolean groupByRating = true; // Boolean | 
        PVServices pvServices = PVServices.fromValue("Nothing"); // PVServices | 
        List<AdvancedSearchFilterParams> advancedFilters = Arrays.asList(); // List<AdvancedSearchFilterParams> | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        RatedSongForUserSortRule sort = RatedSongForUserSortRule.fromValue("None"); // RatedSongForUserSortRule | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        SongOptionalFields fields = SongOptionalFields.fromValue("None"); // SongOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            RatedSongForUserForApiContractPartialFindResult result = apiInstance.apiUsersIdRatedSongsGet(id, query, tagName, tagId, artistId, childVoicebanks, artistGrouping, rating, songListId, groupByRating, pvServices, advancedFilters, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdRatedSongsGet");
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
| **query** | **String**|  | [optional] [default to ] |
| **tagName** | **String**|  | [optional] |
| **tagId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **artistId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **childVoicebanks** | **Boolean**|  | [optional] [default to false] |
| **artistGrouping** | [**LogicalGrouping**](.md)|  | [optional] [enum: And, Or] |
| **rating** | [**SongVoteRating**](.md)|  | [optional] [enum: Nothing, Dislike, Like, Favorite] |
| **songListId** | **Integer**|  | [optional] |
| **groupByRating** | **Boolean**|  | [optional] [default to true] |
| **pvServices** | [**PVServices**](.md)|  | [optional] [enum: Nothing, NicoNicoDouga, Youtube, SoundCloud, Vimeo, Piapro, Bilibili, File, LocalFile, Creofuga, Bandcamp] |
| **advancedFilters** | [**List&lt;AdvancedSearchFilterParams&gt;**](AdvancedSearchFilterParams.md)|  | [optional] |
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **getTotalCount** | **Boolean**|  | [optional] [default to false] |
| **sort** | [**RatedSongForUserSortRule**](.md)|  | [optional] [enum: None, Name, AdditionDate, PublishDate, FavoritedTimes, RatingScore, RatingDate] |
| **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words] |
| **fields** | [**SongOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, Albums, Artists, Lyrics, MainPicture, Names, PVs, ReleaseEvent, Tags, ThumbUrl, WebLinks, Bpm] |
| **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English] |

### Return type

[**RatedSongForUserForApiContractPartialFindResult**](RatedSongForUserForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersIdRatedSongsSongIdGet

> SongVoteRating apiUsersIdRatedSongsSongIdGet(id, songId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        Integer songId = 56; // Integer | 
        try {
            SongVoteRating result = apiInstance.apiUsersIdRatedSongsSongIdGet(id, songId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdRatedSongsSongIdGet");
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
| **songId** | **Integer**|  | |

### Return type

[**SongVoteRating**](SongVoteRating.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersIdReportsPost

> Boolean apiUsersIdReportsPost(id, createReportModel)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        CreateReportModel createReportModel = new CreateReportModel(); // CreateReportModel | 
        try {
            Boolean result = apiInstance.apiUsersIdReportsPost(id, createReportModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdReportsPost");
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
| **createReportModel** | [**CreateReportModel**](CreateReportModel.md)|  | [optional] |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersIdSettingsSettingNamePost

> apiUsersIdSettingsSettingNamePost(id, settingName, body)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        String settingName = "settingName_example"; // String | 
        String body = "body_example"; // String | 
        try {
            apiInstance.apiUsersIdSettingsSettingNamePost(id, settingName, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdSettingsSettingNamePost");
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
| **settingName** | **String**|  | |
| **body** | **String**|  | [optional] |

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


## apiUsersIdSongListsGet

> SongListForApiContractPartialFindResult apiUsersIdSongListsGet(id, query, tagId, childTags, nameMatchMode, start, maxResults, getTotalCount, sort, fields)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer id = 56; // Integer | 
        String query = ""; // String | 
        List<Integer> tagId = Arrays.asList(); // List<Integer> | 
        Boolean childTags = false; // Boolean | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        SongListSortRule sort = SongListSortRule.fromValue("None"); // SongListSortRule | 
        SongListOptionalFields fields = SongListOptionalFields.fromValue("None"); // SongListOptionalFields | 
        try {
            SongListForApiContractPartialFindResult result = apiInstance.apiUsersIdSongListsGet(id, query, tagId, childTags, nameMatchMode, start, maxResults, getTotalCount, sort, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersIdSongListsGet");
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
| **query** | **String**|  | [optional] [default to ] |
| **tagId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **childTags** | **Boolean**|  | [optional] [default to false] |
| **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words] |
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **getTotalCount** | **Boolean**|  | [optional] [default to false] |
| **sort** | [**SongListSortRule**](.md)|  | [optional] [enum: None, Name, Date, CreateDate] |
| **fields** | [**SongListOptionalFields**](.md)|  | [optional] [enum: None, Description, Events, MainPicture, Tags] |

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


## apiUsersMessagesMessageIdGet

> UserMessageContract apiUsersMessagesMessageIdGet(messageId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer messageId = 56; // Integer | 
        try {
            UserMessageContract result = apiInstance.apiUsersMessagesMessageIdGet(messageId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersMessagesMessageIdGet");
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
| **messageId** | **Integer**|  | |

### Return type

[**UserMessageContract**](UserMessageContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiUsersNamesGet

> List&lt;String&gt; apiUsersNamesGet(query, nameMatchMode, maxResults, includeDisabled)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        String query = ""; // String | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        Integer maxResults = 10; // Integer | 
        Boolean includeDisabled = false; // Boolean | 
        try {
            List<String> result = apiInstance.apiUsersNamesGet(query, nameMatchMode, maxResults, includeDisabled);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersNamesGet");
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
| **includeDisabled** | **Boolean**|  | [optional] [default to false] |

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


## apiUsersProfileCommentsCommentIdDelete

> apiUsersProfileCommentsCommentIdDelete(commentId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer commentId = 56; // Integer | 
        try {
            apiInstance.apiUsersProfileCommentsCommentIdDelete(commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersProfileCommentsCommentIdDelete");
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


## apiUsersProfileCommentsCommentIdPost

> apiUsersProfileCommentsCommentIdPost(commentId, commentForApiContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.UserApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserApiApi apiInstance = new UserApiApi(defaultClient);
        Integer commentId = 56; // Integer | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            apiInstance.apiUsersProfileCommentsCommentIdPost(commentId, commentForApiContract);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApiApi#apiUsersProfileCommentsCommentIdPost");
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

