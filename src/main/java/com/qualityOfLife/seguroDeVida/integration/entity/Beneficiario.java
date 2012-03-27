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
	private int IdBeneficiario;
	
	@Column(name="Id_Formato")
	private int IdFormato;
	
	@Column(name="Nom_Beneficiario")
	private String NomBeneficiario;
	
	@Column(name="ApelliP_Ben")
	private String ApellidoBen;
	
	@Column(name="ApelliM_Ben")
	private String ApelliMBen;
	
	
	@Column(name="Nom_Parentesco")
	private String NomParentesco;
	
	@Column(name="Obs_Ben")
	private String ObsBen;
	
	@Column(name="Num_Porcentaje")
	private int NumPorcetaje;

	public int getIdBeneficiario() {
		return IdBeneficiario;
	}

	public void setIdBeneficiario(int idBeneficiario) {
		IdBeneficiario = idBeneficiario;
	}

	public int getIdFormato() {
		return IdFormato;
	}

	public void setIdFormato(int idFormato) {
		IdFormato = idFormato;
	}

	public String getNomBeneficiario() {
		return NomBeneficiario;
	}

	public void setNomBeneficiario(String nomBeneficiario) {
		NomBeneficiario = nomBeneficiario;
	}

	public String getApellidoBen() {
		return ApellidoBen;
	}

	public void setApellidoBen(String apellidoBen) {
		ApellidoBen = apellidoBen;
	}

	public String getApelliMBen() {
		return ApelliMBen;
	}

	public void setApelliMBen(String apelliMBen) {
		ApelliMBen = apelliMBen;
	}

	public String getNomParentesco() {
		return NomParentesco;
	}

	public void setNomParentesco(String nomParentesco) {
		NomParentesco = nomParentesco;
	}

	public String getObsBen() {
		return ObsBen;
	}

	public void setObsBen(String obsBen) {
		ObsBen = obsBen;
	}

	public int getNumPorcetaje() {
		return NumPorcetaje;
	}

	public void setNumPorcetaje(int numPorcetaje) {
		NumPorcetaje = numPorcetaje;
	}

	

}
