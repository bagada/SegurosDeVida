package com.qualityOfLife.seguroDeVida.integration.dao;

import com.qualityOfLife.seguroDeVida.integration.entity.Estado;



public interface EstadoDAO { 
	
	public void saveEquipment(Estado estado);
	public void updateEquipment(Estado estado);
	public void deleteEquipment(Estado estado);
	public Estado findEstado(Estado estado);
	

}
