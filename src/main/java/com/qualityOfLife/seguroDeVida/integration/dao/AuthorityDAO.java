package com.qualityOfLife.seguroDeVida.integration.dao;

import java.util.List;

import com.qualityOfLife.seguroDeVida.integration.entity.Authority;

public interface AuthorityDAO {
	
	public void saveAuthority(Authority authority);	
	public List<Authority> getAuthoritiesByUsername(int idUser);
	

}
