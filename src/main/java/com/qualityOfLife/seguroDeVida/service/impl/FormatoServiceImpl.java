package com.qualityOfLife.seguroDeVida.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.qualityOfLife.seguroDeVida.integration.dao.FormatoDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Formato;
import com.qualityOfLife.seguroDeVida.service.FormatoService;

public class FormatoServiceImpl implements FormatoService {

	@Autowired
	private FormatoDAO formatoDAO; 
	
	public void saveFormato(Formato formato) {
		formatoDAO.saveFormato(formato);
	}

	public void updateFormato(Formato formato) {
		formatoDAO.updateFormato(formato);
	}

	public void deleteFormato(Formato formato) {
		formatoDAO.deleteFormato(formato);
	}

	public Formato findFormato(Formato formato) {
			return formatoDAO.findFormato(formato);
	}

}
