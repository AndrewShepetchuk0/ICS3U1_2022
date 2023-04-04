
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double pencils, cost = 0, subTotal, total;
        int n = 0;
        //initializes variables
        System.out.print("How many pencils are you buying for your school? ");
        pencils = input.nextDouble();
        //asks for and recieves number of pencils being bought
        if(pencils < 1700) n = 1;
        if(pencils >= 1700) n = 2;
        if(pencils >= 2700) n =3;
        if(pencils > 3500) n =4;
        switch(n){
            default:
                System.out.println("not a valid number");
                break;
            case 1:
                cost = 1.10;
                break;
            case 2:
                cost = 1.05;
                break;
            case 3:
                cost = 0.99;
                break;
            case 4:
                cost = 0.94;
                break;
        // sets the cost based off how many pencils are being bought
        }
        System.out.println("Your rate per pencil is $ " + cost);
        //Prints rate per pencil
        subTotal = pencils * cost;
        total = (subTotal * 0.13) + subTotal;
        //calculates subtotal and total
        System.out.println("Your total is $ " + total);
        //prints total
        }
    }

