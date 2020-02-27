package com.codeclan.example.courseBooking.repositories.CourseRepository;

import com.codeclan.example.courseBooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    List<Course> findAllCoursesWithGivenRating(int starRating);
}
