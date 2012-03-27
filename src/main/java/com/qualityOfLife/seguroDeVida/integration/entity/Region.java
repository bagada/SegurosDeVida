package com.qualityOfLife.seguroDeVida.integration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Quality_Region")

public class Region {
	@Id
	@Column(name="Id_Region")
	private int IdRegion;
	
	@Column(name="Nom_Region")
	private String NomRegion;

	public int getIdRegion() {
		return IdRegion;
	}

	public void setIdRegion(int idRegion) {
		IdRegion = idRegion;
	}

	public String getNomRegion() {
		return NomRegion;
	}

	public void setNomRegion(String nomRegion) {
		NomRegion = nomRegion;
	}
}
