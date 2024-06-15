package com.ms.tmdb.service;

import com.ms.tmdb.model.Movies;
import com.ms.tmdb.repo.MoviesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    MoviesRepo moviesRepo;


    @Override
    public ResponseEntity<?> create(Movies movie) {
        if(movie==null){
         throw new RuntimeException("Movie not inserted");
        }
        return moviesRepo.save(movie);
    }

    @Override
    public void delete(Long id) {
        if(id==null){
            throw new RuntimeException("Movie not available");
        }
        else {
             moviesRepo.deleteById(id);
        }
    }

    @Override
    public Movies update(Long id, Movies movie) {
        if(movie.getId()==null|| id==null){
            throw new RuntimeException("Movie not available");
        }else {
            Movies movies = moviesRepo.getReferenceById(id);
            movies.setId(movie.getId());
            movies.setName(movie.getName());
            movies.setDirector(movie.getDirector());
            movies.setActors(movie.getActors());
            return moviesRepo.save(movies);
        }
    }

    @Override
    public Movies getById(Long id) {
        if(id==null){
            throw new RuntimeException("Movie not available");
        }else {
            return moviesRepo.getReferenceById(id);
        }
    }

    @Override
    public List<Movies> getAll() {
        return null;
    }
}
