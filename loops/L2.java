
import java.util.Scanner;

public class L2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String students;
        int num = 0;
        System.out.print("Enter the name of a student: ");
        students = input.nextLine();
        while(!students.equals("DONE")){
            System.out.print("Enter the name of a student: ");
            students = input.nextLine();
            num = num + 1;
        }
        while(students.equals("DONE")){
            System.out.println("You have " + num + " students");
            break;
        }
    }

}
