package com.example.laptopmarket.nommovieapp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Laptop Market on 11/4/2016.
 */
public class JsonParser {
    public static List<MovieModel> parseJsonFeed(String feed){

        try {
            JSONObject jsonRootObject = new JSONObject(feed);//done
            //Get the instance of JSONArray that contains JSONObjects
            JSONArray jsonMoviesArray = jsonRootObject.optJSONArray("results");
            List<MovieModel> flowerList = new ArrayList<>();
            for (int i = 0; i < jsonMoviesArray.length(); i++) {
                JSONObject jsonObject = jsonMoviesArray.getJSONObject(i);
                String poster_path = "http://image.tmdb.org/t/p/w185/" + jsonObject.optString("poster_path");
                String backdrop_path = "http://image.tmdb.org/t/p/w185/" + jsonObject.optString("backdrop_path");
                String overview = jsonObject.optString("overview");
                String release_date = jsonObject.optString("release_date");
                String id = jsonObject.optString("id");
                String vote_average = jsonObject.optString("vote_average");
                String original_title = jsonObject.optString("original_title");
                MovieModel moviesPojo = new MovieModel();
                moviesPojo.setMovieImageViewUrl(poster_path);
                moviesPojo.setTitle(original_title);
                flowerList.add(moviesPojo);
            }
            return flowerList;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }


    }

}
