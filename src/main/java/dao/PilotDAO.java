package dao;

import java.util.List;

import model.Pilot;


public interface PilotDAO {

	
	public Pilot selectById(Long id);

	public List<Pilot> selectAll();

	public void insert(Pilot user);

	public void update(Pilot user);

	public void delete(Pilot user);
	

}
