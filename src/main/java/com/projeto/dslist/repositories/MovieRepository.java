package com.projeto.dslist.repositories;

import com.projeto.dslist.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
