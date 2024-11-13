package com.projeto.dslist.controller;

import com.projeto.dslist.dto.MovieDTO;
import com.projeto.dslist.dto.MovieListDTO;
import com.projeto.dslist.dto.MovieMinDTO;
import com.projeto.dslist.services.MovieListService;
import com.projeto.dslist.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class MovieListController {

    @Autowired
    private MovieListService movieListService;
    @Autowired
    private MovieService movieService;

    @GetMapping()
    public List<MovieListDTO> findAll(){
        return movieListService.findAll();
    }

    @GetMapping(value = "/{listId}/movies")
    public List<MovieMinDTO> findByList(@PathVariable Long listId){
        return movieService.findByList(listId);
    }


}
