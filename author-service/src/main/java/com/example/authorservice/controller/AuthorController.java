package com.example.authorservice.controller;

import com.example.authorservice.controller.dto.AuthorDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    @GetMapping("/author/{authorId}")
    public AuthorDto getAuthor(@PathVariable("authorId") int authorId) {
        return AuthorDto.builder().name("Joao").age(20).build();
    }
}
