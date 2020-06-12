package com.caminha.bookmarking.entities;

import lombok.Data;

@Data
public class User {
    private long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private int gender;
    private String userType;
}
