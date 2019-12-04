package fr.adaming.formation.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_medecins")
public class Medecin implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMedecin;
	private String nomMedecin;
	private String prenomMedecin;

	// Associations
	@ManyToOne
	@JoinColumn(name = "idService")
	private ServiceM serviceMedecin;

	// Constructeurs
	public Medecin() {
		super();
	}

	public Medecin(String nomMedecin, String prenomMedecin, ServiceM serviceMedecin) {
		super();
		this.nomMedecin = nomMedecin;
		this.prenomMedecin = prenomMedecin;
		this.serviceMedecin = serviceMedecin;
	}

	public Medecin(long idMedecin, String nomMedecin, String prenomMedecin, ServiceM serviceMedecin) {
		super();
		this.idMedecin = idMedecin;
		this.nomMedecin = nomMedecin;
		this.prenomMedecin = prenomMedecin;
		this.serviceMedecin = serviceMedecin;
	}

	// Getters et Setters
	public long getIdMedecin() {
		return idMedecin;
	}

	public void setIdMedecin(long idMedecin) {
		this.idMedecin = idMedecin;
	}

	public String getNomMedecin() {
		return nomMedecin;
	}

	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}

	public String getPrenomMedecin() {
		return prenomMedecin;
	}

	public void setPrenomMedecin(String prenomMedecin) {
		this.prenomMedecin = prenomMedecin;
	}

	public ServiceM getServiceMedecin() {
		return serviceMedecin;
	}

	public void setServiceMedecin(ServiceM serviceMedecin) {
		this.serviceMedecin = serviceMedecin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// toString
	@Override
	public String toString() {
		return "Medecin [idMedecin=" + idMedecin + ", nomMedecin=" + nomMedecin + ", prenomMedecin=" + prenomMedecin
				+ ", serviceMedecin=" + serviceMedecin + "]";
	}

}