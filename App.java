import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("FROM: ");
        String from = sc.nextLine();

        System.out.print("TO: ");
        String to = sc.nextLine();

        double rate = checkRate(from, to);
        System.out.print("Please enter the weight: ");
        double weight = sc.nextDouble();

        System.out.println("Price: $" + rate * weight);

    }

    public static double checkRate(String from, String to){
        if(from.equals("AP")  && to.equals("EU")){
            return 8084.00;
        } else{
            return 1000.00;
        }
        
    }
}
