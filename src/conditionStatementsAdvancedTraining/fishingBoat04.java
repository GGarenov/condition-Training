package conditionStatementsAdvancedTraining;

import java.util.Scanner;

public class fishingBoat04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String sezon = scanner.nextLine();
        int broiRibari = Integer.parseInt(scanner.nextLine());
        double boatPrice = 0;
//· Ако групата е от 7 до 11 човека включително – отстъпка от 15%.
//
//· Ако групата е от 12 нагоре – отстъпка от 25%.
        switch (sezon) {
            case "Spring":
                boatPrice = 3000;
                if (broiRibari <= 6) {
                    boatPrice = boatPrice - (boatPrice * 0.10);
                } else if (broiRibari >= 7 && broiRibari <= 11) {
                    boatPrice = boatPrice - (boatPrice * 0.15);
                } else boatPrice = boatPrice - (boatPrice * 0.25);
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                if (broiRibari <= 6) {
                    boatPrice = boatPrice - (boatPrice * 0.10);
                } else if (broiRibari >= 7 && broiRibari <= 11) {
                    boatPrice = boatPrice - (boatPrice * 0.15);
                } else boatPrice = boatPrice - (boatPrice * 0.25);
                break;
            case "Winter":
                boatPrice = 2600;
                if (broiRibari <= 6) {
                    boatPrice = boatPrice - (boatPrice * 0.10);
                } else if (broiRibari >= 7 && broiRibari <= 11) {
                    boatPrice = boatPrice - (boatPrice * 0.15);
                } else boatPrice = boatPrice - (boatPrice * 0.25);
                break;
                }
            if (broiRibari % 2 == 0 && !(sezon.equals("Autumn"))) {
                boatPrice = boatPrice - (boatPrice * 0.05);
            }
                if (boatPrice <= budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - boatPrice);
                } else System.out.printf("Not enough money! You need %.2f leva.", boatPrice - budget);
            }
        }


