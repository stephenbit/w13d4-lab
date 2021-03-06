package com.codeclan.example.courseBooking.repositories.CustomerRepository;

import com.codeclan.example.courseBooking.models.Course;
import com.codeclan.example.courseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

    List<Customer> findCustomersByBookingsCourseName(String name);

    List<Customer> findCustomersByTownAndBookingsCourseName(String town, String courseName);

    List<Customer> findCustomersByAgeGreaterThanAndTownIgnoreCaseAndBookingsCourseNameIgnoreCase(int age, String town, String courseName);

}
