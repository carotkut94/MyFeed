package com.death.myfeed.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Awesome Pojo Generator
 */
public class FeedResponse {
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("attachments")
    @Expose
    private List<Attachments> attachments;
    @SerializedName("fromCache")
    @Expose
    private Boolean fromCache;
    @SerializedName("saved")
    @Expose
    private Boolean saved;
    @SerializedName("recentReactions")
    @Expose
    private List<RecentReactions> recentReactions;
    @SerializedName("likeCount")
    @Expose
    private Integer likeCount;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("liked")
    @Expose
    private Boolean liked;
    @SerializedName("shareCount")
    @Expose
    private Integer shareCount;
    @SerializedName("createdAt")
    @Expose
    private Long createdAt;
    @SerializedName("xid")
    @Expose
    private String xid;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("viewCount")
    @Expose
    private Integer viewCount;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("isFeatured")
    @Expose
    private Boolean isFeatured;
    @SerializedName("precantCount")
    @Expose
    private Integer precantCount;
    @SerializedName("isPNSent")
    @Expose
    private Boolean isPNSent;
    @SerializedName("isRepost")
    @Expose
    private Boolean isRepost;
    @SerializedName("postType")
    @Expose
    private String postType;
    @SerializedName("userFollowsPoster")
    @Expose
    private Boolean userFollowsPoster;
    @SerializedName("reactionCount")
    @Expose
    private Integer reactionCount;
    @SerializedName("parentId")
    @Expose
    private Object parentId;
    @SerializedName("commentCount")
    @Expose
    private Integer commentCount;
    @SerializedName("isHidden")
    @Expose
    private Boolean isHidden;
    @SerializedName("tags")
    @Expose
    private List<Tags> tags;
    @SerializedName("webPath")
    @Expose
    private String webPath;
    @SerializedName("sender")
    @Expose
    private Sender sender;
    @SerializedName("temple")
    @Expose
    private Integer temple;
    @SerializedName("user")
    @Expose
    private Integer user;
    @SerializedName("isValidPost")
    @Expose
    private Boolean isValidPost;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Attachments> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachments> attachments) {
        this.attachments = attachments;
    }

    public Boolean getFromCache() {
        return fromCache;
    }

    public void setFromCache(Boolean fromCache) {
        this.fromCache = fromCache;
    }

    public Boolean getSaved() {
        return saved;
    }

    public void setSaved(Boolean saved) {
        this.saved = saved;
    }

    public List<RecentReactions> getRecentReactions() {
        return recentReactions;
    }

    public void setRecentReactions(List<RecentReactions> recentReactions) {
        this.recentReactions = recentReactions;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getLiked() {
        return liked;
    }

    public void setLiked(Boolean liked) {
        this.liked = liked;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public String getXid() {
        return xid;
    }

    public void setXid(String xid) {
        this.xid = xid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsFeatured() {
        return isFeatured;
    }

    public void setIsFeatured(Boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    public Integer getPrecantCount() {
        return precantCount;
    }

    public void setPrecantCount(Integer precantCount) {
        this.precantCount = precantCount;
    }

    public Boolean getIsPNSent() {
        return isPNSent;
    }

    public void setIsPNSent(Boolean isPNSent) {
        this.isPNSent = isPNSent;
    }

    public Boolean getIsRepost() {
        return isRepost;
    }

    public void setIsRepost(Boolean isRepost) {
        this.isRepost = isRepost;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Boolean getUserFollowsPoster() {
        return userFollowsPoster;
    }

    public void setUserFollowsPoster(Boolean userFollowsPoster) {
        this.userFollowsPoster = userFollowsPoster;
    }

    public Integer getReactionCount() {
        return reactionCount;
    }

    public void setReactionCount(Integer reactionCount) {
        this.reactionCount = reactionCount;
    }

    public Object getParentId() {
        return parentId;
    }

    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public String getWebPath() {
        return webPath;
    }

    public void setWebPath(String webPath) {
        this.webPath = webPath;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Integer getTemple() {
        return temple;
    }

    public void setTemple(Integer temple) {
        this.temple = temple;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Boolean getIsValidPost() {
        return isValidPost;
    }

    public void setIsValidPost(Boolean isValidPost) {
        this.isValidPost = isValidPost;
    }
}