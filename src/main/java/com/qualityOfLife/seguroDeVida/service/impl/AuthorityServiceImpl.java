package com.qualityOfLife.seguroDeVida.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qualityOfLife.seguroDeVida.integration.dao.AuthorityDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Authority;
import com.qualityOfLife.seguroDeVida.service.AuthorityService;

public class AuthorityServiceImpl implements AuthorityService{

	@Autowired
	private AuthorityDAO authorityDAO; 
	public void saveAuthority(Authority authority) {
		authorityDAO.saveAuthority(authority);
	}

	public List<Authority> getAuthoritiesByUsername(int idUser) {
		return authorityDAO.getAuthoritiesByUsername(idUser);
	}

}
