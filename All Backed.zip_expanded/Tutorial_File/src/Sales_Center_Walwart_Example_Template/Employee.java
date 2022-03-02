package Sales_Center_Walwart_Example_Template;

public abstract class Employee 
 
{
	 
	private String firstName;
	private String lastName; 
	
	public Employee (String fn, String ln) 
	
	{
		 
		firstName = fn;
		lastName = ln;
		
	}
	
	public String toString() // Prints Employee Object
	
	{
		
		return (firstName + " " + lastName + " ");
	
	}
	
	abstract double pay(double period); 
	
}
