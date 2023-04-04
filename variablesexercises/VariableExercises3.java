
package variablesexercises;
import java.util.Scanner;

public class VariableExercises3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int num1, num2, num3, num4, average;
        System.out.print("1st mark");
        num1 = input.nextInt();
        System.out.print("2nd mark");
        num2 = input.nextInt();
        System.out.print("3rd mark");
        num3 = input.nextInt();
        System.out.print("4th mark");
        num4 = input.nextInt();
        average = (num1 + num2 + num3 + num4) / 4;
        System.out.println("The average is " + average);
    }
    
}
