package fr.adaming.formation.service;

import java.util.List;

import fr.adaming.formation.model.ServiceM;

public interface IServiceMService {

	public ServiceM saveService(ServiceM service);

	public void deleteService(long idService);

	public ServiceM getOne(long idService);

	public List<ServiceM> getAll();

	public ServiceM updateService(ServiceM service);

}