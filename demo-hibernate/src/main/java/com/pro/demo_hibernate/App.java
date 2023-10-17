package com.pro.demo_hibernate;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException
    {
        demo d1 = new demo();
        
        d1.setId(101);
        d1.setName("ABC");
        d1.setAge(20);
        
        Configuration cnf = new Configuration().configure().addAnnotatedClass(demo.class);
        
        SessionFactory sf = cnf.buildSessionFactory();
        
        Session session = sf.openSession();
        
        org.hibernate.Transaction tx = session.beginTransaction();
        
        session.save(d1);
        
        tx.commit();
        
        System.out.println("End...!");
    }
}
