package com.qualityOfLife.seguroDeVida.integration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Quality_Potenciacion")
public class Potenciacion {
	@Id
	@Column(name="Id_Potenciacion")
	private int idPotenciacion;
	
	@Column(name="Num_Potenciacion")
	private int numPotenciacion;

	@Column(name="Porcentaje_Potenciacion")
	private int porcetanjePotenciacion;

	@Column(name="Mes_Potenciacion")
	private int mesPotenciacion;

	public int getIdPotenciacion() {
		return idPotenciacion;
	}

	public void setIdPotenciacion(int idPotenciacion) {
		this.idPotenciacion = idPotenciacion;
	}

	public int getNumPotenciacion() {
		return numPotenciacion;
	}

	public void setNumPotenciacion(int numPotenciacion) {
		this.numPotenciacion = numPotenciacion;
	}

	public int getPorcetanjePotenciacion() {
		return porcetanjePotenciacion;
	}

	public void setPorcetanjePotenciacion(int porcetanjePotenciacion) {
		this.porcetanjePotenciacion = porcetanjePotenciacion;
	}

	public int getMesPotenciacion() {
		return mesPotenciacion;
	}

	public void setMesPotenciacion(int mesPotenciacion) {
		this.mesPotenciacion = mesPotenciacion;
	}

}
