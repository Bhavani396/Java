package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();	
		
	// creating session object
	Session session = factory.openSession();
	// creating transaction object
	Transaction t = session.beginTransaction();
	
	Person person = new Person("ram","ram@gamil.com");
	Person person1 = new Person("sam","sam@gamil.com");
	session.save(person);
	session.save(person1);
	t.commit();
	System.out.println("Records inserted");

	}
}



