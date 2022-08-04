package conditionStatementsAdvancedTraining;

import java.util.Scanner;

public class newHouse03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int broiCvetq = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        switch (flowerType) {
            case "Roses":
                totalPrice = broiCvetq * 5;
                if (broiCvetq > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }
                break;
            case "Dahlias":
                totalPrice = broiCvetq * 3.80;
                if (broiCvetq > 90) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Tulips":
                totalPrice = broiCvetq * 2.80;
                if (broiCvetq > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Narcissus":
                totalPrice = broiCvetq * 3;
                if (broiCvetq < 120) {
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;
            case "Gladiolus":
                totalPrice = broiCvetq * 2.50;
                if (broiCvetq < 80) {
                    totalPrice = totalPrice + (totalPrice * 0.20);
                }
                break;
        }
        double diff = Math.abs(budget - totalPrice);
        if(totalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", broiCvetq, flowerType,diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}

