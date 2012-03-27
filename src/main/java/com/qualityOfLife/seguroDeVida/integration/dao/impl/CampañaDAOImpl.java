package com.qualityOfLife.seguroDeVida.integration.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.qualityOfLife.seguroDeVida.integration.dao.CampañaDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Campaña;

public class CampañaDAOImpl extends HibernateDaoSupport implements CampañaDAO {

	public void saveCampaña(Campaña campaña) {
		getHibernateTemplate().save(campaña);
		
	}

	public void updateCampaña(Campaña campaña) {
		getHibernateTemplate().update(campaña);
		
	}

	public void deleteCampaña(Campaña campaña) {
		getHibernateTemplate().delete(campaña);
		
	}

	public Campaña findCampaña(Campaña campaña) {
		
		return (Campaña) getHibernateTemplate().find(String.valueOf(campaña.getIdCampaña())).get(0);
	}

}
