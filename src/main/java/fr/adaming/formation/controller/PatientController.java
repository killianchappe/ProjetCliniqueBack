package fr.adaming.formation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.adaming.formation.model.Patient;
import fr.adaming.formation.service.IEtatService;
import fr.adaming.formation.service.IPatientService;

@RestController
@RequestMapping("patient")
@CrossOrigin("http://localhost:4200")
public class PatientController {

	@Autowired
	IPatientService patientService;
	@Autowired
	IEtatService etatService;

	@GetMapping
	public List<Patient> getAll() {
		return patientService.getAll();
	}

	@GetMapping("{id}")
	public Patient getOne(@PathVariable long id) {
		return patientService.getOne(id);
	}

	@PostMapping
	public Patient addPatient(@RequestBody Patient patient) {
		return patientService.savePatient(patient);
	}

	@PutMapping("{id}")
	public Patient updatePatient(@RequestBody Patient patient, @PathVariable long id) {
		Patient patientActuel = new Patient();
		patientActuel = patientService.getOne(id);
		patientActuel.setDossierPatient(patient.getDossierPatient());
		patientActuel.setEtatPatient(patient.getEtatPatient());
		patientActuel.setNomPatient(patient.getNomPatient());
		patientActuel.setPrenomPatient(patient.getPrenomPatient());
		return patientService.updatePatient(patientActuel);
	}

	@PutMapping("{idPatient}/{idEtat}")
	public void affecterEtat(@PathVariable long idPatient, @PathVariable long idEtat) {
		patientService.affecterEtat(idPatient, idEtat);
	}

	@DeleteMapping("{id}")
	public boolean deletePatient(@PathVariable long id) {
		try {
			patientService.deletePatient(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}