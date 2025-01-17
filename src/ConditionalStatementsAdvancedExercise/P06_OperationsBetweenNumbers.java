package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P06_OperationsBetweenNumbers {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        switch (operator){
            case "+":
                int sum = n1 + n2;
                if ( sum % 2 == 0){ //проверка дали моето число е четно
                    System.out.printf("%d %s %d = %d - even", n1, operator, n2, sum);
                } else {
                    System.out.printf("%d %s %d = %d - odd", n1, operator, n2, sum);
                }
                break;
            case "-":
                int diff = n1 - n2;
                if ( diff % 2 == 0){ //проверка дали моето число е четно
                    System.out.printf("%d %s %d = %d - even", n1, operator, n2, diff);
                } else {
                    System.out.printf("%d %s %d = %d - odd", n1, operator, n2, diff);
                }
                break;
            case "*":
                int multiply = n1 * n2;
                if ( multiply % 2 == 0){ //проверка дали моето число е четно
                    System.out.printf("%d %s %d = %d - even", n1, operator, n2, multiply);
                } else {
                    System.out.printf("%d %s %d = %d - odd", n1, operator, n2, multiply);
                }
                break;
            case "/":
                if (n2 == 0){
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    double division = n1 * 1.0 / n2;
                    System.out.printf("%d / %d = %.2f", n1, n2, division);

                }
                break;
            case "%":
                if (n2 == 0){
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    int result = n1 % n2;
                    System.out.printf("%d %% %d = %d", n1, n2, result);
                }
                break;
        }
    }
}
