package com.qualityOfLife.seguroDeVida.integration.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Quality_Formato")
public class Formato {
	
	@Id
	@Column(name="Id_Formato")
	private int idFormato;
	
	@Column(name="Id_Empleado")
	private int idEmpleado;
	
	@Column(name="Id_Potenciacion")
	private int idPotenciacion;
	
	@Column(name="Id_Historico")
	private int idHistorico;
	
	@Column(name="Fecha_Formato")
	private Date fechaFormato;
	
	@Column(name="Nom_Region")
	private String nomRegion;

	public int getIdFormato() {
		return idFormato;
	}

	public void setIdFormato(int idFormato) {
		this.idFormato = idFormato;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public int getIdPotenciacion() {
		return idPotenciacion;
	}

	public void setIdPotenciacion(int idPotenciacion) {
		this.idPotenciacion = idPotenciacion;
	}

	public int getIdHistorico() {
		return idHistorico;
	}

	public void setIdHistorico(int idHistorico) {
		this.idHistorico = idHistorico;
	}

	public Date getFechaFormato() {
		return fechaFormato;
	}

	public void setFechaFormato(Date fechaFormato) {
		this.fechaFormato = fechaFormato;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

}
