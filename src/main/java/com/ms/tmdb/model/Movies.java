package com.ms.tmdb.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Movies {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ElementCollection
    private List<String> actors;
    private String director;

}
