package ForLoopExercise;

import java.util.Scanner;

public class P02_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > max){
                max = number;
            }

        }
        int sumWithOutMaxNumber = sum - max;
        if (max == sumWithOutMaxNumber){
            System.out.println("Yes");
            System.out.println("Sum = " + max);

        } else {
            int diff = Math.abs(max - sumWithOutMaxNumber);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
