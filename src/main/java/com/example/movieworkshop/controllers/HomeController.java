package com.example.movieworkshop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.movieworkshop.view.ViewMovie;

@RestController
public class HomeController {

    ViewMovie viewMovie = new ViewMovie();

    @GetMapping("/first")
    public String firstMessage(){
        String welcomeMessage = viewMovie.getWelcomeMessage();
        return welcomeMessage;
    }
}
