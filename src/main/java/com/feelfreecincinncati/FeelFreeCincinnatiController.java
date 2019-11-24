package com.feelfreecincinncati;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.feelfreecincinncati.dto.AdventureDTO;
import com.feelfreecincinncati.dto.EventDTO;
import com.feelfreecincinncati.service.IAdventureService;
import com.feelfreecincinncati.service.IEventService;


@Controller
public class FeelFreeCincinnatiController {
	
	@Autowired
	private IAdventureService adventureServiceStub;
	@Autowired
	private IEventService eventServiceStub; 
	
	@RequestMapping(value="/getEvent")
	public String getEvent(EventDTO eventDTO) {
		
		eventDTO = eventServiceStub.fetchById(4);	
		return "index";
		
	}
	
	@RequestMapping(value="/getAdventure")
	public String getAdventure(AdventureDTO adventureDTO) {
		adventureDTO = adventureServiceStub.fetchById(4);
		return "index";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String start(Model model) {
		model.addAttribute("eventDTO", new EventDTO());
		model.addAttribute("advenuteDTO", new AdventureDTO());
		return "index";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		return "index";
	}

	@RequestMapping("/")
	public String error() {
		return "index";
	}

}
