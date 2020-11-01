//Question 4: Array of 3 objects for each type of employee

import java.util.*;
public class Employee
{
	Scanner sc= new Scanner(System.in);
	String name, dr;
	int age, sal;

	public void getDetails(){
		System.out.println("Enter Name : ");
		name=sc.next();
		System.out.println("Enter Age : ");
		age=sc.nextInt();
		System.out.println("Enter Degree : ");
		dr=sc.next();
		System.out.println("Enter Sallary:");
		sal=sc.nextInt();
		
	}

	public void displayDetails(){
		System.out.println("*************************");
		System.out.println(" Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Degree : "+dr);
		System.out.println("Sallary : "+sal);
		System.out.println("*************************");
	}

	public static void main(String args[ ]){
		Employee ep[]=new Employee[3];
		for(int i=0; i<3; i++){
			ep[i]=new Employee();
			ep[i].getDetails();
			ep[i].displayDetails();
		}
		
	}
} 