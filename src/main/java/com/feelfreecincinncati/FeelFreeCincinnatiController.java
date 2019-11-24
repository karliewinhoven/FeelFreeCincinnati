package com.feelfreecincinncati;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.feelfreecincinncati.dto.AdventureDTO;
import com.feelfreecincinncati.dto.EventDTO;
import com.feelfreecincinncati.service.iAdventureService;
import com.feelfreecincinncati.service.iEventService;


@Controller
public class FeelFreeCincinnatiController {
	
	@Autowired
	private iAdventureService adventureServiceStub;
	@Autowired
	private iEventService eventServiceStub; 
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String start(Model model) {
		AdventureDTO adventureDTO = adventureServiceStub.fetchById(4);
		model.addAttribute("adventureDTO", adventureDTO);
		EventDTO eventDTO = eventServiceStub.fetchById(2);
		model.addAttribute("eventDTO", eventDTO);
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
