package com.qualityOfLife.seguroDeVida.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.qualityOfLife.seguroDeVida.integration.dao.UserPasswordDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.UserPassword;
import com.qualityOfLife.seguroDeVida.service.UserPasswordService;

public class UserPasswordServiceImpl implements UserPasswordService{

	@Autowired
	private UserPasswordDAO userPasswordDAO;
	
	public UserPassword findByUserAndPasword(String username, String password) {
		return userPasswordDAO.findByUserAndPasword(username, password);
	}

	public void saveUserPassword(UserPassword userPassword) {
		userPasswordDAO.saveUserPassword(userPassword);
	}

}
