
package variablesexercises;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int containerNumber;
        double refund, containerSize;
        System.out.print("How many containers do you have?");
        containerNumber = input.nextInt();
        System.out.print("Whats the size of tour container(s) in liters");
        containerSize = input.nextDouble();
        if (containerSize <= 1){
            refund = containerNumber * 0.1;
        }
        else{
            refund = containerNumber * 0.25;
        }
        System.out.println("Your refund is $" + refund);
    }
    
}
