package com.mmcneil.spring_boot_deezer_music_store.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Album implements Release {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private Artist artist;
    private String coverUrl;
    @JsonProperty("cover_small")
    private String coverSmall;
    @JsonProperty("cover_medium")
    private String coverMedium;
    @JsonProperty("cover_big")
    private String coverBig;
    @JsonProperty("cover_xl")
    private String coverXl;
    @JsonProperty("picture_small")
    private String pictureSmall;
    @JsonProperty("picture_medium")
    private String pictureMedium;
    @JsonProperty("picture_big")
    private String pictureBig;
    @JsonProperty("picture_xl")
    private String pictureXl;
    @JsonProperty("genre_id")
    private int genreId;
    private GenreListResponse genreListResponse;
    private String label;
    @JsonProperty("nb_tracks")
    private int nbTracks;
    private int duration;
    private int fans;
    @JsonProperty("release_date")
    private String releaseDate;
    private String tracklist;
    @JsonProperty("explicit_lyrics")
    private boolean explicitLyrics;
    @JsonProperty("explicit_content_lyrics")
    private int explicitContentLyrics;
    @JsonProperty("explicit_content_cover")
    private int explicitContentCover;
    private List<Artist> contributors;
    @OneToMany(mappedBy = "album")
    private List<Track> tracks = new ArrayList<>();

    private double price;
    private int quantity;

    public Album(int id, String title, Artist artist, String coverUrl) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.coverUrl = coverUrl;
        this.price = 9.99; // default for now
        this.quantity = 1;
    }

    @Override
    public long getId() { return id; }

    @Override
    public String getTitle() { return title; }

    @Override
    public String getArtist() { return artist != null ? artist.getName() : ""; }

    @Override
    public String getCoverSmall() { return coverUrl; }
    @Override
    public String getCoverMedium() { return coverMedium; }
    @Override
    public String getCoverBig() { return coverMedium; }
    @Override
    public String getCoverXl() { return coverMedium; }
    @Override
    public String getPictureSmall() { return coverMedium; }
    @Override
    public String getPictureMedium() { return coverMedium; }
    @Override
    public String getPictureBig() { return coverMedium; }
    @Override
    public String getPictureXl() { return coverMedium; }

    public int getDuration() { return duration; }

    public int getNbTracks() { return nbTracks; }

    public String getLabel() { return label; }

    @Override
    public String getType() { return "album"; }

    public String getCoverUrl() { return coverUrl; }

    public String getTracklist() { return tracklist; }

    public double getPrice() { return price; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void setPrice(int quantity) { this.quantity = quantity; }

    public List<Artist> getContributors() { return contributors; }

    public List<Track> getTracks() { return tracks; }

    public GenreListResponse getGenres() { return genreListResponse; }

    @Override
    public String toString() {
        return title + " by " + artist;
    }
}
