//Write a program for method overriding using super keyword
package assignments_Java;

class Tickets1
{
	void bus_ticket()
	{
		System.out.println("Bus ticket is available");
	}
	void train_ticket()
	{
		System.out.println("Train ticket is available");
	}
}

class Buss extends Tickets1
{
	void bus_ticket() 
	{
		super.bus_ticket();
	}
}
class Flights extends Tickets1
{
	void train_ticket() 
	{
		super.train_ticket();
	}
}

public class Assignment_32  extends Flights {

	public static void main(String[] args) 
	{
		Assignment_32 a32 = new Assignment_32();
		a32.bus_ticket();
		a32.train_ticket();
		
		
		
	}

}