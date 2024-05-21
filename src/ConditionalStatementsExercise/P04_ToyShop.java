package ConditionalStatementsExercise;

import java.util.Scanner;

public class P04_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double puzzle = 2.60;
        double talkingDoll = 3.00;
        double teddyBear = 4.10;
        double minion = 8.20;
        double truck = 2.00;
        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzlePcs = Integer.parseInt(scanner.nextLine());
        int talkingDollPcs = Integer.parseInt(scanner.nextLine());
        int teddyBearPcs = Integer.parseInt(scanner.nextLine());
        int minionPcs = Integer.parseInt(scanner.nextLine());
        int truckPcs = Integer.parseInt(scanner.nextLine());

        double sum = puzzlePcs * puzzle + talkingDollPcs * talkingDoll + teddyBearPcs * teddyBear + minionPcs * minion + truckPcs * truck;
        int toyPcs = puzzlePcs + talkingDollPcs + teddyBearPcs + minionPcs + truckPcs;
        if(toyPcs>=50){
            sum = sum - sum * 0.25;
        }
        sum = sum - sum * 0.10;
        if ( vacationPrice <= sum){
            System.out.printf("Yes! %.2f lv left.", sum - vacationPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", vacationPrice - sum);
        }

    }
}
