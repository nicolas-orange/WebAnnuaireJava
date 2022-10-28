/**
 * 
 */
package fr.imt.webannuaire;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author INMO7350
 *
 */
@SpringBootApplication
public class testPerson {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    SpringApplication.run(testPerson.class, args);
	    
		Person totot = new Person ("dupont","toto","012345678","Paris");
		Person totod = new Person("dupond","toto","012345679","Paris");
		
		System.out.println(totot);
		System.out.println(totod);
		
		
		
	}

}
