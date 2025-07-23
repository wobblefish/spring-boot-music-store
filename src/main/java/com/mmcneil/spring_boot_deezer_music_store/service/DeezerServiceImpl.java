package com.mmcneil.spring_boot_deezer_music_store.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class DeezerServiceImpl implements DeezerService {

    private final RestTemplate rest;

    private DeezerServiceImpl(RestTemplateBuilder builder) {
        this.rest = builder.build();
    }

//    public List<Album> searchAlbums(String query) {
//        String url = "https://api.deezer.com/search/album?q=" + (UriUtils.encode(query, StandardCharsets.UTF_8);
//        DeezerSearchResponse response = rest.getForObject(url, DeezerSearchResponse.class);
//        return response != null ? response.getData() : Collections.emptyList();
//
//    }
}
