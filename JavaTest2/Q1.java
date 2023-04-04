
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String st;
        //initialises variable
        System.out.print("Enter the name of a Toronto sports tram: ");
        st = input.nextLine();
        st = st.toLowerCase();
        //Gets input and translates it to lower case
        if(st.equals("maple leafs")){
            System.out.println("Hockey");
        }
        else{
            if(st.equals("rock")){
                System.out.println("Lacrosse");
            }
            else{
                if(st.equals("argos")){
                    System.out.println("Football");
                }
                else{
                    System.out.println("Not a valid sports team name");
                }
                //decides the sport based off the team.
            }
        }
    }

}
