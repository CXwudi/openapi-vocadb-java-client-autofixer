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
import mikufan.cx.vocadbapiclient.model.ArtistForApiContract;
import mikufan.cx.vocadbapiclient.model.ArtistForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.ArtistOptionalFields;
import mikufan.cx.vocadbapiclient.model.ArtistRelationsFields;
import mikufan.cx.vocadbapiclient.model.ArtistSortRule;
import mikufan.cx.vocadbapiclient.model.CommentForApiContract;
import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
import mikufan.cx.vocadbapiclient.model.EntryStatus;
import mikufan.cx.vocadbapiclient.model.NameMatchMode;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ArtistApiApi
 */
@Ignore
public class ArtistApiApiTest {

    private final ArtistApiApi api = new ArtistApiApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiArtistsCommentsCommentIdDeleteTest() {
        Integer commentId = null;

        api.apiArtistsCommentsCommentIdDelete(commentId);

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
    public void apiArtistsCommentsCommentIdPostTest() {
        Integer commentId = null;
        CommentForApiContract commentForApiContract = null;

        api.apiArtistsCommentsCommentIdPost(commentId, commentForApiContract);

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
    public void apiArtistsGetTest() {
        String query = null;
        String artistTypes = null;
        Boolean allowBaseVoicebanks = null;
        List<String> tagName = null;
        List<Integer> tagId = null;
        Boolean childTags = null;
        Integer followedByUserId = null;
        EntryStatus status = null;
        List<AdvancedSearchFilterParams> advancedFilters = null;
        Integer start = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        ArtistSortRule sort = null;
        Boolean preferAccurateMatches = null;
        NameMatchMode nameMatchMode = null;
        ArtistOptionalFields fields = null;
        ContentLanguagePreference lang = null;
        List<String> languages = null;

        ArtistForApiContractPartialFindResult response = api.apiArtistsGet(query, artistTypes, allowBaseVoicebanks, tagName, tagId, childTags, followedByUserId, status, advancedFilters, start, maxResults, getTotalCount, sort, preferAccurateMatches, nameMatchMode, fields, lang, languages);

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
    public void apiArtistsIdCommentsGetTest() {
        Integer id = null;

        List<CommentForApiContract> response = api.apiArtistsIdCommentsGet(id);

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
    public void apiArtistsIdCommentsPostTest() {
        Integer id = null;
        CommentForApiContract commentForApiContract = null;

        CommentForApiContract response = api.apiArtistsIdCommentsPost(id, commentForApiContract);

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
    public void apiArtistsIdDeleteTest() {
        Integer id = null;
        String notes = null;

        api.apiArtistsIdDelete(id, notes);

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
    public void apiArtistsIdGetTest() {
        Integer id = null;
        ArtistOptionalFields fields = null;
        ArtistRelationsFields relations = null;
        ContentLanguagePreference lang = null;

        ArtistForApiContract response = api.apiArtistsIdGet(id, fields, relations, lang);

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
    public void apiArtistsNamesGetTest() {
        String query = null;
        NameMatchMode nameMatchMode = null;
        Integer maxResults = null;

        List<String> response = api.apiArtistsNamesGet(query, nameMatchMode, maxResults);

        // TODO: test validations
    }
    
}
