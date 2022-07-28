package com.Informatorio.NewsArticlesApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Informatorio.NewsArticlesApi.domain.Source;

@Repository
public interface SourceRepository extends JpaRepository <Source, Long> {
    
}
