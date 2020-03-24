//toString() method
//a builting method we can use to print the details
//of an object
//We do not need to import the toString() method
//static variable and static method

public class Account
{
	private String name;
	private int PIN;
	private static int count=0;

	public Account(String name, int PIN)
	{
		this.name = name;
		this.PIN = PIN;

		count++;
	}

	public void setName(String name)
	{
		this.name = name;
	}	
	public String getName()
	{
		return name;
	}

	public void setPIN(int pin)
	{
		PIN = pin;//java is case sensitive
	}

	public int getPIN()
	{
		return PIN;
	}

	public static int getCount()
	{	
		//System.out.println(getName());//not allowed
		//this();//not allowed
		return count;
	}

	public String toString()
	{
		return String.format("%nName: %s%n PIN Code: %d%nTotal Accounts: %d%n",name,getPIN(),getCount());
	}
}