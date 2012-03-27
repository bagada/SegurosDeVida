package com.qualityOfLife.seguroDeVida.service;

import com.qualityOfLife.seguroDeVida.integration.entity.Beneficiario;


public interface BeneficiarioService {
	
	public void saveBeneficiario(Beneficiario beneficiario);
	public void updateBeneficiario(Beneficiario beneficiario);
	public void deleteBeneficiario(Beneficiario beneficiario);
	public Beneficiario findBeneficiario(Beneficiario beneficiario); 

}
