//William Stern	
// 8/29/18
// 2_12Coins
// When given a number of coins determins the total vallue of all the coins
import java.util.Scanner;
public class Program2_12Coins
{
	public static void main(String[] args)
	{
		int quarter;
		int dime;
		int nickel;
		int penny;
		double total;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of coins you have of each type");
		System.out.print("\nQuarters: ");
		quarter = keyboard.nextInt();
		System.out.print("\nDime: ");
		dime = keyboard.nextInt();
		System.out.print("\nNickel: ");
		nickel = keyboard.nextInt();
		System.out.print("\nPenny: ");
		penny = keyboard.nextInt();
		
		total = (quarter*.25)
	}	
}	
