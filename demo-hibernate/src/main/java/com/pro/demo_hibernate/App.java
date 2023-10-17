package com.pro.demo_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        demo d1 = new demo();
        
        d1.setId(101);
        d1.setName("ABC");
        d1.setAge(20);
        
        Configuration cnf = new Configuration();
        
        SessionFactory sf = cnf.buildSessionFactory();
        
        Session session = sf.openSession();
        
        session.save(d1);
    }
}
