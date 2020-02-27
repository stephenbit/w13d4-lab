package com.codeclan.example.courseBooking.repositories.BookingRepository;

import com.codeclan.example.courseBooking.models.Booking;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Booking> findAllBookingsForAGivenDate(String date) {
        List<Booking> result = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Booking.class);
            cr.add(Restrictions.eq("date", date));
            result = cr.list();
        }
        catch(HibernateException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
