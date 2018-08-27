//name
//date
//example 1.1
//first program to test output

//import section
import java.util.Scanner;



public class lincoln8       //must have a class and the file match!!!!!
{
    
public static void main  (String[] args)    // must have main
{
     
    boolean love = false;// may cause you personal problems
    char letter = 'a'; // single quotes for char's ONLY!
    int x,y,z = 16;
    int height = 10;
    int age;
    double cylinder;
    
    double num,num1,cel;
    float num2;// same thing as double but less memory 4 bytes
    
    String name = new String("Kevin Hayes");
    //System.out.println(name);
    
    //class    id     memory      constructor
    String     word = new         String("Bread is Good");
    Scanner    keyboard = new     Scanner(System.in);
    String name1 = new String("Kevin");
    String name2 = new String("Kevin");
    String name3 = new String("Charlie");
    
    System.out.print("Enter Your age ");
    age = keyboard.nextInt();//returns an int
    
    //gets the junk \n
    keyboard.nextLine();
    
    //name = keyboard.next();      //get the text up to the next space
    name = keyboard.nextLine();// gets all of the text to the \n
    
    System.out.print(name + " is " + age + " years old");
    
    
    
    
    
    /*    
    //Math Class p88 
    // The Math class is special- it is static
    //no object is needed
    System.out.println(Math.PI);
    cylinder = Math.PI * Math.pow(5,2)*height;
    System.out.println(cylinder);
    
    System.out.println("The square root of 16 is" + Math.sqrt(z));
    
    /*
    //p78 String methods must! know
    //Pyton woudl do len(word), count the starting 1
    System.out.println(word.length());
    
    //parts of the String, index starting 0
    System.out.println(word.substring(7));
    System.out.println(word.substring(6,9)); //start to n-1
    
    //System.out.println(word.charAt(13)); error out of bounds
    System.out.println(word.charAt(9));
    System.out.println(word.indexOf("o"));
    
    System.out.println(name1 == name2); // are obj the same
    System.out.println(name1.equals(name2));// are obj equal
    
    System.out.println(name3.compareTo(name2));
    
    
    
    
    
    
    /*
    //print formatting examples---------------------------
    double total = 1499.887;
    System.out.printf("Total is: $%,.2f %n",total);
    System.out.printf("Total: %-10.2f: ",total);
    
    String word = new String("Bread");
    System.out.printf("%15s %,10.2f" ,word,2345.56);
    
    
    
    
 /*   
    System.out.print(letter);
    System.out.print(letter +1);
    
    //cast
    System.out.println((char)(letter +1));
 /*   
    //mathmatical problems/errors
    // int division - 5/9 = 0.55556 an int = 0
    cel = 75 -32 * (5/9);
    
    System.out.println("Celsius is: " + cel);
    
    //promotion - 9 permoted to a double, permotes 75-32
        cel = (75 -32) * (5.0/9);
    
    System.out.println("Celsius is: " + cel);
    
        //cast
        cel = (75 -32) * ((double)5/9);
    
    System.out.println("Celsius is: " + cel);
    
 /*  //day 1 
    System.out.println("A quote by Abraham Lincolin:"  );
    
    /*
    System.out.println("Whatever you are, be a good one."  );

    //System.out.println(
/**/
}//end of main
}//end of class lincolin

/*
 A quote by Abraham Lincolin:
Whatever you are, be a good one.
----------------
A quote by Abraham Lincolin:
Whatever you are, be a good one.
 
 */


















