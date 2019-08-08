package co.grandcircus.computer_science_hall;

import java.util.Comparator;
import java.util.List;

public class Tiny {
	private String name;
	private String invented;
	private String year;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInvented() {
		return invented;
	}
	public void setInvented(String invented) {
		this.invented = invented;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Tiny [name=" + name + ", invented=" + invented + ", year=" + year + "]";
	}
	public static List<Tiny> sort(Comparator<Tiny> comparing) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
