
import java.util.Scanner;

public class L1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String name = "";
        System.out.println("What is your name?: ");
        name = input.nextLine();
        name = name.toLowerCase();
        while(!name.equals("tim")){
            System.out.println("What is your name?: ");
            name = input.nextLine();
            name = name.toLowerCase();
        }
        while(name.equals("tim")){
            System.out.println("Tim");
            break;
        }
            
        }
        
    }