//Day 4 Quetion 1

import java.util.*;

public class Avenger
{
	Scanner sc= new Scanner(System.in);
	String name, pwr, wp, pt;
	int age;

	public void getDetails(){
		System.out.println("Enter Name : ");
		name=sc.next();
		System.out.println("Enter Age : ");
		age=sc.nextInt();
		System.out.println("Enter Power : ");
		pwr=sc.next();
		System.out.println("Enter Weapon:");
		wp=sc.next();
		System.out.println("Enter Planet:");
		pt=sc.next();
	}

	public void displayDetails(){
		System.out.println("*************************");
		System.out.println(" Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Power : "+pwr);
		System.out.println("Weapon:"+wp);
		System.out.println("Planet: "+pt);
		System.out.println("*************************");
	}

	public static void main(String args[ ]){
		Avenger av[]=new Avenger[5];
		for(int i=0; i<5; i++){
			av[i]=new Avenger();
			av[i].getDetails();
			av[i].displayDetails();
		}
		
	}
} 