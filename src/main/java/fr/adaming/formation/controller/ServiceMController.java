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
import fr.adaming.formation.model.ServiceM;
import fr.adaming.formation.service.IServiceMService;

@RestController
@RequestMapping("serviceM")
@CrossOrigin("http://localhost:4200")
public class ServiceMController {

	@Autowired
	IServiceMService serviceMService;

	@GetMapping
	public List<ServiceM> getAll() {
		return serviceMService.getAll();
	}

	@GetMapping("{id}")
	public ServiceM getOne(@PathVariable long id) {
		return serviceMService.getOne(id);
	}

	@PostMapping
	public ServiceM addServiceM(@RequestBody ServiceM serviceM) {
		return serviceMService.saveService(serviceM);
	}

	@PutMapping("{id}")
	public ServiceM updateServiceM(@RequestBody ServiceM serviceM, @PathVariable long id) {
		ServiceM serviceMActuel = new ServiceM();
		serviceMActuel = serviceMService.getOne(id);
		serviceMActuel.setNomService(serviceM.getNomService());
		return serviceMService.updateService(serviceM);
	}

	@DeleteMapping("{id}")
	public boolean deleteServiceM(@PathVariable long id) {
		try {
			serviceMService.deleteService(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}