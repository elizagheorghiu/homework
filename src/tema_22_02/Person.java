package tema_22_02;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private String cnp;
	private int age;
	private List<Hobby> listHobby = new ArrayList<>();

	public Person(String name, String cnp, int age) {
		super();
		this.name = name;
		this.cnp = cnp;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Hobby> getListHobby() {
		return listHobby;
	}

	public void setListHobby(List<Hobby> listHobby) {
		this.listHobby.addAll(listHobby);
	}

	public String toString() {
		return this.getClass().getSimpleName() + " [name=" + name + ", cnp=" + cnp + ", age=" + age + "]";
	}
}