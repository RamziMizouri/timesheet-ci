
package tn.esprit.spring.service;

 
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.services.IDepartementService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartementServiceImplTest {

		@Autowired
		IDepartementService ids; 
		
		@Test
		public void testaddDepartement()  {
			Departement d = new Departement("informatique"); 
			Departement departementAdded = ids.addDepartement(d); 
			Assert.assertEquals(d.getName(), departementAdded.getName());
		}
	 
		@Test
		public void testModifyDepartement()   {
			Departement d = new Departement("informatique"); 
			Departement departementUpdated = ids.updateDepartement(d); 
			Assert.assertEquals(d.getName(), departementUpdated.getName());
		}	
 
 
}





