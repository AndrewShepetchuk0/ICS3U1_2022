
import java.util.Scanner;

public class ar1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String[] people = {"Paolo", "Uriel", "Alessandro", "Gianpaolo", "Amey", "Zapanta", "Joshua", "Sal", "Anthony", "Sarah", "Christian", "Gianluca"};
        int avg = 0, length = 0, high = 0, num = 0;
        for(int i = 0; i < people.length; i++){
            length += people[i].length();
            avg = length/people.length;
            if(people[i].length() > 0){
                high = people[i].length();
            }
            else if(people[i].length() > high){
                high = people[i].length();
            }
            if(people[i].length() > 6){
                num = num+1;
            }
        }
        System.out.println("The average name length is " + avg);
        System.out.println("The longest name is " + high + " letters long");
        System.out.println("There are " + num + " names with more than 6 letters");
    }

}
