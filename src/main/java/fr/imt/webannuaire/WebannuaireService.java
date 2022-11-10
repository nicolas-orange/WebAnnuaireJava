package fr.imt.webannuaire;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service(value = "listePerson")
public class WebannuaireService implements WebannuaireInterface {

	Map<Integer, Person> hm;

	public WebannuaireService() {
		hm = new HashMap<Integer, Person>();

		Person totot = new Person("dupont", "toto", 180, "012345678", "Paris");
		hm.put(totot.getId(), totot);

		Person totod = new Person("dupond", "toto", 160, "012345679", "Paris");
		hm.put(totod.getId(), totod);

		System.out.println(totot);
		System.out.println(totod);

		// Création d'une instance
		Person pers1 = new Person();
		pers1.setName("Paul");
		pers1.setSurname("Personne");
		pers1.setId(12);
		pers1.setSize(170);
		hm.put(pers1.getId(), pers1);

		Person pers2 = new Person("Abitbol", "Georges", 180, "+33685326340", "New York");
		hm.put(pers2.getId(), pers2);
		System.out.println(pers1);
		System.out.println(pers2);

		Person Who = new Person("Who", "Doctor", 175, "0606060606", "Lille");
		hm.put(Who.getId(), Who);
		Person Bond = new Person("Bond", "James", 180, "0606060606", "Londres");
		hm.put(Bond.getId(), Bond);
		Person Georges = new Person("Abitbol", "Georges", 180, "+33633609805", "Paris");
		hm.put(Georges.getId(), Georges);
	}

	@Override
	public Collection<Person> getAll() {
		// TODO Auto-generated method stub
		return (Collection<Person>) hm.values();

	}

	@Override
	public Person getFromId(int id) {
		// TODO Auto-generated method stub
		return hm.get(id);
	}

	@Override
	public List<Person> getFromName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteFromId(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPerson(Person p) {
		// TODO Auto-generated method stub

	}

}
