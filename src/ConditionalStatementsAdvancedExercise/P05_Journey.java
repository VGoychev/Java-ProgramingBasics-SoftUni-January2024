package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String vacation = "";
        double price = 0.00;
        if (budget <= 100){
            destination = "Bulgaria";
            if(season.equals("summer")){
                vacation = "Camp";
                price = budget - budget * 0.70;
            } else if (season.equals("winter")){
                vacation = "Hotel";
                price = budget - budget * 0.30;
            }
        } else if (budget <= 1000){
            destination = "Balkans";
            if(season.equals("summer")){
                vacation = "Camp";
                price = budget - budget * 0.60;
            } else if (season.equals("winter")){
                vacation = "Hotel";
                price = budget - budget * 0.20;
            }
        } else {
            destination = "Europe";
            vacation = "Hotel";
            price = budget - budget * 0.10;
        }
        System.out.printf("Somewhere in %s\n%s - %.2f", destination, vacation, price);
    }
}
