package com.mmcneil.spring_boot_deezer_music_store.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DeezerModelDeserializationTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    void testAlbumSearchDeserialization() throws Exception {
        InputStream is = getClass().getClassLoader().getResourceAsStream("sample-deezer-album-search.json");
        assertNotNull(is, "Sample JSON file not found");
        String json = new String(is.readAllBytes(), StandardCharsets.UTF_8);


    }
}
