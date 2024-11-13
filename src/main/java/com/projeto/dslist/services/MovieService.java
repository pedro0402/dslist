package com.projeto.dslist.services;

import com.projeto.dslist.dto.MovieDTO;
import com.projeto.dslist.dto.MovieMinDTO;
import com.projeto.dslist.entities.Movie;
import com.projeto.dslist.projections.MovieMinProjection;
import com.projeto.dslist.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id){
        Movie result = movieRepository.findById(id).get();
        return new MovieDTO(result);
    }

    @Transactional(readOnly = true)
    public List<MovieMinDTO> findAll(){
       List<Movie> result = movieRepository.findAll();
       return result.stream().map(x -> new MovieMinDTO(x)).toList(); //transforma uma lista de movies em uma lista de moviesDTO
    }

    @Transactional(readOnly = true)
    public List<MovieMinDTO> findByList(Long listId){
        List<MovieMinProjection> result = movieRepository.searchByList(listId);
        return result.stream().map(x -> new MovieMinDTO(x)).toList(); //transforma uma lista de movies em uma lista de moviesDTO
    }

}
