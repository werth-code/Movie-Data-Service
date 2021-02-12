package com.matthewwerth.moviedataservice.resource;

import com.matthewwerth.moviedataservice.models.Rating;
import com.matthewwerth.moviedataservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

    @RequestMapping("/movies/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("/users/{userID}")
    public UserRating getUserRating(@PathVariable("userID") String userID) {
        UserRating userRating = new UserRating();
        userRating.initData(userID);
        return userRating;
    }
}
