package conditionsTraining;

import java.util.Scanner;

public class toyShop04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cenaEkskurziq = Double.parseDouble(scanner.nextLine());
        int broiPuzeli = Integer.parseInt(scanner.nextLine());
        int broiKukli = Integer.parseInt(scanner.nextLine());
        int Mecheta = Integer.parseInt(scanner.nextLine());
        int Minioni = Integer.parseInt(scanner.nextLine());
        int Kamioncheta = Integer.parseInt(scanner.nextLine());
        double SumaPoruchka = (broiPuzeli * 2.60) + (broiKukli * 3) + (Mecheta * 4.10) + (Minioni * 8.20) + (Kamioncheta * 2);
        int BroiArtikuli = broiPuzeli + broiKukli + Mecheta + Minioni + Kamioncheta;
        if(BroiArtikuli > 50) {
            SumaPoruchka = SumaPoruchka - (SumaPoruchka * 0.25);
        }
        double Naem = SumaPoruchka * 0.10;
        double ObshtaPechalba = SumaPoruchka - Naem;
        double OstavashtiPari = ObshtaPechalba - cenaEkskurziq;
        double NedostigashtiPari = cenaEkskurziq - ObshtaPechalba;
        if(ObshtaPechalba <= cenaEkskurziq) {
            System.out.printf("Not enough money! %.2f lv needed.", cenaEkskurziq - ObshtaPechalba);
        } else {
            System.out.printf("Yes! %.2f lv left.", ObshtaPechalba - cenaEkskurziq);
        }
    }
}
