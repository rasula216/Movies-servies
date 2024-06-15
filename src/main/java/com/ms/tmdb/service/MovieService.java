package com.ms.tmdb.service;

import com.ms.tmdb.model.Movies;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MovieService {

    ResponseEntity<?> create(Movies movie);

    void delete(Long id);

    Movies update(Long id, Movies movie);

    Movies getById(Long id);

    List<Movies> getAll();

}
