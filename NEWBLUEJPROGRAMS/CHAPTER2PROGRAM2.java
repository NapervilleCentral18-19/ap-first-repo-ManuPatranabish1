import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Asks the user for the radius of a circle, then calculates the area and circumference.
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
    System.out.print("What is the radius of the circle?: ");
    radius= keyboard.nextDouble();//radius is a double 
    circumference= 2* Math.PI * radius; //calculates the circumference using the circumference of a circle formula
    area= Math.PI * Math.pow(radius,2);//calculates the area using the area of a circle formula
    DecimalFormat fmt = new DecimalFormat ("#.###");//creates a new decimal format which goes to 3 decimal places
    System.out.print("The area is" +fmt.format(area));
    System.out.print("The circumference  is" +fmt.format(circumference));
    
    
    
    
    

    
    }//end of main 
    
    
    
    
  
    
    
    

}