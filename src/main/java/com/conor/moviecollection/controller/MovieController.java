package com.conor.moviecollection.controller;


import com.conor.moviecollection.repository.MoviesRepository;
import com.conor.moviecollection.model.Movie;
import com.conor.moviecollection.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    MoviesRepository moviesRepository;

    // Get All Movies
    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return moviesRepository.findAll();
    }

    // Create a new Movie Entry
    @PostMapping("/movies")
    public Movie createMovie(@Valid @RequestBody Movie movie) {
        return moviesRepository.save(movie);
    }

// Get a Single Note

// Update a Note
@PutMapping("/movies/{id}")
public ResponseEntity<Movie> updateNote(@PathVariable(value = "id") Long movieId,
                                       @Valid @RequestBody Movie movieDetails) {
    Movie movie = moviesRepository.findOne(movieId);
    if(note == null) {
        return ResponseEntity.notFound().build();
    }
    movie.setTitle(movieDetails.getTitle());
    movie.setContent(movieDetails.getContent());

    Movie updatedMovie = moviesRepository.save(movie);
    return ResponseEntity.ok(updatedMovie);
}
// Delete a Note
}