
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int b = 0;
        //Defines b variable for number of babies
        System.out.print("How many babies do you have");
        b = input.nextInt();
        //Recieves input for number of babies
        switch(b){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Twins");
                break;
            case 3:
                System.out.println("Triplets");
                break;
            case 4:
                System.out.println("Quadruplets");
                break;
            case 5:
                System.out.println("Quintuplets");
                break;
            case 6:
                System.out.println("sextuplets");
                break;
            default:
                System.out.println("No clue");
        }
        //Determines the name that corresponds with the number of babies
    }

}
