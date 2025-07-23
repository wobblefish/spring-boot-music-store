package com.mmcneil.spring_boot_deezer_music_store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeezerController {

    @GetMapping("/")
    public String hello() {
        return "Hello, and welcome to the future home of the Deezer Music Store!";
    }
}

