package assignments_Java;

// Assignment 2-Write a program to find the vote eligibility for a person whose age is 17.age =17, find person is eligible to vote or not.


public class Assignment_12
{
	static int age =17;
	
	public static void main(String[] args) 
	{
		if(age>=18)
		{
			System.out.println("The person is eligible for voting");
		}
		else
		{
			System.out.println("The person is not eligible with age = "+ age);
		}
	}

}
