package Exam;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int first = Integer.valueOf(String.valueOf(number.charAt(0)));
        int second = Integer.valueOf(String.valueOf(number.charAt(1)));
        int third = Integer.valueOf(String.valueOf(number.charAt(2)));

        for (int i = 1; i <= third; i++) {
            for (int j = 1; j <= second ; j++) {
                for (int k = 1; k <= first ; k++) {
                    System.out.print(i + " * ");
                    System.out.print(j + " * ");
                    System.out.print(k + " = ");
                    System.out.print(i * j * k + ";\n");
                }
            }
        }
    }
}
