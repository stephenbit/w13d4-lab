package com.codeclan.example.courseBooking.projections;

import com.codeclan.example.courseBooking.models.Booking;
import com.codeclan.example.courseBooking.models.Course;
import com.codeclan.example.courseBooking.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedCourseAndCustomer", types = Booking.class)
public interface embedCourseAndCustomer {

        String getDate();

        Customer getCustomer();

        Course getCourse();
}
