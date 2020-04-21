/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-21 14:49:12
 * @modify date 2020-04-21 14:49:12
 * @desc [description]
 */
package com.gagan.lab5moviespringboot.repository;

import com.gagan.lab5moviespringboot.entity.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

}