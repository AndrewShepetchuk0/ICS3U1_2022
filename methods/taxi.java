
import java.util.Scanner;

public class taxi {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double meters;
        System.out.print("How many meters have you traveled? ");
        meters = input.nextDouble();
        double total = totalC(meters);
        System.out.println("Your total fare is " + total);
    }
    public static double totalC(double meters){
        double total;
        total = (meters * (0.25 / 140)) + 4;
        return total;
    }

}
