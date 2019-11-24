package com.feelfreecincinncati.service;

import com.feelfreecincinncati.dto.EventDTO;

public interface iEventService {

	EventDTO fetchById(int id);

	void save(EventDTO eventDTO);

}