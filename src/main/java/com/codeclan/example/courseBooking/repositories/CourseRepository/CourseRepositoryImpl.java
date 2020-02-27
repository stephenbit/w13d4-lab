package com.codeclan.example.courseBooking.repositories.CourseRepository;

import com.codeclan.example.courseBooking.models.Course;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> findAllCoursesWithGivenRating(int starRating){
        List<Course> result = null;
        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Course.class);
            cr.add(Restrictions.eq("starRating", starRating));
            result = cr.list();
        }
        catch (HibernateException ex){
            ex.printStackTrace();
        }
        return result;
    }
}
