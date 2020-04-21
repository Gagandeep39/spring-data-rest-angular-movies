/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-21 14:49:17
 * @modify date 2020-04-21 14:49:17
 * @desc [description]
 */
package com.gagan.lab5moviespringboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Movie Bean
 */
@Entity
@Table(name = "movie_table")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    private Integer moviesId;

    @Column(name = "movie_name")
    private String moviesName;

    @Column(name = "movie_rating")
    private Integer moviesRating;

    @Column(name = "movie_genre")
    private String moviesGenre;

    public Integer getMoviesId() {
        return moviesId;
    }

    public void setMoviesId(Integer moviesId) {
        this.moviesId = moviesId;
    }

    public String getMoviesName() {
        return moviesName;
    }

    public void setMoviesName(String moviesName) {
        this.moviesName = moviesName;
    }

    public Integer getMoviesRating() {
        return moviesRating;
    }

    public void setMoviesRating(Integer moviesRating) {
        this.moviesRating = moviesRating;
    }

    public String getMoviesGenre() {
        return moviesGenre;
    }

    public void setMoviesGenre(String moviesGenre) {
        this.moviesGenre = moviesGenre;
    }


    @Override
    public String toString() {
        return "{" +
            " moviesId='" + getMoviesId() + "'" +
            ", moviesName='" + getMoviesName() + "'" +
            ", moviesRating='" + getMoviesRating() + "'" +
            ", moviesGenre='" + getMoviesGenre() + "'" +
            "}";
    }


}
