package com.projeto.dslist.services;

import com.projeto.dslist.dto.MovieMinDTO;
import com.projeto.dslist.entities.Movie;
import com.projeto.dslist.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<MovieMinDTO> findAll(){
       List<Movie> result = movieRepository.findAll();
       return result.stream().map(x -> new MovieMinDTO(x)).toList(); //transforma uma lista de movies em uma lista de moviesDTO

    }
}
