/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author shepetA6373
 */
public class SPENDING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double food, clothing, entertainment, rent, total;
        double foodP, clothingP, entertainmentP, rentP;
        //initialises food, clothing, and entertainement variables (and percentages)
        System.out.println("How much did you spend on food?");
        food = input.nextDouble();
        System.out.println("How much did you spend on clothing?");
        clothing = input.nextDouble();
        System.out.println("How much did you spend on entertainment");
        entertainment = input.nextDouble();
        System.out.println("How much did you spend on rent?");
        rent = input.nextDouble();
        //Asks and determines how much money is spent on each category
        total = food + clothing + entertainment + rent;
        foodP = (food * 100) / total;
        clothingP = (clothing * 100) / total;
        entertainmentP = (entertainment * 100) / total;
        rentP = (rent * 100) / total;
        //Determines total money spent and the percentages of each
        System.out.println("Category Budget");
        System.out.println("Food " + foodP + "%");
        System.out.println("Clothing " + clothingP + "%");
        System.out.println("Entertainment " + entertainmentP + "%");
        System.out.println("Rent " + rentP + "%");
        //Displays the percentages of each category
    }

}
