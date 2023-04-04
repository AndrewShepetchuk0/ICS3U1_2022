
package variablesexercises;
import java.util.Scanner;

public class VariableExercises4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double area, roomLength, roomWidth;
        System.out.print("What's the room's length in metres? ");
        roomLength = input.nextDouble();
        System.out.print("What's the room's width in metres? ");
        roomWidth = input.nextDouble();
        area = roomLength * roomWidth;
        System.out.println("The room's area in metres is " + area);
    }
    
}
