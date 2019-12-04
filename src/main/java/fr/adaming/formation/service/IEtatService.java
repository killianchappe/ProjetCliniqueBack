package fr.adaming.formation.service;

import java.util.List;

import fr.adaming.formation.model.Etat;

public interface IEtatService {

	public Etat saveEtat(Etat etat);

	public void deleteEtat(long idEtat);

	public Etat getOne(long idEtat);

	public List<Etat> getAll();

	public Etat updateEtat(Etat etat);

}
