package com.qualityOfLife.seguroDeVida.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpleadoController {
	
	@RequestMapping(value = "/empleado", method = RequestMethod.GET)
	public String login(ModelMap model) {
		//System.out.println("------------------------algo mas--");
		//model.addAttribute("loginForm",new LoginForm());

		return "/Empleado";
	}

}
