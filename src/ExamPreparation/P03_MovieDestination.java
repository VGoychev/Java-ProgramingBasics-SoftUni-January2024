package ExamPreparation;

import java.util.Scanner;

public class P03_MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        if(season.equals("Winter")){
            switch (destination) {
                case "Dubai":
                    price = 45000 * 0.70;
                    break;
                case "Sofia":
                    price = 17000 * 1.25;
                    break;
                case "London":
                    price = 24000;
                    break;
            }
        } else if(season.equals("Summer")){
            switch (destination) {
                case "Dubai":
                    price = 40000 * 0.70;
                    break;
                case "Sofia":
                    price = 12500 * 1.25;
                    break;
                case "London":
                    price = 20250;
                    break;
            }
        }
        double sum = days * price;
        if(budget < sum ){
            System.out.printf("The director needs %.2f leva more!", sum-budget);
        } else {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget-sum);
        }
    }
}
