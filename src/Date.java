
public class Date {
	public int month; 
	public int day;
	public int year;
	
	public Date(int inMont, int inDay, int inYear){
		
		month=inMont;
		day=inDay;
		year=inYear;
	}
	
	public int errorCheck(int inMonth, int inDay, int inYear){
		if(inMonth < 1 || inMonth > 12 || inYear < 1000 || 
				inDay < 1 || inDay > 31 || 
				((inMonth == 4 || inMonth == 6 || inMonth == 9 || inMonth == 11) && inDay > 30) 
				|| (inMonth == 2 && inDay > 29))
				return 1;
		
		else return 0;
	}
}
