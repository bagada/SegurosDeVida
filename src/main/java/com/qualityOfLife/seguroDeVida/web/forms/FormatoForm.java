package com.qualityOfLife.seguroDeVida.web.forms;

import java.sql.Date;

public class FormatoForm {
	
	private int idFormato;
	private int idEmpleado;
	private int idPotenciacion;
	private int idHistorico;
	private Date fechaFormato;
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
