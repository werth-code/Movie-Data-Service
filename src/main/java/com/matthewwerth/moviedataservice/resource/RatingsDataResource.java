package com.matthewwerth.moviedataservice.resource;

import com.matthewwerth.moviedataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

    @RequestMapping("/{movieID")
    public Rating getRating(@PathVariable("movieID") String movieID) {
        return new Rating(movieID, 4);
    }
}
