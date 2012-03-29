package com.qualityOfLife.seguroDeVida.service.impl;


import org.springframework.beans.factory.annotation.Autowired;


import com.qualityOfLife.seguroDeVida.integration.dao.RegionDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.Region;
import com.qualityOfLife.seguroDeVida.service.RegionService;

public class RegionServiceImpl implements RegionService {
	@Autowired
	private RegionDAO regionDao;

	public void saveRegion(Region region) {
		regionDao.saveRegion(region);
		
	}

	public void updateRegion(Region region) {
		regionDao.updateRegion(region);
		
	}

	public void deleteRegion(Region region) { 
		regionDao.deleteRegion(region);
				
	}

	public Region findRegion(Region region) {
		
		return regionDao.findRegion(region);
	}

}
