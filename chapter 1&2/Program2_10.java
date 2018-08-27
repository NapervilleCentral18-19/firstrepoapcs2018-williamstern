/**
 * 
 * 
 * @ Codemonkey: William Stern
 * @ Compter Scientist: Amber Hunter
 * @date 8/23-24/18
 * @version (Pro 2.10)
 * / Finds the area and perimiter of a triangle when given the length of the sides
 * //
 **/
 import java.util.Scanner;
 public class Program2_10
 {
	 public static void main (String[] args)
	 {
		 int a, b, c;
		 int perimeter;
		 double area;
		 double semip;
		 Scanner keyboard = new Scanner(System.in);
		 
		 //Inputs
		 System.out.print("Enter side one: ");
		 a = keyboard.nextInt();
		 
		 System.out.print("Enter side two: ");
		 b = keyboard.nextInt();
		 
		 System.out.print("Enter side three: ");
		 c = keyboard.nextInt();
		 
		 // Computes the perimeter
		 perimeter = a + b + c;
		 semip = 0.5 * perimeter; // semip is used in equation for area of the triangle
		 // Equation for the area
		 area = Math.sqrt(semip * (semip - a) * (semip - b) * (semip - c));
		 
		 // Outputs
		 System.out.println("The perimeter is " + perimeter);
		 System.out.println("The area is " + area);
	}
}		 
		 
		 
		 
