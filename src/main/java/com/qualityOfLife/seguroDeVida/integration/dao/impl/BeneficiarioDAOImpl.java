package com.qualityOfLife.seguroDeVida.integration.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.qualityOfLife.seguroDeVida.integration.dao.BeneficiarioDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Beneficiario;

public class BeneficiarioDAOImpl extends HibernateDaoSupport implements BeneficiarioDAO{

	public void saveBeneficiario(Beneficiario beneficiario) {
		getHibernateTemplate().save(beneficiario);
		
	}

	public void updateBeneficiario(Beneficiario beneficiario) {
		getHibernateTemplate().update(beneficiario);
		
	}

	public void deleteBeneficiario(Beneficiario beneficiario) {
		getHibernateTemplate().delete(beneficiario);
		
	}

	public Beneficiario findBeneficiario(Beneficiario beneficiario) {
		return (Beneficiario) getHibernateTemplate().find(String.valueOf(beneficiario.getIdBeneficiario())).get(0);
	}

}
