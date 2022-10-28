package fr.imt.webannuaire;

public class Person {
	
	private static int currentid=1;
	private int id;
	private String name;
	private String surname;
	private String phone;
	private String city;

	public Person() {
	};

	public Person(String pname, String psurname, String pphone, String pcity) {
		super();
		this.id = currentid;
		currentid++;
		this.name = pname;
		this.surname = psurname;
		this.phone = pphone;
		this.city = pcity;
	}
	public Person(int pid, String pname, String psurname, String pphone, String pcity) {
		this.id = pid;
		this.name = pname;
		this.surname = psurname;
		this.phone = pphone;
		this.city = pcity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", phone=" + phone + ", city=" + city
				+ "]";
	}

}
