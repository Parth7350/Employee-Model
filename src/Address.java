
public class Address {
	public String street;
	public String city;
	public String state;
	public String zip;
	
	public Address (String inStreet, String inCity, String inState, String inZip){
		
		inState.toUpperCase();
		street = inStreet;
		city = inCity;
		state = inState;
		zip = inZip;
	}
	
}
