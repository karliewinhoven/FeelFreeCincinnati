package com.feelfreecincinncati.service;

import com.feelfreecincinncati.dto.AdventureDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

	@Component
	public class AdventureServiceStub {
		
		public static List<AdventureDTO> adventures = new ArrayList<>();
		
		static {
			AdventureDTO adventure = new AdventureDTO();
			adventure.setAdventureID(1);
			adventure.setAdventureName("Jog");
			adventures.add(adventure);
			
			adventure = new AdventureDTO();
			adventure.setAdventureID(2);
			adventure.setAdventureName("Walk in the park");
			adventures.add(adventure);
			
			adventure = new AdventureDTO();
			adventure.setAdventureID(3);
			adventure.setAdventureName("Read a book");
			adventures.add(adventure);
			
			adventure = new AdventureDTO();
			adventure.setAdventureID(4);
			adventure.setAdventureName("Walk your pet");
			adventures.add(adventure);
			
			adventure = new AdventureDTO();
			adventure.setAdventureID(5);
			adventure.setAdventureName("Wash your car");
			adventures.add(adventure);
			
			adventure = new AdventureDTO();
			adventure.setAdventureID(6);
			adventure.setAdventureName("Go to the library");
			adventures.add(adventure);
			
			adventure = new AdventureDTO();
			adventure.setAdventureID(7);
			adventure.setAdventureName("Sit by the river");
			adventures.add(adventure);
			
			adventure = new AdventureDTO();
			adventure.setAdventureID(8);
			adventure.setAdventureName("Volunteer");
			adventures.add(adventure);
			
			adventure = new AdventureDTO();
			adventure.setAdventureID(9);
			adventure.setAdventureName("Take pictures around your neighborhood");
			adventures.add(adventure);
			
			adventure = new AdventureDTO();
			adventure.setAdventureID(10);
			adventure.setAdventureName("Run");
			adventures.add(adventure);


		}
		
		public AdventureDTO fetchById(int id) {
			return null;
		}

		public void save(AdventureDTO adventureDTO) {
			
		}
		
	}


