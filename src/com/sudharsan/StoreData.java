package com.sudharsan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");
	      
	     
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	   
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();  
	          
	    Student s=new Student();  
	    s.setId(3);
	    s.setName("Ajay");
	    s.setDept("CSE");
	      
	    session.persist(s); 
	      
	    t.commit();
	    session.close();  
	      
	    System.out.println("successfully saved");  
	}

}
