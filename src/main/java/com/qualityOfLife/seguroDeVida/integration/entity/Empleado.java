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
	private int idEmp;
	
	@Column(name="Nom_Emp")
	private String nomEmp;
	
	@Column(name="ApeP_Emp")
	private String apePEmp;
	
	@Column(name="ApeM_Emp")
	private String apeMEmp;
	
	
	@Column(name="RFC_Emp")
	private String rFCEmp;
	
	@Column(name="Nom_Estado")
	private String nomEstado;
	
	@Column(name="Nom_Region")
	private String nomRegion;

	public int getIdEmp() {
		return idEmp;
	}

	public void setIdEmp(int idEmp) {
		this.idEmp = idEmp;
	}

	public String getNomEmp() {
		return nomEmp;
	}

	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}

	public String getApePEmp() {
		return apePEmp;
	}

	public void setApePEmp(String apePEmp) {
		this.apePEmp = apePEmp;
	}

	public String getApeMEmp() {
		return apeMEmp;
	}

	public void setApeMEmp(String apeMEmp) {
		this.apeMEmp = apeMEmp;
	}

	public String getRFCEmp() {
		return rFCEmp;
	}

	public void setRFCEmp(String rFCEmp) {
		this.rFCEmp = rFCEmp;
	}

	public String getNomEstado() {
		return nomEstado;
	}

	public void setNomEstado(String nomEstado) {
		this.nomEstado = nomEstado;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	
	

}
