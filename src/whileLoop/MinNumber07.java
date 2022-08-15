package whileLoop;

import java.util.Scanner;

public class MinNumber07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNum = Integer.MAX_VALUE;
        String inputLine = scanner.nextLine();
        while(!inputLine.equals("Stop")){
            int currentNum = Integer.parseInt(inputLine);
            if (currentNum < minNum) {
                minNum = currentNum;
            }
            inputLine = scanner.nextLine();

        }
        System.out.println(minNum);
    }
}
