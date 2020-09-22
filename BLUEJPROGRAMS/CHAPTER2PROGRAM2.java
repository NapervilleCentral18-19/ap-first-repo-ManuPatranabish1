import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Write a description of class CHAPTER2PROGRAM2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CHAPTER2PROGRAM2
{
  public static void main(String[] args) {
    double radius;
    double area;
    double circumference;
    Scanner keyboard = new Scanner (System.in);
    radius= keyboard.nextDouble();
    circumference= 2* Math.PI * radius; 
    area= Math.PI * Math.pow(radius,2);
    DecimalFormat fmt = new DecimalFormat ("#.###");
    System.out.print("The area is" +fmt.format(area));
    System.out.print("The circumference  is" +fmt.format(circumference));
    
    
    
    
    

    
    }//end of main 
    
    
    
    
  
    
    
    

}
