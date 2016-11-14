package dao;

import java.util.List;

import model.Aircraft;

public interface AircraftDAO {
	
	
	public Aircraft selectById(Long id);

	public List<Aircraft> selectAll();

	public void insert(Aircraft role);

	public void update(Aircraft role);

	public void delete(Aircraft role);

}
