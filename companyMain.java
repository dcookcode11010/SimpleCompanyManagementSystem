package Company;

import java.io.IOException;
import java.util.Scanner;

public class companyMain 
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		int choice = 0;
		
		Employee e = new Employee();
		
		do
		{
			System.out.println("If you would like you add an employee than input 0.\n\nIf you would like to see a list of employees input 1.\n\nPlease enter your input:\n ");
			Scanner ss = new Scanner(System.in);
			
			choice = ss.nextInt();
			switch(choice)
			{
				case 0:
					e.getEmp();
					break;
				case 1:
					e.printEmp();	
					break;
				default:
					System.out.println("Thank you for using our system");
			}
		}
		while (choice < 2);
	}

}
