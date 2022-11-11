package com.example.libraryservice.client;

import com.example.libraryservice.controller.dto.AuthorDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("author-service")
public interface AuthorApi {

    @GetMapping("/author/{authorId}")
    public AuthorDto getAuthor(@PathVariable("authorId") int authorId);
}
