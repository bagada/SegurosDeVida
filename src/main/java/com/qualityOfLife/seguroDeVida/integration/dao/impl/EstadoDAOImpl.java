package com.qualityOfLife.seguroDeVida.integration.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.qualityOfLife.seguroDeVida.integration.dao.EstadoDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Estado;

public class EstadoDAOImpl extends HibernateDaoSupport implements EstadoDAO{

	public void saveEquipment(Estado estado) {
		getHibernateTemplate().save(estado);
		
	}

	public void updateEquipment(Estado estado) {
	 getHibernateTemplate().update(estado);
		
	}

	public void deleteEquipment(Estado estado) {
	      getHibernateTemplate().delete(estado);
		
	}

	public Estado findEstado(Estado estado) {
				return (Estado) getHibernateTemplate().find(String.valueOf(estado.getIdEstado()));
	}

}
