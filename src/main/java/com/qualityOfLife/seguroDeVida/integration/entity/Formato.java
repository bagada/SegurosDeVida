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
	private int IdFormato;
	
	@Column(name="Id_Empleado")
	private int IdEmpleado;
	
	@Column(name="Id_Potenciacion")
	private int IdPotenciacion;
	
	@Column(name="Id_Historico")
	private int IdHistorico;
	
	@Column(name="Fecha_Formato")
	private Date FechaFormato;
	
	@Column(name="Nom_Region")
	private String NomRegion;

	public int getIdFormato() {
		return IdFormato;
	}

	public void setIdFormato(int idFormato) {
		IdFormato = idFormato;
	}

	public int getIdEmpleado() {
		return IdEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		IdEmpleado = idEmpleado;
	}

	public int getIdPotenciacion() {
		return IdPotenciacion;
	}

	public void setIdPotenciacion(int idPotenciacion) {
		IdPotenciacion = idPotenciacion;
	}

	public int getIdHistorico() {
		return IdHistorico;
	}

	public void setIdHistorico(int idHistorico) {
		IdHistorico = idHistorico;
	}

	public Date getFechaFormato() {
		return FechaFormato;
	}

	public void setFechaFormato(Date fechaFormato) {
		FechaFormato = fechaFormato;
	}

	public String getNomRegion() {
		return NomRegion;
	}

	public void setNomRegion(String nomRegion) {
		NomRegion = nomRegion;
	}

}
