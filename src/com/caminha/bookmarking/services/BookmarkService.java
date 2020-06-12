package com.caminha.bookmarking.services;

import com.caminha.bookmarking.entities.Book;
import com.caminha.bookmarking.entities.BookMark;
import com.caminha.bookmarking.entities.Movie;

public class BookmarkService {
    public static BookmarkService instance = new BookmarkService();

    private BookmarkService() {
    }

    public BookmarkService getInstance() {
        return instance;
    }

    public Movie createMovie(int id, String title, String profileUrl, int releaseYear,
                             String[] cast, String[] directors, String genre, double imdbRating) {

        Movie movie = new Movie();
        movie.setId(id);
        movie.setProfileUrl(profileUrl);
        movie.setReleaseYear(releaseYear);
        movie.setCast(cast);
        movie.setDirectors(directors);
        movie.setGenre(genre);
        movie.setImdbRating(imdbRating);

        return  movie;
    }

    public Book createBook(int id, String title, String profileUrl, int publicationYear,
                            String[] authors, String publisher, String genre, double amazonRating) {

        Book book = new Book();
        book.setId(id);
        book.setProfileUrl(profileUrl);
        book.setPublicationYear(publicationYear);
        book.setAuthors(authors);
        book.setPublisher(publisher);
        book.setGenre(genre);
        book.setAmazonRating(amazonRating);

        return  book;
    }
}
