//Day3

import java.util.*;
public class Emp
{
	Scanner sc = new Scanner(System.in);
	String name;
	int sal, a_sal;
	int dob, mob,yob,age;	
	float tax=0;
	public void accept()
	{
		System.out.println("Enter Name :");
		name=sc.next();
		System.out.println("Enter date of Birth :");
		dob=sc.nextInt();
		System.out.println("Enter Month of Birth :");
		mob=sc.nextInt();
		System.out.println("Enter Year of Birth :");
		yob=sc.nextInt();
		System.out.println("Enter Monthly Sallary :");
		sal=sc.nextInt();
	}

	public void calculate(){
		System.out.println("Age : "+(2020-yob)+"Years ");
		a_sal=sal*12;
		System.out.println("A_sal :"+a_sal);
		
		if(a_sal>=500000){
			tax=a_sal*20/100;
			System.out.println("Tax :"+tax);
		}
		else if(a_sal<500000 && a_sal>=400000){
			tax=a_sal*15/100;
			System.out.println("Tax :"+tax);
		}
		else if(a_sal<400000 && a_sal>=300000){
			tax=a_sal*10/100;
			System.out.println("Tax :"+tax);
		}
		else if(a_sal<300000 && a_sal>=200000){
			tax=a_sal*5/100;
			System.out.println("Tax :"+tax);
		}
		else {
			System.out.println("Tax : No Tax");	
		}
	}
	
	public static void main(String args[])
	{
		Scanner c=new Scanner(System.in);
		String ch;
		Emp e= new Emp();
		
		do{
		e.accept();
		e.calculate();
		System.out.println("Do u want to continue ...... press Y/y else N/n");
		ch=c.next();
		}while(ch.equals("Y") || ch.equals("y") );
		
	}
}
