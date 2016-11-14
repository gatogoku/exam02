package impl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dao.AircraftDAO;
import model.Aircraft;
import data.HibernateSession;

public class HibernateAirfraftDAO implements AircraftDAO{

	SessionFactory sessionFactory = null;
	Session session = null;
	
	public void initializaSession(){
		sessionFactory=HibernateSession.getSessionFactory();
		session=sessionFactory.openSession();
	}

	public Aircraft selectById(Long id) {
		
		// TODO Auto-generated method stub
		initializaSession();
		Aircraft customer = (Aircraft) session.get(Aircraft.class, id);
		session.close();
		return customer;
	
	}

	public List<Aircraft> selectAll() {
		// TODO Auto-generated method stub
		initializaSession();
		List<Aircraft> roles = session.createCriteria(Aircraft.class).list();
		session.close();
		return roles;
	}

	public void insert(Aircraft role) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		//Long id =  (Long) session.save(role);
		//role.setId(role.getId());
		session.save(role);
		session.getTransaction().commit();
		session.close();
		
	}

	public void update(Aircraft role) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		session.merge(role);
		session.getTransaction().commit();
		session.close();
		
	}

	public void delete(Aircraft role) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		session.merge(role);
		session.getTransaction().commit();
		session.close();
		
	}

}
