package NestedLoops;

import java.util.Scanner;

public class P04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int mNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int firstNumber = start; firstNumber <= end; firstNumber++) {
            for (int secondNumber = start; secondNumber <= end ; secondNumber++) {
                count++;
                int sum = firstNumber + secondNumber;
                if( sum == mNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, firstNumber, secondNumber, mNumber);
                    return;
                }

            }
        }
        System.out.printf("%d combinations - neither equals %d", count, mNumber);
    }
}
