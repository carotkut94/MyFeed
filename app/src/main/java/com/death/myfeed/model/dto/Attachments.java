package com.death.myfeed.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Awesome Pojo Generator
 */
public class Attachments {
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("mobile_url")
    @Expose
    private String mobile_url;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("userName")
    @Expose
    private String userName;
    @SerializedName("thumbnail_url")
    @Expose
    private String thumbnail_url;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("userImage")
    @Expose
    private String userImage;
    @SerializedName("post")
    @Expose
    private Integer post;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("downsampled_url")
    @Expose
    private String downsampled_url;
    @SerializedName("watermark_url")
    @Expose
    private String watermark_url;
    @SerializedName("temple")
    @Expose
    private Integer temple;
    @SerializedName("medium_url")
    @Expose
    private String medium_url;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user")
    @Expose
    private Integer user;
    @SerializedName("duration")
    @Expose
    private Integer duration;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getMobile_url() {
        return mobile_url;
    }

    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getDownsampled_url() {
        return downsampled_url;
    }

    public void setDownsampled_url(String downsampled_url) {
        this.downsampled_url = downsampled_url;
    }

    public String getWatermark_url() {
        return watermark_url;
    }

    public void setWatermark_url(String watermark_url) {
        this.watermark_url = watermark_url;
    }

    public Integer getTemple() {
        return temple;
    }

    public void setTemple(Integer temple) {
        this.temple = temple;
    }

    public String getMedium_url() {
        return medium_url;
    }

    public void setMedium_url(String medium_url) {
        this.medium_url = medium_url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}