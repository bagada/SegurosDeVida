package com.qualityOfLife.seguroDeVida.integration.dao;


import com.qualityOfLife.seguroDeVida.integration.entity.Region;

public interface RegionDAO { 
	public void saveRegion(Region region);
	public void updateRegion(Region region);
	public void deleteRegion(Region region);
	public Region findRegion(Region region);
	

}
