package fr.adaming.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.formation.model.Operation;

public interface IOperationRepository extends JpaRepository<Operation, Long> {

}
