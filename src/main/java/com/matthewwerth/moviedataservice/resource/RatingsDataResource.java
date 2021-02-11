package com.matthewwerth.moviedataservice.resource;

import com.matthewwerth.moviedataservice.models.Rating;
import com.matthewwerth.moviedataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

    @RequestMapping("/{movieID}")
    public Rating getRating(@PathVariable("movieID") String movieID) {
        return new Rating(movieID, 4);
    }

    @RequestMapping("/users/{userID}")
    public UserRating getUser(@PathVariable("userID") String userID) {
        List<Rating> ratings = Arrays.asList(     // this is hardcoded example of api response
                new Rating("123", 5),
                new Rating("234", 4),
                new Rating("345", 3)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
