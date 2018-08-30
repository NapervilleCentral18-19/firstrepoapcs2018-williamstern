

// William Stern
// 8/28/18
// Program 2.7
// Converts seconds into hours and minutes and leftover seconds

import java.util.Scanner;

public class Program2_7
{
	public static void main (String[] args)
	{
		int initialTime;
		int hours, minutes, seconds;
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Enter an ammount of seconds: ");
		initialTime = keyboard.nextInt();
		
		// COnverts seconds into to hours minutes and leftover seconds
		seconds = initialTime % 60;
		minutes = initialTime / 60;
		hours = minutes / 60;
		minutes -= 60 * hours;
		
		System.out.println("\nseconds: " + seconds);
		System.out.println("minutes: " + minutes);
		System.out.println("hours: " + hours);
	}
}
		
		
		
