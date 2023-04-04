
import java.util.Scanner;

public class q3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num, numE = 0, pos = 0, neg = 0, high = 0;
        do{
            System.out.println("Input an intiger");
            num = input.nextInt();
            if(num > 0){
                pos = pos + 1;
            }
            else{
                neg = neg + 1;
            }
            if(numE == 1){
                high = num;
            }
            else if(num > high){
                high = num;
            }
            numE = numE + 1;
        }while (num != 0);
        System.out.println(numE - 1);
        System.out.println(pos + " positive numbers");
        System.out.println((neg - 1) + " negative numbers");
        System.out.println(high + " is the highest number");
    }
}
