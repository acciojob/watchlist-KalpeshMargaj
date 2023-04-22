package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieController {
    @Autowired
    MovieService movieService;
    @PostMapping("/add-movie")
    public ResponseEntity<String> addMovie(@RequestBody Movie movie)
    {
        movieService.addMovie(movie);
        return new ResponseEntity<>("New movie added Successfully", HttpStatus.CREATED);
    }
    @PostMapping("/add-director")
    public ResponseEntity<String> addDirector(@RequestBody Director director)
    {
        movieService.addDirector(director);
        return new ResponseEntity<>("New director added Successfully", HttpStatus.CREATED);
    }
    @PutMapping("/add-movieDirectorPair")
    public ResponseEntity<String> addMovieDirectorPair(@RequestParam String movieName,String directorName)
    {
        movieService.addMovieDirectorPair(movieName,directorName);
        return new ResponseEntity<>("New pair added Successfully", HttpStatus.CREATED);
    }
    @GetMapping("/get-movie-by-name/{name}")
    public ResponseEntity<Movie> getMovieByName(@PathVariable String movieName)
    {
        Movie movie=movieService.getMovieByName(movieName);
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }
    @GetMapping("/get-director-by-name/{name}")
    public ResponseEntity<Director> getDirectorByName(@PathVariable String directorName)
    {
        Director director=movieService.getDirectorByName(directorName);
        return new ResponseEntity<>(director, HttpStatus.CREATED);
    }
    @GetMapping("/get-movies-by-director-name/{director}")
    public ResponseEntity<List<String>> getMoviesByDirectorName(@PathVariable String directorName)
    {
        List<String> movie=movieService.getMovieByDirectorName(directorName);
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }
    @GetMapping("/get-all-movies")
    public ResponseEntity<List<String>> findAllMovies()
    {
        List<String> movie=movieService.getAllMovies();
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete-director-by-name")
    public ResponseEntity<String> deleteDirectorByName(@RequestParam String directorName)
    {
        movieService.deleteDirectorByName(directorName);
        return new ResponseEntity<>("Director deleted successfully", HttpStatus.CREATED);
    }
    @DeleteMapping("/delete-all-directors")
    public ResponseEntity<String> deleteAllDirectors()
    {
        movieService.deleteAllDirectors();
        return new ResponseEntity<>("All directors deleted successfully", HttpStatus.CREATED);
    }

}
