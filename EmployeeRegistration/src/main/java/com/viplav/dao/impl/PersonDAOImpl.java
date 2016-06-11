/**
 * 
 */
package com.viplav.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.viplav.dao.personDAO;
import com.viplav.form.PersonForm;
import com.viplav.model.PersonEntity;

/**
 * @author Rammohan
 *
 */
public class PersonDAOImpl implements personDAO {

	
    private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addPerson(PersonEntity person) {
		// TODO Auto-generated method stub
		System.out.println("*************");
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		Session session = this.sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		session.save(person);
		tx.commit();
		session.close();
//		this.sessionFactory.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PersonForm> getAllPsersons() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().createQuery("from PersonEntity ").list();

		
	}

	@Override
	public void deletePerson(Integer personId) {
		// TODO Auto-generated method stub
		PersonEntity person = (PersonEntity) this.sessionFactory.getCurrentSession().load(PersonEntity.class, personId);
		if(null != personId){
			this.sessionFactory.getCurrentSession().delete(person);
		}
		
	}

}
