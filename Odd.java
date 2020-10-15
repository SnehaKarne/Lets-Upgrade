//Day 4 Quetion 2

import java.util.*;

public class Odd
{
	Scanner sc= new Scanner(System.in);
	 int ar[] =new int[5];

	public void cal(){
		for(int i=0; i<5; i++){
			System.out.println("Enter number : ");
			
			ar[i]=sc.nextInt();
		}
		System.out.println("*******Odd numbers are******* ");
		for(int i=0; i<5; i++){
			if(ar[i]%2!=0){
			System.out.println("           "+ar[i]);
			}
		}
		System.out.println("**************************** *");
	}

	public static void main(String args[ ])
	{
		Odd c=new Odd();
		c.cal();
	}
		
}