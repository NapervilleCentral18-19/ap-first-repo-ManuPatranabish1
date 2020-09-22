import java.util.Scanner;
/**
 * Write a description of class Chapter2Program1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chapter2Program1
{
  public static void main(String[] args) {
    System.out.print("DONT PLAY WITH MY BOY HAYES TWITCH TAKEOVER")
    Scanner keyboard = new Scanner (System.in);
    System.out.print("Enter the total number of seconds:");
    double totalseconds = keyboard.nextDouble();
    double hours= totalseconds % 3600;
    double minutes= hours % 60;
    double seconds= minutes % 60;
    System.out.println("Hours:"+hours+"Minutes:"+minutes+"Seconds:"+seconds);
    
    
    }//end of main 
    
    
    
    
  
    
    
    

}
