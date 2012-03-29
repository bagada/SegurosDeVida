package com.qualityOfLife.seguroDeVida.integration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Quality_Parentesco")
public class Parentesco {
	@Id
	@Column(name="Id_Parentesco")
	private int idParentesco;
	
	@Column(name="Nom_Parentesco")
	private int nomParentesco;

	public int getIdParentesco() {
		return idParentesco;
	}

	public void setIdParentesco(int idParentesco) {
		this.idParentesco = idParentesco;
	}

	public int getNomParentesco() {
		return nomParentesco;
	}

	public void setNomParentesco(int nomParentesco) {
		this.nomParentesco = nomParentesco;
	}

}
