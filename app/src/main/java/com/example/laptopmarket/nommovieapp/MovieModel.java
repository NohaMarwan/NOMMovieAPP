package com.example.laptopmarket.nommovieapp;

/**
 * Created by Laptop Market on 10/23/2016.
 */
public class MovieModel {
    private String movieImageViewUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public MovieModel() {

    }

    public MovieModel(String movieImageViewUrl, String title) {
        this.movieImageViewUrl = movieImageViewUrl;
        this.title = title;
    }

    public String getMovieImageViewUrl() {
        return movieImageViewUrl;
    }

    public void setMovieImageViewUrl(String movieImageViewUrl) {
        this.movieImageViewUrl = movieImageViewUrl;
    }
}