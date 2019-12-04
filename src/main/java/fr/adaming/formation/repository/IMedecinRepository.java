package fr.adaming.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.formation.model.Medecin;

public interface IMedecinRepository extends JpaRepository<Medecin, Long> {

}
