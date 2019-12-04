package fr.adaming.formation.service;

import java.util.List;

import fr.adaming.formation.model.Salle;

public interface ISalleService {

	public Salle saveSalle(Salle salle);

	public void deleteSalle(long idSalle);

	public Salle getOne(long idSalle);

	public List<Salle> getAll();

	public Salle updateSalle(Salle salle);

}