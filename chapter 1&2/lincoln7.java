//name
//date
//example 1.1 prgram name
//first program to test output - description

//import section
import java.util.Scanner;


public class lincoln7       //must have a class
{
public static void main  (String[] args)    // must have main
{
    //primative data types
    int x = 5,y,z = 21;
    int age;
    //x = 5.5; // error, try it!
    double num,num1,cel;
    float num3; // = double but less memory 4 bytes
    char letter = 'a'; // use single quote
    boolean love = false;
    double total = 1499.897;
    double height = 10;
    
    // can't use reserved words p 28
    //int package; this goto
    
//------------Objects--------------------
    //class name     id     memory        constructor
    String           word = new           String("Screen Protector");
    //p.90 -- sanner methods
    Scanner          keyboard = new       Scanner(System.in);
    
    String name = new String("Kevin");
    String name1 = new String("Kevin");
    String name2 = new String("Bob");
    
    System.out.print("Enter your age ");
    age = keyboard.nextInt();//returns the data type int
    
    //name = keyboard.next();//this will get input upto the next space
    name = keyboard.nextLine();//input up to the \n
    
    
    System.out.print(name + " is years " + age + " old");
    
    
  /*  
    //p88 - What is different about the Math Calss??
    
    double cylinder = Math.PI * Math.pow(5,2)*height;
    System.out.println(cylinder);
    
    System.out.print("The square root of 21 is"+ Math.sqrt(z));
    
    
    
/*    
    //p. 78 are String methods you must know AP Test
    //len(word) - function
    System.out.println(word.length());
    
    //get part of a String -- index starts at 0
    System.out.println(word.substring(8));
    System.out.println(word.substring(7,13));
    System.out.println(word.substring(7,16));// n,n-1
    
    //System.out.println(word.charAt(16));//error out of bounds not n-1
    System.out.println(word.indexOf("P"));
    
    System.out.println(name == name1);//are they the same obj
    System.out.println(name.equals(name1));//are they equal obj
    
    System.out.println(name.compareTo(name2));
    
    
    
    
    
    
    
    
    
 
/*    
    //---------Print Formatting
 
    System.out.printf("Total is: $%,.2f %n",total);
    System.out.printf("Total: %-10.2f: " , total);
    
    
    
    
//------------Cast and Promotion Stuff-----------
 /*   
    System.out.print(letter);
    System.out.print(letter +1);
    //this is casting the number of 98 to the char b
    System.out.println((char)(letter +1));
    
    //mathmatical problems, I do not caree
    
    
    cel = 75 - 32 *(5/9);
    
    System.out.println("Celsius temp is " + cel);
    
    //permotion
     cel = (75 - 32) *5.0/9; //permotes 9 to a double, permote 75-32
    
    System.out.println("Celsius temp is " + cel);
    
    //cast
     cel = (75 - 32) * (double)x/9; //permotes 9 to a double, permote 75-32
    
    System.out.print("Celsius temp is " + cel);
    
    
    
/*    
    System.out.println("A quote by Abraham Lincolin:"  );

    System.out.println("Whatever you are, be a good one."  );

    //System.out.println(
/**/
}//end of main
}//end of class lincolin


/*
 * A quote by Abraham Lincolin:
Whatever you are, be a good one.

---------------
A quote by Abraham Lincolin:
Whatever you are, be a good one.

 */




















