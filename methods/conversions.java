import java.util.Scanner;

public class conversions {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double length;
        String unit;
        System.out.print("Enter the unit you are converting: ");
        unit = input.nextLine();
        System.out.print("Enter the length of the measurement: ");
        length = input.nextDouble();
        unit = unit.toLowerCase();
        if(unit.equals("inches")){
            System.out.println("i");
            double total = inch(length);
            System.out.println(total);
        }
        else if(unit.equals("feet")){
            System.out.println("f");
            double total = feet(length);
            System.out.println(total);
        }
        else if(unit.equals("yards")){
            System.out.println("y");
            double total = yard(length);
            System.out.println(total);
        }
        else{
            System.out.println("m");
            double total = meter(length);
            System.out.println(total);
    }
    }
    public static double inch(double length){
        double total;
        total = length * 2.54;
        return total;
    }
    public static double feet(double length){
        double total;
        total = length * 30;
        return total;
    }
    public static double yard(double length){
        double total;
        total = length * 0.91;
        return total;
    }
    public static double meter(double length){
        double total;
        total = length * 1.6;
        return total;
    }
}
