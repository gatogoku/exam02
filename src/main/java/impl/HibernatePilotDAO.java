package impl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dao.PilotDAO;
import data.HibernateSession;
import model.Pilot;

public class HibernatePilotDAO implements PilotDAO{
	
	SessionFactory sessionFactory = null;
	Session session = null;
	
	public void initializaSession(){
		sessionFactory=HibernateSession.getSessionFactory();
		session=sessionFactory.openSession();
	}

	public Pilot selectById(Long id) {
		
		// TODO Auto-generated method stub
		initializaSession();
		Pilot customer = (Pilot) session.get(Pilot.class, id);
		session.close();
		return customer;
	
	}

	public List<Pilot> selectAll() {
		// TODO Auto-generated method stub
		initializaSession();
		List<Pilot> users = session.createCriteria(Pilot.class).list();
		session.close();
		return users;
	}

	public void insert(Pilot user) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		Long id =  (Long) session.save(user);
		user.setId(id);
		session.getTransaction().commit();
		session.close();
		
	}

	public void update(Pilot user) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		session.merge(user);
		session.getTransaction().commit();
		session.close();
		
	}

	public void delete(Pilot user) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		session.merge(user);
		session.getTransaction().commit();
		session.close();
		
	}

}
