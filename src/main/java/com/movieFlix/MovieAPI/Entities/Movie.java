package com.movieFlix.MovieAPI.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieID;

    @Column(nullable = false)
    @NotBlank(message = "Title cannot be empty")    //Came from Spring boot started validation
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "Director cannot be empty")
    private String director;

    @Column(nullable = false)
    @NotBlank(message = "Studio cannot be empty") //This validation is only for string
    private String Studio;

    @ElementCollection
    @CollectionTable(name="Movie_Cast")
    private Set<String> moviecast;

    @Column(nullable = false)
    private Integer releaseYear;

    @Column(nullable = false)
    @NotBlank(message = "Poster cannot be empty")
    private String poster;
}
