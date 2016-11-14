package model;

import java.util.HashSet;
import java.util.Set;

public class Aircraft {
	Long id =null;
	String model;
	Long autonomy;
	Pilot pilot;
	
	
	
	public Aircraft(){}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getModel() {
		return model;
	}




	public void setModel(String model) {
		this.model = model;
	}




	public Long getAutonomy() {
		return autonomy;
	}




	public void setAutonomy(Long autonomy) {
		this.autonomy = autonomy;
	}




	public Pilot getPilot() {
		return pilot;
	}




	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}




	public Aircraft(Long id, String model, Long autonomy) {
		super();
		this.id = id;
		this.model = model;
		this.autonomy = autonomy;
	}
	

}
