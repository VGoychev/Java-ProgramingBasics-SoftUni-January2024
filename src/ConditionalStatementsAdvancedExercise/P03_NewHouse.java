package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P03_NewHouse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int flowerPcs = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double endPrice = 0.00;
        switch (flowers){
            case "Roses":

                if (flowerPcs > 80){
                    endPrice = flowerPcs * 5 * 0.90;
                } else {
                    endPrice =flowerPcs * 5;
                }
                break;
            case "Dahlias":
                if (flowerPcs > 90){
                    endPrice = flowerPcs * 3.80 * 0.85;
                } else {
                    endPrice =flowerPcs * 3.80;
                }
                break;
            case "Tulips":
                if (flowerPcs > 80){
                    endPrice = flowerPcs * 2.80 * 0.85;
                } else {
                    endPrice =flowerPcs * 2.80;
                }
                break;
            case "Narcissus":
                if (flowerPcs < 120){
                    endPrice = flowerPcs * 3 * 1.15;
                } else {
                    endPrice = flowerPcs * 3;
                }
                break;
            case "Gladiolus":
                if (flowerPcs < 80){
                    endPrice = flowerPcs * 2.50 * 1.20;
                } else {
                    endPrice = flowerPcs * 2.50;
                }
                break;
        }
        if(budget >= endPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerPcs, flowers, budget-endPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", endPrice-budget);
        }
    }
}
