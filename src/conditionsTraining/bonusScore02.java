package conditionsTraining;

import javax.imageio.IIOParam;
import java.util.Scanner;

public class bonusScore02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// num % 2 == 0 - chetno
// num % 2 == 1 - nechetno
    int number = Integer.parseInt(scanner.nextLine());
    double bonus = 0;
    if(number <= 100) {
        bonus=5;
    } else if(number >= 1000) {
        bonus = number * 0.10;
    } else {
        bonus = number * 0.20;
    }

    if (number % 2 == 0) {
        bonus = bonus + 1;
        }

        if(number % 10 == 5) {
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(number + bonus);
    }
    }