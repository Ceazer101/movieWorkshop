package com.example.movieworkshop.repositories;

import com.example.movieworkshop.models.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieHandler {

    public ArrayList<Movie> addFileToList() {
        ArrayList<Movie> allMovies = new ArrayList<>();
        File movieData = new File("data/imdb-data.csv");
        try {
            Scanner scan = new Scanner(movieData);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] stringArray = line.split(";");
                int releaseYear = Integer.parseInt(stringArray[0]);
                int lengthInMinutes = Integer.parseInt(stringArray[1]);
                String movieTitle = stringArray[2];
                String movieGenre = stringArray[3];
                int movieRating = Integer.parseInt(stringArray[4]);
                String hasAward = stringArray[5];
                Movie currentMovie = new Movie(releaseYear, lengthInMinutes, movieTitle, movieGenre, movieRating, hasAward);
                allMovies.add(currentMovie);

            }
        } catch (
                FileNotFoundException e) {
            System.out.println("Error: Could not find file.");
            e.printStackTrace();
        }
        return allMovies;
    }
}
