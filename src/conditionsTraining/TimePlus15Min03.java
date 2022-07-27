package conditionsTraining;

import java.util.Scanner;

public class TimePlus15Min03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Hour = Integer.parseInt(scanner.nextLine());
        int Minutes = Integer.parseInt(scanner.nextLine());
        int TotalMin = Hour * 60 + Minutes + 15;
        Hour = TotalMin / 60;
        Minutes = TotalMin % 60;
        if(Hour > 23){
            Hour = 0;
        }
        if(Minutes < 10) {
            System.out.printf("%d:0%d", Hour, Minutes);

        } else {
            System.out.printf("%d:%d",  Hour, Minutes);
        }
        }
    }
