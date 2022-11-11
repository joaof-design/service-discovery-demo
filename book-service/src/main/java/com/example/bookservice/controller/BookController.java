package com.example.bookservice.controller;

import com.example.bookservice.controller.dto.BookDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/author/{authorId}/books")
    public List<BookDto> getBooks() {
        List<BookDto> books = new ArrayList<>();

        books.add(BookDto.builder().name("Harry Potter").publisherName("Texto Editora").build());
        books.add(BookDto.builder().name("Design Patterns").publisherName("Texto Editora").build());

        return books;
    }
}
