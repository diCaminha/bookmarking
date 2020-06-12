package com.caminha.bookmarking.entities;

import lombok.Data;

@Data
public class WebLink extends BookMark {
    private String url;
    private String host;
}
