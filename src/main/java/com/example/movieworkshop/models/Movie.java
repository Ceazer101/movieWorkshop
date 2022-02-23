package com.example.movieworkshop.models;

public class Movie implements Comparable<Movie>{

    private int year;
    private int length;
    private String title;
    private String genre;
    private int rating;
    private String hasAwards;

    public Movie(int year, int length, String title, String genre, int rating, String hasAwards) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.hasAwards = hasAwards;
    }

    public int compareTo(Movie other){
        return rating - other.rating;
    }

    public String getHasAwards() {
        return hasAwards;
    }

    @Override
    public String toString() {
        return year + " " + length + " minutes '" + title + "' " + genre + " rating: " + rating + " awards: " + hasAwards;
    }
}
