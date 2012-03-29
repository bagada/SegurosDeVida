package com.qualityOfLife.seguroDeVida.integration.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.qualityOfLife.seguroDeVida.integration.dao.FormatoDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Formato;

public class FormatoDAOImpl extends HibernateDaoSupport implements FormatoDAO {

	public void saveFormato(Formato formato) {
		getHibernateTemplate().save(formato);

	}

	public void updateFormato(Formato formato) {
		getHibernateTemplate().update(formato);

	}

	public void deleteFormato(Formato formato) {
		getHibernateTemplate().delete(formato);

	}

	public Formato findFormato(Formato formato) {
		return (Formato)getHibernateTemplate().find(String.valueOf(formato.getIdFormato())).get(0);
	}

}
