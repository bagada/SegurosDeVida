package com.qualityOfLife.seguroDeVida.integration.dao;

import com.qualityOfLife.seguroDeVida.integration.entity.Beneficiario;


public interface BeneficiarioDAO {
	public void saveBeneficiario(Beneficiario beneficiario);
	public void updateBeneficiario(Beneficiario beneficiario);
	public void deleteBeneficiario(Beneficiario beneficiario);
	public Beneficiario findBeneficiario(Beneficiario beneficiario); 

}
