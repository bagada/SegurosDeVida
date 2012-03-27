package com.qualityOfLife.seguroDeVida.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.qualityOfLife.seguroDeVida.integration.dao.EmpleadoDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Empleado;
import com.qualityOfLife.seguroDeVida.security.service.EmpleadoService;

public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDAO empleadoDAO;
	public void saveEmpleado(Empleado empleado) {
	
}
	public void updateEmpleado(Empleado empleado) {
		empleadoDAO.saveEmpleado(empleado);
		
	}
	public void deleteEmpleado(Empleado empleado) {
	empleadoDAO.deleteEmpleado(empleado);
		
	}
	public Empleado findEmpleado(Empleado empleado) {
		
		return  empleadoDAO.findEmpleado(empleado);
				
				}
}
