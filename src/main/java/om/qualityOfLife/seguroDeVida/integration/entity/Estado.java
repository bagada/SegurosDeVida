package om.qualityOfLife.seguroDeVida.integration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Quality_Estado")

public class Estado { 
	
	@Id
	@Column(name="Id_Estado")
	private int IdEstado;
	
	@Column(name="Nom_Estado")
	private String NomEstado;

	public int getIdEstado() {
		return IdEstado;
	}

	public void setIdEstado(int idEstado) {
		IdEstado = idEstado;
	}

	public String getNomEstado() {
		return NomEstado;
	}

	public void setNomEstado(String nomEstado) {
		NomEstado = nomEstado;
	}

	
	
	

}
