package com.example.libraryservice.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class LibraryDto {

    private AuthorDto author;
    private List<BookDto> books;
}
