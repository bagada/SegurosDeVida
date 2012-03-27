package com.qualityOfLife.seguroDeVida.security.service;

import com.qualityOfLife.seguroDeVida.integration.entity.Region;

public interface RegionService {
	public void saveRegion(Region region);
	public void updateRegion(Region region);
	public void deleteRegion(Region region);
	public Region findRegion(Region region);

}
