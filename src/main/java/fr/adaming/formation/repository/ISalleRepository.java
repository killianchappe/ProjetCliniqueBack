package fr.adaming.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.formation.model.Salle;

public interface ISalleRepository extends JpaRepository<Salle, Long> {

}
