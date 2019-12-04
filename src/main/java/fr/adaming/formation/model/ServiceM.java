package fr.adaming.formation.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_services")
public class ServiceM implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idService;
	private String nomService;

	// Constructeurs
	public ServiceM() {
		super();
	}

	public ServiceM(String nomService) {
		super();
		this.nomService = nomService;
	}

	public ServiceM(long idService, String nomService) {
		super();
		this.idService = idService;
		this.nomService = nomService;
	}

	// Getters et Setters
	public long getIdService() {
		return idService;
	}

	public void setIdService(long idService) {
		this.idService = idService;
	}

	public String getNomService() {
		return nomService;
	}

	public void setNomService(String nomService) {
		this.nomService = nomService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// toString
	@Override
	public String toString() {
		return "Service [idService=" + idService + ", nomService=" + nomService + "]";
	}

}