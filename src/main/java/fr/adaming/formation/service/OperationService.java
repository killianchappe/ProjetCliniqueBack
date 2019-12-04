package fr.adaming.formation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.formation.model.Medecin;
import fr.adaming.formation.model.Operation;
import fr.adaming.formation.model.Patient;
import fr.adaming.formation.model.Salle;
import fr.adaming.formation.repository.IMedecinRepository;
import fr.adaming.formation.repository.IOperationRepository;
import fr.adaming.formation.repository.IPatientRepository;
import fr.adaming.formation.repository.ISalleRepository;

@Service
public class OperationService implements IOperationService {

	@Autowired
	IOperationRepository operationRepository;
	@Autowired
	IPatientRepository patientRepository;
	@Autowired
	ISalleRepository salleRepository;
	@Autowired
	IMedecinRepository medecinRepository;

	public Operation saveOperation(Operation operation) {
		return operationRepository.save(operation);
	}

	public void deleteOperation(long idOperation) {
		operationRepository.deleteById(idOperation);
	}

	public Operation getOne(long idOperation) {
		Optional<Operation> operationOptional = operationRepository.findById(idOperation);
		Operation operation = new Operation();
		if (operationOptional.isPresent()) {
			operation = operationOptional.get();
			return operation;
		} else {
			return operation;
		}
	}

	public List<Operation> getAll() {
		List<Operation> operations = new ArrayList<Operation>();
		operations = operationRepository.findAll();
		return operations;
	}

	public Operation updateOperation(Operation operation) {
		return operationRepository.save(operation);
	}

	public void affecterPatient(long idOperation, long idPatient) {
		Operation operation = operationRepository.findById(idOperation).get();
		Patient patient = patientRepository.getOne(idPatient);
		operation.setPatientOperation(patient);
		operationRepository.save(operation);
	}

	public void affecterSalle(long idOperation, long idSalle) {
		Operation operation = operationRepository.getOne(idOperation);
		Salle salle = salleRepository.findById(idSalle).get();
		operation.setSalleOperation(salle);
		operationRepository.save(operation);
	}

	public void affecterMedecin(long idOperation, long idMedecin) {
		Operation operation = operationRepository.getOne(idOperation);
		Medecin medecin = medecinRepository.findById(idMedecin).get();
		operation.setMedecinOperation(medecin);
		operationRepository.save(operation);
	}

}