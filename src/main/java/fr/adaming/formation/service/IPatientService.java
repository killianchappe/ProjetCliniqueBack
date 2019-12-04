package fr.adaming.formation.service;

import java.util.List;
import fr.adaming.formation.model.Patient;

public interface IPatientService {

	public Patient savePatient(Patient patient);

	public void deletePatient(long idPatient);

	public Patient getOne(long idPatient);

	public List<Patient> getAll();

	public Patient updatePatient(Patient patient);

	public void affecterEtat(long idPatient, long idEtat);

}