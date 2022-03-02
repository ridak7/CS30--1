package Sales_Center_Walwart_Example_Template;

public class Associates extends Employee

{

	private double HourlyPayRate;
	
	public Associates(String fn, String ln, double rate) 
	
	{
		 
		super(fn, ln);
		HourlyPayRate = rate;
		
	}
		
	public double pay (double hours)  
	
	{

		double payEarned;
		
		if (hours > 40) 
		
		{
		
			payEarned = ((HourlyPayRate * 40) + (HourlyPayRate * 1.5) * (hours - 40));
			
		}
			
		else 
			
		{
			
			payEarned = hours * HourlyPayRate;
				
		}
		
		return payEarned;
		
	}
		
		public String toString() //prints Associates Object 
		
		{
			
			return(super.toString() + " ,Associates" + "Salary Pay Rate: " + HourlyPayRate);
			
		}

	
}
