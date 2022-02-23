package com.example.movieworkshop.services;

import com.example.movieworkshop.models.Movie;
import com.example.movieworkshop.repositories.MovieHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class service {

    ArrayList<Movie> movies;
    private Random rand = new Random();

    public service(){
        MovieHandler fileHandler = new MovieHandler();
        movies = fileHandler.addFileToList();
    }

    public String getWelcomeMessage(){
        String welcomeMessage = "Welcome to Movie Facts Workshop" +
                "\nYou have four options in this application" +
                "\n/getFirst" +
                "\n/getRandom" +
                "\n/getTenSortByPopularity" +
                "\n/howManyWonAnAward";
        return welcomeMessage;
    }

    public String getFirstMovie(){
        String firstMovie = movies.get(0).toString();
        return firstMovie;
    }

    public String getRandomMovie(){
        String randMovie = movies.get(rand.nextInt(movies.size())+1).toString();
        return randMovie;
    }

    public ArrayList<Movie> getTenMovies(){
        ArrayList<Movie> topTen = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            topTen.add(movies.get(rand.nextInt(movies.size())+1));
        }
        Collections.sort(topTen);
        return topTen;
    }

    public int howManyAwards(){
        int count = 0;
        for(Movie m : movies){
            if (m.getHasAwards().equals("Yes")){
                count++;
            }
        }
        return count;
    }
}
