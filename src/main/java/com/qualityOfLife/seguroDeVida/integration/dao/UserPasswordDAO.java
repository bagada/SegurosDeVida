package com.qualityOfLife.seguroDeVida.integration.dao;

import com.qualityOfLife.seguroDeVida.integration.entity.UserPassword;

public interface UserPasswordDAO {
	
	public UserPassword findByUserAndPasword(final String username, final String password);
	public void saveUserPassword(UserPassword userPassword);

}
