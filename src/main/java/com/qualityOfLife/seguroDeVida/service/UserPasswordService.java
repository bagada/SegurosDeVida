package com.qualityOfLife.seguroDeVida.service;

import com.qualityOfLife.seguroDeVida.integration.entity.UserPassword;

public interface UserPasswordService {

	public UserPassword findByUserAndPasword(final String username, final String password);
	public void saveUserPassword(UserPassword userPassword);
}
