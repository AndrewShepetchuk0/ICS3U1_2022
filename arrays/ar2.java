
import java.util.Scanner;

public class ar2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] marks = {70, 80, 23, 65, 92, 100, 86, 73, 45, 56, 92, 97, 69};
        int sum = 0;
        int high = 0;
        //
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        //
        for(var i = marks.length-1; i >= 0; i--){
            System.out.println(marks[i]);
        } 
        //
        int length = marks.length;
        for(var i = 0; i < marks.length; i++){
            sum += marks[i];
        }
        int avg = sum / length;
        System.out.println("The average mark is "+ avg);
        //
        
    }
}

