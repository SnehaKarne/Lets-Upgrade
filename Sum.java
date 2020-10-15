//Day 4 Quetion 3

import java.util.*;

public class Sum
{
	Scanner sc= new Scanner(System.in);
	 int ar[] =new int[5];

	public void sum(){
		for(int i=0; i<5; i++){
			System.out.println("Enter number : ");
			ar[i]=sc.nextInt();
		}
		System.out.println("*******Sum of 5 numbers are******* ");
		int ans=0;
		for(int i=0; i<5; i++)
		ans=ans+ar[i];
		System.out.println(ans);
		System.out.println("***********************************");
	}

	public static void main(String args[ ])
	{
		Sum c=new Sum();
		c.sum();
	}
		
}