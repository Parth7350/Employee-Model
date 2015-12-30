
public class Employee {
	public Name name;
	public Date date;
	public Address address;
	public String[] data;
	
	public Employee(String first, String last, 
			int inMont, int inDay, int inYear,
			String inStreet, String inCity, String inState, int inZip){
		
		if (errorCheck(inMont, inDay, inYear, inState, inZip) == 1)
			System.out.println("Error in data. Please try again.");
		else{
			name = new Name(first, last);
			date = new Date(inMont, inDay, inYear);
			address = new Address(inStreet, inCity, inState, inZip);
			
			data[0] = name.firstName + " " + name.lastName;
			data[1] = date.month + " " + date.day + ", " + date.year;
			data[2] = address.street + ", " + address.city +  ", " + address.state + ", " + address.zip;
		}
		
		
	}
	
	public int errorCheck(int inMonth, int inDay, int inYear,String inState, int inZip){
		if(inMonth < 1 || inMonth > 12 || inYear < 1000 || 
				inDay < 1 || inDay > 31 || 
				((inMonth == 4 || inMonth == 6 || inMonth == 9 || inMonth == 11) && inDay > 30) 
				|| (inMonth == 2 && inDay > 29) || inState.length() != 2 || inZip <= 10000 || inZip > 99999)
				return 1;
		
		else return 0;
	}
}
