package fr.adaming.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.formation.model.ServiceM;

public interface IServiceMRepository extends JpaRepository<ServiceM, Long> {

}
