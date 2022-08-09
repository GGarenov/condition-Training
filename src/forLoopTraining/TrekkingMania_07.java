package forLoopTraining;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int vsichkiHora = 0;
        int musala = 0;
        int montblanc = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;
        for (int i = 1; i <=n; i++) {
            int broiHora = Integer.parseInt(scanner.nextLine());
//            totalPeople = totalPeople + people; // totalPeople += people
            vsichkiHora = vsichkiHora + broiHora;

            if(broiHora <= 5){
                musala = musala + broiHora;
            } else if(broiHora <=12) {
                montblanc = montblanc + broiHora;
            } else if(broiHora <=25){
                kilimandjaro = kilimandjaro + broiHora;
            } else if(broiHora <=40){
                k2 = k2 + broiHora;
            } else if(broiHora >=41) {
                everest = everest + broiHora;
            }
            }
        System.out.printf("%.2f%%%n", musala * 1.0 / vsichkiHora * 100);
        System.out.printf("%.2f%%%n", montblanc * 1.0 / vsichkiHora * 100);
        System.out.printf("%.2f%%%n", kilimandjaro * 1.0 / vsichkiHora * 100);
        System.out.printf("%.2f%%%n", k2 * 1.0 / vsichkiHora * 100);
        System.out.printf("%.2f%%%n", everest * 1.0 / vsichkiHora * 100);
        }
    }
