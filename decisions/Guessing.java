
import java.util.Scanner;

public class Guessing {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pn, sn = 7;
        System.out.print("Enter a number between 1 and 20");
        pn = input.nextInt();
        System.out.println("Computers number is " + sn);
        System.out.println("Players number is " + pn);
        if(pn == sn){
            System.out.println("Nice guess");
            }
        else{
            if(pn > 20 && pn < 0){
                System.out.println("Not a valid number");
            }
            else{
                System.out.println("Better luck next time");
            }
          }
        }
    }


