package com.feelfreecincinncati.service;

import com.feelfreecincinncati.dto.EventDTO;

public interface iEventService {
	public EventDTO fetchById(int id);
	
	public void save(EventDTO eventDTO);
	
}
