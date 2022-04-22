package Company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.*;

public class Employee 
{
	String empName = "";
	String fDepartment = "";
	
	public Employee()
	{

	}
	
	public String getEmp() throws IOException 
	{
		
		String fName;
		String lName;
		String department;
		
		System.out.println("Please enter your first name: ");
		Scanner f = new Scanner(System.in);
		
		fName = f.nextLine();
		
		System.out.println("Please enter your last name: ");
		Scanner l = new Scanner(System.in);
		
		lName = l.nextLine();
		
		System.out.println("What department do you work in:\n Sales\n IT\n Human\n ");
		Scanner d = new Scanner(System.in);
		
		department = d.nextLine();
		
		System.out.println("You entered:" );
		System.out.println(lName + " " + fName);
		
		empName = fName + lName;
		
			FileWriter fw = new FileWriter("EmployeeList.txt",true);
	        PrintWriter outt = new PrintWriter(fw);
			outt.println("Last name: " + lName + " | " + "First name: " + fName + " | " + "Department: " + department);
			outt.close();
			
		return empName;
	}
	public void printEmp() throws IOException
	{
		File fileName = new File("EmployeeList.txt");

	    FileInputStream inFile = new FileInputStream("EmployeeList.txt");
	    int fileLength = (int) fileName.length();

	    byte Bytes[] = new byte[fileLength];

	    inFile.read(Bytes);

	    String file1 = new String(Bytes);
	    System.out.println("File content is:\n" + file1);

	    inFile.close();
	}
	
	
}
