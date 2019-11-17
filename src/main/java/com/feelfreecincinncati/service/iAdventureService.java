package com.feelfreecincinncati.service;

import com.feelfreecincinncati.dto.AdventureDTO;

public interface iAdventureService {

	public AdventureDTO fetchById(int id);

	public void save(AdventureDTO adventureDTO);

}