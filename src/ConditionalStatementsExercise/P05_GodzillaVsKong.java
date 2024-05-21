package ConditionalStatementsExercise;

import java.util.Scanner;

public class P05_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothPriceForStatist = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double clothPrice = statists * clothPriceForStatist;

        if ( statists > 150){
            clothPrice =clothPrice - clothPrice * 0.10;
        }
        double endPrice = decor + clothPrice;
        double endEndPrice = budget - endPrice;

        if(endPrice > budget){
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", Math.abs(endEndPrice));
        } else if ( endPrice<=budget) {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", endEndPrice);
        }

    }
}
