package com.qualityOfLife.seguroDeVida.security.service;

import com.qualityOfLife.seguroDeVida.integration.entity.Estado;


public interface EstadoService {


	public void saveEstado(Estado estado);
	public void updateEstado(Estado estado);
	public void deleteEstado(Estado estado);
	public Estado findEstado(Estado estado);

}
