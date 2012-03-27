package com.qualityOfLife.seguroDeVida.integration.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.qualityOfLife.seguroDeVida.integration.dao.EmpleadoDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Empleado;

public class EmpleadoDAOImpl extends HibernateDaoSupport implements EmpleadoDAO {

	public void saveEmpleado(Empleado empleado) {
		getHibernateTemplate().save(empleado);
	}

	public void updateEmpleado(Empleado empleado) {
		getHibernateTemplate().update(empleado);
		
	}

	public void deleteEmpleado(Empleado empleado) {
		getHibernateTemplate().delete(empleado);
		
	}

	public Empleado findEmpleado(Empleado empleado) {

		return (Empleado) getHibernateTemplate().find(String.valueOf(empleado.getIdEmp()));
	}

}
