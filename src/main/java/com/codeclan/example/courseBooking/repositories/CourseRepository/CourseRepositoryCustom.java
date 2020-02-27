package com.codeclan.example.courseBooking.repositories.CourseRepository;

import com.codeclan.example.courseBooking.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> findAllCoursesWithGivenRating(int starRating);
}
