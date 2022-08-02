/*
 * VocaDbWeb
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.model.AdvancedSearchFilterParams;
import mikufan.cx.vocadbapiclient.model.AlbumForUserForApiContract;
import mikufan.cx.vocadbapiclient.model.AlbumForUserForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.AlbumOptionalFields;
import mikufan.cx.vocadbapiclient.model.AlbumSortRule;
import mikufan.cx.vocadbapiclient.model.ArtistForUserForApiContract;
import mikufan.cx.vocadbapiclient.model.ArtistForUserForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.ArtistOptionalFields;
import mikufan.cx.vocadbapiclient.model.ArtistSortRule;
import mikufan.cx.vocadbapiclient.model.ArtistType;
import mikufan.cx.vocadbapiclient.model.CommentForApiContract;
import mikufan.cx.vocadbapiclient.model.CommentForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
import mikufan.cx.vocadbapiclient.model.CreateReportModel;
import mikufan.cx.vocadbapiclient.model.DiscType;
import mikufan.cx.vocadbapiclient.model.EntryEditDataContract;
import mikufan.cx.vocadbapiclient.model.EntryType;
import java.time.LocalDateTime;
import mikufan.cx.vocadbapiclient.model.LogicalGrouping;
import mikufan.cx.vocadbapiclient.model.MediaType;
import mikufan.cx.vocadbapiclient.model.NameMatchMode;
import mikufan.cx.vocadbapiclient.model.PVServices;
import mikufan.cx.vocadbapiclient.model.PurchaseStatus;
import mikufan.cx.vocadbapiclient.model.PurchaseStatuses;
import mikufan.cx.vocadbapiclient.model.RatedSongForUserForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.RatedSongForUserSortRule;
import mikufan.cx.vocadbapiclient.model.ReleaseEventForApiContract;
import mikufan.cx.vocadbapiclient.model.SongListForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.SongListOptionalFields;
import mikufan.cx.vocadbapiclient.model.SongListSortRule;
import mikufan.cx.vocadbapiclient.model.SongOptionalFields;
import mikufan.cx.vocadbapiclient.model.SongVoteRating;
import mikufan.cx.vocadbapiclient.model.TagBaseContract;
import mikufan.cx.vocadbapiclient.model.UserEventRelationshipType;
import mikufan.cx.vocadbapiclient.model.UserForApiContract;
import mikufan.cx.vocadbapiclient.model.UserForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.UserGroupId;
import mikufan.cx.vocadbapiclient.model.UserInboxType;
import mikufan.cx.vocadbapiclient.model.UserMessageContract;
import mikufan.cx.vocadbapiclient.model.UserMessageContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.UserOptionalFields;
import mikufan.cx.vocadbapiclient.model.UserSortRule;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApiApi
 */
@Ignore
public class UserApiApiTest {

