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
import fr.adaming.formation.model.Salle;
import fr.adaming.formation.service.ISalleService;

@RestController
@RequestMapping("salle")
@CrossOrigin("http://localhost:4200")
public class SalleController {

	@Autowired
	ISalleService salleService;

	@GetMapping
	public List<Salle> getAll() {
		return salleService.getAll();
	}

	@GetMapping("{id}")
	public Salle getOne(@PathVariable long id) {
		return salleService.getOne(id);
	}

	@PostMapping
	public Salle addSalle(@RequestBody Salle salle) {
		return salleService.saveSalle(salle);
	}

	@PutMapping("{id}")
	public Salle updateSalle(@RequestBody Salle salle, @PathVariable long id) {
		Salle salleActuel = new Salle();
		salleActuel = salleService.getOne(id);
		salleActuel.setNumeroSalle(salle.getNumeroSalle());
		salleActuel.setTypeSalle(salle.getTypeSalle());
		return salleService.updateSalle(salleActuel);
	}

	@DeleteMapping("{id}")
	public boolean deleteSalle(@PathVariable long id) {
		try {
			salleService.deleteSalle(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}