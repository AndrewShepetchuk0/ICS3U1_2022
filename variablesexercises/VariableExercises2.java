
package variablesexercises;
import java.util.Scanner;

public class VariableExercises2 {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2, sum;
        System.out.println("First number");
        num1 = input.nextInt();
        System.out.println("Second number");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println(sum);    
    }
    
}
