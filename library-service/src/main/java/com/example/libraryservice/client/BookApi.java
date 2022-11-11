package com.example.libraryservice.client;

import com.example.libraryservice.controller.dto.BookDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("book-service")
public interface BookApi {

    @GetMapping("/author/{authorId}/books")
    public List<BookDto> getBooks(@PathVariable("authorId") int authorId);
}
