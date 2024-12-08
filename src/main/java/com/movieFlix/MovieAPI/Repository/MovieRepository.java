package com.movieFlix.MovieAPI.Repository;
import com.movieFlix.MovieAPI.Entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository  extends JpaRepository<Movie,Integer> {


}
