package ForLoopExercise;

import java.util.Scanner;

public class P04_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double washPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int moneySum = 0;
        int toy = 0;
        int totalMoney = 0;

        for (int i = 1; i <= n; i++) {
            if ( i % 2 == 0){
                moneySum = moneySum + 10;
                totalMoney = totalMoney + moneySum - 1;
            } else {
                toy++;
            }

        }
        int toySum = toy * toyPrice;
        totalMoney = totalMoney + toySum;
        if ( totalMoney >= washPrice){
            System.out.printf("Yes! %.2f", totalMoney - washPrice);
        } else {
            System.out.printf("No! %.2f", washPrice - totalMoney);

        }
    }
}
