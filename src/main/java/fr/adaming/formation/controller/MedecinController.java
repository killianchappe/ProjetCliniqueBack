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
import fr.adaming.formation.model.Medecin;
import fr.adaming.formation.service.IMedecinService;

@RestController
@RequestMapping("medecin")
@CrossOrigin("http://localhost:4200")
public class MedecinController {

	@Autowired
	IMedecinService medecinService;

	@GetMapping
	public List<Medecin> getAll() {
		return medecinService.getAll();
	}

	@GetMapping("{id}")
	public Medecin getOne(@PathVariable long id) {
		return medecinService.getOne(id);
	}

	@PostMapping
	public Medecin addMedecin(@RequestBody Medecin medecin) {
		return medecinService.saveMedecin(medecin);
	}

	@PutMapping("{id}")
	public Medecin updateMedecin(@RequestBody Medecin medecin, @PathVariable long id) {
		Medecin medecinActuel = new Medecin();
		medecinActuel = medecinService.getOne(id);
		medecinActuel.setNomMedecin(medecin.getNomMedecin());
		medecinActuel.setPrenomMedecin(medecin.getPrenomMedecin());
		medecinActuel.setServiceMedecin(medecin.getServiceMedecin());
		return medecinService.updateMedecin(medecinActuel);
	}

	@PutMapping("{idMedecin}/{idServiceM}")
	public void affecterService(@PathVariable long idMedecin, @PathVariable long idServiceM) {
		medecinService.affecterServiceM(idMedecin, idServiceM);
	}

	@DeleteMapping("{id}")
	public boolean deleteMedecin(@PathVariable long id) {
		try {
			medecinService.deleteMedecin(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}