package com.feelfreecincinncati.service;

import org.springframework.stereotype.Component;

import com.feelfreecincinncati.dto.EventDTO;




	@Component
	public class EventServiceStub {
		public EventDTO fetchById(int id) {
			EventDTO eventDTO = new EventDTO();
			eventDTO.setEventID(4);
			return eventDTO;
		}
		
	public void save(EventDTO eventDTO) {
			
			
			
		}
	}


