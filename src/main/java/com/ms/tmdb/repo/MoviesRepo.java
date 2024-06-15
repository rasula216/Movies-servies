package com.ms.tmdb.repo;

import com.ms.tmdb.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepo extends JpaRepository<Movies,Long> {

}
