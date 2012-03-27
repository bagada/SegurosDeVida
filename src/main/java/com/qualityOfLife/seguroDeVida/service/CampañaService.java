package com.qualityOfLife.seguroDeVida.service;

import com.qualityOfLife.seguroDeVida.integration.entity.Campaña;

public interface CampañaService {
	public void saveCampaña(Campaña campaña);
	public void updateCampaña(Campaña campaña);
	public void deleteCampaña(Campaña campaña);
	public Campaña findCampaña(Campaña campaña); 

}
