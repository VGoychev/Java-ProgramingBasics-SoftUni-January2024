package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double rent = 0.00;
        switch (season){
            case "Spring":
                rent = 3000;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
                break;
        }
        if (fisherman <= 6) {
            rent = rent - rent * 0.10;
        } else if (fisherman <= 11) {
            rent = rent - rent * 0.15;
        } else {
            rent = rent - rent * 0.25;
        }

        if (fisherman % 2 == 0 && !season.equals("Autumn")) {
            rent = rent - rent * 0.05;
        }
        if (budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rent);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
        }
    }
}
