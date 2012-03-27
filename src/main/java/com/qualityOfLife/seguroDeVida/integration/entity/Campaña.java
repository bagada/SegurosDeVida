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
	private int IdCampaña;
	
	@Column(name="Fecha_Inicio_Campaña")
	private Date FechaInicioCampaña;
	
	
	@Column(name="Fecha_Termino_Campaña")
	private Date FechaTerminoCampaña;


	public int getIdCampaña() {
		return IdCampaña;
	}


	public void setIdCampaña(int idCampaña) {
		IdCampaña = idCampaña;
	}


	public Date getFechaInicioCampaña() {
		return FechaInicioCampaña;
	}


	public void setFechaInicioCampaña(Date fechaInicioCampaña) {
		FechaInicioCampaña = fechaInicioCampaña;
	}


	public Date getFechaTerminoCampaña() {
		return FechaTerminoCampaña;
	}


	public void setFechaTerminoCampaña(Date fechaTerminoCampaña) {
		FechaTerminoCampaña = fechaTerminoCampaña;
	}


}
