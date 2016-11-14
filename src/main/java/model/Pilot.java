package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pilot {
	
	
	//List<Role> roles = new ArrayList<Role>() ;
	Long id = null;
	String name;
	int license;
	Aircraft aircraft;
	
	
	

	
	public Pilot(Long id, String name, Integer license) {
		super();
		this.id = id;
		this.name = name;
		this.license = license;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getLicense() {
		return license;
	}


	public void setLicense(Integer license) {
		this.license = license;
	}


	public Aircraft getAircraft() {
		return aircraft;
	}


	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}


	public Pilot(){}


	
}
