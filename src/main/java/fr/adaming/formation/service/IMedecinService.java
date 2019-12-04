package fr.adaming.formation.service;

import java.util.List;
import fr.adaming.formation.model.Medecin;

public interface IMedecinService {

	public Medecin saveMedecin(Medecin medecin);

	public void deleteMedecin(long idMedecin);

	public Medecin getOne(long idMedecin);

	public List<Medecin> getAll();

	public Medecin updateMedecin(Medecin medecin);

	public void affecterServiceM(long idMedecin, long idServiceM);

}