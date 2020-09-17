package com.geekbrains.spring;

import com.geekbrains.spring.model.Product;
import com.geekbrains.spring.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = null;
        try {

            session = factory.getCurrentSession();
            session.beginTransaction();
            User user = session.get(User.class, 2L);
           // System.out.println(user);

//            Product product = session.get(Product.class, 1L);
//            System.out.println(product);
//
//            user.buy(product);
//            System.out.println(user);
//
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
            if (session != null) {
                session.close();
            }
        }
    }
}
