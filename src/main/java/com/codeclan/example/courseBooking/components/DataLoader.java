package com.codeclan.example.courseBooking.components;

import com.codeclan.example.courseBooking.models.Booking;
import com.codeclan.example.courseBooking.models.Course;
import com.codeclan.example.courseBooking.models.Customer;
import com.codeclan.example.courseBooking.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.courseBooking.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.courseBooking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Course course1 = new Course("Memes", "Edinburgh", 5);
        Course course2 = new Course("Meths", "Dundee", 1);
        Course course3 = new Course("Skience", "Aberfoyle", 4);

        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);


        Customer customer1 = new Customer("Very Auld Jock", "Dundee", 97);
        Customer customer2 = new Customer("Absolute Legend", "Edinburgh", 27);
        Customer customer3 = new Customer("Nyan Cat", "Glasgow", 46);

        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);

        Booking booking1 = new Booking("01/01/2020", course1, customer1);
        Booking booking2 = new Booking("02/02/2020", course2, customer2);
        Booking booking3 = new Booking("03/03/2020", course3, customer3);

        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        bookingRepository.save(booking3);

    }
}
