package com.qualityOfLife.seguroDeVida.integration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Quality_Empleado")
public class Empleado {
	@Id
	@Column(name="Id_Emp")
	private int IdEmp;
	
	@Column(name="Nom_Emp")
	private String NomEmp;
	
	@Column(name="ApeP_Emp")
	private String ApePEmp;
	
	@Column(name="ApeM_Emp")
	private String ApeMEmp;
	
	
	@Column(name="RFC_Emp")
	private String RFCEmp;
	
	@Column(name="Nom_Estado")
	private String NomEstado;
	
	@Column(name="Nom_Region")
	private String NomRegion;

	public int getIdEmp() {
		return IdEmp;
	}

	public void setIdEmp(int idEmp) {
		IdEmp = idEmp;
	}

	public String getNomEmp() {
		return NomEmp;
	}

	public void setNomEmp(String nomEmp) {
		NomEmp = nomEmp;
	}

	public String getApePEmp() {
		return ApePEmp;
	}

	public void setApePEmp(String apePEmp) {
		ApePEmp = apePEmp;
	}

	public String getApeMEmp() {
		return ApeMEmp;
	}

	public void setApeMEmp(String apeMEmp) {
		ApeMEmp = apeMEmp;
	}

	public String getRFCEmp() {
		return RFCEmp;
	}

	public void setRFCEmp(String rFCEmp) {
		RFCEmp = rFCEmp;
	}

	public String getNomEstado() {
		return NomEstado;
	}

	public void setNomEstado(String nomEstado) {
		NomEstado = nomEstado;
	}

	public String getNomRegion() {
		return NomRegion;
	}

	public void setNomRegion(String nomRegion) {
		NomRegion = nomRegion;
	}
	
	

}
