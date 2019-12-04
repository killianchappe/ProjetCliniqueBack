package fr.adaming.formation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.formation.model.Salle;
import fr.adaming.formation.repository.ISalleRepository;

@Service
public class SalleService implements ISalleService {

	@Autowired
	ISalleRepository salleRepository;

	public Salle saveSalle(Salle salle) {
		return salleRepository.save(salle);
	}

	public void deleteSalle(long idSalle) {
		salleRepository.deleteById(idSalle);
	}

	public Salle getOne(long idSalle) {
		Optional<Salle> salleOptional = salleRepository.findById(idSalle);
		Salle salle = new Salle();
		if (salleOptional.isPresent()) {
			salle = salleOptional.get();
			return salle;
		} else {
			return salle;
		}
	}

	public List<Salle> getAll() {
		List<Salle> salles = new ArrayList<Salle>();
		salles = salleRepository.findAll();
		return salles;
	}

	public Salle updateSalle(Salle salle) {
		return salleRepository.save(salle);
	}

}