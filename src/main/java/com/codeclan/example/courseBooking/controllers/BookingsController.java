package com.codeclan.example.courseBooking.controllers;

import com.codeclan.example.courseBooking.models.Booking;
import com.codeclan.example.courseBooking.repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingsController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/search/findAllBookingsForAGivenDate")
    public List<Booking> findAllBookingsForAGivenDate(@RequestParam String date) {
        return bookingRepository.findAllBookingsForAGivenDate(date);

    }

}
