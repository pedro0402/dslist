package com.projeto.dslist.controller;

import com.projeto.dslist.dto.MovieMinDTO;
import com.projeto.dslist.entities.Movie;
import com.projeto.dslist.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping()
    public List<MovieMinDTO> findAll(){
        List<MovieMinDTO> result = movieService.findAll();
        return result;
    }

}
