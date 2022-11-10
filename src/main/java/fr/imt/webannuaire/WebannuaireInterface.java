package fr.imt.webannuaire;

import java.util.Collection;
import java.util.List;

public interface WebannuaireInterface {

	public Collection<Person> getAll();
	public Person getFromId(int id);
	public List<Person> getFromName(String name);
	public boolean deleteFromId(int id);
	public void addPerson(Person p);

}
