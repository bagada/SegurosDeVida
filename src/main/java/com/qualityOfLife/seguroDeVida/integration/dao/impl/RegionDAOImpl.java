package com.qualityOfLife.seguroDeVida.integration.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.qualityOfLife.seguroDeVida.integration.dao.RegionDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Region;

public class RegionDAOImpl  extends HibernateDaoSupport implements RegionDAO{

	public void saveRegion(Region region) {
		getHibernateTemplate().save(region);
		
	}

	public void updateRegion(Region region) {
		getHibernateTemplate().update(region);
		
	}

	public void deleteRegion(Region region) {
		getHibernateTemplate().delete(region);
		
	}

	public Region findRegion(Region region) {
		
		return  (Region)getHibernateTemplate().find(String.valueOf(region.getIdRegion()));
	}

}
