// William Stern
// 8/30/18
// Phone2.14
//Creates a random phone number

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
		

		num1 = generator.nextInt(9) - 1;
		num2 = generator.nextInt(8);
		num3 = (int)(Math.random() * 8);

		num4 = generator.nextInt(743);
		num5 = generator.nextInt(9999);
		
		
		String numFinal = new String("" + num1 + num2 + num3 + num4 + num5);
		finalNum = (int)numFinal;
		DecimalFormat format = new DecimalFormat("###-###-####");
		
		System.out.println(format.format(numFinal));
	}
}