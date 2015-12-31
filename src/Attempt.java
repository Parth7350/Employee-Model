
import java.util.Scanner;
public class Attempt
{


public static void main(String[] args)
{
	int i = 0;
    Scanner input = new Scanner(System.in);
    Employee[] employees ={};
    System.out.println("Number of employees: ");
    int n = input.nextInt();
      
   
        while (i < n) {
        System.out.println("Please enter the first name of employee: " );
        if (input.hasNextLine()) 
        {
        String dummy = input.nextLine(); //Purpose?
        }
        String firstname = input.nextLine();

        System.out.println("Please enter the last name of employee: " );
        String lastname = input.nextLine();

        System.out.println("Please enter the street and house number of employee: " );
        String street = input.nextLine();

        System.out.println("Please enter the city of employee: " );
        String city = input.nextLine();

        System.out.println("Please enter the state of employee: " );
        String state = input.nextLine();

        System.out.println("Please enter the zip code of employee: " );
        String zip = input.nextLine();

        System.out.println("Please enter the month hired for employee: " );
        int month = input.nextInt();

        System.out.println("Please enter the day hired for employee: " );
        int day = input.nextInt();

        System.out.println("Please enter the year hired for employee: " );
        int year = input.nextInt();
        
        if(errorCheck(month, day, year, state, zip) ==1)
        	System.out.println("Invalid data input. Please try again.");
        else{
        	employees[i] = new Employee(firstname, lastname, month, day, year, street, city, state, zip);
        	i++;
        }
        
        
    }

    
}
static int errorCheck(int inMonth, int inDay, int inYear,String inState, String inZip){
	if(inMonth < 1 || inMonth > 12 || inYear < 1000 || 
			inDay < 1 || inDay > 31 || 
			((inMonth == 4 || inMonth == 6 || inMonth == 9 || inMonth == 11) && inDay > 30) 
			|| (inMonth == 2 && inDay > 29) || inState.length() != 2 || inZip.length() != 5)
			return 1;
	
	else return 0;
}
}
