package com.mmcneil.spring_boot_deezer_music_store.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Genre {
    private int id;
    private String name;
    private String picture;
    @JsonProperty("picture_small")
    private String pictureSmall;
    @JsonProperty("picture_medium")
    private String pictureMedium;
    @JsonProperty("picture_big")
    private String pictureBig;
    @JsonProperty("picture_xl")
    private String pictureXl;

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPicture() { return picture; }
    public String getPictureSmall() { return pictureSmall; }
    public String getPictureMedium() { return pictureMedium; }
    public String getPictureBig() { return pictureBig; }
    public String getPictureXl() { return pictureXl; }
}