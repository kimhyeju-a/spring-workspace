package di.collection;

import java.util.List;

public class ListAddress {
	private List<String> address;
	private List<Integer> number;

	public ListAddress() {
	}

	public ListAddress(List<String> address) {
		this.address = address;
	}
	
	public ListAddress(List<String> address, List<Integer> number) {
		super();
		this.address = address;
		this.number = number;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public List<Integer> getNumber() {
		return number;
	}

	public void setNumber(List<Integer> number) {
		this.number = number;
	}
	
}
