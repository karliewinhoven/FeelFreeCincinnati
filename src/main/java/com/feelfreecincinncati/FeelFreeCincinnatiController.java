package com.feelfreecincinncati;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FeelFreeCincinnatiController {
	
	@RequestMapping("/index")
	public String start() {
		return "index";
	}

}
