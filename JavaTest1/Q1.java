
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //initializes department variable
        String depH;
        // asks for and recieves input corrolating to the name of the department
        System.out.print("What's the name of the department? ");
        depH = input.nextLine();
        //Reads the name of the department and outputs the name of the department head
        switch(depH){
            default:
                //Displays the mesage if the separtment entered doesn't have a defined head
                System.out.println("Not a department head in our database");
                break;
            case "Business":
                System.out.println("Mr. Masciarelli");
                break;
            case "Technology":
                System.out.println("Mr. Zapanta");
                break;
            case "Moderns":
                System.out.println("Mme. Quindamo");
                break;
            case "English":
                System.out.println("Mrs. Bertucci");
                break;
        }
            
                
    }

}
