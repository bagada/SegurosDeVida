package com.qualityOfLife.seguroDeVida.integration.dao;

import com.qualityOfLife.seguroDeVida.integration.entity.Formato;

public interface FormatoDAO {

	public void saveFormato(Formato formato);
	public void updateFormato(Formato formato);
	public void deleteFormato(Formato formato);
	public Formato findFormato(Formato formato);
}
