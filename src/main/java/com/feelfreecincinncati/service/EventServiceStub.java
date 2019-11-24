package com.feelfreecincinncati.service;

import org.springframework.stereotype.Component;

import com.feelfreecincinncati.dto.EventDTO;




	@Component
	public class EventServiceStub implements iEventService {
		@Override
		public EventDTO fetchById(int id) {
			EventDTO eventDTO = new EventDTO();
			eventDTO.setEventID(4);
			eventDTO.setName("Bengals Game");
			eventDTO.setAddress("123 Main Street");
			//insert date variable here
			eventDTO.setCost(60);
			eventDTO.setDescription("Dissapointment spread over 3 hours");
			return eventDTO;
		}
		
	@Override
	public void save(EventDTO eventDTO) {
			
			
			
		}
	}


