package com.qualityOfLife.seguroDeVida.web.forms;

import java.sql.Date;

public class CampañaForm {
	
	private int idCampaña;
	private Date fechaInicioCampaña;
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
