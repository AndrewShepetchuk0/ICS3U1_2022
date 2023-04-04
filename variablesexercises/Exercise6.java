
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        double t, h;
        System.out.println("How much time?");
        t = input.nextDouble();
        if (t <= 4.5){
            h = 100-4.9*(t * t);
            System.out.println("the hiegt of the object is " + h);
        }
        else{
            System.out.println("time has to be less than 4.5 seconds");
        }

    }

}
