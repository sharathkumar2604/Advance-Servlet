package com.sharath.repo;

import java.util.List;

import com.sharath.dto.ShowroomsDto;

public interface ShowroomsRepo {

	public boolean save(ShowroomsDto d);

	public List<ShowroomsDto> readAll();

	public ShowroomsDto readByname(String name);

	public boolean updateDealsWithByNameAndLocation(String dealsWith, String name, String location);

	public boolean deleteByNameAndDealsWith(String name, String dealsWith);

}
