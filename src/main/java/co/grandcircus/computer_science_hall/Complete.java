package co.grandcircus.computer_science_hall;


/*
 * 
"firstName": "Ada",
"lastName": "Lovelace",
"innovation": "published the first computer programs",
"year": 1843
 */
public class Complete {
	private String firstName;
	private String lastName;
	private String innovation;
	private String year;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getInnovation() {
		return innovation;
	}
	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Complete [firstName=" + firstName + ", lastName=" + lastName + ", innovation=" + innovation + ", year="
				+ year + "]";
	}
	
	
}
