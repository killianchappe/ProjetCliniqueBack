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
import fr.adaming.formation.model.Operation;
import fr.adaming.formation.service.IOperationService;

@RestController
@RequestMapping("operation")
@CrossOrigin("http://localhost:4200")
public class OperationController {

	@Autowired
	IOperationService operationService;

	@GetMapping
	public List<Operation> getAll() {
		return operationService.getAll();
	}

	@GetMapping("{id}")
	public Operation getOne(@PathVariable long id) {
		return operationService.getOne(id);
	}

	@PostMapping
	public Operation addOperation(@RequestBody Operation operation) {
		return operationService.saveOperation(operation);
	}

	@PutMapping("{id}")
	public Operation updateOperation(@RequestBody Operation operation, @PathVariable long id) {
		Operation operationActuel = new Operation();
		operationActuel = operationService.getOne(id);
		operationActuel.setDateOperation(operation.getDateOperation());
		operationActuel.setMedecinOperation(operation.getMedecinOperation());
		operationActuel.setPatientOperation(operation.getPatientOperation());
		operationActuel.setSalleOperation(operation.getSalleOperation());
		return operationService.updateOperation(operationActuel);
	}

	@PutMapping("{idOperation}/patient{idPatient}")
	public void affecterPatient(@PathVariable long idOperation, @PathVariable long idPatient) {
		operationService.affecterPatient(idOperation, idPatient);
	}

	@PutMapping("{idOperation}/salle{idSalle}")
	public void affecterSalle(@PathVariable long idOperation, @PathVariable long idSalle) {
		operationService.affecterSalle(idOperation, idSalle);
	}

	@PutMapping("{idOperation}/medecin{idMedecin}")
	public void affecterMedecin(@PathVariable long idOperation, @PathVariable long idMedecin) {
		operationService.affecterMedecin(idOperation, idMedecin);
	}

	@DeleteMapping("{id}")
	public boolean deleteOperation(@PathVariable long id) {
		try {
			operationService.deleteOperation(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}