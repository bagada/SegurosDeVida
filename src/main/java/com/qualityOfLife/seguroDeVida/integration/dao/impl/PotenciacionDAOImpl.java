package com.qualityOfLife.seguroDeVida.integration.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.qualityOfLife.seguroDeVida.integration.dao.PotenciacionDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Potenciacion;

public class PotenciacionDAOImpl extends HibernateDaoSupport implements PotenciacionDAO {

	public List<Potenciacion> getAll() {
		
		return getHibernateTemplate().loadAll(Potenciacion.class);
	}

}
