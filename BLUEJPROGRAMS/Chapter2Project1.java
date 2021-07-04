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
    int totalseconds = keyboard.nextInt();
    int hours= totalseconds / 3600;
    int minutes= (totalseconds % 3600) / 60;
    int seconds= (totalseconds % 3600) % 60;
    System.out.println("Hours:"+hours+"Minutes:"+minutes+"Seconds:"+seconds);
    
    
    }//end of main 
    
    
    
    
  
    
    
    

}
