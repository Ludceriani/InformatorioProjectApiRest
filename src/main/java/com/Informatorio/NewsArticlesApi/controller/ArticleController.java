package com.Informatorio.NewsArticlesApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Informatorio.NewsArticlesApi.domain.Article;
import com.Informatorio.NewsArticlesApi.repository.ArticleRepository;

@RestController
public class ArticleController {

    public ArticleRepository articleRepository;

    @Autowired
    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    //Create Articles
    @PostMapping("/article")
    public Article createActor(@RequestBody Article article) {
        return articleRepository.save(article);
    }
}
