package com.cleberfeitosa.movie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleberfeitosa.movie.dto.MovieDTO;
import com.cleberfeitosa.movie.dto.MovieGenreDTO;
import com.cleberfeitosa.movie.services.MovieService;

@RestController
@RequestMapping(value = "v1/movies")
public class MovieControllerV1 {

	@Autowired
	private MovieService service;
	
	@GetMapping
	public Page<MovieGenreDTO> findAll(Pageable pageable) {
		return service.findAllMovieGenre(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public MovieGenreDTO findById(@PathVariable Long id) {
		return service.findByIdMovieGenre(id);
	}
}
