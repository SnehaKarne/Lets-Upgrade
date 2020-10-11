//Day3

import java.util.*;
public class Result
{
	Scanner sc = new Scanner(System.in);
	String name;
	int m1,m2,m3,m4,m5, tol, per;
	
	
	public void accept()
	{
		System.out.println("Enter Name :");
		name=sc.next();
		System.out.println("Enter Marks 1 :");
		m1=sc.nextInt();
		System.out.println("Enter Marks 2 :");
		m2=sc.nextInt();
		System.out.println("Enter Marks 3 :");
		m3=sc.nextInt();
		System.out.println("Enter Marks 4 :");
		m4=sc.nextInt();
		System.out.println("Enter Marks 5 :");
		m5=sc.nextInt();

		tol=m1+m2+m3+m4+m5;
		per=tol/5;
		
		if(per<100 && per>=85){
			System.out.println("Name :"+name);
			System.out.println("Percentage :"+per);
			System.out.println("Grade A");
		}
		else if(per<85 && per>=70){
			System.out.println("Name :"+name);
			System.out.println("Percentage :"+per);
			System.out.println("Grade B");
		}
		else if(per<70 && per>=55){
			System.out.println("Name :"+name);
			System.out.println("Percentage :"+per);
			System.out.println("Grade C");
		}
		else if(per<55 && per>=35){
			System.out.println("Name :"+name);
			System.out.println("Percentage :"+per);
			System.out.println("Grade D");
		}
		else {
			System.out.println("Name :"+name);
			System.out.println("Percentage :"+per);
			System.out.println("Grade FAIL");
		}
	}	
	
	public static void main(String args[])
	{
		Scanner c=new Scanner(System.in);
		String ch;
		Result r= new Result();
		do{
		r.accept();
		System.out.println("Do u want to continue ...... press Y/y else N/n");
		ch=c.next();
		}while(ch.equals("Y") || ch.equals("y") );
		
	}
}
