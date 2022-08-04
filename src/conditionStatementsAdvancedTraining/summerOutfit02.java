package conditionStatementsAdvancedTraining;

import java.util.Scanner;

public class summerOutfit02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Gradusi = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        String outfit = "";
        String shoes = "";
        switch (dayTime){
            case "Morning":
                if(Gradusi >= 10 && Gradusi <=18){
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";

                } else if (Gradusi > 18 && Gradusi <= 24){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }else if(Gradusi >=25){
                    outfit = "T-Shirt";
                    shoes = "Sandals";

                }
                break;
            case "Afternoon":
                if(Gradusi >= 10 && Gradusi <=18){
                    outfit = "Shirt";
                    shoes = "Moccasins";

                } else if (Gradusi > 18 && Gradusi <= 24){
                    outfit = "T-Shirt";
                    shoes = "Sandals";

                }else if(Gradusi >=25){
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if(Gradusi >= 10 && Gradusi <=18){
                    outfit = "Shirt";
                    shoes = "Moccasins";

                } else if (Gradusi > 18 && Gradusi <= 24){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }else if(Gradusi >=25){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", Gradusi, outfit, shoes);
    }
}
