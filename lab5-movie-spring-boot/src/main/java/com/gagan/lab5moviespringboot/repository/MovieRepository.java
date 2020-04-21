/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-21 14:49:12
 * @modify date 2020-04-21 14:49:12
 * @desc MOvie Repository + Cotroller 
 * This behavour is because this applciation ises spring-data-rest dependency which eliminates controller
 * It provides all generally used dependency
 */
package com.gagan.lab5moviespringboot.repository;

import com.gagan.lab5moviespringboot.entity.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * To allow communication with lcoalhost4200
 * @CrossOrigin("http://localhost:4200")
 */
@CrossOrigin("*")
@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    /**
     * Custom REST impl
     * @param genre Searches a movie by Genre
     * @return  List of all movies mathicng this genre
     * @apiNote returnType findBy{PropertyNameOfEntity}(@Param("param1")String param1, @Param("paramX")String paramX)
     */
    public List<Movie> findByMoviesGenre(@Param("genre") String genre);

}