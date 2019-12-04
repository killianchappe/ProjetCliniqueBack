package fr.adaming.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import fr.adaming.formation.repository.IUserRepository;
import fr.adaming.formation.service.IEtatService;
import fr.adaming.formation.service.IMedecinService;
import fr.adaming.formation.service.IOperationService;
import fr.adaming.formation.service.IPatientService;
import fr.adaming.formation.service.ISalleService;
import fr.adaming.formation.service.IServiceMService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	IPatientService patientService;
	@Autowired
	IMedecinService medecinService;
	@Autowired
	IEtatService etatService;
	@Autowired
	IServiceMService serviceService;
	@Autowired
	ISalleService salleService;
	@Autowired
	IOperationService operationService;

	@Autowired
	IUserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// PATIENTS
//		Patient p1 = new Patient();
//		p1.setIdPatient(1);
//		p1.setNomPatient("modif");
//		p1.setPrenomPatient("modif");
//		p1.setDossierPatient("grippe");
//		patientService.savePatient(p1);
//		Patient p2 = new Patient();
//		p2.setNomPatient("dswxfc");
//		p2.setPrenomPatient("sdf");
//		patientService.savePatient(p2);
//		System.out.println(patientService.getOne(1));
//		System.out.println(patientService.getAll());
		// patientService.deletePatient(2);

		// MEDECINS
//		Medecin m1 = new Medecin();
//		m1.setNomMedecin("sqdfg");
//		Medecin m2 = new Medecin();
//		m2.setNomMedecin("sqdsdfgfg");
//		medecinService.saveMedecin(m1);
//		medecinService.saveMedecin(m2);
//		System.out.println(medecinService.getOne(1));
//		System.out.println(medecinService.getAll());
		// medecinService.deleteMedecin(2);

		// OPERATIONS
//		Operation op1 = new Operation();
//		op1.setMedecinOperation(m1);
//		Operation op2 = new Operation();
//		op2.setMedecinOperation(m2);
//		operationService.saveOperation(op1);
//		operationService.saveOperation(op2);
//		System.out.println(operationService.getOne(1));
//		System.out.println(operationService.getAll());
//		operationService.deleteOperation(2);

		// SALLES
//		Salle s1 = new Salle();
//		s1.setNumeroSalle(20);
//		Salle s2 = new Salle();
//		s2.setNumeroSalle(25);
//		salleService.saveSalle(s1);
//		salleService.saveSalle(s2);
//		System.out.println(salleService.getOne(1));
//		System.out.println(salleService.getAll());
//		salleService.deleteSalle(2);

		// ETATS
//		Etat et1 = new Etat();
//		et1.setLibelleEtat("qswdxfcgh");
//		Etat et2 = new Etat();
//		et2.setLibelleEtat("qswsdxfghdxfcgh");
//		etatService.saveEtat(et1);
//		etatService.saveEtat(et2);
//		System.out.println(etatService.getOne(1));
//		System.out.println(etatService.getAll());
//		etatService.deleteEtat(2);

		// SERVICES
//		ServiceM serv1 = new ServiceM();
//		serv1.setNomService("sdf");
//		ServiceM serv2 = new ServiceM();
//		serv2.setNomService("ssdfdf");
//		serviceService.saveService(serv1);
//		serviceService.saveService(serv2);
//		System.out.println(serviceService.getOne(1));
//		System.out.println(serviceService.getAll());
//		serviceService.deleteService(2);

		// FINAL TEST
//		Patient p1 = new Patient();
//		Medecin m1 = new Medecin();
//		Salle s1 = new Salle();
//		Operation op1 = new Operation();
//		Etat et1 = new Etat();
//		ServiceM serv1 = new ServiceM();
//
//		et1.setLibelleEtat("Vivant");
//		p1.setNomPatient("TOTO");
//		p1.setPrenomPatient("toto");
//		p1.setDossierPatient("Grippe");
//		p1.setEtatPatient(et1);
//		serv1.setNomService("service1");
//		m1.setNomMedecin("Dr. TITI");
//		m1.setPrenomMedecin("titi");
//		m1.setServiceMedecin(serv1);
//		s1.setNumeroSalle(10);
//		s1.setTypeSalle("soins");
//		op1.setMedecinOperation(m1);
//		op1.setPatientOperation(p1);
//		op1.setSalleOperation(s1);
//		op1.setDateOperation(java.sql.Date.valueOf("2019-11-26"));
//
//		etatService.saveEtat(et1);
//		patientService.savePatient(p1);
//		serviceService.saveService(serv1);
//		medecinService.saveMedecin(m1);
//		salleService.saveSalle(s1);
//		operationService.saveOperation(op1);

		// TEST PATIENT OPTIONAL
//		System.out.println("Démarrage perso");
//		Patient patient = new Patient();
//		Optional<Patient> patientOptional;
//		patientOptional = patientService.getOne(2);
//		if (patientOptional.isPresent()) {
//			patient = patientOptional.get();
//			System.err.println("======" + patient + "=======");
//		} else {
//			System.err.println("======Patient introuvable!======");
//		}

//		System.out.println(patientService.getOne(0));

//		patientService.affecterEtat(1, 1);

//		operationService.affecterMedecin(1, 1);
//		operationService.affecterPatient(1, 1);
//		operationService.affecterSalle(1, 1);

//		medecinService.affecterServiceM(1, 10);
//		Medecin medecin2 = new Medecin();
//		medecin2.setNomMedecin("YOYO");
//		medecin2.setPrenomMedecin("yoyo");
//		medecinService.saveMedecin(medecin2);
//		medecinService.affecterServiceM(2, 10);

//		Operation operation2 = new Operation();
//		operation2.setDateOperation(java.sql.Date.valueOf("2019-11-20"));
//		operationService.saveOperation(operation2);
//		operationService.affecterSalle(2, 1);
//		operationService.affecterMedecin(2, 2);
//		operationService.affecterPatient(2, 1);

//		System.err.println(etatService.getAll());
//		System.err.println(patientService.getAll());

	}

}