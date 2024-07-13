//Write a program for method overriding
package assignments_Java;

class Amazon
{
	void orders()
	{
		System.out.println("Your order is shipped");
	}
}
public class Assignment_31 extends Amazon {

	void orders()
	{
		System.out.println("Order is delivered");
	}
	public static void main(String[] args)
	{
		Assignment_31 a31 = new Assignment_31();
		a31.orders();

	}

}
