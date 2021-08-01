package tn.esprit.spring.services;

import java.util.List;
import tn.esprit.spring.entities.Departement;

public interface IDepartementService {
	
	List<Departement> getallDepartements(); 
	Departement addDepartement(Departement d);
	void removeDepartementById(int id);
	Departement updateDepartement(Departement d);
	Departement getDepartement(int id);
}
