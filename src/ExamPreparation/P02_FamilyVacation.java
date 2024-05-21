package ExamPreparation;

import java.util.Scanner;

public class P02_FamilyVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double priceForNight = Double.parseDouble(scanner.nextLine());
        int percentSpending = Integer.parseInt(scanner.nextLine());
        if (nights>7){
            priceForNight = priceForNight * 0.95;
        }
        double sumSpending = nights * priceForNight;
        double percent = budget * ((double) percentSpending /100);
        double sum = sumSpending + percent;
        if (sum <= budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget-sum);
        } else {
            System.out.printf("%.2f leva needed.", sum-budget);
        }
    }
}
