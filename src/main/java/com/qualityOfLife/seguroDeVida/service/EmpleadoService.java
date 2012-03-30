package com.qualityOfLife.seguroDeVida.service;

import com.qualityOfLife.seguroDeVida.integration.entity.Empleado;

public interface EmpleadoService {
	
	public void saveEmpleado(Empleado empleado);
	public void updateEmpleado(Empleado empleado);
	public void deleteEmpleado(Empleado empleado);
	public Empleado findEmpleado(Integer id);

}
