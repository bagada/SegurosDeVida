package com.qualityOfLife.seguroDeVida.integration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Quality_Beneficiario")
public class Beneficiario {
	
	@Id
	@Column(name="Id_Beneficario")
	private int idBeneficiario;
	
	@Column(name="Id_Formato")
	private int idFormato;
	
	@Column(name="Nom_Beneficiario")
	private String nomBeneficiario;
	
	@Column(name="ApelliP_Ben")
	private String apellidoBen;
	
	@Column(name="ApelliM_Ben")
	private String apelliMBen;
	
	
	@Column(name="Nom_Parentesco")
	private String nomParentesco;
	
	@Column(name="Obs_Ben")
	private String obsBen;
	
	@Column(name="Num_Porcentaje")
	private int numPorcetaje;

	public int getIdBeneficiario() {
		return idBeneficiario;
	}

	public void setIdBeneficiario(int idBeneficiario) {
		this.idBeneficiario = idBeneficiario;
	}

	public int getIdFormato() {
		return idFormato;
	}

	public void setIdFormato(int idFormato) {
		this.idFormato = idFormato;
	}

	public String getNomBeneficiario() {
		return nomBeneficiario;
	}

	public void setNomBeneficiario(String nomBeneficiario) {
		this.nomBeneficiario = nomBeneficiario;
	}

	public String getApellidoBen() {
		return apellidoBen;
	}

	public void setApellidoBen(String apellidoBen) {
		this.apellidoBen = apellidoBen;
	}

	public String getApelliMBen() {
		return apelliMBen;
	}

	public void setApelliMBen(String apelliMBen) {
		this.apelliMBen = apelliMBen;
	}

	public String getNomParentesco() {
		return nomParentesco;
	}

	public void setNomParentesco(String nomParentesco) {
		this.nomParentesco = nomParentesco;
	}

	public String getObsBen() {
		return obsBen;
	}

	public void setObsBen(String obsBen) {
		this.obsBen = obsBen;
	}

	public int getNumPorcetaje() {
		return numPorcetaje;
	}

	public void setNumPorcetaje(int numPorcetaje) {
		this.numPorcetaje = numPorcetaje;
	}

	

}
