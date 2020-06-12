package com.caminha.bookmarking.entities;

import lombok.Data;

@Data
public class Book extends BookMark{
    private int publicationYear;
    private String publisher;
    private String[] authors;
    private String genre;
    private double amazonRating;
}
