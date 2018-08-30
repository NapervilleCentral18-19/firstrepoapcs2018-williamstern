//William Stern	
// 8/29/18
// Program2_12Coins
// When given a number of coins determins the total vallue of all the coins
import java.util.Scanner;
import java.text.NumberFormat;
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
		
		// Computer the total value of the coins
		total = (quarter * .25) + (dime * .10) + (nickel * .05) + (penny * .01);
		
		// Sets money as the CurrencyInstance formatter
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("");
		System.out.print("Total: " + money.format(total));
	}	
}	
/*
 * 
 Enter the number of coins you have of each type

Quarters: 1

Dime: 1

Nickel: 1

Penny: 1

Total: $0.41


Enter the number of coins you have of each type

Quarters: 4

Dime: 3

Nickel: 5

Penny: 2

Total: $1.57
/**/
