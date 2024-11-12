package com.projeto.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private MovieList list;

    public BelongingPK(){}

    public BelongingPK(Movie movie, MovieList list) {
        this.movie = movie;
        this.list = list;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public MovieList getList() {
        return list;
    }

    public void setList(MovieList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(movie, that.movie) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, list);
    }
}
