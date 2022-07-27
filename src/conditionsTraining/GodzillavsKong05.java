package conditionsTraining;

import java.util.Scanner;

public class GodzillavsKong05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    double Budget = Double.parseDouble(scanner.nextLine());
    int BroiStatisti = Integer.parseInt(scanner.nextLine());
    double cenaObleklo = Double.parseDouble(scanner.nextLine());
    double Dekor = Budget * 0.10;
    double ObshtaCenaObleklo = cenaObleklo * BroiStatisti;
    if(BroiStatisti > 150) {
        ObshtaCenaObleklo = ObshtaCenaObleklo - (ObshtaCenaObleklo * 0.10);
    }
    double ObshtBudget = ObshtaCenaObleklo + Dekor;
    double NedostigBudget = ObshtBudget - Budget;
    double OstatakBudget = Budget - ObshtBudget;
    if(ObshtBudget > Budget) {
        System.out.println("Not enough money!");
        System.out.printf("Wingard needs %.2f leva more.", ObshtBudget - Budget);
    } else {
        System.out.println("Action!");
        System.out.printf("Wingard starts filming with %.2f leva left.", Budget - ObshtBudget);
    }
    }
    }

