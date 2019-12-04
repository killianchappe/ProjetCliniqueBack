package fr.adaming.formation.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_salles")
public class Salle implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idSalle;
	private int numeroSalle;
	private String typeSalle;

	// Constructeurs
	public Salle() {
		super();
	}

	public Salle(int numeroSalle, String typeSalle) {
		super();
		this.numeroSalle = numeroSalle;
		this.typeSalle = typeSalle;
	}

	public Salle(long idSalle, int numeroSalle, String typeSalle) {
		super();
		this.idSalle = idSalle;
		this.numeroSalle = numeroSalle;
		this.typeSalle = typeSalle;
	}

	// Getters et Setters
	public long getIdSalle() {
		return idSalle;
	}

	public void setIdSalle(long idSalle) {
		this.idSalle = idSalle;
	}

	public int getNumeroSalle() {
		return numeroSalle;
	}

	public void setNumeroSalle(int numeroSalle) {
		this.numeroSalle = numeroSalle;
	}

	public String getTypeSalle() {
		return typeSalle;
	}

	public void setTypeSalle(String typeSalle) {
		this.typeSalle = typeSalle;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// toString
	@Override
	public String toString() {
		return "Salle [idSalle=" + idSalle + ", numeroSalle=" + numeroSalle + ", typeSalle=" + typeSalle + "]";
	}

}