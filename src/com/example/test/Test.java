package com.example.test;

import com.example.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.io.IOException;

/**
 * @Author: mzy
 * @Date: 2019-1-9 16:12
 */
public class Test {

    public static void main(String[] args)throws IOException{
        Configuration configuration = new Configuration( );
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        User user = new User();
        user.setId(7);
        user.setUsername("毛梓仰4");
        user.setPassword("1234564");
        user.setEmail("123456@qq.com4");

        session.save(user);
        transaction.commit();
        session.close();

        System.out.println("Successful saved.");
    }
}
