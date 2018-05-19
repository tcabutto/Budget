import java.util.ArrayList;

public class Person 
{
	private String fname, lname;
	private ArrayList<Account> accounts;
	
	public Person()
	{
		accounts = new ArrayList<Account>();
	}
	
	public void addAccount(Account a)
	{
		accounts.add(a);
	}
	
	public void getAccount(String name)
	{
		for(int i=0; i<accounts.size(); i++)
		{
			Account find = accounts.get(i);
			if(find.getName().equals(name))
			{	//Will print information for account rather than passing data back to main.
				System.out.println(find.toString());
				break;
			}
			else
			{
				i++;
			}
		}
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
}
