
import java.util.Scanner;

public class p3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String passw, user;
        int tries = 0;
        do{
            System.out.print("Enter a user name: ");
            user = input.nextLine();
            user = user.toLowerCase();
            System.out.print("Enter a password: ");
            passw = input.nextLine();
            tries = tries + 1;
            if(tries >= 5){
                System.out.println("Account locked");
            }
        }while(!passw.equals("teacher1") && !user.equals("zzapanta"));
        System.out.println("Logged in");
        
    }

}
