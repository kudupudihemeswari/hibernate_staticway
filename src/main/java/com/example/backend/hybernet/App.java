package com.example.backend.hybernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
      StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata mt = new MetadataSources(ssr).getMetadataBuilder().build();
    	SessionFactory sf=mt.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	hibernate f=new hibernate();
    	f.setName("hema");
    	f.setEmail("hema123@gmail.com");
    	f.setPhno(8479393);
    	f.setPassword("efeferg");
        s.save(f);
    	t.commit();
    	System.out.println("successfully inserted");
    	sf.close();
    	s.close();
    	
    	}
    }

