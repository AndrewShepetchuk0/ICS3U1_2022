
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int b1, b2, b3, n=0;
        String p1, p2, p3;
        System.out.print("Enter the first player's name ");
        p1 = input.nextLine();
        System.out.print("Enter the second player's name ");
        p2 = input.nextLine();
        System.out.print("Enter the third player's name ");
        p3 = input.nextLine();
        //Reads names of players
        System.out.print("How many points did " + p1 + "score? ");
        b1 = input.nextInt();
        System.out.print("How many points did " + p2 + "score? ");
        b2 = input.nextInt();
        System.out.print("How many points did " + p3 + "score? ");
        b3 = input.nextInt();
        //Reads the score of each player
        if(b1 >= 10 && b2 >= 10 && b3 >= 10){
            System.out.println("RAPTORS WIN!!");
        }
        else{
            System.out.println("RAPTORS LOSE!!");
        }
    }

}
