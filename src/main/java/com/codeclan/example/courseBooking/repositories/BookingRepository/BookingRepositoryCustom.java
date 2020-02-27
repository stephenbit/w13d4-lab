package com.codeclan.example.courseBooking.repositories.BookingRepository;

import com.codeclan.example.courseBooking.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {
    List<Booking> findAllBookingsForAGivenDate(String date);
}
