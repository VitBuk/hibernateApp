package com.vitubk.spring;

import com.vitubk.spring.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
        SessionFactory sessionFactory =  configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            Person person = new Person("Test1", 30);
            Person person2 = new Person("Test2", 40);
            Person person3 = new Person("Test3", 50);

            session.getTransaction();
            session.save(person1);




            System.out.println(person.getName());
            System.out.println(person.getAge());
        } finally {
            sessionFactory.close();
        }
        session.getTransaction().commit();
        sessionFactory.close();
    }
}
