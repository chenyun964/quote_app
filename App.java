import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SELECT SHIPPING TYPE:");
        System.out.println("(1. Air   2. Ocean");
        String typeInput = sc.nextLine();
        boolean isShippingTypeAir = (typeInput.equals("1") || typeInput.equalsIgnoreCase("air"));

        System.out.print("FROM: ");
        String from = sc.nextLine();

        System.out.print("TO: ");
        String to = sc.nextLine();
        
        if (isShippingTypeAir) {
            double rate = checkRate(from, to, isShippingTypeAir);
            System.out.print("Please enter the weight: ");
            double weight = sc.nextDouble();
            System.out.println("Price: $" + rate * weight);
        }
        
        sc.close();
    }

    public static double checkRate(String from, String to, boolean isShippingTypeAir) {
        if (isShippingTypeAir) {
            if(from.equals("AP") && to.equals("EU")) {
                return 8084.00;
            } else {
                return 1000.00;
            }
        }
    }
}
