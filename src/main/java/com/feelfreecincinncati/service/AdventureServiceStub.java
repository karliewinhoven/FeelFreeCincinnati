package com.feelfreecincinncati.service;

import org.springframework.stereotype.Component;

import com.feelfreecincinncati.dto.AdventureDTO;



	@Component
	public class AdventureServiceStub implements IAdventureService {
		
		
		@Override
		public AdventureDTO fetchById(int id) {
			AdventureDTO adventureDTO = new AdventureDTO();
			adventureDTO.setAdventureID(4);
			adventureDTO.setAdventure("Run a marathon");
			return adventureDTO;
		}
		
		@Override
		public void save(AdventureDTO adventureDTO) {
			
			
			
		}
	}


