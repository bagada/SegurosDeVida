package com.qualityOfLife.seguroDeVida.integration.dao;

import com.qualityOfLife.seguroDeVida.integration.entity.Empleado;

public interface EmpleadoDAO {

	public void saveEmpleado(Empleado empleado);
	public void updateEmpleado(Empleado empleado);
	public void deleteEmpleado(Empleado empleado);
	public Empleado findEmpleado(Empleado empleado);


}
