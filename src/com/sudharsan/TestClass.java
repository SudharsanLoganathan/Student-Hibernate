package com.sudharsan;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestClass {

	public static void main(String[] args) {
		Session session=new AnnotationConfiguration()  
		         .configure().buildSessionFactory().openSession();  
		      
		    Transaction t=session.beginTransaction();  
		      
		    Student s=new Student();  
		    s.setId(6);  
		    s.setName("Sathish");
		    s.setDept("IT");
		    session.persist(s);  
		      
		    t.commit();  
		    session.close();  
		    System.out.println("successfully saved");   
	}

}
