package tema_22_02;

import java.util.ArrayList;
import java.util.List;

public class Hobby {

	private String hobbyName;
	private int frequency;

	private List<String> listAddress = new ArrayList<>();

	public Hobby(String hobbyName, int frequency) {
		super();
		this.hobbyName = hobbyName;
		this.frequency = frequency;
	}

	public void addAddressList(List<String> address) {
		this.listAddress.addAll(address);
	}

	public List<String> getListAddress() {
		return listAddress;
	}

	public String getHobbyName() {
		return hobbyName;
	}

	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public String toString() {
		return this.getClass().getSimpleName() + " [name=" + hobbyName + ", frequency=" + frequency + ", address="
				+ listAddress + "]";
	}
}
