
public class Employee {
	public Name name;
	public Date date;
	public Address address;
	public String[] data;
	
	public Employee(String first, String last, 
			int inMont, int inDay, int inYear,
			String inStreet, String inCity, String inState, String zip){
		

			name = new Name(first, last);
			date = new Date(inMont, inDay, inYear);
			address = new Address(inStreet, inCity, inState, zip);
			
			
		}
		
		
	
	

}
