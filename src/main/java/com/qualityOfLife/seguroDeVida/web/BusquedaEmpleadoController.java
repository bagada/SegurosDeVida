package com.qualityOfLife.seguroDeVida.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qualityOfLife.seguroDeVida.integration.entity.Empleado;
import com.qualityOfLife.seguroDeVida.service.EmpleadoService;

@Controller
public class BusquedaEmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoService; 
	
	@RequestMapping(value = "/busqueda", method = RequestMethod.GET)
	public String login(ModelMap model) {
		//System.out.println("------------------------algo mas--");
		//model.addAttribute("loginForm",new LoginForm());

		return "/buscaEmpleado";
	}
	
	@RequestMapping(value="/busqueda",method=RequestMethod.POST)
	public @ResponseBody Empleado addUser(@RequestParam(value="id") Integer id){
		
	Empleado empleado = empleadoService.findEmpleado(id);
		
		return empleado;
	}

}
