package fr.adaming.formation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.formation.model.Etat;
import fr.adaming.formation.model.Patient;
import fr.adaming.formation.repository.IEtatRepository;
import fr.adaming.formation.repository.IPatientRepository;

@Service
public class PatientService implements IPatientService {

	@Autowired
	IPatientRepository patientRepository;
	@Autowired
	IEtatRepository etatRepository;

	public Patient savePatient(Patient patient) {
		return patientRepository.save(patient);
	}

	public void deletePatient(long idPatient) {
		patientRepository.deleteById(idPatient);
	}

	public Patient getOne(long idPatient) {
		Optional<Patient> patientOptional = patientRepository.findById(idPatient);
		Patient patient = new Patient();
		if (patientOptional.isPresent()) {
			patient = patientOptional.get();
			return patient;
		} else {
			return patient;
		}
	}

	public List<Patient> getAll() {
		List<Patient> patients = new ArrayList<Patient>();
		patients = patientRepository.findAll();
		return patients;
	}

	public Patient updatePatient(Patient patient) {
		return patientRepository.save(patient);
	}

	public void affecterEtat(long idPatient, long idEtat) {
		Etat etat = etatRepository.getOne(idEtat);
		Patient patient = patientRepository.findById(idPatient).get();
		patient.setEtatPatient(etat);
		patientRepository.save(patient);
	}

}