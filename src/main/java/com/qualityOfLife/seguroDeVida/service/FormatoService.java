package com.qualityOfLife.seguroDeVida.service;

import com.qualityOfLife.seguroDeVida.integration.entity.Formato;

public interface FormatoService {
	
	public void saveFormato(Formato formato);
	public void updateFormato(Formato formato);
	public void deleteFormato(Formato formato);
	public Formato findFormato(Formato formato);

}
