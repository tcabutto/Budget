
public class Budget 
{
	private String startDate, type;
	private double budget;
	private double limit;
	private Person person;
	
	public String getStartDate() 
	{
		return startDate;
	}
	
	public void setStartDate(int month, int day, int year) 
	{
		this.startDate = Integer.toString(month) + "/" + Integer.toString(day) + "/" + Integer.toString(year);
	}
	
	public String getType() 
	{
		return type;
	}
	
	public void setType(int num) 
	{	
		//main will make sure that 1, 2, and 3 are the only options that can be input into setter.
		if(num==1)
		{
			type = "Daily";
		}
		if(num==2)
		{
			type = "Weekly";
		}
		if(num==4)
		{
			type = "Monthly";
		}
		if(num==3)
		{
			type = "Annually";
		}
	}
	
	public double getBudget() 
	{
		return budget;
	}
	
	public void setBudget(double budget) 
	{
		this.budget = budget;
	}
	
	public double getLimit() 
	{
		return limit;
	}
	
	public void setLimit(double limit) 
	{
		this.limit = limit;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
