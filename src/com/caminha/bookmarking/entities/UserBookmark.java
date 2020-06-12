package com.caminha.bookmarking.entities;

import lombok.Data;

@Data
public class UserBookmark {
    private User user;
    private BookMark bookMark;
}
