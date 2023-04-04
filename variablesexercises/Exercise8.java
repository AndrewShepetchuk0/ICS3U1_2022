
import java.util.Scanner;

public class Exercise8 {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double taxD, burger, fries, soda, total, price, tax = 0.6;
        //inititalizes variables
        System.out.print("How many burgers will you buy?");
        burger = input.nextDouble();
        //asks and recieves input for number of burgers
        System.out.print("How many fries will you buy?");
        fries = input.nextDouble();
        //asks and recieves input for number of fries
        System.out.print("How many sodas will you have?");
        soda = input.nextDouble();
        //asks and recieves input for number of sodas
        price = (burger * 1.69) + (fries * 1.09) + (soda * 0.99);
        //calculates subtotal
        taxD = price * tax;
        //calculates tax
        total = (price * tax)+ price;
        System.out.println("Your tax is $ " + taxD);
        System.out.println("Your total is $ " + total);
        //calculates and displays total and tax
    }

}
