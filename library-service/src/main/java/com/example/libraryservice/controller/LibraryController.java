package com.example.libraryservice.controller;

import com.example.libraryservice.client.AuthorApi;
import com.example.libraryservice.client.BookApi;
import com.example.libraryservice.controller.dto.LibraryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @Autowired
    private AuthorApi authorApi;

    @Autowired
    private BookApi bookApi;

    @GetMapping("/library/author/{authorId}")
    public LibraryDto getLibraryBooks(@PathVariable("authorId") int authorId) {
        return LibraryDto.builder()
                .author(authorApi.getAuthor(authorId))
                .books(bookApi.getBooks(authorId))
                .build();
    }
}
