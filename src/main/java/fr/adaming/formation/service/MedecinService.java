package fr.adaming.formation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.formation.model.Medecin;
import fr.adaming.formation.model.ServiceM;
import fr.adaming.formation.repository.IMedecinRepository;
import fr.adaming.formation.repository.IServiceMRepository;

@Service
public class MedecinService implements IMedecinService {

	@Autowired
	IMedecinRepository medecinRepository;
	@Autowired
	IServiceMRepository serviceMRepository;

	public Medecin saveMedecin(Medecin medecin) {
		return medecinRepository.save(medecin);
	}

	public void deleteMedecin(long idMedecin) {
		medecinRepository.deleteById(idMedecin);
	}

	public Medecin getOne(long idMedecin) {
		Optional<Medecin> medecinOptional = medecinRepository.findById(idMedecin);
		Medecin medecin = new Medecin();
		if (medecinOptional.isPresent()) {
			medecin = medecinOptional.get();
			return medecin;
		} else {
			return medecin;
		}
	}

	public List<Medecin> getAll() {
		List<Medecin> medecins = new ArrayList<Medecin>();
		medecins = medecinRepository.findAll();
		return medecins;
	}

	public Medecin updateMedecin(Medecin medecin) {
		return medecinRepository.save(medecin);
	}

	public void affecterServiceM(long idMedecin, long idServiceM) {
		Medecin medecin = medecinRepository.getOne(idMedecin);
		ServiceM serviceM = serviceMRepository.findById(idServiceM).get();
		medecin.setServiceMedecin(serviceM);
		medecinRepository.save(medecin);
	}

}