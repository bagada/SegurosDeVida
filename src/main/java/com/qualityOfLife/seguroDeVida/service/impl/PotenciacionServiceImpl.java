package com.qualityOfLife.seguroDeVida.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qualityOfLife.seguroDeVida.integration.dao.PotenciacionDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Potenciacion;
import com.qualityOfLife.seguroDeVida.service.PotenciacionService;

public class PotenciacionServiceImpl  implements PotenciacionService{
	
	@Autowired
	private PotenciacionDAO potenciacionDAO;
	
	public List<Potenciacion> getAll() {
		
		return potenciacionDAO.getAll();
	}
	

}
