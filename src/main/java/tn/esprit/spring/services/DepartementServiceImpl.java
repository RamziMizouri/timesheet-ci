package tn.esprit.spring.services;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.repository.DepartementRepository;
@Service
public class DepartementServiceImpl implements IDepartementService{

	@Autowired
	DepartementRepository departementRepository;
	private static final Logger l = LogManager.getLogger(DepartementServiceImpl.class);
	
	
	
	@Override
	public List<Departement> getallDepartements() {
		List<Departement> departements = null;
		try {

		l.info("In getallDepartements() : ");
		departements =  departementRepository.findAll();
		l.info("Out of getallDepartements() : ");
		}catch (Exception e) {
		l.error("Error in getallDepartements() : ");
		}

		return departements;
	}

	@Override
	public Departement addDepartement(Departement d) {
		try {
			l.info("In addDepartement() : ");		
			departementRepository.save(d);
			l.info("Out of addDepartement() : ");
			return d;
		}
	catch (Exception e) {
		l.error("Error in addDepartements() : ");		
		throw e;
	}
		
	}

	@Override
	public void removeDepartementById(int id) {
		departementRepository.deleteById(id);	
	}
	
	
	@Override
	public Departement getDepartement(int id) {
		l.info("in  getDepartement"); 
		Departement d = departementRepository.findById(id).get(); 
		l.info("user returned :");
		return d; 
	}
	@Override
	public Departement updateDepartement(Departement d) {
		try { 
			if (d != null) {
			departementRepository.save(d);
			}
			return d;
		}catch (Exception e) {
			l.error("Error in getallDepartements() : ");
		}
		return d;
	}

}
