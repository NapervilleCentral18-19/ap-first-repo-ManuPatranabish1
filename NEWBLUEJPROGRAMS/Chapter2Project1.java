 import java.util.Scanner;
/**
 * Converts seconds into hours, minutes and seconds 
 *
 * Manu Patranabish
 * 9/18
 */
public class Chapter2Project1
{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner (System.in);
    System.out.print("Enter the total number of seconds:");
    int totalseconds = keyboard.nextInt();// stores the total number of seconds
    int hours= totalseconds / 3600;// takes the seconds and converts into hours
    int minutes= (totalseconds % 3600) / 60; //performs the modulus function on the total seconds and divides by 60 too get the remaining minutes
    int seconds= (totalseconds % 3600) % 60; //performs the modulus function on the total seconds and again by 60 too get the remaining seconds
    System.out.println("Hours:"+hours+"Minutes:"+minutes+"Seconds:"+seconds);
    
    
    }//end of main 
    
    
    
    
  
    
    
    

}