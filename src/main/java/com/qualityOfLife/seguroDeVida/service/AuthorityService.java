package com.qualityOfLife.seguroDeVida.service;

import java.util.List;

import com.qualityOfLife.seguroDeVida.integration.entity.Authority;

public interface AuthorityService {
	public void saveAuthority(Authority authority);	
	public List<Authority> getAuthoritiesByUsername(int idUser);

}
