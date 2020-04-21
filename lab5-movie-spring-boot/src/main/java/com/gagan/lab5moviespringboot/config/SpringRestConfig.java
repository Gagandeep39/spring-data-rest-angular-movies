/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-21 15:33:47
 * @modify date 2020-04-21 15:33:47
 * @desc Modify Default settings of Rest Repository
 */
package com.gagan.lab5moviespringboot.config;

import com.gagan.lab5moviespringboot.entity.Movie;

import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

@Component
public class SpringRestConfig {

    /**
     * Default behaviour: ID is not sent in repsosne
     * To enable IDs to be sent in response from server
     */
    @Bean
    public RepositoryRestConfigurer configureRest() {
        return RepositoryRestConfigurer.withConfig(config -> {
            config.exposeIdsFor(Movie.class);
        });
    }

}