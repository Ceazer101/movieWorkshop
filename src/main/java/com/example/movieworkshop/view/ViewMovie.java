package com.example.movieworkshop.view;

import java.util.ArrayList;
import java.util.Random;

public class ViewMovie {

    ArrayList<Movie> movies;
    private Random rand = new Random();

    public ViewMovie(){
        FileHandler fileHandler = new FileHandler();
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
}
