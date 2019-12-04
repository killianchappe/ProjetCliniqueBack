package fr.adaming.formation.service;

import java.util.List;
import fr.adaming.formation.model.Operation;

public interface IOperationService {

	public Operation saveOperation(Operation operation);

	public void deleteOperation(long idOperation);

	public Operation getOne(long idOperation);

	public List<Operation> getAll();

	public Operation updateOperation(Operation operation);

	public void affecterPatient(long idOperation, long idPatient);

	public void affecterSalle(long idOperation, long idSalle);

	public void affecterMedecin(long idOperation, long idMedecin);

}