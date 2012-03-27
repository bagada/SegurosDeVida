package com.qualityOfLife.seguroDeVida.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.qualityOfLife.seguroDeVida.integration.dao.EstadoDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Estado;
import com.qualityOfLife.seguroDeVida.security.service.EstadoService;

public class EstadoServiceImpl  implements EstadoService{
	@Autowired
	private EstadoDAO estadoDAO;

	public void saveEstado(Estado estado) {
		estadoDAO.saveEquipment(estado);
		
	}

	public void updateEstado(Estado estado) {
		estadoDAO.updateEquipment(estado);
	}

	public void deleteEstado(Estado estado) {
		estadoDAO.deleteEquipment(estado);
		
	}

	public Estado findEstado(Estado estado) {
		
		return  estadoDAO.findEstado(estado);
	}

	

}
