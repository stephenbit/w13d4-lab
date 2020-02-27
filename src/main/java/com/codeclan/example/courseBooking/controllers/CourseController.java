package com.codeclan.example.courseBooking.controllers;

import com.codeclan.example.courseBooking.models.Course;
import com.codeclan.example.courseBooking.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/search/findAllCoursesWithGivenRating")
    public List<Course> findAllCoursesWithGivenRating(@RequestParam int starRating){
        return courseRepository.findAllCoursesWithGivenRating(starRating);
    }
}
