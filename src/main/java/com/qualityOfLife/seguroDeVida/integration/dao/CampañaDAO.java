package com.qualityOfLife.seguroDeVida.integration.dao;

import com.qualityOfLife.seguroDeVida.integration.entity.Campaña;

public interface CampañaDAO {
	
	public void saveCampaña(Campaña campaña);
	public void updateCampaña(Campaña campaña);
	public void deleteCampaña(Campaña campaña);
	public Campaña findCampaña(Campaña campaña); 

}
