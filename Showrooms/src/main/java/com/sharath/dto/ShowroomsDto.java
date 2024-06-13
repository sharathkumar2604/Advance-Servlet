package com.sharath.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="ShowroomDto")
@NamedQuery(name="readAll", query="select r from ShowroomsDto r")
@NamedQuery(name="readByName", query="select r from ShowroomsDto r where r.showroomName=:showroomName")
@NamedQuery(name="update", query="update ShowroomsDto r set r.dealsWith=:dealsWith where r.showroomName=:showroomName and r.location=:location")
@NamedQuery(name="delete", query="delete from ShowroomsDto r where r.showroomName=:showroomName and r.dealsWith=:dealsWith")

public class ShowroomsDto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String showroomName;
	
	private String dealsWith;
	
	private String location;

	public ShowroomsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShowroomsDto(String showroomName, String dealsWith, String location) {
		super();
		
		this.showroomName = showroomName;
		this.dealsWith = dealsWith;
		this.location = location;
	}

	public int getId() {
		return id;
	}


	public String getShowroomName() {
		return showroomName;
	}

	public void setShowroomName(String showroomName) {
		this.showroomName = showroomName;
	}

	public String getDealsWith() {
		return dealsWith;
	}

	public void setDealsWith(String dealsWith) {
		this.dealsWith = dealsWith;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "ShowroomsDto [id=" + id + ", showroomName=" + showroomName + ", dealsWith=" + dealsWith + ", location="
				+ location + "]";
	}
	

}
