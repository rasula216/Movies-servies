package com.ms.tmdb.controller;

import com.ms.tmdb.model.Movies;
import com.ms.tmdb.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/movies")
public class MovieController {
    @Autowired
    MovieService movieService;


    @RequestMapping("/create")
    public ResponseEntity<?> createMovie(@RequestBody Movies movies){
       return movieService.create(movies);
    }


}
