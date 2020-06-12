package com.caminha.bookmarking.entities;

import lombok.Data;

@Data
public class Movie extends BookMark {
    private int releaseYear;
    private String[] cast;
    private String[] directors;
    private String genre;
    private double imdbRating;
}
