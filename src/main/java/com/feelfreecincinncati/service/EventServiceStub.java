package com.feelfreecincinncati.service;

import com.feelfreecincinncati.dto.EventDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

	@Component
	public class EventServiceStub {

		public static List<EventDTO> events = new ArrayList<>();
		
		static {
			EventDTO event = new EventDTO();
			event.setEventID(1);
			event.setName("Bengals game");
			event.setAddress("011 Bengals St.");
			event.setCost(60);
			event.setDescription("Dissapointment spread over 3 hours");
			events.add(event);
			
			event = new EventDTO();
			event.setEventID(2);
			event.setName("UC football game");
			event.setDescription("UC home Football game");
			event.setAddress("1234 Bearcat St.");
			event.setCost(10);
			events.add(event);
			 
			event = new EventDTO();
			event.setEventID(3);
			event.setName("FC soccer game");
			event.setDescription("FCC home soccer game");
			event.setAddress("1234 soccer St.");
			event.setCost(20);
			events.add(event);
			 
			event = new EventDTO();
			event.setEventID(4);
			event.setName("Concert");
			event.setDescription("Concert with some cool bands");
			event.setAddress("666 Music Ave.");
			event.setCost(30);
			events.add(event);
			
			event = new EventDTO();
			event.setEventID(5);
			event.setName("Local brewery");
			event.setDescription("Drink beer at a local brewery");
			event.setAddress("884 Beer St.");
			event.setCost(15);
			events.add(event);
			 
			event = new EventDTO();
			event.setEventID(6);
			event.setName("New restaurant");
			event.setDescription("Eat a restaurant that you have not tried before");
			event.setAddress("54 Hungry Pkwy.");
			event.setCost(50);
			events.add(event);
			 
			event = new EventDTO();
			event.setEventID(7);
			event.setName("Local Farmers market");
			event.setDescription("Explore a farmers market");
			event.setAddress("8 East Market Rd.");
			event.setCost(10);
			events.add(event);
		}
		
	public EventDTO fetchById(int id) {
			return null;
		}
	
	public void save(EventDTO eventDTO) {
	
		}
	}


