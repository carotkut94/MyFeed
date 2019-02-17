package com.death.myfeed.model.dto;

import android.widget.ImageView;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.squareup.picasso.Picasso;

import androidx.databinding.BindingAdapter;

/**
 * Awesome Pojo Generator
 */
public class Sender {
    @SerializedName("friendlyId")
    @Expose
    private String friendlyId;
    @SerializedName("webPath")
    @Expose
    private String webPath;
    @SerializedName("isIdentityVerified")
    @Expose
    private Boolean isIdentityVerified;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("microThumbnailUrl")
    @Expose
    private String microThumbnailUrl;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("thumbnailUrl")
    @Expose
    private String thumbnailUrl;

    public String getFriendlyId() {
        return friendlyId;
    }

    public void setFriendlyId(String friendlyId) {
        this.friendlyId = friendlyId;
    }

    public String getWebPath() {
        return webPath;
    }

    public void setWebPath(String webPath) {
        this.webPath = webPath;
    }

    public Boolean getIsIdentityVerified() {
        return isIdentityVerified;
    }

    public void setIsIdentityVerified(Boolean isIdentityVerified) {
        this.isIdentityVerified = isIdentityVerified;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMicroThumbnailUrl() {
        return microThumbnailUrl;
    }

    public void setMicroThumbnailUrl(String microThumbnailUrl) {
        this.microThumbnailUrl = microThumbnailUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView view, String imageUrl) {
        Picasso.get()
                .load(imageUrl)
                .into(view);
    }
}