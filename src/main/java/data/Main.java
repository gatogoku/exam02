package data;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import impl.HibernateAirfraftDAO;
import impl.HibernatePilotDAO;
import model.Aircraft;
import model.Pilot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aircraft AC1 = new Aircraft(null,"MOD1",12L);
		Aircraft AC2= new Aircraft(null,"MOD2",13L);
		
		Pilot PIL1 = new Pilot(null, "PIL1", 1232);
		Pilot PIL2 = new Pilot(null, "PIL2", 1262);
				
		//HibernatePilotDAO pidao = new HibernatePilotDAO();
		HibernateAirfraftDAO aidao = new HibernateAirfraftDAO();
		
		
		AC1.setPilot(PIL1);
		AC2.setPilot(PIL2);
		
		aidao.insert(AC1);
		aidao.insert(AC2);
		
		
		
////	
//		
//		
//		
//		
//		
//
	}

}
