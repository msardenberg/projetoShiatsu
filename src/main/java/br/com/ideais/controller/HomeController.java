package br.com.ideais.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	
	@RequestMapping(value="/")
	public String home(Map<String, Object> model) {
		return "home";
	}
		
	@RequestMapping(value="/index")
	public String index(Map<String, Object> model) {
		return "index";
	}
	
}
