
import java.util.Scanner;

public class triangle {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int leng1, leng2, leng3;
        boolean Vtriangle;
        System.out.print("Input the first length: ");
        leng1 = input.nextInt();
        System.out.print("Input the second length: ");
        leng2 = input.nextInt();
        System.out.print("Input the third length: ");
        leng3 = input.nextInt();
        Vtriangle = triangle(leng1, leng2, leng3);
        if(Vtriangle == true){
            System.out.println("Invalid triangle");
        }
        else{
            System.out.println("Valid triangle");
        }
    }
    
    public static boolean triangle(int leng1, int leng2, int leng3){
        if((leng1 > leng2 + leng3) || (leng2 > leng1 + leng3) || (leng3 > leng1 + leng2)){
            return true;
        }
        else{
            return false;
        }
    }

}
