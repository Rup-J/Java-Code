//hybrid inheritance
package assignments_Java;

class Tickets
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

class Bus extends Tickets
{
	void bus_ticket() 
	{
		super.bus_ticket();
	}
}
class Flight extends Tickets
{
	void train_ticket() 
	{
		super.train_ticket();
	}
}

public class Assignment_24  extends Flight {

	public static void main(String[] args) 
	{
		Assignment_24 a24 = new Assignment_24();
		a24.bus_ticket();
		a24.train_ticket();
		
		
		
	}

}
