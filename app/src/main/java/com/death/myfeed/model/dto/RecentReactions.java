package com.death.myfeed.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Awesome Pojo Generator
 */
public class RecentReactions {
    @SerializedName("thumbnailUrlWithBackground")
    @Expose
    private String thumbnailUrlWithBackground;
    @SerializedName("nameKey")
    @Expose
    private String nameKey;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("staticUrl")
    @Expose
    private String staticUrl;
    @SerializedName("thumbnailUrl")
    @Expose
    private String thumbnailUrl;
    @SerializedName("selectedImageUrl")
    @Expose
    private String selectedImageUrl;

    public String getThumbnailUrlWithBackground() {
        return thumbnailUrlWithBackground;
    }

    public void setThumbnailUrlWithBackground(String thumbnailUrlWithBackground) {
        this.thumbnailUrlWithBackground = thumbnailUrlWithBackground;
    }

    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaticUrl() {
        return staticUrl;
    }

    public void setStaticUrl(String staticUrl) {
        this.staticUrl = staticUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getSelectedImageUrl() {
        return selectedImageUrl;
    }

    public void setSelectedImageUrl(String selectedImageUrl) {
        this.selectedImageUrl = selectedImageUrl;
    }
}