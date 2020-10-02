import java.util.Scanner;
import java.text.NumberFormat;
/**
 * This program asks the user how many quarters, dimes, nickles and pennies they have.
 * Then asks to format it into dollars and cents. 
 *
 * Manu
 * 9/25
 */
public class CoinsProgram
{
  public static void main(String[] args) {
    Scanner keyboard= new Scanner (System.in);
    System.out.println("How many quarters do you have?:");
    int quarters= keyboard.nextInt();//takes the number of quarters the user has and puts it into a variable
    System.out.println("How many dimes do you have?:");
    int dimes= keyboard.nextInt();//takes the number of dimes the user has and puts it into a variable
    System.out.println("How many nickles do you have?:");
    int nickles= keyboard.nextInt();//takes the number of nickles the user has and puts it into a variable
    System.out.println("How many pennies do you have?:");
    int pennies= keyboard.nextInt();//takes the number of pennnies the user has and puts it into a variable
    double total= (.25*quarters)+ (.1*dimes)+(.05*nickles)+(.01*pennies);//multiplies each coin number into a decimal value according to its monetary worth then keeps it as a double in the variable total
    NumberFormat fmt1= NumberFormat.getCurrencyInstance();// creates a currency formmatter so total can be formatted as currency
    System.out.print("The total is : "+fmt1.format(total));
    
    
    
    
    
    
    
    

    
    }//end of main 
    
    
    
    
  
    
    
    

}
