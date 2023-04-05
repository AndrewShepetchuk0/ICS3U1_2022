
package variablesexercises;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        //Java scanner initialization 
        Scanner input = new Scanner (System.in);
        
        //Variables
        int containerNumber;
        double refund, containerSize;
        
        //User input
        System.out.print("How many containers do you have?");
        containerNumber = input.nextInt();
        System.out.print("Whats the size of tour container(s) in liters");
        containerSize = input.nextDouble();
        
        //Refund Calculation
        if (containerSize <= 1){
            refund = containerNumber * 0.1;
        }
        else{
            refund = containerNumber * 0.25;
        }
        
        //Refund display
        System.out.println("Your refund is $" + refund);
    }
    
}
