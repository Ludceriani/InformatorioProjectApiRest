package com.Informatorio.NewsArticlesApi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Informatorio.NewsArticlesApi.domain.Author;
import com.Informatorio.NewsArticlesApi.repository.AuthorRepository;

@RestController
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @PostMapping("/author")
    public Author createAuthor(@RequestBody Author author) {
        return authorRepository.save(author);       
    }
    
}
