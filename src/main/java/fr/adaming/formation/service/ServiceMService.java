package fr.adaming.formation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import fr.adaming.formation.model.ServiceM;
import fr.adaming.formation.repository.IServiceMRepository;
import org.springframework.stereotype.Service;

@Service
public class ServiceMService implements IServiceMService {

	@Autowired
	IServiceMRepository serviceRepository;

	public ServiceM saveService(ServiceM service) {
		return serviceRepository.save(service);
	}

	public void deleteService(long idService) {
		serviceRepository.deleteById(idService);
	}

	public ServiceM getOne(long idService) {
		Optional<ServiceM> serviceOptional = serviceRepository.findById(idService);
		ServiceM service = new ServiceM();
		if (serviceOptional.isPresent()) {
			service = serviceOptional.get();
			return service;
		} else {
			return service;
		}
	}

	public List<ServiceM> getAll() {
		List<ServiceM> services = new ArrayList<ServiceM>();
		services = serviceRepository.findAll();
		return services;
	}

	public ServiceM updateService(ServiceM service) {
		return serviceRepository.save(service);
	}

}