package com.projeto.dslist.repositories;

import com.projeto.dslist.entities.Movie;
import com.projeto.dslist.entities.MovieList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieListRepository extends JpaRepository<MovieList, Long> {

}
