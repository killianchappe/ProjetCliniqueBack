package fr.adaming.formation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.formation.model.Etat;
import fr.adaming.formation.repository.IEtatRepository;

@Service
public class EtatService implements IEtatService {

	@Autowired
	IEtatRepository etatRepository;

	public Etat saveEtat(Etat etat) {
		return etatRepository.save(etat);
	}

	public void deleteEtat(long idEtat) {
		etatRepository.deleteById(idEtat);
	}

	public Etat getOne(long idEtat) {
		Optional<Etat> etatOptional = etatRepository.findById(idEtat);
		Etat etat = new Etat();
		if (etatOptional.isPresent()) {
			etat = etatOptional.get();
			return etat;
		} else {
			return etat;
		}
	}

	public List<Etat> getAll() {
		List<Etat> etats = new ArrayList<Etat>();
		etats = etatRepository.findAll();
		return etats;
	}

	public Etat updateEtat(Etat etat) {
		return etatRepository.save(etat);
	}

}
