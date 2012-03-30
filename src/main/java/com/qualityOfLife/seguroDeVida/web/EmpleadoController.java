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

import com.qualityOfLife.seguroDeVida.integration.entity.Empleado;
import com.qualityOfLife.seguroDeVida.service.EmpleadoService;
import com.qualityOfLife.seguroDeVida.web.forms.EmpleadoForm;

@Controller
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;

	@RequestMapping(value = "/empleado", method = RequestMethod.GET)
	public String login(ModelMap model) {
		// System.out.println("------------------------algo mas--");
		model.addAttribute("empleadoForm", new EmpleadoForm());

		return "/Empleado";
	}

	@RequestMapping(value = "/empleado", method = RequestMethod.POST)
	public String registerNewUser(@Valid EmpleadoForm empleadoForm,
			BindingResult result, Model model, HttpSession session) {
		if (result.hasErrors()) {
			System.out.println("------------error--------------");
			return "/Empleado";
		} else {
			System.out.println("--------------------------");
			try {
				System.out.println("--------------------------");

				Empleado empleado = new Empleado();

				empleado.setNomEmp(empleadoForm.getNomEmp());
				empleado.setApePEmp(empleadoForm.getApePEmp());
				empleado.setApeMEmp(empleadoForm.getApeMEmp());
				empleado.setRFCEmp(empleadoForm.getrFCEmp());
				empleado.getIdEstado(empleadoForm.getIdEstado());
				empleado.setIdRegion(empleadoForm.getIdRegion());

				try {

					empleadoService.saveEmpleado(empleado);
				} catch (Exception e) {
					e.printStackTrace();
				}

				return "/exito";
			} catch (Exception e) {
				model.addAttribute("error", "userAlreadyExist");
				return "/Empleado";
			}
		}
	}

	@RequestMapping(value = "/exito", method = RequestMethod.GET)
	public String exito(ModelMap model) {

		return "/exito";
	}
}
