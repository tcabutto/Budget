import java.text.DecimalFormat;

public class Account 
{
	private String name;
	private double balance;
	private boolean negative;
	private DecimalFormat df = new DecimalFormat("#.00"); 
	
	public Account()
	{
		setNegative(false);
	}
	
	
	public String getName() 
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	public double getBalance() 
	{
		return balance;
	}


	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	public void isNegative() 
	{
		if(negative)
		{
			System.out.println("Your account is in the negative!\nBalance: $" + df.format(balance));
		}
		else
		{
			System.out.println("You're still in the positive!\nBalance: $" + df.format(balance));
		}
	}


	public void setNegative(boolean val)
	{
		this.negative = val;
	}
	
	
	public void add(double cash)
	{
		balance += cash;
	}
	
	public void subtract(double cash)
	{
		balance -= cash;
	}
	
	public String toString()
	{

		String retval = "Account name: " + name + "\n" + "Account balance: $" + df.format(balance);

		return retval;
	}

}
