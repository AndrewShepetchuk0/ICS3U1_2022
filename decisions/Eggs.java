
import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int egg, eggP, n = 0;
        double prc;
        System.out.println("How many eggs are you purchasing: ");
        egg = input.nextInt();
        egg = egg/12;
        if(egg < 4) n = 1;
        if(egg < 6) n = 2;
        if(egg < 11) n = 3;
        if(egg >= 11) n =4;
        switch(n){
            case 1:
                prc = egg * 0.5;
                break;
            case 2:
                prc = egg * 0.45;
                break;
            case 3:
                prc = egg * 0.40;
                break;
            case 4:
                prc = egg * 0.35;
                break;
        }
    }

}
