
import java.util.Scanner;

public class PKg {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int kg, l, w, h, s;
        System.out.print("Enter the weight of the package in kilograms: ");
        kg = input.nextInt();
        System.out.print("Enter the length of the package in centimeters: ");
        l = input.nextInt();
        System.out.print("Enther the width of the package in centimeters: ");
        w = input.nextInt();
        System.out.print("Enter the hieght of the package in centimeters: ");
        h = input.nextInt();
        s = l * w * h;
        if(kg >= 32){
            System.out.println("Too heavy");
        }
        if(s >= 100000){
            System.out.println("Too large");
        }
        if(s >= 100000 && kg >= 32){
            System.out.println("Too large and too heavy");
        }
        
    }

}
