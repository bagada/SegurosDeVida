package com.qualityOfLife.seguroDeVida.integration.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.qualityOfLife.seguroDeVida.integration.dao.ParentescoDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Parentesco;

public class ParentescoDAOImpl extends HibernateDaoSupport implements ParentescoDAO {

	public List<Parentesco> getAll() {
		
		return   getHibernateTemplate().loadAll(Parentesco.class);
	}

}