    private final UserApiApi api = new UserApiApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersCurrentAlbumCollectionStatusesAlbumIdGetTest() {
        Integer albumId = null;
        AlbumForUserForApiContract response = api.apiUsersCurrentAlbumCollectionStatusesAlbumIdGet(albumId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersCurrentAlbumsAlbumIdPostTest() {
        Integer albumId = null;
        PurchaseStatus collectionStatus = null;
        MediaType mediaType = null;
        Integer rating = null;
        String response = api.apiUsersCurrentAlbumsAlbumIdPost(albumId, collectionStatus, mediaType, rating);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersCurrentFollowedArtistsArtistIdGetTest() {
        Integer artistId = null;
        ArtistForUserForApiContract response = api.apiUsersCurrentFollowedArtistsArtistIdGet(artistId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersCurrentFollowedTagsTagIdDeleteTest() {
        Integer tagId = null;
        api.apiUsersCurrentFollowedTagsTagIdDelete(tagId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersCurrentFollowedTagsTagIdPostTest() {
        Integer tagId = null;
        api.apiUsersCurrentFollowedTagsTagIdPost(tagId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersCurrentGetTest() {
        UserOptionalFields fields = null;
        UserForApiContract response = api.apiUsersCurrentGet(fields);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersCurrentRatedSongsSongIdGetTest() {
        Integer songId = null;
        SongVoteRating response = api.apiUsersCurrentRatedSongsSongIdGet(songId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersCurrentRefreshEntryEditPostTest() {
        EntryType entryType = null;
        Integer entryId = null;
        EntryEditDataContract response = api.apiUsersCurrentRefreshEntryEditPost(entryType, entryId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersCurrentSongTagsSongIdPostTest() {
        Integer songId = null;
        List<TagBaseContract> tagBaseContract = null;
        api.apiUsersCurrentSongTagsSongIdPost(songId, tagBaseContract);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersGetTest() {
        String query = null;
        UserGroupId groups = null;
        LocalDateTime joinDateAfter = null;
        LocalDateTime joinDateBefore = null;
        NameMatchMode nameMatchMode = null;
        Integer start = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        UserSortRule sort = null;
        Boolean includeDisabled = null;
        Boolean onlyVerified = null;
        String knowsLanguage = null;
        UserOptionalFields fields = null;
        UserForApiContractPartialFindResult response = api.apiUsersGet(query, groups, joinDateAfter, joinDateBefore, nameMatchMode, start, maxResults, getTotalCount, sort, includeDisabled, onlyVerified, knowsLanguage, fields);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdAlbumCollectionStatusesAlbumIdGetTest() {
        Integer id = null;
        Integer albumId = null;
        AlbumForUserForApiContract response = api.apiUsersIdAlbumCollectionStatusesAlbumIdGet(id, albumId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdAlbumsGetTest() {
        Integer id = null;
        String query = null;
        Integer tagId = null;
        String tag = null;
        Integer artistId = null;
        PurchaseStatuses purchaseStatuses = null;
        Integer releaseEventId = null;
        DiscType albumTypes = null;
        List<AdvancedSearchFilterParams> advancedFilters = null;
        Integer start = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        AlbumSortRule sort = null;
        NameMatchMode nameMatchMode = null;
        AlbumOptionalFields fields = null;
        ContentLanguagePreference lang = null;
        MediaType mediaType = null;
        AlbumForUserForApiContractPartialFindResult response = api.apiUsersIdAlbumsGet(id, query, tagId, tag, artistId, purchaseStatuses, releaseEventId, albumTypes, advancedFilters, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang, mediaType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdEventsGetTest() {
        Integer id = null;
        UserEventRelationshipType relationshipType = null;
        List<ReleaseEventForApiContract> response = api.apiUsersIdEventsGet(id, relationshipType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdFollowedArtistsArtistIdGetTest() {
        Integer id = null;
        Integer artistId = null;
        ArtistForUserForApiContract response = api.apiUsersIdFollowedArtistsArtistIdGet(id, artistId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdFollowedArtistsGetTest() {
        Integer id = null;
        String query = null;
        List<Integer> tagId = null;
        ArtistType artistType = null;
        Integer start = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        ArtistSortRule sort = null;
        NameMatchMode nameMatchMode = null;
        ArtistOptionalFields fields = null;
        ContentLanguagePreference lang = null;
        ArtistForUserForApiContractPartialFindResult response = api.apiUsersIdFollowedArtistsGet(id, query, tagId, artistType, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdGetTest() {
        Integer id = null;
        UserOptionalFields fields = null;
        UserForApiContract response = api.apiUsersIdGet(id, fields);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdMessagesDeleteTest() {
        Integer id = null;
        List<Integer> messageId = null;
        api.apiUsersIdMessagesDelete(id, messageId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdMessagesGetTest() {
        Integer id = null;
        UserInboxType inbox = null;
        Boolean unread = null;
        Integer anotherUserId = null;
        Integer start = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        UserMessageContractPartialFindResult response = api.apiUsersIdMessagesGet(id, inbox, unread, anotherUserId, start, maxResults, getTotalCount);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdMessagesPostTest() {
        Integer id = null;
        UserMessageContract userMessageContract = null;
        UserMessageContract response = api.apiUsersIdMessagesPost(id, userMessageContract);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdProfileCommentsGetTest() {
        Integer id = null;
        Integer start = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        CommentForApiContractPartialFindResult response = api.apiUsersIdProfileCommentsGet(id, start, maxResults, getTotalCount);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdProfileCommentsPostTest() {
        Integer id = null;
        CommentForApiContract commentForApiContract = null;
        CommentForApiContract response = api.apiUsersIdProfileCommentsPost(id, commentForApiContract);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdRatedSongsGetTest() {
        Integer id = null;
        String query = null;
        String tagName = null;
        List<Integer> tagId = null;
        List<Integer> artistId = null;
        Boolean childVoicebanks = null;
        LogicalGrouping artistGrouping = null;
        SongVoteRating rating = null;
        Integer songListId = null;
        Boolean groupByRating = null;
        PVServices pvServices = null;
        List<AdvancedSearchFilterParams> advancedFilters = null;
        Integer start = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        RatedSongForUserSortRule sort = null;
        NameMatchMode nameMatchMode = null;
        SongOptionalFields fields = null;
        ContentLanguagePreference lang = null;
        RatedSongForUserForApiContractPartialFindResult response = api.apiUsersIdRatedSongsGet(id, query, tagName, tagId, artistId, childVoicebanks, artistGrouping, rating, songListId, groupByRating, pvServices, advancedFilters, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdRatedSongsSongIdGetTest() {
        Integer id = null;
        Integer songId = null;
        SongVoteRating response = api.apiUsersIdRatedSongsSongIdGet(id, songId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdReportsPostTest() {
        Integer id = null;
        CreateReportModel createReportModel = null;
        Boolean response = api.apiUsersIdReportsPost(id, createReportModel);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdSettingsSettingNamePostTest() {
        Integer id = null;
        String settingName = null;
        String body = null;
        api.apiUsersIdSettingsSettingNamePost(id, settingName, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersIdSongListsGetTest() {
        Integer id = null;
        String query = null;
        List<Integer> tagId = null;
        Boolean childTags = null;
        NameMatchMode nameMatchMode = null;
        Integer start = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        SongListSortRule sort = null;
        SongListOptionalFields fields = null;
        SongListForApiContractPartialFindResult response = api.apiUsersIdSongListsGet(id, query, tagId, childTags, nameMatchMode, start, maxResults, getTotalCount, sort, fields);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersMessagesMessageIdGetTest() {
        Integer messageId = null;
        UserMessageContract response = api.apiUsersMessagesMessageIdGet(messageId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersNamesGetTest() {
        String query = null;
        NameMatchMode nameMatchMode = null;
        Integer maxResults = null;
        Boolean includeDisabled = null;
        List<String> response = api.apiUsersNamesGet(query, nameMatchMode, maxResults, includeDisabled);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersProfileCommentsCommentIdDeleteTest() {
        Integer commentId = null;
        api.apiUsersProfileCommentsCommentIdDelete(commentId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiUsersProfileCommentsCommentIdPostTest() {
        Integer commentId = null;
        CommentForApiContract commentForApiContract = null;
        api.apiUsersProfileCommentsCommentIdPost(commentId, commentForApiContract);

        // TODO: test validations
    }
    
}
