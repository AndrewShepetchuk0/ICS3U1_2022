
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double c = 0, s, t, b;
        //defines variables
        System.out.print("How many basketballs are you buying? ");
        b = input.nextInt();
        //recieves input for number of basketballs
        if(b < 30){
            c = 30;
        }
        else{
            if(b >= 30 && b < 50){
                c = 25;
            }
            else{
                if(b >= 50){
                c = 20;
            }
            }
        }
        //determines the cost per basketball
        System.out.println("Your rate per basketball is $: " + c);
        s = b * c;
        t = (s * 0.13) + s;
        System.out.println("Your total is $: " + t);
        //calculates total and subtotal and then outputs total
    }

}
