package com.projeto.dslist.services;

import com.projeto.dslist.dto.MovieDTO;
import com.projeto.dslist.dto.MovieListDTO;
import com.projeto.dslist.dto.MovieMinDTO;
import com.projeto.dslist.entities.Movie;
import com.projeto.dslist.entities.MovieList;
import com.projeto.dslist.repositories.MovieListRepository;
import com.projeto.dslist.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieListService {

    @Autowired
    private MovieListRepository movieListRepository;


    @Transactional(readOnly = true)
    public List<MovieListDTO> findAll(){
       List<MovieList> result = movieListRepository.findAll();
       return result.stream().map(x -> new MovieListDTO(x)).toList(); //transforma uma lista de movies em uma lista de moviesDTO
    }
}
