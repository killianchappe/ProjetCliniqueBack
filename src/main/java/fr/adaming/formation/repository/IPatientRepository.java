package fr.adaming.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.formation.model.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Long> {

}
