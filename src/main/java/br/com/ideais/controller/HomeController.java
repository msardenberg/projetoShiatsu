package br.com.ideais.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ideais.dao.DAOBase;


@Controller
public class HomeController {
	
	private DAOBase<?> daoBase;
	
	@RequestMapping("/")
	public String index(Map<String, Object> model) {
		
		return "index";
	}
	
	public void setDaoBase(DAOBase<?> daoBase) {
		this.daoBase = daoBase;
	}
	
}
