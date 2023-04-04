/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author shepetA6373
 */
public class EGGS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int eggsDozens, eggs;
        double dozenPrice = 14.50, subtotal, tax = 0.13, total;
        // defines the price per dozen, number off dozens, and tax
        System.out.println("How many dozens of eggs will you buy?");
        eggsDozens = input.nextInt();
        // asks for ang gets number of egg dozens
        eggs = eggsDozens * 12;
        // calculates the number of eggs
        subtotal = eggsDozens * dozenPrice;
        //calculates syubtotal
        System.out.println("You are buying " + eggs + " eggs");
        System.out.println("Your subtotal is $" + subtotal);
        //displays number of eggs and subtotal 
        total = (subtotal * tax) + subtotal;
        System.out.println("Your total is $" + total);
        //displays total
        //EGGS
    }

}
