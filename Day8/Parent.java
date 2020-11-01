// Question 1:Create a parent class for different employees with common details name, age, salary, designation, and methods to get details and display details.
import java.util.*;
class Parent
{
	String nm, desig;
	int age, sal;
	Scanner sc=new Scanner(System.in);

	public void getDetails()
	{
		System.out.println("Enter the Name of employee : ");	
		nm=sc.next();
		System.out.println("Enter the Age of employee : ");	
		age=sc.nextInt();
		System.out.println("Enter the Sallary of employee : ");	
		sal=sc.nextInt();
		System.out.println("Enter the Designation of employee : ");	
		desig=sc.next();
	}

	public void display()
	{
		System.out.println("");
		System.out.println(" ********Employee Details******** ");	
		System.out.println(" Name of employee : "+nm);	
		System.out.println(" Age of employee : "+age);
		System.out.println(" Sallary of employee : "+sal);
		System.out.println(" Designation of employee : "+desig);	
		System.out.println(" ************************************* ");
	}
}

class Main
{
	public static void main(String args[])
	{
		Parent p=new Parent();
		p.getDetails();
		p.display();
	}
}