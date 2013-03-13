package br.com.ideais.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.ideais.model.User;
import br.com.ideais.service.UserService;

@Controller("UserController")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/cadastroUsuario",method = RequestMethod.GET )
	public ModelAndView newUser(){
		return new ModelAndView("index", "user", new User());
	}
		
	@RequestMapping(value = "/cadastroUsuario",method = RequestMethod.POST )
	public ModelAndView newUser(User user){
		if("".equals(user.getEmail()) || "".equals(user.getPassword())){
			List<String> mensagens = new ArrayList<String>();
			mensagens.add("Erro ao cadastrar, preencha todos os campos do cadastro!!");
			return new ModelAndView("index", "mensagens", mensagens);
		}else{
		userService.save( user );
		}
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/remove/{id}",method = RequestMethod.GET )
	public ModelAndView delete( @PathVariable Long id ){
		User user = userService.find( id );
		return new ModelAndView("index", "user", user);
	}
	@RequestMapping(value = "/remove",method = RequestMethod.POST )
	public String delete( User user ){
		userService.remove( user );
		return "index";
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}