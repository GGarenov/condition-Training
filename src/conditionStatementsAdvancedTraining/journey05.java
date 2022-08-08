package conditionStatementsAdvancedTraining;

import java.util.Scanner;

public class journey05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String sezon = scanner.nextLine();
        String destination = "";
        String type = "";
        double amountSpent = 0;
        switch (sezon){
            case "summer":
                if (budget <= 100)
                {
                   destination.equals("Bulgaria");
                   type.equals("Camp");
                   amountSpent = budget - (budget * 0.30);
                    System.out.printf("Somewhere in", destination);
                    System.out.printf("Camp - %.2f", amountSpent);
                }else if(budget <= 1000){
                    destination.equals("Balkans");
                    type.equals("Camp");
                    amountSpent = budget - (budget * 0.40);
                    System.out.printf("Somewhere in", destination);
                    System.out.printf("Camp - %.2f", amountSpent);
            } else{
                    destination.equals("Europe");
                    type.equals("Hotel");
                    amountSpent = budget - (budget * 0.90);
                    System.out.printf("Somewhere in", destination);
                    System.out.printf("Hotel - %.2f", amountSpent);
                }
                break;
            case "winter":
                if (budget <= 100)
                {
                    destination.equals("Bulgaria");
                    type.equals("Hotel");
                    amountSpent = budget - (budget * 0.70);
                    System.out.printf("Somewhere in", destination);
                    System.out.printf("Hotel - %.2f", amountSpent);
                }else if(budget <= 1000){
                    destination.equals("Balkans");
                    type.equals("Hotel");
                    amountSpent = budget - (budget * 0.80);
                    System.out.printf("Somewhere in", destination);
                    System.out.printf("Hotel - %.2f", amountSpent);
                } else{
                    destination.equals("Europe");
                    type.equals("Hotel");
                    amountSpent = budget - (budget * 0.90);
                    System.out.printf("Somewhere in", destination);
                    System.out.printf("Hotel - %.2f", amountSpent);
                }
                break;
        }
    }
}
