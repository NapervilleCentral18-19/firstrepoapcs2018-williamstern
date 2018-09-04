// William STern
//9/4/2018
// Name
// formats a fullname for two lines with a dot after the middle initial

import  java.util.Scanner;

public class Name
{
    public static void main(String[] args)
    {
        String fullName;
        int size;
        int space;
        int lastSpace;
        String lastnames;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        fullName = scan.nextLine();
        size = fullName.length();
        space = fullName.indexOf(" ");
        lastnames = fullName.substring(space +1, size);
        lastSpace = lastnames.indexOf(" ");// finds second space
        size = lastnames.length(); // Reassigns size for use in second println
        
        System.out.println(fullName.substring(0, space + 2) + ".");
        System.out.println(lastnames.substring(lastSpace+1, size));
    
        /**
         * Enter your full name: William Matthew Stern
         * William M.
         * Stern
         * Enter your full name: Edgar Allan Poe
         * Edgar A.
         * Poe

         */









}
    
}   
