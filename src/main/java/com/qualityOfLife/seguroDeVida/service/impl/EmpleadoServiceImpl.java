package com.qualityOfLife.seguroDeVida.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.qualityOfLife.seguroDeVida.integration.dao.EmpleadoDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Empleado;
import com.qualityOfLife.seguroDeVida.service.EmpleadoService;

public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDAO empleadoDAO;
	public void saveEmpleado(Empleado empleado) {
		empleadoDAO.saveEmpleado(empleado);
	
}
	public void updateEmpleado(Empleado empleado) {
		empleadoDAO.saveEmpleado(empleado);
		
	}
	public void deleteEmpleado(Empleado empleado) {
	empleadoDAO.deleteEmpleado(empleado);
		
	}
	public Empleado findEmpleado(Integer id) {
		
		return  empleadoDAO.findEmpleado(id);
				
				}
}
