package com.example.movieworkshop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.movieworkshop.services.service;

@RestController
public class HomeController {

    service viewMovie = new service();

    @GetMapping("/")
    public String firstMessage(){
        String welcomeMessage = viewMovie.getWelcomeMessage();
        return welcomeMessage;
    }

    @GetMapping("/getFirst")
    public String getFirstMovie(){
        String firstMovie = viewMovie.getFirstMovie();
        return firstMovie;
    }

    @GetMapping("/getRandom")
    public String getRandomMovie(){
        String randoMovie = viewMovie.getRandomMovie();
        return randoMovie;
    }

    @GetMapping("/getTenSortByPopularity")
    public String getTenSortByPopularity(){
        String topTen = viewMovie.getTenMovies().toString();
        return topTen;
    }

    @GetMapping("/howManyWonAnAward")
    public int getHowManyWonAnAward(){
        int numAwards = viewMovie.howManyAwards();
        return numAwards;
    }

}
