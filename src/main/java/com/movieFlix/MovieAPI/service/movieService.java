package com.movieFlix.MovieAPI.service;
import com.movieFlix.MovieAPI.Dto.MovieDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

import java.util.List;

public interface movieService {

    MovieDto addMovie(MovieDto md, MultipartFile file);

    MovieDto getMovie(Integer movieID);

    List<MovieDto>getAllMovies();
}
