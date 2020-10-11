//Day 2
public class Employee
{
	String name="Sneha";
	int age=19;
	String city="Pune";
	
	public void Display()
	{
		System.out.println("The name is "+name+".");
		System.out.println("The age is "+age+".");
		System.out.println("The city is "+city+".");
	}

	public static void main(String args[])
	{
		Employee e= new Employee();
		e.Display();

		Employee e1= new Employee();
		e1.Display();
	}
}
