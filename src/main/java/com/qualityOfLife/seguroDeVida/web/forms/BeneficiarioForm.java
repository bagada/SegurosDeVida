package com.qualityOfLife.seguroDeVida.web.forms;

public class BeneficiarioForm {
	
	private int idBeneficiario;
	private int idFormato;
	private String nomBeneficiario;
	private String apellidoBen;
	private String apelliMBen;
	private String nomParentesco;
	private String obsBen;
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
