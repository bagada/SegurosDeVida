package com.qualityOfLife.seguroDeVida.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qualityOfLife.seguroDeVida.integration.entity.Parentesco;
import com.qualityOfLife.seguroDeVida.service.ParentescoService;

public class ParentescoServiceImpl implements ParentescoService {
	@Autowired
    private ParentescoService parentescoDao;
	public List<Parentesco> getAll() {
		
		return parentescoDao.getAll();
	}

}
