package com.qualityOfLife.seguroDeVida.service;

import com.qualityOfLife.seguroDeVida.integration.entity.User;

public interface UserService {
	
	public void saveUser(User user);
	public void updateUser(User user);	
	public User findUser(String username,String password);
	public User findByUsername(String username);
	public User getUserByUsername(String username);

}
