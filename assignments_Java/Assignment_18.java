package assignments_Java;
//Using Scanner Class please execute below problems:
//(Area of circle, Circumferance of circle, Area of square, Area of reactangle, Area of trinagle, 
//Area of trepezium, Circumferance of square,Circumferance of reactangle, Circumferance of trinagle, 
//Circumferance of trepezium)

import java.util.Scanner;

public class Assignment_18 {
	
	public static void main(String[] args) 
	{
		Scanner s =  new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
        double r = s.nextDouble();

        // Calculate area of the circle
        double area = Math.PI * r * r;
        System.out.println("Area of the circle: " + area);

        // Calculate circumference of the circle
        double circumference = 2 * Math.PI * r;
        System.out.println("Circumference of the circle: " + circumference);
		
        // area of square
        System.out.print("Enter the side of the square: ");
        double side = s.nextDouble();
        System.out.println("Area of the square- "+ side*side);
        
     // area of rectangle
        System.out.print("Enter the l,b of the rectangle: ");
        double l = s.nextDouble();
        double b = s.nextDouble();
        System.out.println("Area of the rectangle- "+ (l*b));
        
     // area of triangle
        System.out.print("Enter the h of the triangle : ");
        double h= s.nextDouble();
        System.out.println("Area of the triangle- "+ (0.5*b*h));
        
     // area of trapezium
        System.out.println("Area of the trapezium- "+ (0.5*(l+b)*h));
        
      //Circumferance of square
        System.out.println("Circumferance of square- "+ (4*side));
        
      // Circumferance of rectangle
        System.out.println("Circumferance of rectangle - "+ (2*(l+b)));
      //  Circumferance of triangle
        System.out.println("Circumferance of triangle "+ (l+b+h));
        
     //  Circumferance of trapezium
        System.out.println("Circumferance of trapezium "+ (l+b+h+r));   
	}

}
