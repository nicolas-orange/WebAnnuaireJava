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

		Person totot = new Person("dupont", "toto", 180, "012345678", "Paris");
		Person totod = new Person("dupond", "toto", 160, "012345679", "Paris");

		System.out.println(totot);
		System.out.println(totod);

		// Création d'une instance
		Person pers1 = new Person();
		pers1.setName("Paul");
		pers1.setId(12);
		pers1.setSize(170);
		// Création du JSON
//		Jsonb jsontable = JsonBuilder.create();
//		String result = jsontable.toJson(pers1);
//		System.out.println(result);

	}

}
