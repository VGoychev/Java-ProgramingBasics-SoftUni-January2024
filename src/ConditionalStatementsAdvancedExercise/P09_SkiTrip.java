package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P09_SkiTrip {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String place = scanner.nextLine();
        String grade = scanner.nextLine();
        double pricePerNight = 0.00;
        int nights = days - 1;

        double endPrice = 0.00;
        switch (place){
            case "room for one person":
                pricePerNight = 18.00;
                endPrice = nights * pricePerNight;
                break;
            case "apartment":
                pricePerNight = 25.00;
                endPrice = nights * pricePerNight;
                if (days > 15){
                    endPrice = endPrice * 0.50;
                } else if (days >= 10){
                    endPrice = endPrice * 0.65;
                } else {
                    endPrice = endPrice * 0.70;
                }
                break;
            case "president apartment":
                pricePerNight = 35.00;
                endPrice = nights * pricePerNight;
                if (days > 15){
                    endPrice = endPrice * 0.80;
                } else if (days >= 10){
                    endPrice = endPrice * 0.85;
                } else {
                    endPrice = endPrice * 0.90;
                }
                break;
        }
        if(grade.equals("positive")){
            endPrice = endPrice + endPrice * 0.25;
        } else if (grade.equals("negative")) {
            endPrice = endPrice - endPrice * 0.10;
        }
        System.out.printf("%.2f", endPrice);
    }
}
