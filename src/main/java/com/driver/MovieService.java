package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public void addMovie(Movie movie) {
        movieRepository.addMovie(movie);
    }

    public void addDirector(Director director) {
        movieRepository.addDirector(director);
    }

    public void addMovieDirectorPair(String movieName, String directorName) {
        movieRepository.addMovieDirectorPair(movieName,directorName);
    }

    public Movie getMovieByName(String movieName) {
        Movie movie=movieRepository.getMovieByName(movieName);
        return movie;
    }

    public Director getDirectorByName(String directorName) {
        Director director = movieRepository.getDirectorByName(directorName);
        return director;
    }

    public List<String> getMovieByDirectorName(String directorName) {
        List<String> ans = movieRepository.getMovieByDirectorName(directorName);
        return ans;
    }

    public List<String> getAllMovies() {
        List<String> ans = movieRepository.getAllMovies();
        return ans;
    }

    public void deleteDirectorByName(String directorName) {
        movieRepository.deleteDirectorByName(directorName);
    }

    public void deleteAllDirectors() {
        movieRepository.deleteAllDirectors();
    }
}
