package com.sharath.service;

import java.util.List;

import com.sharath.dto.ShowroomsDto;
import com.sharath.repo.ShowroomsRepo;
import com.sharath.repo.ShowroomsRepoImpl;

public class ShowroomsServiceImpl implements ShowroomsService {

	ShowroomsRepo repo= new ShowroomsRepoImpl();	
	@Override
	public boolean save(ShowroomsDto d) {

		if(d.getShowroomName().length()>2)
		{
			if(d.getDealsWith().length()>2)
			{
				if(d.getLocation().length()>2)
				{
					return repo.save(d);
					
				}
			}
		}
		
		
		return false;
	}
	@Override
	public List<ShowroomsDto> readAll() {
		
		return repo.readAll();
	}
	@Override
	public ShowroomsDto readByName(String name) {
		if(name.length()>1)
		{
			return repo.readByname(name);
			
		}
		
		return null;
	}
	@Override
	public boolean updateDealsWithByNameAndLocation(String dealsWith, String name, String location) {

		if(dealsWith.length()>2)
		{
			if(name.length()>2)
			{
				if(location.length()>2)
				{
					return repo.updateDealsWithByNameAndLocation(dealsWith,name,location);
					
				}
			}
		}
		return false;
	}
	@Override
	public boolean deleteByNameAndDealsWith(String name, String dealsWith) {
		if(dealsWith.length()>2)
		{
			if(name.length()>2)
			{
				return repo.deleteByNameAndDealsWith(name,dealsWith);
				
			}
		}
			
		return false;
	}

}
