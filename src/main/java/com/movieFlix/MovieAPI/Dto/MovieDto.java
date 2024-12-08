package com.movieFlix.MovieAPI.Dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieID;


    @NotBlank(message = "Title cannot be empty")    //Came from Spring boot started validation
    private String title;


    @NotBlank(message = "Director cannot be empty")
    private String director;


    @NotBlank(message = "Studio cannot be empty")
    private String Studio;

    @ElementCollection
    @CollectionTable(name="Movie_Cast")
    private Set<String> moviecast;

    private Integer releaseYear;

    @NotBlank(message = "Poster cannot be empty")
    private String poster;


    @NotBlank(message = "Please provide poster url")
    private String posterURL;
}
