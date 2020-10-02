import java.util.Random;
import java.text.DecimalFormat;
/**
 * Creates a Random Phone Number with the restrictions that the first three numbers can't contain an 8 or 9. The second number must be less than 743 and the last number has 4 digits. 
 * 
 *
 * Manu Patranabish
 * 9/26
 */
public class phonenumberprogram
{
  public static void main(String[] args) {
    Random rand = new Random();
    int num1= ((rand.nextInt(8)+1)*100)+(rand.nextInt(8)+1*10)+rand.nextInt(8);// First creates a number in the 100s that is less than 800, then a number in the 10s that is less than 80
    int num2= rand.nextInt(743);//finds a number less than 743
    int num3= rand.nextInt(9999);//finds a number from 0-9999
    DecimalFormat fmt1 = new DecimalFormat("000");//3 zeroes
    DecimalFormat fmt2= new DecimalFormat("0000"); //4 zeroes 
    String phonenumber= fmt1.format(num1) + "-"+ fmt1.format(num2)+ "-" + fmt2.format(num3);//creates the number
    System.out.print(phonenumber);
    
    
    
    
    
    
    

    
    }//end of main 
    
    
    
    
  
    
    
    

}
