package assignments_Java;
//conditional operators 
public class Assignment_08 {
	int a=10;
	int b=20;

	public static void main(String[] args) {
		//>,< , <=, >= , != (not equals to) , ==
		
		Assignment_08 a8 = new Assignment_08();
		if(a8.a > a8.b)
		{
			System.out.println("A is greater than B");
		}
		else if (a8.a < a8.b)
		{
			System.out.println("A is less than B");
		}
		else if(a8.a <= 10)
		{
			System.out.println("Number is less than or equal to 10");
		}
		else if(a8.b >= 10)
		{
			System.out.println("Number is greater than or equal to 10");
		}
		else if(a8.a != a8.b)
		{
			System.out.println("Numbers are not equal");
		}
		else if(a8.a == a8.b)
		{
			System.out.println("Numbers are equal");
		}
	}

}
