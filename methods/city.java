
import java.util.Scanner;

public class city {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String c1, c2, c3;
        System.out.print("Enter the name of a city: ");
        c1 = input.nextLine();
        System.out.print("Enter the name of a city: ");
        c2 = input.nextLine();
        System.out.print("Enter the name of a city: ");
        c3 = input.nextLine();
        double average = averageL(c1, c2, c3);
        System.out.println(average);
    }
    public static double averageL( String c1, String c2, String c3){//double method, uses c1, c2, c3 variables
        double average;
        average = (c1.length() + c2.length() +  c3.length())/3;//calculates average
        return average;//commits average to main
    }
        
}
