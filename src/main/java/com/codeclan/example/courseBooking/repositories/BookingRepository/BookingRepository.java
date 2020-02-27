package com.codeclan.example.courseBooking.repositories.BookingRepository;


import com.codeclan.example.courseBooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
    List<Booking> findAllBookingsForAGivenDate(String date);
}
