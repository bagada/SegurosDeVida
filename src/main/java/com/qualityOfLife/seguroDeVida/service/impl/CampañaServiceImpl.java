package com.qualityOfLife.seguroDeVida.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.qualityOfLife.seguroDeVida.integration.dao.CampañaDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Campaña;
import com.qualityOfLife.seguroDeVida.service.CampañaService;

public class CampañaServiceImpl implements CampañaService {

	@Autowired
	private CampañaDAO campañaDAO;

	public void saveCampaña(Campaña campaña) {
		campañaDAO.saveCampaña(campaña);

	}

	public void updateCampaña(Campaña campaña) {
		campañaDAO.updateCampaña(campaña);

	}

	public void deleteCampaña(Campaña campaña) {
		campañaDAO.deleteCampaña(campaña);
	}

	public Campaña findCampaña(Campaña campaña) {

		return campañaDAO.findCampaña(campaña);
	}

}
