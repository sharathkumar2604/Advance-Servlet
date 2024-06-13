package com.sharath.service;

import java.util.List;

import com.sharath.dto.ShowroomsDto;

public interface ShowroomsService {
	
	public boolean save(ShowroomsDto d);
	
	public List<ShowroomsDto> readAll();
	
	public ShowroomsDto readByName(String name);	
	
	public boolean updateDealsWithByNameAndLocation(String dealsWith,String name,String location);
	
	public boolean deleteByNameAndDealsWith(String name,String dealsWith);
	
	
	
	

}
