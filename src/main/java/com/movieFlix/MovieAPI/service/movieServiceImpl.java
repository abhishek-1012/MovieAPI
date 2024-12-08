package com.movieFlix.MovieAPI.service;

import com.movieFlix.MovieAPI.Dto.MovieDto;
import com.movieFlix.MovieAPI.Repository.MovieRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class movieServiceImpl implements movieService {

    private final MovieRepository mr;

    public movieServiceImpl(MovieRepository mr){
        this.mr=mr;
    }
    @Override
    public MovieDto addMovie(MovieDto md, MultipartFile file) {
        return null;
    }

    @Override
    public MovieDto getMovie(Integer movieID) {
        return null;
    }

    @Override
    public List<MovieDto> getAllMovies() {
        return List.of();
    }
}
