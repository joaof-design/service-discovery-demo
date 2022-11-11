package com.example.libraryservice.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BookDto {

    private String name;
    private String publisherName;
}
