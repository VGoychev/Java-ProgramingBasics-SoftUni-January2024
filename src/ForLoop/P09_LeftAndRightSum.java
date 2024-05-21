package ForLoop;

import java.util.Scanner;

public class P09_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int firstSum = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSum += number;
        }
        int secondSum = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSum += number;
        }
        if (firstSum == secondSum ){
            System.out.println("Yes, sum = " + firstSum);
        } else {
            int diff = Math.abs(secondSum - firstSum);
            System.out.println("No, diff = "+ diff);
        }
    }
}
