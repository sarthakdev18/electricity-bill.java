import java.util.*;

public class ElectricityBill {
    public static void main(String args[]) {
        int units;
        double bill = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Number of units: ");
        units = sc.nextInt();

        if(units < 100) {
            bill = units * 1.20;
        } else if(units < 300) {
            bill = 100 * 1.20 + (units - 100) * 2;
        } else if(units > 300) {
            bill = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
        }

        System.out.println("Electricity bill for"  + units + "is: " + bill);
    }
}
