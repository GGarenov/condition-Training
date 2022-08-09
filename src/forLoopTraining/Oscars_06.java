package forLoopTraining;
import java.util.Scanner;
public class Oscars_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double totalPoints = academyPoints;
        for (int i = 1; i <= n; i++) {
            String Jury = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            int duljinaIme = Jury.length();
            double calculatedPoints = (duljinaIme * points) / 2;
            totalPoints = totalPoints + calculatedPoints;
            if (totalPoints > 1250.5){
                break;
            }
        }
        if (totalPoints > 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);

        }
    }
}
