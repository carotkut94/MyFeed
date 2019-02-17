package com.death.myfeed.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Awesome Pojo Generator
 */
public class Metadata {
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}