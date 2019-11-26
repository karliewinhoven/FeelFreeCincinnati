package com.feelfreecincinncati.service;

import com.feelfreecincinncati.dto.EventDTO;

public interface IEventService {

	EventDTO fetchById(int id);

	void save(EventDTO eventDTO);

}