import java.util.Scanner;

/**
 * Asks the user to enter their full name then asks the programmer to hack into First Middle. then Last Name on the second line. 
 *
 * Manu
 * 9/26
 */
public class NameProgram
{
  public static void main(String[] args) {
      Scanner keyboard= new Scanner (System.in);
      System.out.println("What is your full name (First Middle and Last)");//asks the user for their full name
      String name= keyboard.nextLine();
      int firstspace= name.indexOf(" ");//finds the first space in the string 
      int secondspace=name.indexOf(" ", firstspace+1);//finds the space after the first space hence firstspace+1
      String firstname=name.substring(0,firstspace);//first name is between the start of the string and first space
      String middlename=name.substring(firstspace,secondspace);//middle name is between the first and second space
      String lastname=name.substring(secondspace+1);//everything after the second space is the last name
      System.out.println(firstname+" "+middlename+".");
      System.out.println(lastname);
      
      
      
      
      
      
      
      
      
      
   
    
    
    
    
    
    
    

    
    }//end of main 
    
    
    
    
  
    
    
    

}
//What is your full name (first,middle,last)?
//Manu Kumar Patranabish
//Manu Kumar.
//Patranabish
//What is your full name (first,middle,last)?
//Kanye Omari West
//Kanye Omari.
//West
