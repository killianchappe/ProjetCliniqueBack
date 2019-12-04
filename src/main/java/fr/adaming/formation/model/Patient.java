package fr.adaming.formation.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_patients")
public class Patient implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPatient;
	private String nomPatient;
	private String prenomPatient;
	private String dossierPatient;

	// Associations
	@OneToOne
	@JoinColumn(name = "idEtat")
	private Etat etatPatient;

	// Constructeurs
	public Patient() {
		super();
	}

	public Patient(String nomPatient, String prenomPatient, String dossierPatient, Etat etatPatient) {
		super();
		this.nomPatient = nomPatient;
		this.prenomPatient = prenomPatient;
		this.dossierPatient = dossierPatient;
		this.etatPatient = etatPatient;
	}

	public Patient(long idPatient, String nomPatient, String prenomPatient, String dossierPatient, Etat etatPatient) {
		super();
		this.idPatient = idPatient;
		this.nomPatient = nomPatient;
		this.prenomPatient = prenomPatient;
		this.dossierPatient = dossierPatient;
		this.etatPatient = etatPatient;
	}

	// Getters et Setters
	public long getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(long idPatient) {
		this.idPatient = idPatient;
	}

	public String getNomPatient() {
		return nomPatient;
	}

	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}

	public String getPrenomPatient() {
		return prenomPatient;
	}

	public void setPrenomPatient(String prenomPatient) {
		this.prenomPatient = prenomPatient;
	}

	public String getDossierPatient() {
		return dossierPatient;
	}

	public void setDossierPatient(String dossierPatient) {
		this.dossierPatient = dossierPatient;
	}

	public Etat getEtatPatient() {
		return etatPatient;
	}

	public void setEtatPatient(Etat etatPatient) {
		this.etatPatient = etatPatient;
	}

	// toString
	@Override
	public String toString() {
		return "Patient [idPatient=" + idPatient + ", nomPatient=" + nomPatient + ", prenomPatient=" + prenomPatient
				+ ", dossierPatient=" + dossierPatient + ", etatPatient=" + etatPatient + "]";
	}

}