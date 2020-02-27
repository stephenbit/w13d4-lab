package com.codeclan.example.courseBooking.repositories.BookingRepository;


import com.codeclan.example.courseBooking.models.Booking;
import com.codeclan.example.courseBooking.projections.embedCourseAndCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = embedCourseAndCustomer.class )
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
    List<Booking> findAllBookingsForAGivenDate(String date);
}
