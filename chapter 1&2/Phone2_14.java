// William Stern
// 8/30/18
// Phone2.14
//Creates a random phone number and formats it with dashes

import java.text.DecimalFormat;
import java.util.Random;

public class Phone2_14
{
	public static void main(String[] args)
	{
		Random generator = new Random();

		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int finalNum;
		String phone;

		num1 = generator.nextInt(7) + 1; // Generates the first three numbers
		num2 = generator.nextInt(8);
		num3 = (int)(Math.random() * 8);

		num4 = generator.nextInt(743);
		num5 = generator.nextInt(9999);
		
		phone = "" + num1 + num2 + num3 + "-" + num4 + "-" + num5;
 
		System.out.println(phone);
		
		/**
		 * 624-512-2873
		 * 636-110-3008


		 */
	}
}
