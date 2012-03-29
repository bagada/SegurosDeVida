package com.qualityOfLife.seguroDeVida.web;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qualityOfLife.seguroDeVida.integration.entity.Campaña;
import com.qualityOfLife.seguroDeVida.service.CampañaService;
import com.qualityOfLife.seguroDeVida.web.forms.CampañaForm;

@Controller 
public class CampañaController {
	
	@Autowired
	private CampañaService campañaService;
	
	@RequestMapping(value = "/campana", method = RequestMethod.GET)
	public String login(ModelMap model) {
		//System.out.println("------------------------algo mas--");
		model.addAttribute("campanaForm",new CampañaForm());  
		return "/Campaña";
	}
	
	
	@RequestMapping(value = "/registerEmployee", method = RequestMethod.POST)
	public String create(@Valid CampañaForm campañaForm, BindingResult result,
			Model model, HttpSession session) {
		if (result.hasErrors()) {
			System.out.println("---------------------+++++++");

			return "/registerEmployee";
		}else{
			try{
				Campaña campana = new Campaña();
				campana.setFechaInicioCampaña(campañaForm.getFechaInicioCampaña());
				campana.setFechaTerminoCampaña(campañaForm.getFechaTerminoCampaña());
				campañaService.saveCampaña(campana);
				return "/login";
				
			}catch(Exception e){
			model.addAttribute("error", "userAlreadyExist");
			return "registerEmployee";
			}
		}
	}
	

}
