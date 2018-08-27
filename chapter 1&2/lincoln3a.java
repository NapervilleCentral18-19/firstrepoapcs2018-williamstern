//name
//date
//example 1.1
//first program to test output


//import area, java code not built in
import java.util.Scanner;


public class lincoln3a      //must have class & file name match!!!!
{
public static void main  (String[] args)    // must have main
{
    final double gravity = 9.8;// this is a constant
    
    //gravity = 2;
    //primative data types
    //; end a line and champ at hide and seek
    int x,y,z = 16; char letter = 'a'; //int == char
    int age;
    double num, num1, cTemp;//decimal number
    float num2;
    boolean love;
    double Total = 1499.879;
    String name,name1;
    
    //Class     id     memory        constructor
    String      word    = new        String("My cats breath smells like cat food");
    //method list on p 90
    Scanner    keyboard = new        Scanner(System.in);
 
    System.out.print("Enter your age");
    age = keyboard.nextInt();
    keyboard.nextLine();//this clears \n out of input buffer
    
    System.out.print("What is your name");
    //name = keyboard.next();     //this get text to the first space
    name = keyboard.nextLine(); //this gets all text to \n
    
    System.out.println(name + " is "+age+" years old");
    
    
    
    
    
    /*
    
    double cylinder,height = 10;
    //Math is a static class
    cylinder = 3.1415 * Math.pow(5,2)* height;
    
    System.out.println(cylinder);
    
    System.out.println("The square root of 16 is"+ Math.sqrt(z));
    
    
    
    /*   
    //p78
    System.out.println(word);
    System.out.println(word.length());
    
    System.out.println(word.substring(8));
    System.out.println(word.substring(8,16));
    //System.out.println(word.substring(8,36));//error not 35 index
    System.out.println(word.charAt(10));
    System.out.println(word.indexOf("l"));
    System.out.println(word.indexOf("C"));
    
    String name = new String("Kevin");
    String name1 = new String("Kevin");
    String name2 = new String("Thomas");
    
    // tests if the objects are the same
    System.out.println(name == name1);
    //test if objects are equal according to some criteria
    System.out.println(name.equals(name1));
    
    System.out.println(name.compareTo(name2));
    System.out.println(name2.compareTo(name));
    System.out.println(name.compareTo(name1));
    

    
    
    
    
    
    
    
    
/*
    System.out.printf("Total is: $%,.2f%n",Total);
    System.out.printf("Total: %-10.2f: ",Total);
     
    
  /*-------------------------CAST & PROMOTION  
    //int's and char's are the same thing!!!!!
    System.out.print(1+letter);
    
    //casting
    System.out.println((int)letter);
    System.out.println((int)letter);
    
    //mathmatical problems
    cTemp = (75 - 32) * (5/9);// int division 5/9 = int 0.5555555 is equal o 0.0
    System.out.println("The Celsius temp is" + cTemp);
    
    // promotion change a in to a double 5.0 and it changes 9 to 9.0
    cTemp = (75 - 32) * (5.0/9);
    System.out.println("The Celsius temp is" + cTemp);
    
    //cast
    cTemp = (75 - 32) * ((double)5/9);
    System.out.println("The Celsius temp is" + cTemp);
    
/*   
    System.out.println("A quote by Abraham Lincolin:"  );
    System.out.println("Whatever you are, be a good one."  );
    
    System.out.println("Press any key, what is the any key?");
/**/
}//end of main
}//end of class lincolin

/*
 * A quote by Abraham Lincolin:
Whatever you are, be a good one.
Press any key, what is the any key?


A quote by Abraham Lincolin:
Whatever you are, be a good one.
Press any key, what is the any key?

 */



















