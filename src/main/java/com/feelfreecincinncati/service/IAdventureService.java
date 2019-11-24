package com.feelfreecincinncati.service;

import com.feelfreecincinncati.dto.AdventureDTO;

public interface IAdventureService {

	AdventureDTO fetchById(int id);

	void save(AdventureDTO adventureDTO);

}