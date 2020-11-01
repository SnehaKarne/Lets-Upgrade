//Question 2: Create three child classes one for the doctor, one for an engineer, and one for pilots and include their different operations in respective classes.
import java.util.*;
class Doctor
{
	String nm, Spe, edu;
	int sal, age;
	Scanner sc=new Scanner(System.in);

	public void getDetails()
	{
		System.out.println("Enter the Name of Doctor : ");	
		nm=sc.next();
		System.out.println("Enter the Specialization : ");	
		Spe=sc.next();
		System.out.println("Enter the Sallary of Doctor : ");	
		sal=sc.nextInt();
		System.out.println("Enter the Age of Doctor : ");	
		age=sc.nextInt();
		System.out.println("Enter the Degree of Doctor : ");	
		edu=sc.next();
	}

	public void display()
	{
		System.out.println("");
		System.out.println(" ********Doctor Details******** ");	
		System.out.println(" Name of Doctor : "+nm);	
		System.out.println(" Age of Doctor : "+age);
		System.out.println(" Sallary of Doctor : "+sal);
		System.out.println(" Degree of Doctor : "+edu);	
		System.out.println(" ************************************* ");
		System.out.println("");
	}
}

class Engineer
{
	String nm, Spe, edu;
	int sal, age;
	Scanner sc=new Scanner(System.in);

	public void getDetails()
	{
		System.out.println("Enter the Name of Engineer: ");	
		nm=sc.next();
		System.out.println("Enter the Branch : ");	
		Spe=sc.next();
		System.out.println("Enter the Sallary of Engineer : ");	
		sal=sc.nextInt();
		System.out.println("Enter the Age of Engineer : ");	
		age=sc.nextInt();
		System.out.println("Enter the Degree of Engineer : ");	
		edu=sc.next();
	}

	public void display()
	{
		System.out.println("");
		System.out.println(" ********Engineer Details******** ");	
		System.out.println(" Name of Engineer : "+nm);	
		System.out.println(" Age of Engineer : "+age);
		System.out.println(" Sallary of Engineer : "+sal);
		System.out.println(" Degree of Engineer : "+edu);	
		System.out.println(" ************************************* ");
		System.out.println("");
	}
}

class Pilot
{
	String nm, Spe, edu;
	int sal, age;
	Scanner sc=new Scanner(System.in);

	public void getDetails()
	{
		System.out.println("Enter the Name of Pilot : ");	
		nm=sc.next();
		System.out.println("Enter the Specialization : ");	
		Spe=sc.next();
		System.out.println("Enter the Sallary of Pilot : ");	
		sal=sc.nextInt();
		System.out.println("Enter the Age of Pilot : ");	
		age=sc.nextInt();
		System.out.println("Enter the Degree of Pilot : ");	
		edu=sc.next();
	}

	public void display()
	{
		System.out.println("");
		System.out.println(" ********Pilot Details******** ");	
		System.out.println(" Name of Pilot : "+nm);	
		System.out.println(" Age of Pilot : "+age);
		System.out.println(" Sallary of Pilot : "+sal);
		System.out.println(" Degree of Pilot : "+edu);	
		System.out.println(" ************************************* ");
		System.out.println("");
	}
}

class Main
{
	public static void main(String args[])
	{
		Doctor d=new Doctor();
		d.getDetails();
		d.display();

		Engineer e=new Engineer();
		e.getDetails();
		e.display();

		Pilot p=new Pilot();
		p.getDetails();
		p.display();
	}
}