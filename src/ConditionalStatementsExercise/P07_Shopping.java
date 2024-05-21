package ConditionalStatementsExercise;

import java.util.Scanner;

public class P07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoPcs = Integer.parseInt(scanner.nextLine());
        int procPcs = Integer.parseInt(scanner.nextLine());
        int ramPcs = Integer.parseInt(scanner.nextLine());

        int videoPrice = 250;

        int sumVideo = videoPcs * videoPrice;
        double sumProc = procPcs * (sumVideo*0.35);
        double sumRam = ramPcs * (sumVideo*0.10);

        double finalPrice = sumVideo + sumProc + sumRam;
        if(videoPcs > procPcs){
            finalPrice = finalPrice - finalPrice * 0.15;
        }
        if(finalPrice <= budget){
            finalPrice = budget - finalPrice;
            System.out.printf("You have %.2f leva left!", finalPrice);
        } else if (finalPrice > budget){
            finalPrice = budget - finalPrice;
            System.out.printf("Not enough money! You need %.2f leva more!",Math.abs(finalPrice));
        }
    }
}
