package fr.adaming.formation.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_operations")
public class Operation implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idOperation;
	private Date dateOperation;

	// Associations
	@ManyToOne
	@JoinColumn(name = "idPatient")
	private Patient patientOperation;
	@ManyToOne
	@JoinColumn(name = "idSalle")
	private Salle salleOperation;
	@ManyToOne
	@JoinColumn(name = "idMedecin")
	private Medecin medecinOperation;

	// Constructeurs
	public Operation() {
		super();
	}

	public Operation(Date dateOperation, Patient patientOperation, Salle salleOperation, Medecin medecinOperation) {
		super();
		this.dateOperation = dateOperation;
		this.patientOperation = patientOperation;
		this.salleOperation = salleOperation;
		this.medecinOperation = medecinOperation;
	}

	public Operation(long idOperation, Date dateOperation, Patient patientOperation, Salle salleOperation,
			Medecin medecinOperation) {
		super();
		this.idOperation = idOperation;
		this.dateOperation = dateOperation;
		this.patientOperation = patientOperation;
		this.salleOperation = salleOperation;
		this.medecinOperation = medecinOperation;
	}

	// Getters et Setters
	public long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(long idOperation) {
		this.idOperation = idOperation;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public Patient getPatientOperation() {
		return patientOperation;
	}

	public void setPatientOperation(Patient patientOperation) {
		this.patientOperation = patientOperation;
	}

	public Salle getSalleOperation() {
		return salleOperation;
	}

	public void setSalleOperation(Salle salleOperation) {
		this.salleOperation = salleOperation;
	}

	public Medecin getMedecinOperation() {
		return medecinOperation;
	}

	public void setMedecinOperation(Medecin medecinOperation) {
		this.medecinOperation = medecinOperation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// toString
	@Override
	public String toString() {
		return "Operation [idOperation=" + idOperation + ", dateOperation=" + dateOperation + ", patientOperation="
				+ patientOperation + ", salleOperation=" + salleOperation + ", medecinOperation=" + medecinOperation
				+ "]";
	}

}