package com.qualityOfLife.seguroDeVida.integration.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Quality_Campaña")

public class Campaña {
	@Id
	@Column(name="Id_Campaña")
	private int idCampaña;
	
	@Column(name="Fecha_Inicio_Campaña")
	private Date fechaInicioCampaña;
	
	
	@Column(name="Fecha_Termino_Campaña")
	private Date fechaTerminoCampaña;


	public int getIdCampaña() {
		return idCampaña;
	}


	public void setIdCampaña(int idCampaña) {
		this.idCampaña = idCampaña;
	}


	public Date getFechaInicioCampaña() {
		return fechaInicioCampaña;
	}


	public void setFechaInicioCampaña(Date fechaInicioCampaña) {
		this.fechaInicioCampaña = fechaInicioCampaña;
	}


	public Date getFechaTerminoCampaña() {
		return fechaTerminoCampaña;
	}


	public void setFechaTerminoCampaña(Date fechaTerminoCampaña) {
		this.fechaTerminoCampaña = fechaTerminoCampaña;
	}


}
