/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author shepetA6373
 */
public class GALLONCONVERTER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double gallons, quarts, pints, cups, tablespoons;
        // initialises variables
        System.out.println("Enter the number of gallons");
        gallons = input.nextDouble();
        //Asks for and recieves number of gallons
        quarts = gallons * 4;
        pints = gallons * 8;
        cups = gallons * 16;
        tablespoons = gallons * 256;
        // calculates the conversions
        System.out.println("In "+ gallons +" gallons theere are");
        System.out.println(quarts + " quarts");
        System.out.println(pints + " pints");
        System.out.println(cups + " cups");
        System.out.println(tablespoons + " tablespoons");
        //Prints conversions
    }

}
