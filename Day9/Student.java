//Question 3: In the main method create an array of objects for three of them get the details and print for all the objet
import java.util.*;

public class Student
{
	Scanner sc= new Scanner(System.in);
	String name, dr, clg, pt;
	int age;

	public void getDetails(){
		System.out.println("Enter Name : ");
		name=sc.next();
		System.out.println("Enter Age : ");
		age=sc.nextInt();
		System.out.println("Enter Degree : ");
		dr=sc.next();
		System.out.println("Enter Collage:");
		clg=sc.next();
		System.out.println("Enter Persentage:");
		pt=sc.next();
	}

	public void displayDetails(){
		System.out.println("*************************");
		System.out.println(" Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Degree : "+dr);
		System.out.println("Collage:"+clg);
		System.out.println("Persentage: "+pt);
		System.out.println("*************************");
	}

	public static void main(String args[ ]){
		Student st[]=new Student[3];
		for(int i=0; i<3; i++){
			st[i]=new Student();
			st[i].getDetails();
			st[i].displayDetails();
		}
		
	}
} 