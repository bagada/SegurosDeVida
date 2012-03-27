package com.qualityOfLife.seguroDeVida.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.qualityOfLife.seguroDeVida.integration.entity.Beneficiario;
import com.qualityOfLife.seguroDeVida.service.BeneficiarioService;

public class BeneficiarioServiceImpl implements BeneficiarioService {
	
@Autowired
	private BeneficiarioService beneficiarioDAO;

	public void saveBeneficiario(Beneficiario beneficiario) {
		beneficiarioDAO.saveBeneficiario(beneficiario);
		
	}

	public void updateBeneficiario(Beneficiario beneficiario) {
		beneficiarioDAO.updateBeneficiario(beneficiario);
		
	}

	public void deleteBeneficiario(Beneficiario beneficiario) {
		beneficiarioDAO.deleteBeneficiario(beneficiario);
		
	}

	public Beneficiario findBeneficiario(Beneficiario beneficiario) {
		
		return beneficiarioDAO.findBeneficiario (beneficiario);
	}

}
