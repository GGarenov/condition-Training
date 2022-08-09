package whileLoop;

import java.util.Scanner;

public class Passoword02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String pass = scanner.nextLine();
        while(true){
            String inputData = scanner.nextLine();
            if (inputData.equals(pass)){
                System.out.printf("Welcome %s!%n", username);
                break;
            }
        }

        }
    }

