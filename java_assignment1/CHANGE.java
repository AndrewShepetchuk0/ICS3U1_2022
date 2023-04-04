/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author shepetA6373
 */
public class CHANGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int cents, quarters, dimes, nickels , pennies;
        //Initialises variables
        System.out.println("Enter the change in cents");
        cents = input.nextInt();
        //Asks for and recieves input for cents
        quarters = cents / 25;
        dimes = (cents - (quarters * 25)) / 10;
        nickels = (cents - (quarters * 25)- (dimes * 10) ) /5;
        pennies = (cents - (quarters * 25)- (dimes * 10)) /1;
        //Calculates number of coins
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes " + dimes);
        System.out.println("Nickels " + nickels);
        System.out.println("Pennies " + pennies);
        //Displays number of coins
    }

}
