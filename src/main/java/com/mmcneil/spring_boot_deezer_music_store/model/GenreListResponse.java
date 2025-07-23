package com.mmcneil.spring_boot_deezer_music_store.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GenreListResponse {
    @JsonProperty("data")
    private List<Genre> genres;

    public List<Genre> getGenres() { return genres; }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
}