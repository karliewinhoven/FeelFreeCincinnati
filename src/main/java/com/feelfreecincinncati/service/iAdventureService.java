package com.feelfreecincinncati.service;

import com.feelfreecincinncati.dto.AdventureDTO;

public interface iAdventureService {

	AdventureDTO fetchById(int id);

	void save(AdventureDTO adventureDTO);

}