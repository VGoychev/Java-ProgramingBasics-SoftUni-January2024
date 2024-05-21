package Exam;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();
        int spending = 0;
        double priceSum = people * points;
        double moneyAfterSpending = 0.0;
        if(season.equals("summer")){
            if(place.equals("Abroad")){
                priceSum = priceSum + priceSum * 0.50;
                moneyAfterSpending = priceSum - priceSum * 0.10;
            }else if(place.equals("Bulgaria")){
                moneyAfterSpending = priceSum - priceSum * 0.05;
            }
        } else if (season.equals("winter")){
            if(place.equals("Abroad")){
                priceSum = priceSum + priceSum * 0.50;
                moneyAfterSpending = priceSum - priceSum * 0.15;
            } else if (place.equals("Bulgaria")){
                moneyAfterSpending = priceSum - priceSum * 0.08;
            }
        }
        double charityMoney = moneyAfterSpending * 0.75;
        double moneyLeft = moneyAfterSpending - charityMoney;
        double moneyPerPerson = moneyLeft / people;
        System.out.printf("Charity - %.2f%n", charityMoney);
        System.out.printf("Money per dancer - %.2f", moneyPerPerson);
    }
}
