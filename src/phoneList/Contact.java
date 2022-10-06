package phoneList;

/*
 * This contains info for a single contact
 * 
 * Parameters Needed to Store
 *   - Contact's Name
 *   - Contact's Phone Number
 *   
 * Needed Methods
 *   - Constructor(s)
 *   - getter methods
 *   - Setter methods not necessary unless Constructor
 *        initialize variables.
 *   - Override toString() so that Contact can
 *        be printed as part of a list.
 * 
 */



public class Contact {

	private String name;
	private String number;
	
	public Contact(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	
	public String getName() {
		return name;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setNumber(String newNumber) {
		this.number = newNumber;
	}
	
	public String toString() {
		return "Contact's Name: " + name +
			"\nContact's Number: " + number;
	}
	
}
